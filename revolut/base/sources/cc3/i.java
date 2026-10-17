package cc3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes21.dex */
public final class i extends gim.i implements Function1 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f22930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, Continuation continuation) {
        super(1, continuation);
        this.f22930w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f22930w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (nim.a.a(r8, r7) == r2) goto L17;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            cc3.j r0 = r7.f22930w
            kl.t1 r1 = r0.f22932q
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r7.v
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1e
            if (r3 != r4) goto L16
            cc3.j r0 = r7.u
            yhm.o.b(r8)
            goto L81
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            yhm.o.b(r8)
            goto L32
        L22:
            yhm.o.b(r8)
            efm.r r8 = r1.j()
            r7.v = r5
            java.lang.Object r8 = nim.a.c(r8, r7)
            if (r8 != r2) goto L32
            goto L80
        L32:
            od0.i r8 = (od0.i) r8
            java.lang.Object r8 = r8.g()
            com.revolut.feature.cash_topup.api.models.BarcodeDetails r8 = (com.revolut.feature.cash_topup.api.models.BarcodeDetails) r8
            if (r8 == 0) goto L90
            java.lang.String r8 = r8.f65584a
            r1.getClass()
            java.lang.String r3 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            java.lang.Object r1 = r1.f185240b
            jb3.d r1 = (jb3.d) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r3)
            com.revolut.feature.cash_topup.impl.data.service.CashTopUpBarcodeService r3 = r1.f172579a
            efm.b r8 = r3.deleteBarcode(r8)
            i1i.a r3 = new i1i.a
            r6 = 3
            r3.<init>(r1, r6)
            pfm.t r8 = r8.l(r3)
            jb3.c r3 = new jb3.c
            r6 = 1
            r3.<init>(r1, r6)
            j6k.g r1 = new j6k.g
            r6 = 6
            r1.<init>(r3, r6)
            pfm.t r8 = r8.m(r1)
            java.lang.String r1 = "doOnError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
            pfm.r r8 = te0.w.g0(r8)
            r7.u = r0
            r7.v = r4
            java.lang.Object r8 = nim.a.a(r8, r7)
            if (r8 != r2) goto L81
        L80:
            return r2
        L81:
            j60.a r8 = r0.o
            cc3.h r1 = new cc3.h
            r2 = 1
            r1.<init>(r0, r2)
            r0 = 0
            j60.a.v(r8, r0, r1, r5)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L90:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cc3.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
