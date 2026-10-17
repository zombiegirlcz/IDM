package f7e;

import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import f5g.l;
import g48.r0;
import gim.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import pfe.f;
import s6e.l0;
import vkm.q;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6e.f f132598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f132599b;

    public b(g6e.f subaccountTransactionInteractor, r0 jointAccountsInteractor) {
        Intrinsics.checkNotNullParameter(subaccountTransactionInteractor, "subaccountTransactionInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        this.f132598a = subaccountTransactionInteractor;
        this.f132599b = jointAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r6, gim.c r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof f7e.a
            if (r6 == 0) goto L13
            r6 = r7
            f7e.a r6 = (f7e.a) r6
            int r0 = r6.f132597w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f132597w = r0
            goto L18
        L13:
            f7e.a r6 = new f7e.a
            r6.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f132597w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            yhm.o.b(r7)
            goto L4c
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            g48.r0 r7 = r5.f132599b
            akg.n r7 = r7.c()
            f5g.l r1 = new f5g.l
            r4 = 5
            r1.<init>(r4)
            jhi.b r7 = mo3.a.g(r7, r3, r1, r2)
            r6.f132597w = r2
            java.lang.Object r7 = vkm.q.z(r7, r6)
            if (r7 != r0) goto L4c
            return r0
        L4c:
            n38.a r7 = (n38.a) r7
            if (r7 == 0) goto L5e
            tof.hc r6 = new tof.hc
            java.lang.String r7 = r7.f211924b
            r6.<init>(r7, r3)
            java.util.Set r6 = zhm.y0.b(r6)
            if (r6 == 0) goto L5e
            return r6
        L5e:
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f7e.b.a(java.util.Set, gim.c):java.lang.Object");
    }

    @Override // pfe.f
    public final Object b(Set set, c cVar) {
        Set set2 = set;
        ArrayList arrayList = new ArrayList(w.t(set2, 10));
        Iterator it8 = set2.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ProductAccountId) it8.next()).f89729a);
        }
        return q.z(mo3.a.g(((l0) this.f132598a).b(d0.i1(arrayList), SubaccountType.Joint.f88961a), null, new l(6), 1), cVar);
    }
}
