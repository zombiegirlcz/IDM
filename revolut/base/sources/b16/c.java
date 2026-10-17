package b16;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements wli.f {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ui0.d f11733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ki0.c f11734b;

    public c(ui0.d currentAppVersion, ki0.c storeAppVersionProvider) {
        Intrinsics.checkNotNullParameter(currentAppVersion, "currentAppVersion");
        Intrinsics.checkNotNullParameter(storeAppVersionProvider, "storeAppVersionProvider");
        this.f11733a = currentAppVersion;
        this.f11734b = storeAppVersionProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // wli.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zli.b r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof b16.b
            if (r0 == 0) goto L14
            r0 = r13
            b16.b r0 = (b16.b) r0
            int r1 = r0.f11732x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f11732x = r1
        L12:
            r13 = r0
            goto L1c
        L14:
            b16.b r0 = new b16.b
            gim.c r13 = (gim.c) r13
            r0.<init>(r11, r13)
            goto L12
        L1c:
            java.lang.Object r0 = r13.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.f11732x
            r3 = 1
            wli.j r4 = wli.j.f298515a
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            ui0.d r12 = r13.u
            yhm.o.b(r0)
            goto L8e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            yhm.o.b(r0)
            java.util.LinkedHashMap r12 = r12.d
            java.lang.String r0 = "amv"
            java.lang.String r12 = zli.f.a(r12, r0)
            if (r12 == 0) goto Lbe
            boolean r0 = kotlin.text.d0.W(r12)
            r2 = 0
            if (r0 == 0) goto L5c
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r5 = rd0.c.WARNING
            r9 = 0
            r10 = 16
            java.lang.String r6 = "AndroidMinimumVersionRestrictionCheck"
            java.lang.String r7 = "Android minimum version restriction is blank"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
        L5a:
            r12 = r2
            goto L76
        L5c:
            ui0.c r0 = ui0.d.Companion     // Catch: java.lang.Exception -> L66
            r0.getClass()     // Catch: java.lang.Exception -> L66
            ui0.d r12 = ui0.c.a(r12)     // Catch: java.lang.Exception -> L66
            goto L76
        L66:
            r0 = move-exception
            r12 = r0
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r5 = rd0.d.f253311a
            rd0.c r5 = rd0.c.ERROR
            java.lang.String r6 = "Unable to parse android minimum version restriction"
            java.lang.String r7 = "AndroidMinimumVersionRestrictionCheck"
            rd0.d.a(r5, r7, r6, r12, r0)
            goto L5a
        L76:
            if (r12 == 0) goto Lbe
            ui0.d r0 = r11.f11733a
            int r0 = r0.compareTo(r12)
            if (r0 < 0) goto L81
            goto Lbe
        L81:
            r13.u = r12
            r13.f11732x = r3
            ki0.c r0 = r11.f11734b
            java.lang.Comparable r0 = r0.a(r13)
            if (r0 != r1) goto L8e
            return r1
        L8e:
            ui0.d r0 = (ui0.d) r0
            if (r0 != 0) goto La2
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r5 = rd0.c.INFO
            r9 = 0
            r10 = 16
            java.lang.String r6 = "AndroidMinimumVersionRestrictionCheck"
            java.lang.String r7 = "Android minimum version skipped: no store version"
            r8 = 0
            rd0.d.b(r5, r6, r7, r8, r9, r10)
            return r4
        La2:
            int r13 = r0.compareTo(r12)
            if (r13 < 0) goto Lb0
            wli.i r12 = new wli.i
            y06.a r13 = y06.a.f310150a
            r12.<init>(r13)
            return r12
        Lb0:
            int r12 = r0.compareTo(r12)
            if (r12 >= 0) goto Lbe
            wli.i r12 = new wli.i
            y06.b r13 = y06.b.f310151a
            r12.<init>(r13)
            return r12
        Lbe:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.c.b(zli.b, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
