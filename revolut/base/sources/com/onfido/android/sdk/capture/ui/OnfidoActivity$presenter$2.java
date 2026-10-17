package com.onfido.android.sdk.capture.ui;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenter;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoActivity$presenter$2 extends u implements Function0<OnfidoPresenter> {
    final /* synthetic */ OnfidoActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoActivity$presenter$2(OnfidoActivity onfidoActivity) {
        super(0);
        this.this$0 = onfidoActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final OnfidoPresenter invoke() {
        return this.this$0.getPresenterFactory$onfido_capture_sdk_core_release().create(this.this$0.getOnfidoConfig$onfido_capture_sdk_core_release());
    }
}
