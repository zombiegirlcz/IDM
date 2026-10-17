package zx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f326058w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoiceSettings f326059x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f326058w = oVar;
        this.f326059x = freelancerInvoiceSettings;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f326058w, this.f326059x, continuation, 0);
            default:
                return new n(this.f326058w, this.f326059x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.u
            switch(r0) {
                case 0: goto L78;
                default: goto L5;
            }
        L5:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 0
            r3 = 1
            zx6.o r4 = r7.f326058w
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L15
            goto L39
        L15:
            r8 = move-exception
            goto L3d
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1f:
            yhm.o.b(r8)
            java.lang.String r8 = "BUTTON_TAG_SAVE"
            zx6.n r1 = new zx6.n     // Catch: java.lang.Throwable -> L15
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r5 = r7.f326059x     // Catch: java.lang.Throwable -> L15
            r6 = 0
            r1.<init>(r4, r5, r2, r6)     // Catch: java.lang.Throwable -> L15
            r7.v = r3     // Catch: java.lang.Throwable -> L15
            tji.f r3 = r4.X()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r8 = zh9.u0.b0(r3, r8, r1, r7)     // Catch: java.lang.Throwable -> L15
            if (r8 != r0) goto L39
            goto L77
        L39:
            r4.B2()     // Catch: java.lang.Throwable -> L15
            goto L75
        L3d:
            boolean r0 = r8 instanceof com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError.InvoiceNumberTaken
            if (r0 == 0) goto L68
            r0 = r8
            com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError$InvoiceNumberTaken r0 = (com.revolut.feature.freelancer.impl.network.errorhandling.FreelancerServerError.InvoiceNumberTaken) r0
            java.lang.String r1 = r0.f73538c
            if (r1 == 0) goto L68
            tji.f r8 = r4.X()
            jr6.m r1 = r4.f326060p
            java.lang.String r3 = r0.f73536a
            if (r3 != 0) goto L54
            java.lang.String r3 = ""
        L54:
            ct6.t r1 = (ct6.t) r1
            nii.y0 r1 = r1.f(r3)
            rv6.e r8 = r8.d(r1)
            zx6.m r1 = new zx6.m
            r1.<init>(r4, r0, r2)
            r0 = 3
            yji.l.b1(r4, r8, r2, r1, r0)
            goto L75
        L68:
            aii.o r0 = r4.l1()
            aii.i r1 = new aii.i
            r3 = 6
            r1.<init>(r8, r2, r3)
            r0.M0(r1)
        L75:
            kotlin.Unit r0 = kotlin.Unit.f186387a
        L77:
            return r0
        L78:
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.v
            r2 = 1
            if (r1 == 0) goto L8d
            if (r1 != r2) goto L85
            yhm.o.b(r8)
            goto La3
        L85:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L8d:
            yhm.o.b(r8)
            zx6.o r8 = r7.f326058w
            et6.p1 r8 = r8.f326061q
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r1 = r7.f326059x
            ufm.n r8 = r8.k(r1)
            r7.v = r2
            java.lang.Object r8 = nim.a.b(r8, r7)
            if (r8 != r0) goto La3
            r8 = r0
        La3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zx6.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
