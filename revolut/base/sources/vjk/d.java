package vjk;

import ffk.t;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vge.r;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cha.b f289800l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f289801m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f289802n;

    public d(cha.b familyPlansInteractor, t pricingPlanInteractor, e cancelFamilyExtraSuccessConfigProvider) {
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cancelFamilyExtraSuccessConfigProvider, "cancelFamilyExtraSuccessConfigProvider");
        this.f289800l = familyPlansInteractor;
        this.f289801m = pricingPlanInteractor;
        this.f289802n = cancelFamilyExtraSuccessConfigProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(vjk.d r10, hha.d r11, java.lang.String r12, kotlin.jvm.functions.Function0 r13, gim.c r14) {
        /*
            r10.getClass()
            boolean r2 = r14 instanceof vjk.c
            if (r2 == 0) goto L17
            r2 = r14
            vjk.c r2 = (vjk.c) r2
            int r3 = r2.f289799x
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f289799x = r3
        L15:
            r6 = r2
            goto L1d
        L17:
            vjk.c r2 = new vjk.c
            r2.<init>(r10, r14)
            goto L15
        L1d:
            java.lang.Object r1 = r6.v
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.f289799x
            r8 = 1
            if (r2 == 0) goto L38
            if (r2 != r8) goto L30
            kotlin.jvm.functions.Function0 r0 = r6.u
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            yhm.o.b(r1)
            goto L62
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            yhm.o.b(r1)
            a3b.i r9 = new a3b.i
            r1 = 22
            r9.<init>(r10, r11, r1)
            s15.j r0 = new s15.j
            r1 = 26
            r5 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = r13
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            r6.u = r1
            r6.f289799x = r8
            r1 = 0
            r5 = 3
            r3 = r0
            r4 = r6
            r2 = r9
            r0 = r10
            java.lang.Object r1 = n14.k.R(r0, r1, r2, r3, r4, r5)
            if (r1 != r7) goto L61
            return r7
        L61:
            r0 = r13
        L62:
            nii.e r1 = (nii.e) r1
            boolean r1 = r1 instanceof nii.d
            if (r1 == 0) goto L6b
            r0.invoke()
        L6b:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vjk.d.b3(vjk.d, hha.d, java.lang.String, kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    @Override // vjk.a
    public final void Z2(Function0 onSuccess) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        V2(new r(this, onSuccess, null, 19), new yi5.b(29));
    }
}
