package twb;

import com.revolut.feature.rev_points.api.navigation.RevPointsFeatureConfig;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import com.revolut.feature.rev_points.giftcards.api.model.UserVoucherDetails;
import com.revolut.feature.rev_points.giftcards.api.model.VoucherProduct;
import com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.RevPointsGiftcardDetailsScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.r0;
import skm.a2;
import vkm.j2;
import vkm.q0;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f274999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a f275000b;

    public /* synthetic */ t(com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar, int i) {
        this.f274999a = i;
        this.f275000b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        tvb.c cVar;
        int i = this.f274999a;
        com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar = this.f275000b;
        int i2 = 23;
        Continuation continuation = null;
        int i3 = 0;
        int i5 = 1;
        switch (i) {
            case 0:
                if (((Boolean) obj2).booleanValue()) {
                    aVar.D.a();
                    aVar.E.a();
                    VoucherProduct voucherProduct = ((l) ((j2) aVar.J.f22677a).getValue()).d;
                    if (voucherProduct != null) {
                        aVar.M2(voucherProduct);
                    }
                }
                return Unit.f186387a;
            case 1:
                UserVoucherDetails it8 = (UserVoucherDetails) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                cli.y yVar = aVar.J;
                kwb.b bVar = (kwb.b) ((l) ((j2) yVar.f22677a).getValue()).f274986a.getContent();
                m1c.x xVar = bVar != null ? bVar.f190327b : null;
                kwb.b bVar2 = (kwb.b) ((l) ((j2) yVar.f22677a).getValue()).f274986a.getContent();
                if (bVar2 == null || (cVar = bVar2.d) == null) {
                    cVar = tvb.c.GLOBAL;
                }
                return new kwb.b(null, xVar, it8, cVar);
            case 2:
                uvb.e result = (uvb.e) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof uvb.b;
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar2 = this.f275000b;
                if (z) {
                    aVar2.C1(new RevPointsBuyingDestination(aVar2.H));
                } else if (result instanceof uvb.c) {
                    aVar2.H2(aVar2.J, new tpl.o(result, 20));
                    tvb.a aVar3 = ((uvb.c) result).f283348a;
                    aVar2.l2(new tna.p(aVar3.f274742b, aVar2, continuation, i2), new yi5.b(26));
                    a2 a2Var = aVar2.G;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    yji.l.a1(aVar2, vkm.q.q(nim.a.v(aVar2.f83719r.b(aVar3.f274741a), new t(aVar2, i5))), null, null, new x(aVar2, continuation, 5), 3);
                    Unit unit = Unit.f186387a;
                } else {
                    if (!(result instanceof uvb.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C1(new BridgeDestination(gc0.c.f(new RevPointsFeatureConfig.RevPointsEarnConfig(0))));
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails.a aVar4 = this.f275000b;
                vii.b bVar3 = aVar4.D;
                int i6 = a0.f274969a[((r0) obj2).f201447a.ordinal()];
                int i21 = 2;
                if (i6 == 1) {
                    ang.f fVar = aVar4.B;
                    RevPointsGiftcardDetailsScreenContract$InputData revPointsGiftcardDetailsScreenContract$InputData = aVar4.o;
                    String str = revPointsGiftcardDetailsScreenContract$InputData.f83708a;
                    int i22 = 12;
                    w4l.h hVar = w4l.h.f294642c;
                    if (str != null) {
                        aVar4.G = yji.l.a1(aVar4, nim.a.v(u0.i(vkm.q.Q(aVar4.E, new z(continuation, aVar4, str, i3)), new q0(vkm.q.Q(bVar3, new tik.b(continuation, aVar4, i22)), new x(aVar4, continuation, i3), 1), fVar.j(hVar)), new tsk.j(i2)), null, null, new x(aVar4, continuation, i5), 3);
                    } else {
                        String str2 = revPointsGiftcardDetailsScreenContract$InputData.f83709b;
                        if (str2 != null) {
                            yji.l.a1(aVar4, nim.a.v(u0.i(new q0(vkm.q.Q(bVar3, new tik.b(continuation, aVar4, i22)), new x(aVar4, continuation, i3), 1), vkm.q.Q(aVar4.F, new z(continuation, aVar4, str2, i5)), fVar.j(hVar)), new tsk.j(24)), null, null, new x(aVar4, continuation, i21), 3);
                        }
                    }
                    yji.l.a1(aVar4, rd0.e.n(rd0.e.b(aVar4.v.p()), zhm.h0.f322473a), null, null, new x(aVar4, continuation, 3), 3);
                } else {
                    if (i6 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar4.n2(new y(aVar4, null), new whi.b(6));
                }
                return Unit.f186387a;
        }
    }
}
