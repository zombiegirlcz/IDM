package ogk;

import aii.q;
import aii.r;
import android.os.Parcelable;
import bw6.h;
import cn3.b;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.payments.social.api.navigation.PeerToPeerChatDestination;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FinishCommand;
import d67.s;
import d67.u;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import njd.c;
import ojd.c;
import plk.e;
import pth.h;
import s8k.j;
import zhm.d0;
import zhm.h0;
import zhm.q0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements qii.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225191a;

    public /* synthetic */ b(int i) {
        this.f225191a = i;
    }

    @Override // qii.a
    public final void a(r rVar, qii.b flow) {
        int i = 0;
        switch (this.f225191a) {
            case 0:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 1:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 2:
                Intrinsics.checkNotNullParameter((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_cancellation.kompot.a) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "flow");
                flow.J2();
                return;
            case 3:
                plk.e output = (plk.e) rVar;
                Intrinsics.checkNotNullParameter(output, "output");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlow");
                if (!Intrinsics.f(output, e.a.f237437a)) {
                    if (!Intrinsics.f(output, e.b.f237438a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = -1;
                }
                knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(Integer.valueOf(i), null, null, 6)));
                return;
            case 4:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 5:
                Intrinsics.checkNotNullParameter((sjk.c) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "flow");
                flow.J2();
                return;
            case 6:
                Intrinsics.checkNotNullParameter((com.revolut.retail.feature.pricing_plans.ui.impl.flows.plan_durable_terms.a) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "flow");
                flow.J2();
                return;
            case 7:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 8:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 9:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 10:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 11:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 12:
                a10.b.y((q) rVar, "<unused var>", flow, ib.b.Flow);
                return;
            case 13:
                int i2 = h.f239692a;
                Intrinsics.checkNotNullParameter((til.r) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                flow.J2();
                return;
            case 14:
                cn3.b output2 = (cn3.b) rVar;
                Intrinsics.checkNotNullParameter(output2, "output");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlow");
                if (Intrinsics.f(output2, b.a.f25343a)) {
                    flow.J2();
                    return;
                }
                if (output2 instanceof cn3.c) {
                    List list = ((cn3.c) output2).f25344a;
                    knm.b.j(flow.l1(), list.size() == 1 ? new PeerToPeerChatDestination(((cn3.e) d0.b0(list)).f25347a, null, false) : new MainContainerScreenDestination.JustShow(ibb.c.f160142c.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14));
                    return;
                } else {
                    if (!(output2 instanceof cn3.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Not supported here");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    return;
                }
            case 15:
                Intrinsics.checkNotNullParameter((yv9.e) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "wrapper");
                flow.J2();
                return;
            case 16:
                mo6.c result = (mo6.c) rVar;
                Intrinsics.checkNotNullParameter(result, "result");
                Intrinsics.checkNotNullParameter(flow, "wrapperModel");
                knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(-1, a0.d.x("pocketId", result.f207557a), null, 4)));
                return;
            case 17:
                Intrinsics.checkNotNullParameter((yv9.e) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "wrapper");
                flow.J2();
                return;
            case 18:
                int i3 = r8h.e.f252459a;
                a10.b.y((q) rVar, "<unused var>", flow, "wrapperFlowModel");
                return;
            case 19:
                a10.b.y((q) rVar, "<unused var>", flow, "wrapperFlowModel");
                return;
            case 20:
                Intrinsics.checkNotNullParameter((nz6.c) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(-1, null, null, 6)));
                return;
            case 21:
                u result2 = (u) rVar;
                Intrinsics.checkNotNullParameter(result2, "result");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                if (Intrinsics.f(result2, d67.q.f111462a) || Intrinsics.f(result2, s.f111464a)) {
                    flow.J2();
                    return;
                }
                return;
            case 22:
                bw6.h output3 = (bw6.h) rVar;
                Intrinsics.checkNotNullParameter(output3, "output");
                Intrinsics.checkNotNullParameter(flow, "model");
                if (!Intrinsics.f(output3, h.a.f19248a)) {
                    throw new NoWhenBranchMatchedException();
                }
                flow.J2();
                return;
            case 23:
                a10.b.y((q) rVar, "<unused var>", flow, "wrapperFlow");
                return;
            case 24:
                ojd.c output4 = (ojd.c) rVar;
                Intrinsics.checkNotNullParameter(output4, "output");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlow");
                if (output4 instanceof c.a) {
                    knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(1, null, null, 6)));
                    return;
                } else {
                    knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(0, null, null, 6)));
                    return;
                }
            case 25:
                njd.c output5 = (njd.c) rVar;
                Intrinsics.checkNotNullParameter(output5, "output");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlow");
                if (output5 instanceof c.a) {
                    knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(1, null, null, 6)));
                    return;
                } else {
                    knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(0, null, null, 6)));
                    return;
                }
            case 26:
                Intrinsics.checkNotNullParameter((el3.c) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                flow.J2();
                return;
            case 27:
                ipg.b result3 = (ipg.b) rVar;
                int i5 = upg.c.f282054a;
                Intrinsics.checkNotNullParameter(result3, "result");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlowModel");
                flow.I2(result3);
                return;
            case 28:
                Intrinsics.checkNotNullParameter((j) rVar, "<unused var>");
                Intrinsics.checkNotNullParameter(flow, "flow");
                flow.J2();
                return;
            default:
                RevPointsSpareChangeControllerApi$Result output6 = (RevPointsSpareChangeControllerApi$Result) rVar;
                int i6 = v1c.d.f285291a;
                Intrinsics.checkNotNullParameter(output6, "output");
                Intrinsics.checkNotNullParameter(flow, "wrapperFlow");
                RevPointsSpareChangeControllerApi$BridgeDestination.INSTANCE.getClass();
                Intrinsics.checkNotNullParameter(output6, "output");
                knm.b.j(flow.l1(), new BridgeDestination(new FinishCommand(-1, q0.c(new Pair("REV_POINTS_SPARE_CHANGE_BRIDGE_ARGS", output6)), null, 4)));
                return;
        }
    }

    public /* synthetic */ b(Object obj2, int i) {
        this.f225191a = i;
    }
}
