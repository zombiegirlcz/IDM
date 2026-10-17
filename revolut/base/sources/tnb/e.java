package tnb;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tab.accounts.api.exceptions.ProductAccountNotFoundException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f272375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, g gVar, Continuation continuation) {
        super(2, continuation);
        this.v = str;
        this.f272375w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f272375w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Flow gVar;
        ahe.l lVar;
        Flow flowV;
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (!iVar.d() || !pcd.w.f234902a.contains(((SavingsAccountDetails) iVar.c()).f86460a.f234883c)) {
            return new go.g(new Data(null, new ProductAccountNotFoundException(j6.a.q("Can't build saving account with id = ", this.v)), false, 5, null), 2);
        }
        SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) iVar.c();
        pcd.s sVar = savingsAccountDetails.f86460a;
        g gVar2 = this.f272375w;
        djb.u uVar = gVar2.f272378b;
        List listC = zhm.u.c(sVar);
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(((rnb.x) uVar).a(listC, hVar));
        cxe.u uVarA = gVar2.f272379c.a(w4l.j.f294644c);
        cxe.u uVarE = ((d89.g) gVar2.d).e(z79.b.OTHER);
        int i = b.f272367a[sVar.f234889n.ordinal()];
        int i2 = 3;
        od0.i iVar2 = od0.i.f224256b;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            od0.i.Companion.getClass();
            gVar = new go.g(new Data(iVar2, null, false, 6, null), 2);
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = nim.a.v(gVar2.e.w(sVar.f, zhm.v.l(sVar.f234881a)), new tlf.n(9));
        }
        ahe.l lVar2 = new ahe.l(gVar2.f272382j.k(), 19);
        if (sVar.f234889n != pcd.b.PERSONAL_UNDER_18) {
            od0.i.Companion.getClass();
            lVar = lVar2;
            flowV = new go.g(new Data(iVar2, null, false, 6, null), 2);
        } else {
            lVar = lVar2;
            flowV = nim.a.v(gVar2.f.b(hVar), new en8.j(savingsAccountDetails, i2));
        }
        return nim.a.u(new qqj.g(null, gVar2, savingsAccountDetails), u0.m(u0.i(dVarB, uVarA, uVarE), u0.i(gVar, lVar, flowV)));
    }
}
