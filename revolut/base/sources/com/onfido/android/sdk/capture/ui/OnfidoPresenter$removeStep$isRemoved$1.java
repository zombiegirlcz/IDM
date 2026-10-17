package com.onfido.android.sdk.capture.ui;

import com.onfido.android.sdk.capture.ui.options.FlowAction;
import com.onfido.android.sdk.capture.ui.options.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "invoke", "(Lcom/onfido/android/sdk/capture/ui/options/FlowStep;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoPresenter$removeStep$isRemoved$1 extends u implements Function1<FlowStep, Boolean> {
    final /* synthetic */ FlowAction $flowAction;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnfidoPresenter$removeStep$isRemoved$1(FlowAction flowAction) {
        super(1);
        this.$flowAction = flowAction;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull FlowStep it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return Boolean.valueOf(it8.getAction() == this.$flowAction);
    }
}
