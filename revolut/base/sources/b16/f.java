package b16;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.d f11737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ki0.c f11738b;

    public f(ui0.d currentAppVersion, ki0.c storeAppVersionProvider) {
        Intrinsics.checkNotNullParameter(currentAppVersion, "currentAppVersion");
        Intrinsics.checkNotNullParameter(storeAppVersionProvider, "storeAppVersionProvider");
        this.f11737a = currentAppVersion;
        this.f11738b = storeAppVersionProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.net.Uri r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof b16.e
            if (r0 == 0) goto L14
            r0 = r13
            b16.e r0 = (b16.e) r0
            int r1 = r0.f11736x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f11736x = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            b16.e r0 = new b16.e
            r0.<init>(r11, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.f11736x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            ui0.d r12 = r13.u
            yhm.o.b(r0)
            goto L8a
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            yhm.o.b(r0)
            java.lang.String r0 = "amv"
            java.lang.String r12 = r12.getQueryParameter(r0)     // Catch: java.lang.Exception -> L3e
            goto L3f
        L3e:
            r12 = r4
        L3f:
            if (r12 == 0) goto Laa
            boolean r0 = kotlin.text.d0.W(r12)
            if (r0 == 0) goto L58
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r5 = rd0.c.WARNING
            r9 = 0
            r10 = 16
            java.lang.String r6 = "AndroidMinimumVersionRestrictionCheck"
            java.lang.String r7 = "Android minimum version restriction is blank"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
        L56:
            r12 = r4
            goto L72
        L58:
            ui0.c r0 = ui0.d.Companion     // Catch: java.lang.Exception -> L62
            r0.getClass()     // Catch: java.lang.Exception -> L62
            ui0.d r12 = ui0.c.a(r12)     // Catch: java.lang.Exception -> L62
            goto L72
        L62:
            r0 = move-exception
            r12 = r0
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            java.lang.String r5 = "Unable to parse android minimum version restriction"
            java.lang.String r6 = "AndroidMinimumVersionRestrictionCheck"
            rd0.d.a(r2, r6, r5, r12, r0)
            goto L56
        L72:
            if (r12 == 0) goto Laa
            ui0.d r0 = r11.f11737a
            int r0 = r0.compareTo(r12)
            if (r0 < 0) goto L7d
            goto Laa
        L7d:
            r13.u = r12
            r13.f11736x = r3
            ki0.c r0 = r11.f11738b
            java.lang.Comparable r0 = r0.a(r13)
            if (r0 != r1) goto L8a
            return r1
        L8a:
            ui0.d r0 = (ui0.d) r0
            if (r0 != 0) goto L9e
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r5 = rd0.c.INFO
            r9 = 0
            r10 = 16
            java.lang.String r6 = "AndroidMinimumVersionRestrictionCheck"
            java.lang.String r7 = "Android minimum version skipped: no store version"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            return r4
        L9e:
            int r12 = r0.compareTo(r12)
            if (r12 < 0) goto La7
            b16.g r12 = b16.g.f11739a
            goto La9
        La7:
            b16.h r12 = b16.h.f11740a
        La9:
            return r12
        Laa:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.f.a(android.net.Uri, gim.c):java.lang.Object");
    }
}
