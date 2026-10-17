package elf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class r0 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f127401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final tqi.d f127402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vte.a f127403n;

    public r0(klf.h0 commonDataSource, tqi.d shareExternalDestinationFactory, vte.a topUpInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        this.f127401l = commonDataSource;
        this.f127402m = shareExternalDestinationFactory;
        this.f127403n = topUpInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.Object r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof elf.q0
            if (r0 == 0) goto L13
            r0 = r7
            elf.q0 r0 = (elf.q0) r0
            int r1 = r0.f127398w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127398w = r1
            goto L18
        L13:
            elf.q0 r0 = new elf.q0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127398w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof java.lang.String
            r2 = 0
            if (r7 == 0) goto L3a
            java.lang.String r6 = (java.lang.String) r6
            goto L3b
        L3a:
            r6 = r2
        L3b:
            if (r6 == 0) goto L4c
            eg4.b r7 = new eg4.b
            r4 = 7
            r7.<init>(r5, r6, r2, r4)
            r0.f127398w = r3
            java.lang.Object r6 = r5.Y2(r0, r7)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.r0.Z2(java.lang.Object, gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_MCY_ACCOUNT_DETAILS_SHARE_ACTION")) {
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 != null) {
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                A2(((tqi.e) this.f127402m).b("", str2));
            }
            z = true;
        } else {
            if (Intrinsics.f(str, "ID_MCY_TRANSFER_CANCEL_ACTION")) {
                return Z2(obj2, (gim.c) continuation);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
