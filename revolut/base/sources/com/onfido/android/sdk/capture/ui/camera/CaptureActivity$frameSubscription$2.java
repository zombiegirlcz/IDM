package com.onfido.android.sdk.capture.ui.camera;

import com.onfido.android.sdk.capture.utils.LifecycleDisposableKt;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CaptureActivity$frameSubscription$2 extends u implements Function0<CompositeDisposable> {
    final /* synthetic */ CaptureActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureActivity$frameSubscription$2(CaptureActivity captureActivity) {
        super(0);
        this.this$0 = captureActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CompositeDisposable invoke() {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        LifecycleDisposableKt.disposeOnDestroy(compositeDisposable, this.this$0);
        return compositeDisposable;
    }
}
