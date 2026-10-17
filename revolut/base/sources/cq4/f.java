package cq4;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ hl4.g A;
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f107995w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f107996x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Boolean f107997y;
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dj0.d dVar, Boolean bool, com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a aVar, hl4.g gVar, Continuation continuation) {
        super(1, continuation);
        this.f107996x = dVar;
        this.f107997y = bool;
        this.z = aVar;
        this.A = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.f107996x, this.f107997y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r1 == r14) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r5 = r16
            com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a r0 = r5.z
            yki.i r13 = r0.z
            fim.a r14 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f107995w
            r15 = 2
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 == r2) goto L21
            if (r1 != r15) goto L19
            yhm.o.b(r17)
            r1 = r17
            goto L97
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            int r1 = r5.v
            int r2 = r5.u
            yhm.o.b(r17)
            r8 = r1
            r1 = r17
            goto L7c
        L2c:
            yhm.o.b(r17)
            dj0.d r1 = r5.f107996x
            if (r1 == 0) goto L47
            dj0.d r3 = dj0.d.e
            boolean r1 = r1.f(r3)
            if (r1 == 0) goto L47
            java.lang.Boolean r1 = r5.f107997y
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            if (r1 != 0) goto L47
            r7 = r2
            goto L49
        L47:
            r1 = 0
            r7 = r1
        L49:
            if (r7 == 0) goto L4e
            int r1 = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_bottom_sheet_success_after_checkout_title
            goto L50
        L4e:
            int r1 = com.revolut.feature.credit.core.R$string.credit_facility_cancellation_credit_card_bottom_sheet_success_direct_title
        L50:
            cq4.d r3 = new cq4.d
            r3.<init>()
            al6.c r4 = new al6.c
            r6 = 2
            r4.<init>(r6)
            cq4.e r6 = new cq4.e
            java.lang.Boolean r11 = r5.f107997y
            r12 = 0
            hl4.g r9 = r5.A
            dj0.d r10 = r5.f107996x
            r8 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r5.u = r7
            r5.v = r1
            r5.f107995w = r2
            r2 = r1
            r1 = 0
            r8 = r2
            r2 = r4
            r4 = r6
            r6 = 1
            java.lang.Object r1 = n14.k.V(r0, r1, r2, r3, r4, r5, r6)
            if (r1 != r14) goto L7b
            goto L96
        L7b:
            r2 = r7
        L7c:
            nii.h r1 = (nii.h) r1
            boolean r3 = r1 instanceof nii.g
            if (r3 == 0) goto La6
            nii.g r1 = (nii.g) r1
            java.lang.Object r1 = r1.f216152a
            hl4.f r1 = (hl4.f) r1
            java.lang.String r1 = r1.f152980b
            r5.u = r2
            r5.v = r8
            r5.f107995w = r15
            java.lang.Object r1 = com.revolut.feature.credit.card.impl.ui.cancellation.flow.cancellation.a.I2(r0, r1, r5)
            if (r1 != r14) goto L97
        L96:
            return r14
        L97:
            aii.u r1 = (aii.u) r1
            if (r1 == 0) goto La0
            aii.n r0 = r0.C1(r1)
            return r0
        La0:
            oki.h.D2(r13)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        La6:
            boolean r0 = r1 instanceof nii.f
            if (r0 == 0) goto Lb0
            oki.h.D2(r13)
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        Lb0:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cq4.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
