package dob;

import com.revolut.feature.tab.accounts.models.ProductAccountId;
import djb.n;
import djb.q;
import dmb.m;
import g48.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import rnb.i;
import rnb.v;
import tnb.b0;
import tnb.e0;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements pfe.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f116482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f116483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f116484c;

    public h(q savingsTransactionInteractor, n savingsAccountsDetailsInteractor, r0 jointAccountInteractor) {
        Intrinsics.checkNotNullParameter(savingsTransactionInteractor, "savingsTransactionInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountInteractor, "jointAccountInteractor");
        this.f116482a = savingsTransactionInteractor;
        this.f116483b = savingsAccountsDetailsInteractor;
        this.f116484c = jointAccountInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b9, code lost:
    
        if (r13 == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Set r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dob.h.a(java.util.Set, gim.c):java.lang.Object");
    }

    @Override // pfe.f
    public final Object b(Set set, gim.c cVar) {
        int i;
        Flow flowH;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        Iterator it8 = set2.iterator();
        while (true) {
            i = 0;
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (a0.H(((ProductAccountId) next).f89729a, "Total-", false)) {
                arrayList.add(next);
            }
        }
        Continuation continuation = null;
        if (arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
            Iterator it9 = set2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(rd0.e.b(zi0.c.J(((i) this.f116483b).b(((ProductAccountId) it9.next()).f89729a, w4l.h.f294642c))));
            }
            return vkm.q.z(mo3.a.g(xam.a.h(new c(this, continuation, i), u0.k(arrayList2)), null, new m(15), 1), cVar);
        }
        if (arrayList.size() > 1) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Only one total-account is allowed but " + arrayList.size() + " were received. " + ((ProductAccountId) d0.b0(arrayList)).f89729a + " will be used");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        String str = ((ProductAccountId) d0.b0(arrayList)).f89729a;
        e0.Companion.getClass();
        if (Intrinsics.f(str, b0.f272369b)) {
            flowH = ((v) this.f116482a).c();
        } else if (Intrinsics.f(str, b0.f272370c)) {
            flowH = xam.a.h(new b(this, null), new amh.w(k38.c.a(this.f116484c, null, null, 3), 5));
        } else {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(p.a.p("Total account ", str, " is not supported"));
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var2);
            flowH = null;
        }
        if (flowH != null) {
            return vkm.q.z(mo3.a.g(flowH, null, new m(13), 1), cVar);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.ArrayList r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof dob.d
            if (r0 == 0) goto L13
            r0 = r7
            dob.d r0 = (dob.d) r0
            int r1 = r0.f116477w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f116477w = r1
            goto L18
        L13:
            dob.d r0 = new dob.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f116477w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L7a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r6, r2)
            r7.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L41:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r6.next()
            com.revolut.feature.tab.accounts.models.ProductAccountId r2 = (com.revolut.feature.tab.accounts.models.ProductAccountId) r2
            java.lang.String r2 = r2.f89729a
            djb.q r4 = r5.f116482a
            rnb.v r4 = (rnb.v) r4
            kotlinx.coroutines.flow.Flow r2 = r4.d(r2)
            r7.add(r2)
            goto L41
        L5b:
            j23.b r6 = zh9.u0.k(r7)
            dob.a r7 = new dob.a
            r2 = 2
            r7.<init>(r2)
            dmb.m r2 = new dmb.m
            r4 = 14
            r2.<init>(r4)
            r4 = 2
            jhi.b r6 = mo3.a.h(r6, r7, r2, r4)
            r0.f116477w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L7a
            return r1
        L7a:
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L81
            zhm.h0 r6 = zhm.h0.f322473a
            return r6
        L81:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: dob.h.d(java.util.ArrayList, gim.c):java.lang.Object");
    }
}
