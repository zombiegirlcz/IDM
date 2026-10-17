package com.onfido.android.sdk.capture.internal.util;

import com.onfido.android.sdk.capture.internal.util.UIEvent;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/util/UIEventManager;", "Lcom/onfido/android/sdk/capture/internal/util/UIEvent;", "T", "", "<init>", "()V", "uiEvent", "", "emitUIEvent", "(Lcom/onfido/android/sdk/capture/internal/util/UIEvent;)V", "consumeUIEvent", "lock", "Ljava/lang/Object;", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "", "uiEventsSubject", "Lio/reactivex/rxjava3/subjects/BehaviorSubject;", "Lio/reactivex/rxjava3/core/Observable;", "uiEvents", "Lio/reactivex/rxjava3/core/Observable;", "getUiEvents", "()Lio/reactivex/rxjava3/core/Observable;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class UIEventManager<T extends UIEvent> {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private final Observable uiEvents;

    @NotNull
    private final BehaviorSubject uiEventsSubject;

    public UIEventManager() {
        BehaviorSubject behaviorSubjectD = BehaviorSubject.d(f0.f322471a);
        Intrinsics.checkNotNullExpressionValue(behaviorSubjectD, "createDefault(...)");
        this.uiEventsSubject = behaviorSubjectD;
        Observable observableDistinctUntilChanged = behaviorSubjectD.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        this.uiEvents = observableDistinctUntilChanged;
    }

    public final void consumeUIEvent(@NotNull T uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        synchronized (this.lock) {
            try {
                Iterable iterable = (List) this.uiEventsSubject.e();
                if (iterable == null) {
                    iterable = f0.f322471a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (((UIEvent) obj2).getId() != uiEvent.getId()) {
                        arrayList.add(obj2);
                    }
                }
                this.uiEventsSubject.onNext(arrayList);
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final void emitUIEvent(@NotNull T uiEvent) {
        Intrinsics.checkNotNullParameter(uiEvent, "uiEvent");
        synchronized (this.lock) {
            try {
                BehaviorSubject behaviorSubject = this.uiEventsSubject;
                Collection collection = (List) behaviorSubject.e();
                if (collection == null) {
                    collection = f0.f322471a;
                }
                behaviorSubject.onNext(d0.F0(uiEvent, collection));
                Unit unit = Unit.f186387a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @NotNull
    public final Observable getUiEvents() {
        return this.uiEvents;
    }
}
