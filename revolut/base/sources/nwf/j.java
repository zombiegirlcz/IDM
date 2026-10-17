package nwf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f219866w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f219866w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f219866w, continuation, 0);
            default:
                return new j(this.f219866w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[RETURN, SYNTHETIC] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.u
            switch(r0) {
                case 0: goto L3a;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.v
            nwf.l r2 = r8.f219866w
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            yhm.o.b(r9)
            goto L2c
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            yhm.o.b(r9)
            lvf.a r9 = r2.f219871q
            r8.v = r3
            lvf.c r9 = (lvf.c) r9
            java.lang.Object r9 = r9.Z2(r8)
            if (r9 != r0) goto L2c
            goto L39
        L2c:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r9 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r9
            ch1.f r0 = new ch1.f
            r1 = 1
            r0.<init>(r9, r1)
            r2.x2(r0)
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L39:
            return r0
        L3a:
            nwf.l r0 = r8.f219866w
            ouf.a r1 = r0.f219870p
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L5a
            if (r3 == r5) goto L56
            if (r3 != r4) goto L4e
            yhm.o.b(r9)
            goto L90
        L4e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L56:
            yhm.o.b(r9)
            goto L6a
        L5a:
            yhm.o.b(r9)
            lvf.a r9 = r0.f219871q
            r8.v = r5
            lvf.c r9 = (lvf.c) r9
            java.lang.Object r9 = r9.Z2(r8)
            if (r9 != r2) goto L6a
            goto Lc0
        L6a:
            com.revolut.feature.location.api.domain.models.location.LocationDomain r9 = (com.revolut.feature.location.api.domain.models.location.LocationDomain) r9
            if (r9 == 0) goto Lb4
            jki.i r3 = r0.t2()
            nwf.e r3 = (nwf.e) r3
            java.lang.String r3 = r3.f219860a
            double r5 = r9.f78066a
            java.lang.Double r7 = new java.lang.Double
            r7.<init>(r5)
            double r5 = r9.f78067b
            java.lang.Double r9 = new java.lang.Double
            r9.<init>(r5)
            r8.v = r4
            r4 = r1
            ivf.r r4 = (ivf.r) r4
            java.io.Serializable r9 = r4.a(r3, r7, r9, r8)
            if (r9 != r2) goto L90
            goto Lc0
        L90:
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r9 = zhm.d0.d0(r9)
            com.revolut.feature.transport.models.TransportLocation r9 = (com.revolut.feature.transport.models.TransportLocation) r9
            if (r9 == 0) goto Lb2
            com.revolut.feature.transport.models.TransportLocation r2 = com.revolut.feature.transport.models.TransportLocation.a(r9)
            ivf.r r1 = (ivf.r) r1
            r1.g(r2)
            nwf.g r1 = new nwf.g
            com.revolut.feature.transport.models.TransportLocation r9 = com.revolut.feature.transport.models.TransportLocation.a(r9)
            r1.<init>(r9)
            r0.v2(r1)
            kotlin.Unit r2 = kotlin.Unit.f186387a
            goto Lc0
        Lb2:
            r2 = 0
            goto Lc0
        Lb4:
            nuc.n r9 = new nuc.n
            r1 = 22
            r9.<init>(r1)
            r0.x2(r9)
            kotlin.Unit r2 = kotlin.Unit.f186387a
        Lc0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nwf.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
