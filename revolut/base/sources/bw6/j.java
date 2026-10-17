package bw6;

import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f19250w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ FreelancerInvoice f19251x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z, l lVar, FreelancerInvoice freelancerInvoice, Continuation continuation) {
        super(1, continuation);
        this.v = z;
        this.f19250w = lVar;
        this.f19251x = freelancerInvoice;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new j(this.v, this.f19250w, this.f19251x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((j) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e8, code lost:
    
        if (nim.a.b(r2, r25) == r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bw6.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
