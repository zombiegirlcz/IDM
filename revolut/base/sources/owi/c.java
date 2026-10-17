package owi;

import com.revolut.kompot.common.transition.ZoomTarget;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.home.LoungePassHomeFlowContract$Step;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.WalletPassTarget;
import com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a;
import jxi.s;
import jxi.t;
import jxi.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import svi.q;
import sxi.j;
import sxi.k;
import uwi.l;
import uwi.m;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f230453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b f230454b;

    public /* synthetic */ c(com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar, int i) {
        this.f230453a = i;
        this.f230454b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        q qVar;
        switch (this.f230453a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar = this.f230454b;
                h.t2(bVar, bVar.f98973p, new LoungePassHomeFlowContract$Step.Home(false), false, null, false, 12);
                return Boolean.FALSE;
            case 1:
                l output = (l) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean z = output instanceof m;
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar2 = this.f230454b;
                if (z) {
                    m mVar = (m) output;
                    h.t2(bVar2, bVar2.f98973p, new LoungePassHomeFlowContract$Step.LoungeDetails(mVar.f283680a, mVar.f283682c), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                } else if (Intrinsics.f(output, l.a.f283678a)) {
                    h.t2(bVar2, bVar2.f98973p, new LoungePassHomeFlowContract$Step.PassDetails(null), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(output, l.b.f283679a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(bVar2, bVar2.f98973p, LoungePassHomeFlowContract$Step.PurchasePass.f98970a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 2:
                com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a output2 = (com.revolut.retail.feature.airportlounges.impl.ui.screens.home.a) obj2;
                Intrinsics.checkNotNullParameter(output2, "output");
                boolean z3 = output2 instanceof a.C0605a;
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar3 = this.f230454b;
                if (z3) {
                    h.t2(bVar3, bVar3.f98973p, LoungePassHomeFlowContract$Step.PurchasePass.f98970a, true, null, false, 12);
                } else if (output2 instanceof a.f) {
                    h.t2(bVar3, bVar3.f98973p, LoungePassHomeFlowContract$Step.LoungeSearch.f98967a, true, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (output2 instanceof a.c) {
                    h.t2(bVar3, bVar3.f98973p, new LoungePassHomeFlowContract$Step.PassDetails(null), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                } else if (output2 instanceof u) {
                    i iVar = bVar3.f98973p;
                    WalletPassTarget walletPassTarget = ((u) output2).f179229a;
                    Intrinsics.checkNotNullParameter(walletPassTarget, "<this>");
                    int i = czi.f.f110264a[walletPassTarget.ordinal()];
                    if (i == 1) {
                        qVar = q.RECURRING;
                    } else if (i == 2) {
                        qVar = q.UNLIMITED;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        qVar = q.LIMITED;
                    }
                    h.t2(bVar3, iVar, new LoungePassHomeFlowContract$Step.PassDetails(qVar), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                } else if (output2 instanceof s) {
                    h.t2(bVar3, bVar3.f98973p, new LoungePassHomeFlowContract$Step.AirportDetails(((s) output2).f179226a), true, TransitionAnimation.FADE.f98392a, false, 8);
                } else if (output2 instanceof a.e) {
                    h.t2(bVar3, bVar3.f98973p, LoungePassHomeFlowContract$Step.SavedLounges.f98972a, true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                } else if (output2 instanceof a.b) {
                    h.t2(bVar3, bVar3.f98973p, LoungePassHomeFlowContract$Step.PassActivity.f98968a, true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                } else if (output2 instanceof t) {
                    i iVar2 = bVar3.f98973p;
                    t tVar = (t) output2;
                    String str = tVar.f179227a;
                    h.t2(bVar3, iVar2, new LoungePassHomeFlowContract$Step.LoungeDetails(str, tVar.f179228b), true, com.revolut.kompot.common.transition.a.d(TransitionAnimation.INSTANCE, new ZoomTarget.ListId(str), null), false, 8);
                } else {
                    if (!(output2 instanceof a.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(bVar3, bVar3.f98973p, LoungePassHomeFlowContract$Step.Refund.f98971a, true, null, false, 12);
                }
                return Unit.f186387a;
            case 3:
                k output3 = (k) obj2;
                Intrinsics.checkNotNullParameter(output3, "output");
                boolean z4 = output3 instanceof j;
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar4 = this.f230454b;
                if (z4) {
                    h.t2(bVar4, bVar4.f98973p, new LoungePassHomeFlowContract$Step.LoungeAmenities(((j) output3).f266507a), true, null, false, 12);
                } else if (Intrinsics.f(output3, k.a.f266508a)) {
                    h.t2(bVar4, bVar4.f98973p, new LoungePassHomeFlowContract$Step.PassDetails(null), true, null, false, 12);
                } else {
                    if (!Intrinsics.f(output3, k.b.f266509a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    h.t2(bVar4, bVar4.f98973p, LoungePassHomeFlowContract$Step.PurchasePass.f98970a, true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                vyi.k output4 = (vyi.k) obj2;
                Intrinsics.checkNotNullParameter(output4, "output");
                if (!(output4 instanceof vyi.j)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b bVar5 = this.f230454b;
                vyi.j jVar = (vyi.j) output4;
                h.t2(bVar5, bVar5.f98973p, new LoungePassHomeFlowContract$Step.LoungeDetails(jVar.f293337a, jVar.f293338b), true, com.revolut.kompot.common.transition.a.a(TransitionAnimation.INSTANCE), false, 8);
                return Unit.f186387a;
        }
    }
}
