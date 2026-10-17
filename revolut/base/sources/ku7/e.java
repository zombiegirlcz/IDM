package ku7;

import elm.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import sri.m;
import te0.w;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements cu7.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f189729a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cu7.c f189730b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kw7.c f189731c;
    public final List d;

    public e(m navigator, cu7.c navigationCommandFactory, kw7.c insuranceAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(navigationCommandFactory, "navigationCommandFactory");
        Intrinsics.checkNotNullParameter(insuranceAvailabilityInteractor, "insuranceAvailabilityInteractor");
        this.f189729a = navigator;
        this.f189730b = navigationCommandFactory;
        this.f189731c = insuranceAvailabilityInteractor;
        this.d = u.c("insurance");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2.equals("purchase-protection") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0090, code lost:
    
        if (r2.equals("everyday-protection") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        return zhm.v.k(dl7.a.PURCHASE_PROTECTION_METAL, dl7.a.PURCHASE_PROTECTION_PLUS, dl7.a.PURCHASE_PROTECTION_PREMIUM);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(java.lang.String r2) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku7.e.b(java.lang.String):java.util.List");
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return !d0.W(deeplink.e(2)) && this.d.contains(deeplink.e(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ku7.b
            if (r0 == 0) goto L13
            r0 = r6
            ku7.b r0 = (ku7.b) r0
            int r1 = r0.f189724w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189724w = r1
            goto L18
        L13:
            ku7.b r0 = new ku7.b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189724w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L52
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            kw7.c r6 = r5.f189731c
            gw7.a r2 = gw7.a.EMBEDDED_INSURANCE
            akg.n r6 = r6.a(r2)
            zfd.e r6 = zi0.c.w(r6)
            ku1.f0 r2 = new ku1.f0
            r4 = 3
            r2.<init>(r4)
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r2, r3)
            r0.f189724w = r3
            java.lang.Object r6 = vkm.q.z(r6, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            if (r6 == 0) goto L5b
            boolean r6 = r6.booleanValue()
            goto L5c
        L5b:
            r6 = 0
        L5c:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ku7.e.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0242, code lost:
    
        if (r12 == r1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013e, code lost:
    
        if (r12 == r1) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015e, code lost:
    
        if (r12 == r1) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(jf0.c r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ku7.e.d(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ku7.c
            if (r0 == 0) goto L13
            r0 = r6
            ku7.c r0 = (ku7.c) r0
            int r1 = r0.f189725w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f189725w = r1
            goto L1a
        L13:
            ku7.c r0 = new ku7.c
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f189725w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.f189725w = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L3d
            return r1
        L3d:
            com.revolut.kompot.common.ParcelableDestination r6 = (com.revolut.kompot.common.ParcelableDestination) r6
            r5 = 0
            if (r6 == 0) goto L48
            q06.h r0 = new q06.h
            r0.<init>(r6, r5)
            return r0
        L48:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ku7.e.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        p0 p0Var = p0.f264001a;
        return ue0.e.F(w.o0(f.f127540b, new kq5.d(this, deeplink, null, 12)), Boolean.FALSE);
    }
}
