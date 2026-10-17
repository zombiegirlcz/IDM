package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.ui.OnfidoPresenterInitializer;
import com.onfido.android.sdk.capture.utils.OnfidoConfigExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "initializeResultSuccess", "Lcom/onfido/android/sdk/capture/ui/OnfidoPresenterInitializer$InitializerResult$Success;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoPresenter$initFlow$1 extends u implements Function1<OnfidoPresenterInitializer.InitializerResult.Success, Unit> {
    final /* synthetic */ boolean $isRestoringState;
    final /* synthetic */ boolean $isSystemDarkModeEnabled;
    final /* synthetic */ OnfidoPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoPresenter$initFlow$1(boolean z, OnfidoPresenter onfidoPresenter, boolean z3) {
        super(1);
        this.$isRestoringState = z;
        this.this$0 = onfidoPresenter;
        this.$isSystemDarkModeEnabled = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((OnfidoPresenterInitializer.InitializerResult.Success) obj2);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull OnfidoPresenterInitializer.InitializerResult.Success initializeResultSuccess) {
        Intrinsics.checkNotNullParameter(initializeResultSuccess, "initializeResultSuccess");
        if (this.$isRestoringState) {
            return;
        }
        if (OnfidoConfigExtensionsKt.inWorkflowMode(this.this$0.getOnfidoConfig())) {
            this.this$0.initOrchestrationFlow(initializeResultSuccess.getShouldAskForConsent());
        } else {
            this.this$0.initFlowSteps(initializeResultSuccess.getShouldAskForConsent());
            this.this$0.startFlow();
        }
        this.this$0.trackFlowInitiatedEvents(this.$isSystemDarkModeEnabled);
    }
}
