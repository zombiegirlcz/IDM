package fo2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn2.d f136786a;

    public j(pn2.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f136786a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(mn2.a r10, wn2.a r11, wn2.d r12, gim.c r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof fo2.i
            if (r0 == 0) goto L13
            r0 = r13
            fo2.i r0 = (fo2.i) r0
            int r1 = r0.f136785w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136785w = r1
            goto L18
        L13:
            fo2.i r0 = new fo2.i
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136785w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r13)     // Catch: java.lang.Throwable -> L28
        L26:
            r3 = r13
            goto L54
        L28:
            r0 = move-exception
            r10 = r0
            r2 = r10
            goto L5e
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            yhm.o.b(r13)
            pn2.d r4 = r9.f136786a     // Catch: java.lang.Throwable -> L28
            r0.f136785w = r3     // Catch: java.lang.Throwable -> L28
            r4.getClass()     // Catch: java.lang.Throwable -> L28
            of6.d r2 = new of6.d     // Catch: java.lang.Throwable -> L28
            r8 = 0
            r3 = 20
            r5 = r10
            r7 = r11
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L28
            skm.p0 r10 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L28
            elm.f r10 = elm.f.f127540b     // Catch: java.lang.Throwable -> L28
            java.lang.Object r13 = skm.e0.J(r10, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r13 != r1) goto L26
            return r1
        L54:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L28
            return r2
        L5e:
            zhm.h0 r10 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r11 = rd0.d.f253311a
            rd0.c r11 = rd0.c.ERROR
            r12 = 0
            java.lang.String r13 = "BankAccountSwitchingFormInteractor"
            rd0.d.a(r11, r13, r12, r2, r10)
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: fo2.j.a(mn2.a, wn2.a, wn2.d, gim.c):java.lang.Object");
    }
}
