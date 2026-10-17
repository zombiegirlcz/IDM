package nw9;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q06.k;
import sri.m;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements jf0.d, k {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f219805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f219806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y2c.c f219807c;
    public final y8k.b d;
    public final f e;
    public final Set f;

    public d(m navigator, ang.f userInteractor, y2c.c revolutMeInteractor, y8k.b peerToPeerFeatureConfigProvider, f paymentProfileDeeplinkTargetAccountProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutMeInteractor, "revolutMeInteractor");
        Intrinsics.checkNotNullParameter(peerToPeerFeatureConfigProvider, "peerToPeerFeatureConfigProvider");
        Intrinsics.checkNotNullParameter(paymentProfileDeeplinkTargetAccountProvider, "paymentProfileDeeplinkTargetAccountProvider");
        this.f219805a = navigator;
        this.f219806b = userInteractor;
        this.f219807c = revolutMeInteractor;
        this.d = peerToPeerFeatureConfigProvider;
        this.e = paymentProfileDeeplinkTargetAccountProvider;
        String[] elements = {"payments-qr-scan", "my-payment-profile", "username-contact", "payment-profiles", "p2p-transfer"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f = kotlin.collections.d.y0(elements);
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return this.f.contains(deeplink.e(1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0171, code lost:
    
        if (r0 != r3) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw9.d.b(jf0.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r8.equals("username-contact") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
    
        if (r8.equals("p2p-transfer") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d5, code lost:
    
        if (r8.equals("payment-profiles") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d8, code lost:
    
        r0.f219801w = 1;
        r8 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00de, code lost:
    
        if (r8 != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e0, code lost:
    
        return r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nw9.d.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        if (r5.equals("p2p-transfer") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r5.equals("payment-profiles") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
    
        return ue0.e.I(te0.w.o0(skm.p0.f264003c, new n8a.r(r3, r4, (kotlin.coroutines.Continuation) null, 25)), zhm.h0.f322473a, new nuc.n(18));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r5.equals("username-contact") == false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // jf0.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final efm.d0 f(jf0.c r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r5 = "deeplink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            r5 = 1
            java.lang.String r5 = r4.e(r5)
            int r0 = r5.hashCode()
            java.lang.String r1 = "fromCallable(...)"
            switch(r0) {
                case -1803623471: goto L59;
                case -1360725014: goto L50;
                case -1134560247: goto L37;
                case 1972596417: goto L1d;
                case 2124569129: goto L14;
                default: goto L13;
            }
        L13:
            goto L61
        L14:
            java.lang.String r0 = "username-contact"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
            goto L61
        L1d:
            java.lang.String r0 = "my-payment-profile"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L26
            goto L61
        L26:
            m1i.t r5 = new m1i.t
            r0 = 12
            r5.<init>(r4, r3, r0)
            ufm.c r4 = new ufm.c
            r0 = 2
            r4.<init>(r5, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
            return r4
        L37:
            java.lang.String r4 = "payments-qr-scan"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L40
            goto L61
        L40:
            nc0.a r4 = new nc0.a
            r5 = 2
            r4.<init>(r3, r5)
            ufm.c r5 = new ufm.c
            r0 = 2
            r5.<init>(r4, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            return r5
        L50:
            java.lang.String r0 = "p2p-transfer"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
            goto L61
        L59:
            java.lang.String r0 = "payment-profiles"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L6d
        L61:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            ufm.b r4 = efm.d0.m(r4)
            java.lang.String r5 = "just(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        L6d:
            kotlinx.coroutines.d r5 = skm.p0.f264003c
            n8a.r r0 = new n8a.r
            r1 = 0
            r2 = 25
            r0.<init>(r3, r4, r1, r2)
            ufm.b r4 = te0.w.o0(r5, r0)
            nuc.n r5 = new nuc.n
            r0 = 18
            r5.<init>(r0)
            zhm.h0 r0 = zhm.h0.f322473a
            pfm.z r4 = ue0.e.I(r4, r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nw9.d.f(jf0.c, boolean):efm.d0");
    }
}
