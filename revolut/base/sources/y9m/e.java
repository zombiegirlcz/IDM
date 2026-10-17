package y9m;

import dam.s;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import skm.r;

/* JADX INFO: loaded from: classes17.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f311876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f311877b;

    public e(s transact) {
        Intrinsics.checkNotNullParameter(transact, "transact");
        this.f311876a = transact;
        this.f311877b = e0.b();
        zkm.d dVar = transact.f112593j;
        p0 p0Var = p0.f264001a;
        e0.C(dVar, elm.f.f127540b, null, new b(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y9m.c
            if (r0 == 0) goto L13
            r0 = r6
            y9m.c r0 = (y9m.c) r0
            int r1 = r0.f311872x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311872x = r1
            goto L18
        L13:
            y9m.c r0 = new y9m.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311872x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r5 = r0.u
            yhm.o.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            r0.u = r5
            r0.f311872x = r3
            skm.r r6 = r4.f311877b
            java.lang.Object r6 = r6.y(r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            r0 = 0
            java.lang.String r5 = r6.getString(r5, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y9m.e.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, java.lang.String r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof y9m.d
            if (r0 == 0) goto L13
            r0 = r7
            y9m.d r0 = (y9m.d) r0
            int r1 = r0.f311875y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311875y = r1
            goto L18
        L13:
            y9m.d r0 = new y9m.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f311873w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f311875y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r7)
            goto L45
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            skm.r r7 = r4.f311877b
            r0.u = r5
            r0.v = r6
            r0.f311875y = r3
            java.lang.Object r7 = r7.y(r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            monitor-enter(r7)
            android.content.SharedPreferences$Editor r0 = r7.edit()     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            r0.putString(r5, r6)     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r5 = move-exception
            goto L5e
        L54:
            r0.remove(r5)     // Catch: java.lang.Throwable -> L52
        L57:
            r0.apply()     // Catch: java.lang.Throwable -> L52
            kotlin.Unit r5 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L52
            monitor-exit(r7)
            return r5
        L5e:
            monitor-exit(r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: y9m.e.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}
