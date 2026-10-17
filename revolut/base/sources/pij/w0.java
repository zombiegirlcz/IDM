package pij;

import com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes11.dex */
public final class w0 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f236595w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f236596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f236597y;
    public final /* synthetic */ EsimDataPlanOfferInfo z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, String str, String str2, long j2, EsimDataPlanOfferInfo esimDataPlanOfferInfo, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
        this.f236595w = str;
        this.f236596x = str2;
        this.f236597y = j2;
        this.z = esimDataPlanOfferInfo;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new w0(this.v, this.f236595w, this.f236596x, this.f236597y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((w0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r1.G1(r2, r18) == r3) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b r1 = r0.v
            unj.j r2 = r1.M
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r0.u
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L25
            if (r4 == r6) goto L1f
            if (r4 != r5) goto L17
            yhm.o.b(r19)
            goto La6
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L1f:
            yhm.o.b(r19)
            r4 = r19
            goto L59
        L25:
            yhm.o.b(r19)
            bej.m r4 = r1.L
            cli.y r7 = r1.f101081e0
            java.lang.Object r7 = r7.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            pij.v r7 = (pij.v) r7
            java.lang.String r10 = r7.f236584j
            r0.u = r6
            r9 = r4
            dfj.q3 r9 = (dfj.q3) r9
            r9.getClass()
            dfj.m3 r8 = new dfj.m3
            r17 = 0
            java.lang.String r11 = r0.f236595w
            r12 = 0
            java.lang.String r13 = r0.f236596x
            long r14 = r0.f236597y
            com.revolut.retail.feature.esim.api.model.EsimDataPlanOfferInfo r4 = r0.z
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r17)
            java.lang.Object r4 = r9.a(r8, r0)
            if (r4 != r3) goto L59
            goto La5
        L59:
            bej.k r4 = (bej.k) r4
            boolean r6 = r4 instanceof bej.j
            if (r6 == 0) goto L7d
            bej.j r4 = (bej.j) r4
            boolean r3 = r4.f14855a
            if (r3 == 0) goto L71
            r2.getClass()
            nii.y0 r2 = unj.j.c()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L71:
            r2.getClass()
            nii.y0 r2 = unj.j.a()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L7d:
            bej.k$a r6 = bej.k.a.f14856a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r4, r6)
            if (r6 == 0) goto L91
            r2.getClass()
            nii.y0 r2 = unj.j.b()
            kotlinx.coroutines.flow.Flow r1 = r1.X1(r2)
            return r1
        L91:
            boolean r2 = r4 instanceof bej.l
            if (r2 == 0) goto La9
            bej.l r4 = (bej.l) r4
            java.lang.String r2 = r4.f14857a
            f9i.c r2 = foh.i.a(r2)
            r0.u = r5
            java.lang.Object r1 = r1.G1(r2, r0)
            if (r1 != r3) goto La6
        La5:
            return r3
        La6:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        La9:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pij.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
