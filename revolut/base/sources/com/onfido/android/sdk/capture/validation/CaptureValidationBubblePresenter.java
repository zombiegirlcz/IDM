package com.onfido.android.sdk.capture.validation;

import com.onfido.android.sdk.capture.internal.service.AnnouncementService;
import com.onfido.android.sdk.capture.internal.util.SchedulersProvider;
import com.onfido.android.sdk.capture.internal.util.logging.Timber;
import com.onfido.android.sdk.capture.utils.RxExtensionsKt;
import com.onfido.android.sdk.capture.utils.Visibility;
import com.onfido.android.sdk.capture.validation.OnfidoCaptureValidationBubble;
import igm.g;
import igm.o;
import igm.p;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001d\u001e\u001fB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0012¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter;", "", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "announcementService", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "schedulersProvider", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$BubbleMode;", "bubbleMode", "Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$View;", "view", "<init>", "(Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$BubbleMode;Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$View;)V", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "Lcom/onfido/android/sdk/capture/utils/Visibility;", "liveCaptureObservable", "(Lio/reactivex/rxjava3/core/Observable;)Lio/reactivex/rxjava3/core/Observable;", "postCaptureObservable", "", "onAttach", "()V", "onDetach", "Lcom/onfido/android/sdk/capture/internal/service/AnnouncementService;", "Lcom/onfido/android/sdk/capture/internal/util/SchedulersProvider;", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$BubbleMode;", "Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$View;", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "Companion", "Factory", "View", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class CaptureValidationBubblePresenter {
    private static final long DELAY_VISIBILITY_MILLIS = 2000;

    @NotNull
    private final AnnouncementService announcementService;

    @NotNull
    private final OnfidoCaptureValidationBubble.BubbleMode bubbleMode;

    @NotNull
    private final CompositeDisposable compositeDisposable;

    @NotNull
    private final SchedulersProvider schedulersProvider;

    @NotNull
    private final View view;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$Factory;", "", "create", "Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter;", "bubbleMode", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$BubbleMode;", "view", "Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$View;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Factory {
        @NotNull
        CaptureValidationBubblePresenter create(@NotNull OnfidoCaptureValidationBubble.BubbleMode bubbleMode, @NotNull View view);
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\r"}, d2 = {"Lcom/onfido/android/sdk/capture/validation/CaptureValidationBubblePresenter$View;", "", "displayedText", "", "getDisplayedText", "()Ljava/lang/String;", "renderVisibility", "", "visibility", "Lcom/onfido/android/sdk/capture/utils/Visibility;", "visibilityChange", "Lio/reactivex/rxjava3/core/Observable;", "Lcom/onfido/android/sdk/capture/validation/OnfidoCaptureValidationBubble$VisibilityCommand;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface View {
        @NotNull
        String getDisplayedText();

        void renderVisibility(@NotNull Visibility visibility);

        @NotNull
        Observable visibilityChange();
    }

    public CaptureValidationBubblePresenter(@NotNull AnnouncementService announcementService, @NotNull SchedulersProvider schedulersProvider, @NotNull OnfidoCaptureValidationBubble.BubbleMode bubbleMode, @NotNull View view) {
        Intrinsics.checkNotNullParameter(announcementService, "announcementService");
        Intrinsics.checkNotNullParameter(schedulersProvider, "schedulersProvider");
        Intrinsics.checkNotNullParameter(bubbleMode, "bubbleMode");
        Intrinsics.checkNotNullParameter(view, "view");
        this.announcementService = announcementService;
        this.schedulersProvider = schedulersProvider;
        this.bubbleMode = bubbleMode;
        this.view = view;
        this.compositeDisposable = new CompositeDisposable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable liveCaptureObservable(Observable observable) {
        Observable observableSwitchMap = observable.filter(new p() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.liveCaptureObservable.1
            @Override // igm.p
            public final boolean test(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return CaptureValidationBubblePresenter.this.bubbleMode == OnfidoCaptureValidationBubble.BubbleMode.LIVE_CAPTURE;
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.liveCaptureObservable.2
            @Override // igm.o
            @NotNull
            public final Pair<Visibility, Boolean> apply(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand visibilityCommand) {
                Intrinsics.checkNotNullParameter(visibilityCommand, "visibilityCommand");
                OnfidoCaptureValidationBubble.VisibilityCommand.Visible visible = visibilityCommand instanceof OnfidoCaptureValidationBubble.VisibilityCommand.Visible ? (OnfidoCaptureValidationBubble.VisibilityCommand.Visible) visibilityCommand : null;
                OnfidoCaptureValidationBubble.FocusType focusType = visible != null ? visible.getFocusType() : null;
                OnfidoCaptureValidationBubble.FocusType.AnnounceContent announceContent = focusType instanceof OnfidoCaptureValidationBubble.FocusType.AnnounceContent ? (OnfidoCaptureValidationBubble.FocusType.AnnounceContent) focusType : null;
                return new Pair<>(visibilityCommand.getVisibility(), Boolean.valueOf(announceContent != null ? announceContent.getShouldInterrupt() : false));
            }
        }).switchMap(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.liveCaptureObservable.3
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Pair<? extends Visibility, Boolean> pair) {
                Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                final Visibility visibility = (Visibility) pair.f186385a;
                return visibility.getIsAppearing() ? CaptureValidationBubblePresenter.this.announcementService.announceString(new String[]{CaptureValidationBubblePresenter.this.view.getDisplayedText()}, ((Boolean) pair.f186386b).booleanValue()).d(Observable.just(visibility)) : Observable.timer(2000L, TimeUnit.MILLISECONDS, CaptureValidationBubblePresenter.this.schedulersProvider.getTimer()).map(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.liveCaptureObservable.3.1
                    @NotNull
                    public final Visibility apply(long j2) {
                        return visibility;
                    }

                    @Override // igm.o
                    public /* bridge */ /* synthetic */ Object apply(Object obj2) {
                        return apply(((Number) obj2).longValue());
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Observable postCaptureObservable(Observable observable) {
        Observable observableFlatMap = observable.filter(new p() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.postCaptureObservable.1
            @Override // igm.p
            public final boolean test(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return CaptureValidationBubblePresenter.this.bubbleMode == OnfidoCaptureValidationBubble.BubbleMode.POST_CAPTURE;
            }
        }).map(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.postCaptureObservable.2
            @Override // igm.o
            @NotNull
            public final Visibility apply(@NotNull OnfidoCaptureValidationBubble.VisibilityCommand it8) {
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.getVisibility();
            }
        }).flatMap(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.postCaptureObservable.3
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Visibility visibility) {
                Intrinsics.checkNotNullParameter(visibility, "visibility");
                Observable observableJust = Observable.just(visibility);
                Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
                return visibility.getIsAppearing() ? AnnouncementService.announceString$default(CaptureValidationBubblePresenter.this.announcementService, new String[]{CaptureValidationBubblePresenter.this.view.getDisplayedText()}, false, 2, (Object) null).d(observableJust) : observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMap, "flatMap(...)");
        return observableFlatMap;
    }

    public void onAttach() {
        CompositeDisposable compositeDisposable = this.compositeDisposable;
        Observable observableObserveOn = this.view.visibilityChange().distinctUntilChanged().publish(new o() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.onAttach.1
            @Override // igm.o
            @NotNull
            public final ObservableSource apply(@NotNull Observable shared) {
                Intrinsics.checkNotNullParameter(shared, "shared");
                return CaptureValidationBubblePresenter.this.liveCaptureObservable(shared).mergeWith(CaptureValidationBubblePresenter.this.postCaptureObservable(shared));
            }
        }).subscribeOn(this.schedulersProvider.getIo()).observeOn(this.schedulersProvider.getUi());
        final View view = this.view;
        Disposable disposableSubscribe = observableObserveOn.subscribe(new g() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.onAttach.2
            @Override // igm.g
            public final void accept(@NotNull Visibility p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                view.renderVisibility(p0);
            }
        }, new g() { // from class: com.onfido.android.sdk.capture.validation.CaptureValidationBubblePresenter.onAttach.3
            @Override // igm.g
            public final void accept(@NotNull Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                Timber.INSTANCE.e(throwable, "Failure during visibility change", new Object[0]);
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        RxExtensionsKt.plusAssign(compositeDisposable, disposableSubscribe);
    }

    public void onDetach() {
        this.compositeDisposable.d();
    }
}
