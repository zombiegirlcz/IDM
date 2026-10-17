package com.onfido.android.sdk.capture.ui.camera;

import android.content.DialogInterface;
import com.onfido.android.sdk.capture.ui.camera.CapturePresenter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/content/DialogInterface;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class CapturePresenter$onGeneralUploadError$1 extends u implements Function1<DialogInterface, Unit> {
    final /* synthetic */ CapturePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CapturePresenter$onGeneralUploadError$1(CapturePresenter capturePresenter) {
        super(1);
        this.this$0 = capturePresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((DialogInterface) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull DialogInterface it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        CapturePresenter.View view = this.this$0.view;
        if (view != null) {
            view.openCaptureScreen();
        } else {
            Intrinsics.r("view");
            throw null;
        }
    }
}
