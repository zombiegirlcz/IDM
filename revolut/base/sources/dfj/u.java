package dfj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class u {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final aod.a f114113h = new aod.a(skm.z.f264021a, 1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2 f114114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.a1 f114115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s3 f114116c;
    public final k0 d;
    public final ynj.m e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dm0.d f114117g;

    public u(v2 profilesInteractor, nfj.a1 profilesRepository, s3 subscriptionsInteractor, k0 installationStateInteractor, ynj.m installationStateResolver, l esimConfigurationInteractor, dm0.d deviceIdProvider) {
        Intrinsics.checkNotNullParameter(profilesInteractor, "profilesInteractor");
        Intrinsics.checkNotNullParameter(profilesRepository, "profilesRepository");
        Intrinsics.checkNotNullParameter(subscriptionsInteractor, "subscriptionsInteractor");
        Intrinsics.checkNotNullParameter(installationStateInteractor, "installationStateInteractor");
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        Intrinsics.checkNotNullParameter(esimConfigurationInteractor, "esimConfigurationInteractor");
        Intrinsics.checkNotNullParameter(deviceIdProvider, "deviceIdProvider");
        this.f114114a = profilesInteractor;
        this.f114115b = profilesRepository;
        this.f114116c = subscriptionsInteractor;
        this.d = installationStateInteractor;
        this.e = installationStateResolver;
        this.f = esimConfigurationInteractor;
        this.f114117g = deviceIdProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof dfj.s
            if (r0 == 0) goto L13
            r0 = r8
            dfj.s r0 = (dfj.s) r0
            int r1 = r0.f114098y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114098y = r1
            goto L18
        L13:
            dfj.s r0 = new dfj.s
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f114096w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114098y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.v
            yhm.o.b(r8)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L58
        L3b:
            yhm.o.b(r8)
            r0.u = r7
            r0.f114098y = r4
            dfj.v2 r8 = r6.f114114a
            r8.getClass()
            dfj.r2 r2 = new dfj.r2
            r4 = 0
            r2.<init>(r5, r8, r7, r4)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r2, r0)
            if (r8 != r1) goto L58
            goto L72
        L58:
            r2 = r8
            bej.i r2 = (bej.i) r2
            boolean r2 = r2 instanceof bej.g
            if (r2 == 0) goto L73
            chf.a r2 = new chf.a
            r4 = 11
            r2.<init>(r6, r7, r5, r4)
            r0.u = r5
            r0.v = r8
            r0.f114098y = r3
            java.lang.Object r7 = skm.e0.G(r2, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.u.a(java.lang.String, gim.c):java.lang.Object");
    }
}
