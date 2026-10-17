package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.ui.options.FlowStep;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/onfido/android/sdk/capture/ui/options/FlowStep;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class OnfidoLogMapper$getSdkConfig$expectedFlowSteps$1 extends u implements Function1<FlowStep, CharSequence> {
    public static final OnfidoLogMapper$getSdkConfig$expectedFlowSteps$1 INSTANCE = new OnfidoLogMapper$getSdkConfig$expectedFlowSteps$1();

    public OnfidoLogMapper$getSdkConfig$expectedFlowSteps$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull FlowStep it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        String strName = it8.getAction().name();
        Locale locale = Locale.US;
        return a.r(locale, "US", strName, locale, "toLowerCase(...)");
    }
}
