package g03;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import h93.f0;
import h93.j0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import xy2.a;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b f139269b;

    public /* synthetic */ l(com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar, int i) {
        this.f139268a = i;
        this.f139269b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        efm.r rVarJ;
        switch (this.f139268a) {
            case 0:
                xy2.a result = (xy2.a) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (!Intrinsics.f(result, a.C1720a.f309555a)) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar = this.f139269b;
                bVar.n2(new u(bVar, null, 3), new whi.b(6));
                return Unit.f186387a;
            case 1:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return (data.getLoading() || data.getContent() != null) ? data : zi0.c.P(((a) ((j2) this.f139269b.B.f22677a).getValue()).f139254b, false, null, 3);
            case 2:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                f0 f0Var = (f0) rVar.f314201a;
                od0.i iVar = (od0.i) rVar.f314202b;
                ld6.f fVar = (ld6.f) rVar.f314203c;
                i93.c cVar = (i93.c) iVar.f224257a;
                if (cVar == null) {
                    cVar = f0Var.f150113g;
                }
                f0 card = f0.b(f0Var, cVar);
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar2 = this.f139269b;
                bVar2.H2(bVar2.B, new fpk.b(card, fVar, 28));
                i03.c cVar2 = bVar2.f64871q;
                AccountId accountId = bVar2.o.f64868b;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(card, "card");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                efm.r map = cVar2.f157283a.a(card, accountId).map(new hy2.l(new hul.v(cVar2, card, 22), 17));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return rd0.e.b(ue0.e.H(map, h0.f322473a, new hy2.k(22)));
            case 3:
                List designs = (List) obj2;
                Intrinsics.checkNotNullParameter(designs, "designs");
                List list = designs;
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((e93.f) next).c(), this.f139269b.o.f64867a.f150114h.f13639a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                e93.e eVar = next instanceof e93.e ? (e93.e) next : null;
                Iterator it9 = list.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (ce9.m.s((e93.f) next2)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                return eVar == null ? next2 instanceof e93.e ? (e93.e) next2 : null : eVar;
            default:
                f0 newDisposableCard = (f0) obj2;
                Intrinsics.checkNotNullParameter(newDisposableCard, "newDisposableCard");
                com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.b bVar3 = this.f139269b;
                hy2.f fVar2 = bVar3.v;
                boolean zM = bVar3.o.f64867a.M();
                boolean zE = fVar2.e();
                v6l.s sVar = fVar2.f156704a;
                if (zE) {
                    rVarJ = sVar.h(true, (126 & 2) != 0 ? null : zM ? j0.PRO : null, (126 & 4) != 0 ? null : null, (126 & 8) != 0 ? null : null, null, null, null);
                } else {
                    rVarJ = sVar.j(true, (2046 & 2) != 0 ? null : null, (2046 & 4) != 0 ? false : false, (2046 & 8) != 0 ? false : zM, false, false, null, null, (2046 & 256) != 0 ? null : null, null, null);
                }
                efm.b bVarIgnoreElements = m70.a.g(mo3.a.n(rVarJ), null, null, 3).ignoreElements();
                Intrinsics.checkNotNullExpressionValue(bVarIgnoreElements, "ignoreElements(...)");
                return bVarIgnoreElements.f(te0.w.j(newDisposableCard));
        }
    }
}
