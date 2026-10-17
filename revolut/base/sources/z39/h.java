package z39;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import nnb.l;
import org.jetbrains.annotations.NotNull;
import yhm.j;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z70.c f319226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f319227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f319228c;
    public Boolean d;

    public h(e mockedLocationChecker, z70.c globalSettingsProvider, d mockLocationAppsChecker, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mockedLocationChecker, "mockedLocationChecker");
        Intrinsics.checkNotNullParameter(globalSettingsProvider, "globalSettingsProvider");
        Intrinsics.checkNotNullParameter(mockLocationAppsChecker, "mockLocationAppsChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f319226a = globalSettingsProvider;
        this.f319227b = mockLocationAppsChecker;
        this.f319228c = j.b(new l(featureToggleInteractor, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.location.Location r9) {
        /*
            r8 = this;
            java.lang.String r0 = "location"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.Lazy r1 = r8.f319228c
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L33
            java.lang.Boolean r1 = r8.d
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r2)
            if (r1 != 0) goto L31
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L2b
            boolean r0 = a41.g0.z(r9)
            goto L2f
        L2b:
            boolean r0 = r9.isFromMockProvider()
        L2f:
            if (r0 == 0) goto L33
        L31:
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 == 0) goto L61
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r2 = rd0.c.WARNING
            double r3 = r9.getLatitude()
            double r5 = r9.getLongitude()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Location is spoofed: "
            r9.<init>(r1)
            r9.append(r3)
            java.lang.String r1 = ", "
            r9.append(r1)
            r9.append(r5)
            java.lang.String r4 = r9.toString()
            r6 = 0
            r7 = 16
            java.lang.String r3 = "SpoofedLocationInteractor"
            r5 = 0
            rd0.d.b(r2, r3, r4, r5, r6, r7)
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z39.h.a(android.location.Location):boolean");
    }
}
