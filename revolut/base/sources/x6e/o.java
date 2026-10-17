package x6e;

import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.Subaccount;
import cxe.u;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import vy5.d0;
import wa7.p;
import zh9.u0;
import zhm.r0;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f303078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f303079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.b f303080c;
    public final x79.a d;
    public final y79.a e;
    public final hj8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xqe.b f303081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zf8.n f303082h;
    public final jla.h i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wa7.m f303083j;
    public final p k;

    public o(ang.f userInteractor, g6e.d subaccountInteractor, g6e.b subaccountBackgroundInteractor, x79.a onHoldAccountInteractor, y79.a onHoldAccountMapper, c subaccountEmptyStateProvider, hj8.a juniorProfileInteractor, xqe.b teenProfileInteractor, zf8.n juniorAccountStatesProvider, jla.h productCatalogueInteractor, wa7.m hiddenAccountsInteractor, p hiddenAccountsActionsProvider) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(subaccountEmptyStateProvider, "subaccountEmptyStateProvider");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsActionsProvider, "hiddenAccountsActionsProvider");
        this.f303078a = userInteractor;
        this.f303079b = subaccountInteractor;
        this.f303080c = subaccountBackgroundInteractor;
        this.d = onHoldAccountInteractor;
        this.e = onHoldAccountMapper;
        this.f = juniorProfileInteractor;
        this.f303081g = teenProfileInteractor;
        this.f303082h = juniorAccountStatesProvider;
        this.i = productCatalogueInteractor;
        this.f303083j = hiddenAccountsInteractor;
        this.k = hiddenAccountsActionsProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.subaccount.api.models.Subaccount r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof x6e.k
            if (r0 == 0) goto L13
            r0 = r6
            x6e.k r0 = (x6e.k) r0
            int r1 = r0.f303072w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f303072w = r1
            goto L18
        L13:
            x6e.k r0 = new x6e.k
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f303072w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = zhm.u.c(r5)
            r0.f303072w = r3
            jhi.k r6 = r4.b(r5)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            x64.a r5 = new x64.a
            r0 = 6
            r5.<init>(r0)
            akg.n r5 = nim.a.v(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x6e.o.a(com.revolut.feature.subaccount.api.models.Subaccount, gim.c):java.lang.Object");
    }

    public final jhi.k b(List list) {
        Flow flowV;
        Flow flowB;
        vkm.d dVarB = rd0.e.b(this.f303078a.k(false));
        u uVarE = ((d89.g) this.d).e(z79.b.OTHER);
        z zVar = (z) this.f303079b;
        d0 d0Var = new d0(zVar.r(), 16);
        List list2 = list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it8 = list2.iterator();
        while (it8.hasNext()) {
            linkedHashSet.add(((Subaccount) it8.next()).getF88959a().f234881a);
        }
        Flow flowM = zVar.m(linkedHashSet);
        boolean z = list2 instanceof Collection;
        w4l.h hVar = w4l.h.f294642c;
        if (z && list2.isEmpty()) {
            flowV = new go.g(new Data(new j(r0.g(), r0.g()), null, false, 6, null), 2);
        } else {
            Iterator it9 = list2.iterator();
            while (it9.hasNext()) {
                if (((Subaccount) it9.next()) instanceof Subaccount.Junior) {
                    flowV = nim.a.v(u0.m(rd0.e.b(this.f303082h.d(null, hVar)), ((nj8.n) this.f).k(null, hVar)), new x64.a(5));
                    break;
                }
            }
            flowV = new go.g(new Data(new j(r0.g(), r0.g()), null, false, 6, null), 2);
        }
        ahe.l lVar = new ahe.l(this.f303083j.k(), 29);
        if (z && list2.isEmpty()) {
            flowB = new go.g(new Data(r0.g(), null, false, 6, null), 2);
        } else {
            Iterator it10 = list2.iterator();
            while (it10.hasNext()) {
                if (((Subaccount) it10.next()) instanceof Subaccount.Teen) {
                    flowB = this.f303081g.b(hVar);
                    break;
                }
            }
            flowB = new go.g(new Data(r0.g(), null, false, 6, null), 2);
        }
        return nim.a.u(new l(null, list, this), u0.i(u0.i(dVarB, uVarE, d0Var), u0.i(flowM, flowV, lVar), flowB));
    }
}
