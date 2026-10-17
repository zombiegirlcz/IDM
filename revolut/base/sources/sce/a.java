package sce;

import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationSummary;
import efm.d0;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.h;
import qce.p0;
import qua.p;
import qua.u;
import rfm.f0;
import te0.w;
import ufm.i;
import yua.q;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f261718b;

    public /* synthetic */ a(e eVar, int i) {
        this.f261717a = i;
        this.f261718b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f261717a) {
            case 0:
                e eVar = this.f261718b;
                xua.a aVar = eVar.f261725b;
                mm.g it8 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                p subscription = (p) it8.f207101a;
                int i = c.f261721a[subscription.f249314a.f160152c.ordinal()];
                if (i == 1 || i == 2 || i == 3) {
                    Intrinsics.checkNotNullParameter(subscription, "subscription");
                    efm.b bVarH = ((q) aVar).u(subscription, true).h(sjg.a.b(eVar.f));
                    Intrinsics.checkNotNullExpressionValue(bVarH, "compose(...)");
                    return bVarH;
                }
                if (i == 4) {
                    Intrinsics.checkNotNullParameter(subscription, "subscription");
                    return ((q) aVar).v(subscription, true);
                }
                throw new IllegalStateException("Recurring payment of type " + subscription.f249314a.f160152c + " can not be blocked");
            case 1:
                mm.g it9 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                h hVar = new h(((q) this.f261718b.f261725b).f(((p) it9.f207101a).f249314a.f160150a), 4);
                Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
                return hVar;
            case 2:
                mm.g it10 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                xua.a aVar2 = this.f261718b.f261725b;
                String id10 = ((p) it10.f207101a).f249314a.f160150a;
                q qVar = (q) aVar2;
                Intrinsics.checkNotNullParameter(id10, "id");
                i iVar = new i(qVar.m(), new yta.c(4, new yua.c(qVar, id10, 1)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                h hVar2 = new h(iVar, 4);
                Intrinsics.checkNotNullExpressionValue(hVar2, "ignoreElement(...)");
                return hVar2;
            case 3:
                e eVar2 = this.f261718b;
                xua.a aVar3 = eVar2.f261725b;
                mm.g it11 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                p subscription2 = (p) it11.f207101a;
                boolean zR = u.r(subscription2);
                ibd.e eVar3 = subscription2.f249314a;
                if (zR) {
                    return new h(((q) aVar3).f(eVar3.f160150a), 4);
                }
                int i2 = c.f261721a[eVar3.f160152c.ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    Intrinsics.checkNotNullParameter(subscription2, "subscription");
                    efm.b bVarH2 = ((q) aVar3).u(subscription2, false).h(sjg.a.b(eVar2.f));
                    Intrinsics.checkNotNullExpressionValue(bVarH2, "compose(...)");
                    return bVarH2;
                }
                if (i2 == 4) {
                    Intrinsics.checkNotNullParameter(subscription2, "subscription");
                    return ((q) aVar3).v(subscription2, false);
                }
                throw new IllegalStateException("Recurring payment of type " + eVar3.f160152c + " can not be unblocked");
            case 4:
                mm.g it12 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                h hVar3 = new h(((q) this.f261718b.f261725b).j(((p) it12.f207101a).f249314a.f160150a), 4);
                Intrinsics.checkNotNullExpressionValue(hVar3, "ignoreElement(...)");
                return hVar3;
            case 5:
                xua.a aVar4 = this.f261718b.f261725b;
                mm.g action = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action, "action");
                Pair pair = (Pair) action.f207101a;
                p pVar = (p) pair.f186385a;
                fva.e eVar4 = (fva.e) pair.f186386b;
                ibd.e eVar5 = pVar.f249314a;
                String str = pVar.L;
                ibd.h hVar4 = eVar5.f160152c;
                String str2 = eVar5.f160150a;
                int i3 = c.f261721a[hVar4.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return ((q) aVar4).w(str2, eVar4, str);
                }
                if (i3 == 4) {
                    return ((q) aVar4).x(str2, eVar4, str);
                }
                throw new IllegalStateException("Frequency for recurring payment of type " + eVar5.f160152c + " can not be updated");
            case 6:
                mm.g action2 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action2, "action");
                xua.a aVar5 = this.f261718b.f261725b;
                p pVar2 = (p) action2.f207101a;
                String id11 = pVar2.f249314a.f160150a;
                String str3 = pVar2.L;
                q qVar2 = (q) aVar5;
                Intrinsics.checkNotNullParameter(id11, "id");
                pfm.a aVar6 = new pfm.a(qVar2.m(), new yta.c(7, new yua.b(qVar2, id11, str3, 0)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar6, "flatMapCompletable(...)");
                f0 f0VarF = aVar6.f(d0.m(qua.q.SUCCESS));
                Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
                return f0VarF;
            case 7:
                Intrinsics.checkNotNullParameter((ApmPaymentAuthorisationSummary) obj2, "it");
                ((q) this.f261718b.f261725b).t(false);
                return qua.q.SUCCESS;
            case 8:
                mm.g action3 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action3, "action");
                xua.a aVar7 = this.f261718b.f261725b;
                p0 p0Var = (p0) action3.f207101a;
                return ((q) aVar7).k(p0Var.f244756a.f249314a.f160150a, p0Var.f244757b.toString());
            case 9:
                mm.g action4 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action4, "action");
                ryc.a aVar8 = this.f261718b.f261726c;
                String authorisationId = ((p) action4.f207101a).f249314a.f160150a;
                Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
                f0 f0VarF2 = pd.b.n(kotlin.coroutines.g.f186406a, new s09.c(aVar8, authorisationId, null, 21)).f(d0.m(qua.q.SUCCESS));
                Intrinsics.checkNotNullExpressionValue(f0VarF2, "andThen(...)");
                return f0VarF2;
            case 10:
                mm.g action5 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action5, "action");
                kotlinx.coroutines.d dVar = skm.p0.f264003c;
                e eVar6 = this.f261718b;
                pfm.a aVarE = pd.b.n(dVar, new d(eVar6, action5, null, 2)).e(((q) eVar6.f261725b).t(false));
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                return aVarE;
            case 11:
                mm.g action6 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action6, "action");
                kotlinx.coroutines.d dVar2 = skm.p0.f264003c;
                e eVar7 = this.f261718b;
                i iVar2 = new i(w.o0(dVar2, new d(eVar7, action6, null, 1)), new sc7.g(new a(eVar7, 7), 7), 1);
                Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                return iVar2;
            case 12:
                mm.g it13 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                xua.a aVar9 = this.f261718b.f261725b;
                String id12 = ((p) it13.f207101a).f249314a.f160150a;
                q qVar3 = (q) aVar9;
                Intrinsics.checkNotNullParameter(id12, "id");
                i iVar3 = new i(qVar3.m(), new yta.c(5, new yua.c(qVar3, id12, 2)), 0);
                Intrinsics.checkNotNullExpressionValue(iVar3, "flatMap(...)");
                h hVar5 = new h(iVar3, 4);
                Intrinsics.checkNotNullExpressionValue(hVar5, "ignoreElement(...)");
                return hVar5;
            case 13:
                mm.g action7 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action7, "action");
                kotlinx.coroutines.d dVar3 = skm.p0.f264003c;
                e eVar8 = this.f261718b;
                pfm.a aVarE2 = pd.b.n(dVar3, new d(eVar8, action7, null, 0)).e(((q) eVar8.f261725b).t(true));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 14:
                mm.g action8 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action8, "action");
                e eVar9 = this.f261718b;
                i iVar4 = new i(((q) eVar9.f261725b).k(((p) action8.f207101a).f249314a.f160150a, null), new sc7.g(new s31.a(eVar9, action8, 23), 6), 0);
                Intrinsics.checkNotNullExpressionValue(iVar4, "flatMap(...)");
                return iVar4;
            case 15:
                mm.g action9 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action9, "action");
                kotlinx.coroutines.d dVar4 = skm.p0.f264003c;
                e eVar10 = this.f261718b;
                pfm.a aVarE3 = pd.b.n(dVar4, new d(eVar10, action9, null, 3)).e(((q) eVar10.f261725b).t(false));
                Intrinsics.checkNotNullExpressionValue(aVarE3, "andThen(...)");
                return aVarE3;
            default:
                mm.g action10 = (mm.g) obj2;
                Intrinsics.checkNotNullParameter(action10, "action");
                xua.a aVar10 = this.f261718b.f261725b;
                p pVar3 = (p) action10.f207101a;
                String id13 = pVar3.f249314a.f160150a;
                String str4 = pVar3.L;
                q qVar4 = (q) aVar10;
                Intrinsics.checkNotNullParameter(id13, "id");
                pfm.a aVar11 = new pfm.a(qVar4.m(), new yta.c(28, new yua.b(qVar4, id13, str4, 2)), 4);
                Intrinsics.checkNotNullExpressionValue(aVar11, "flatMapCompletable(...)");
                f0 f0VarF3 = aVar11.f(d0.m(qua.q.SUCCESS));
                Intrinsics.checkNotNullExpressionValue(f0VarF3, "andThen(...)");
                return f0VarF3;
        }
    }
}
