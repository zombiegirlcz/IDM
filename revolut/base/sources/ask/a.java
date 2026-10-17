package ask;

import aae.d;
import aii.o;
import aii.q;
import aii.r;
import com.revolut.feature.full_screen_prompt.navigation.PromptMarketingRetailBridgeDestination;
import com.revolut.feature.full_screen_prompt.navigation.PromptRetailBridgeDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import d67.u;
import i9e.b0;
import iah.f;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class a implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8951a;

    public /* synthetic */ a(int i) {
        this.f8951a = i;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b wrapperFlow) {
        switch (this.f8951a) {
            case 0:
                a10.b.y((q) rVar, "output", wrapperFlow, "wrapperFlow");
                break;
            case 1:
                com.revolut.feature.full_screen_prompt.c output = (com.revolut.feature.full_screen_prompt.c) rVar;
                int i = f67.b.f132406a;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                o oVarH1 = wrapperFlow.h1();
                PromptRetailBridgeDestination.Output.INSTANCE.getClass();
                knm.b.j(oVarH1, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("PROMPT_OUTPUT_ARG", PromptRetailBridgeDestination.Output.Companion.a(output))), null, 4)));
                wrapperFlow.I2(output);
                break;
            case 2:
                u output2 = (u) rVar;
                int i2 = f67.b.f132406a;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlow");
                o oVarH12 = wrapperFlow.h1();
                PromptMarketingRetailBridgeDestination.Output.INSTANCE.getClass();
                knm.b.j(oVarH12, new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("PROMPT_OUTPUT_ARG", PromptMarketingRetailBridgeDestination.Output.Companion.a(output2))), null, 4)));
                wrapperFlow.I2(output2);
                break;
            case 3:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                break;
            case 4:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                break;
            case 5:
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "wrapperFlowModel");
                break;
            case 6:
                Intrinsics.checkNotNullParameter((f) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.J2();
                break;
            case 7:
                int i3 = b0.f159666a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "flowModel");
                break;
            case 8:
                int i5 = b0.f159666a;
                a10.b.y((q) rVar, "<unused var>", wrapperFlow, "flowModel");
                break;
            default:
                int i6 = b0.f159666a;
                Intrinsics.checkNotNullParameter((d) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(wrapperFlow, "wrapperFlowModel");
                wrapperFlow.J2();
                break;
        }
    }
}
