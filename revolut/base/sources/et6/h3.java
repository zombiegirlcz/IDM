package et6;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class h3 {

    @NotNull
    public static final d3 Companion = new d3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.e f129241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jf1.a f129242b;

    public h3(gr6.e freelancerAvailabilityInteractor, jf1.a proMerchantTogglesInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAvailabilityInteractor, "freelancerAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(proMerchantTogglesInteractor, "proMerchantTogglesInteractor");
        this.f129241a = freelancerAvailabilityInteractor;
        this.f129242b = proMerchantTogglesInteractor;
    }

    public final Object a(cs6.c cVar, gim.c cVar2) {
        int i = e3.f129219a[cVar.ordinal()];
        gr6.e eVar = this.f129241a;
        if (i == 1) {
            return ((l0) eVar).g(cVar2);
        }
        if (i == 2) {
            return ((l0) eVar).e(cVar2);
        }
        if (i == 3) {
            return b(cVar2);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof et6.g3
            if (r0 == 0) goto L13
            r0 = r8
            et6.g3 r0 = (et6.g3) r0
            int r1 = r0.f129233w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129233w = r1
            goto L18
        L13:
            et6.g3 r0 = new et6.g3
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129233w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L46
        L36:
            yhm.o.b(r8)
            r0.f129233w = r4
            gr6.e r8 = r7.f129241a
            et6.l0 r8 = (et6.l0) r8
            java.lang.Object r8 = r8.c(r0)
            if (r8 != r1) goto L46
            goto L65
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L67
            r0.f129233w = r3
            jf1.a r8 = r7.f129242b
            zfc.d r8 = (zfc.d) r8
            o7.b r2 = r8.f321922a
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            zfc.c r4 = new zfc.c
            r5 = 0
            r6 = 1
            r4.<init>(r8, r5, r6)
            java.lang.Object r8 = r2.x(r3, r4, r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            return r8
        L67:
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.h3.b(gim.c):java.lang.Object");
    }

    public final v0f.p c() {
        Continuation continuation = null;
        return com.google.crypto.tink.shaded.protobuf.t1.e(new vkm.y(new a35.j(2, 18, continuation), new vkm.v1(new e38.c(this, continuation, 27))), new r1(11));
    }
}
