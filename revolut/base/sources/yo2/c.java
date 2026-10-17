package yo2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn2.d f315539a;

    public c(pn2.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f315539a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof yo2.b
            if (r0 == 0) goto L13
            r0 = r12
            yo2.b r0 = (yo2.b) r0
            int r1 = r0.f315538w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315538w = r1
            goto L18
        L13:
            yo2.b r0 = new yo2.b
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315538w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r12)     // Catch: java.lang.Throwable -> L29
        L27:
            r5 = r12
            goto L51
        L29:
            r0 = move-exception
            r11 = r0
            r6 = r11
            goto L5b
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            yhm.o.b(r12)
            pn2.d r12 = r10.f315539a     // Catch: java.lang.Throwable -> L29
            r0.f315538w = r4     // Catch: java.lang.Throwable -> L29
            r12.getClass()     // Catch: java.lang.Throwable -> L29
            oqk.i r2 = new oqk.i     // Catch: java.lang.Throwable -> L29
            r4 = 26
            r2.<init>(r12, r11, r3, r4)     // Catch: java.lang.Throwable -> L29
            skm.p0 r11 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L29
            elm.f r11 = elm.f.f127540b     // Catch: java.lang.Throwable -> L29
            java.lang.Object r12 = skm.e0.J(r11, r2, r0)     // Catch: java.lang.Throwable -> L29
            if (r12 != r1) goto L27
            return r1
        L51:
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L29
            r7 = 0
            r6 = 0
            r8 = 6
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L29
            return r4
        L5b:
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r12 = rd0.c.ERROR
            java.lang.String r0 = "BankAccountSwitchingRequestStatusInteractor"
            rd0.d.a(r12, r0, r3, r6, r11)
            com.revolut.data.model.Data r4 = new com.revolut.data.model.Data
            r8 = 5
            r9 = 0
            r5 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yo2.c.a(java.lang.String, gim.c):java.lang.Object");
    }
}
