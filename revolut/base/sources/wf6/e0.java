package wf6;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 {

    @NotNull
    private static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe6.m f296983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y70.a f296984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q06.d f296985c;
    public final FeatureCommand d;

    public e0(oe6.m openBankingInteractor, y70.a appInstalledChecker, q06.d deeplinkParser) {
        Intrinsics.checkNotNullParameter(openBankingInteractor, "openBankingInteractor");
        Intrinsics.checkNotNullParameter(appInstalledChecker, "appInstalledChecker");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        this.f296983a = openBankingInteractor;
        this.f296984b = appInstalledChecker;
        this.f296985c = deeplinkParser;
        this.d = new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof wf6.c0
            if (r0 == 0) goto L13
            r0 = r6
            wf6.c0 r0 = (wf6.c0) r0
            int r1 = r0.f296977w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296977w = r1
            goto L18
        L13:
            wf6.c0 r0 = new wf6.c0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296977w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            q06.d r6 = r4.f296985c
            s06.c r6 = (s06.c) r6
            jf0.c r5 = r6.d(r5)
            if (r5 == 0) goto L4b
            r0.f296977w = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            if (r6 != 0) goto L4a
            goto L4b
        L4a:
            return r6
        L4b:
            com.revolut.retail.core.navigation.FeatureCommand r5 = r4.d
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.e0.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(jf0.c r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf6.e0.b(jf0.c, gim.c):java.lang.Object");
    }
}
