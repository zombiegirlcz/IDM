package yx6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;
import wx6.h;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ FreelancerInvoice A;
    public final /* synthetic */ h B;
    public final /* synthetic */ FreelancerInvoiceSettings C;
    public h0 u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f317578w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f317579x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ g f317580y;
    public final /* synthetic */ CoroutineScope z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z, boolean z3, g gVar, CoroutineScope coroutineScope, FreelancerInvoice freelancerInvoice, h hVar, FreelancerInvoiceSettings freelancerInvoiceSettings, Continuation continuation) {
        super(1, continuation);
        this.f317578w = z;
        this.f317579x = z3;
        this.f317580y = gVar;
        this.z = coroutineScope;
        this.A = freelancerInvoice;
        this.B = hVar;
        this.C = freelancerInvoiceSettings;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f317578w, this.f317579x, this.f317580y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r12.i(r11) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
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
            yx6.g r5 = r11.f317580y
            r8 = 0
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            yhm.o.b(r12)
            goto L6c
        L13:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1b:
            skm.h0 r1 = r11.u
            yhm.o.b(r12)
            goto L5e
        L21:
            yhm.o.b(r12)
            r12 = 3
            kotlinx.coroutines.CoroutineScope r1 = r11.z
            wx6.h r7 = r11.B
            boolean r4 = r11.f317578w
            if (r4 == 0) goto L3c
            y65.l r4 = new y65.l
            r9 = 20
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice r6 = r11.A
            r4.<init>(r5, r6, r7, r8, r9)
            skm.h0 r4 = skm.e0.g(r1, r8, r8, r4, r12)
            r10 = r4
            goto L3d
        L3c:
            r10 = r8
        L3d:
            boolean r4 = r11.f317579x
            if (r4 == 0) goto L4f
            y65.l r4 = new y65.l
            r9 = 21
            com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings r6 = r11.C
            r4.<init>(r5, r6, r7, r8, r9)
            skm.h0 r12 = skm.e0.g(r1, r8, r8, r4, r12)
            goto L50
        L4f:
            r12 = r8
        L50:
            if (r10 == 0) goto L5f
            r11.u = r12
            r11.v = r3
            java.lang.Object r1 = r10.y(r11)
            if (r1 != r0) goto L5d
            goto L6b
        L5d:
            r1 = r12
        L5e:
            r12 = r1
        L5f:
            if (r12 == 0) goto L6c
            r11.u = r8
            r11.v = r2
            java.lang.Object r12 = r12.i(r11)
            if (r12 != r0) goto L6c
        L6b:
            return r0
        L6c:
            aii.o r12 = r5.r2()
            yx6.c$a r0 = yx6.c.a.f317576b
            aii.n r12 = r12.M0(r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yx6.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
