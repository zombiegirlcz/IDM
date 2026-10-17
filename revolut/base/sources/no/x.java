package no;

import com.revolut.tracking.v3.AnalyticEvent;
import ho.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes17.dex */
public final class x extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ n.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f217863w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ z f217864x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f217865y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(n.a aVar, AnalyticEvent analyticEvent, z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f217863w = analyticEvent;
        this.f217864x = zVar;
        this.f217865y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new x(this.v, this.f217863w, this.f217864x, this.f217865y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((x) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006c, code lost:
    
        if (no.z.b(r6, true, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
    
        if (no.z.b(r6, false, r8) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        return r0;
     */
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
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L15:
            yhm.o.b(r9)
            goto L78
        L19:
            yhm.o.b(r9)
            ho.n$a r9 = r8.v
            boolean r1 = r9 instanceof ho.g0
            r4 = 0
            if (r1 == 0) goto L2a
            ho.g0 r9 = (ho.g0) r9
            ho.c r9 = (ho.c) r9
            boolean r9 = r9.e
            goto L2b
        L2a:
            r9 = r4
        L2b:
            r1 = 0
            com.revolut.tracking.v3.AnalyticEvent r5 = r8.f217863w
            if (r5 == 0) goto L43
            fo.h r6 = fo.i.Companion
            java.lang.String r7 = r8.f217865y
            if (r7 == 0) goto L3b
            fo.i r5 = kli.a.j(r6, r7, r5)
            goto L44
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Required value was null."
            r9.<init>(r0)
            throw r9
        L43:
            r5 = r1
        L44:
            no.z r6 = r8.f217864x
            if (r5 == 0) goto L5f
            if (r9 == 0) goto L5f
            no.r r9 = no.z.Companion
            gpk.c r9 = r6.e
            kotlinx.coroutines.CoroutineScope r9 = r9.c()
            skm.p0 r0 = skm.p0.f264001a
            elm.f r0 = elm.f.f127540b
            no.w r3 = new no.w
            r3.<init>(r6, r5, r1, r4)
            skm.e0.g(r9, r0, r1, r3, r2)
            goto L78
        L5f:
            if (r5 == 0) goto L6f
            fo.f r9 = r6.f217887j
            r9.a(r5)
            r8.u = r3
            java.lang.Object r9 = no.z.b(r6, r3, r8)
            if (r9 != r0) goto L78
            goto L77
        L6f:
            r8.u = r2
            java.lang.Object r9 = no.z.b(r6, r4, r8)
            if (r9 != r0) goto L78
        L77:
            return r0
        L78:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: no.x.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
