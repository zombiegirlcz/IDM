package sw3;

import ft3.d1;
import ft3.g1;
import ft3.h1;
import gt3.f;
import kotlin.jvm.internal.Intrinsics;
import ne0.d;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x24.a f266090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f266091b;

    public c(x24.a repository, d memoryCache) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f266090a = repository;
        this.f266091b = memoryCache;
    }

    public static String b(h1 h1Var) {
        String str = h1Var.f137835a;
        d1 d1Var = h1Var.f137836b;
        Intrinsics.checkNotNullParameter(d1Var, "<this>");
        Intrinsics.checkNotNullParameter("consents", "prefix");
        String strI = g1.i(d1Var.f137810a);
        f fVar = d1Var.f137811b;
        String[] elements = {"consents", strI, fVar != null ? hb9.b.G(fVar) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return a0.d.s("consents.", str, ".", d0.k0(kotlin.collections.d.L(elements), "_", null, null, 0, null, 62));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(ft3.h1 r11, lu3.d r12, gim.c r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof sw3.a
            if (r0 == 0) goto L13
            r0 = r13
            sw3.a r0 = (sw3.a) r0
            int r1 = r0.f266087x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266087x = r1
            goto L18
        L13:
            sw3.a r0 = new sw3.a
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266087x
            r3 = 1
            r8 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            ft3.h1 r11 = r0.u
            yhm.o.b(r13)
            goto L53
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            yhm.o.b(r13)
            r0.u = r11
            r0.f266087x = r3
            x24.a r5 = r10.f266090a
            r5.getClass()
            wih.c r4 = new wih.c
            r9 = 20
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r11, r4, r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            r11 = r6
        L53:
            it3.d r13 = (it3.d) r13
            r10.c(r8, r11)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sw3.c.a(ft3.h1, lu3.d, gim.c):java.io.Serializable");
    }

    public final void c(lu3.c cVar, h1 h1Var) {
        d dVar = this.f266091b;
        if (cVar == null) {
            dVar.remove(b(h1Var));
        } else {
            dVar.f(b(h1Var), cVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ft3.h1 r10, com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection r11, java.lang.Long r12, gim.c r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof sw3.b
            if (r0 == 0) goto L13
            r0 = r13
            sw3.b r0 = (sw3.b) r0
            int r1 = r0.f266089x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f266089x = r1
            goto L18
        L13:
            sw3.b r0 = new sw3.b
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f266089x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ft3.h1 r10 = r0.u
            yhm.o.b(r13)
            goto L53
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r13)
            r0.u = r10
            r0.f266089x = r3
            x24.a r4 = r9.f266090a
            r4.getClass()
            wh3.h r2 = new wh3.h
            r8 = 0
            r3 = 7
            r5 = r10
            r6 = r11
            r7 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r10, r2, r0)
            if (r13 != r1) goto L52
            return r1
        L52:
            r10 = r5
        L53:
            lu3.c r13 = (lu3.c) r13
            r9.c(r13, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: sw3.c.d(ft3.h1, com.revolut.feature.credit.application.plugins.api.models.consent_preferences.ConsentPreferencesSelection, java.lang.Long, gim.c):java.lang.Object");
    }
}
