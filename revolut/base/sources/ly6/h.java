package ly6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ FreelancerInvoice A;
    public final /* synthetic */ jy6.h B;
    public final /* synthetic */ FreelancerInvoiceSettings C;
    public h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f200711w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f200712x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ k f200713y;
    public final /* synthetic */ CoroutineScope z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(boolean z, boolean z3, k kVar, CoroutineScope coroutineScope, FreelancerInvoice freelancerInvoice, jy6.h hVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Continuation continuation) {
        super(1, continuation);
        this.f200711w = z;
        this.f200712x = z3;
        this.f200713y = kVar;
        this.z = coroutineScope;
        this.A = freelancerInvoice;
        this.B = hVar;
        this.C = freelancerInvoiceSettings;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.f200711w, this.f200712x, this.f200713y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r12.i(r11) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r11.v
            r2 = 2
            r3 = 1
            ly6.k r5 = r11.f200713y
            r8 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r12)
            goto L6a
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            skm.h0 r1 = r11.u
            yhm.o.b(r12)
            goto L5c
        L21:
            yhm.o.b(r12)
            r12 = 3
            kotlinx.coroutines.CoroutineScope r1 = r11.z
            jy6.h r7 = r11.B
            boolean r4 = r11.f200711w
            if (r4 == 0) goto L3b
            lr.l r4 = new lr.l
            r9 = 5
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r6 = r11.A
            r4.<init>(r5, r6, r7, r8, r9)
            skm.h0 r4 = skm.e0.g(r1, r8, r8, r4, r12)
            r10 = r4
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r4 = r11.f200712x
            if (r4 == 0) goto L4d
            lr.l r4 = new lr.l
            r9 = 6
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r6 = r11.C
            r4.<init>(r5, r6, r7, r8, r9)
            skm.h0 r12 = skm.e0.g(r1, r8, r8, r4, r12)
            goto L4e
        L4d:
            r12 = r8
        L4e:
            if (r10 == 0) goto L5d
            r11.u = r12
            r11.v = r3
            java.lang.Object r1 = r10.y(r11)
            if (r1 != r0) goto L5b
            goto L69
        L5b:
            r1 = r12
        L5c:
            r12 = r1
        L5d:
            if (r12 == 0) goto L6a
            r11.u = r8
            r11.v = r2
            java.lang.Object r12 = r12.i(r11)
            if (r12 != r0) goto L6a
        L69:
            return r0
        L6a:
            aii.o r12 = r5.r2()
            ly6.d$a r0 = ly6.d.a.f200708b
            aii.n r12 = r12.M0(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ly6.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
