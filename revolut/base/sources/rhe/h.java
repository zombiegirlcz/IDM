package rhe;

import com.revolut.feature.tab.accounts.models.ProductId;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ProductId f254420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f254421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f254422y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, ProductId productId, List list, Set set, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f254420w = productId;
        this.f254421x = list;
        this.f254422y = set;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.v, this.f254420w, this.f254421x, this.f254422y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084 A[RETURN] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.u
            com.revolut.feature.tab.accounts.models.ProductId r2 = r8.f254420w
            rhe.m r3 = r8.v
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1a
            if (r1 != r4) goto L12
            yhm.o.b(r9)
            goto L59
        L12:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1a:
            yhm.o.b(r9)
            java.util.Map r9 = r3.f254432a
            java.lang.Object r9 = r9.get(r2)
            pfe.f r9 = (pfe.f) r9
            if (r9 == 0) goto L5c
            java.util.List r1 = r8.f254421x
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = zhm.w.t(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L4c
            java.lang.Object r7 = r1.next()
            com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value$Main r7 = (com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value.Main) r7
            com.revolut.feature.tab.accounts.models.ProductAccountId r7 = r7.f89728b
            r6.add(r7)
            goto L3a
        L4c:
            java.util.Set r1 = zhm.d0.i1(r6)
            r8.u = r4
            java.lang.Object r9 = r9.b(r1, r8)
            if (r9 != r0) goto L59
            return r0
        L59:
            tof.i7 r9 = (tof.i7) r9
            goto L5d
        L5c:
            r9 = r5
        L5d:
            aim.o r0 = new aim.o
            r0.<init>()
            java.util.Set r1 = rhe.m.d
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L6f
            tof.k2 r1 = tof.k2.NOT_SPARE_CHANGE
            r0.add(r1)
        L6f:
            java.util.Set r1 = r8.f254422y
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            aim.o r0 = zhm.y0.a(r0)
            if (r9 == 0) goto L84
            mhf.b r1 = r3.f254433b
            r2 = 2
            tof.i7 r9 = mhf.b.a(r1, r9, r5, r0, r2)
            return r9
        L84:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rhe.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
