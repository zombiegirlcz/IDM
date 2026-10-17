package gb8;

import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f142240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f142241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f142242c;

    public g(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f142240a = memoryCache;
        this.f142241b = storage;
        this.f142242c = hlm.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof gb8.d
            if (r0 == 0) goto L13
            r0 = r11
            gb8.d r0 = (gb8.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            gb8.d r0 = new gb8.d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f142234x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3a
            if (r2 != r4) goto L32
            hlm.a r10 = r0.v
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2f
            goto L99
        L2f:
            r11 = move-exception
            goto Laa
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            int r10 = r0.f142233w
            hlm.a r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)
            r11 = r2
            r2 = r10
            r10 = r5
            goto L5c
        L47:
            yhm.o.b(r11)
            r0.u = r10
            hlm.c r11 = r9.f142242c
            r0.v = r11
            r0.f142233w = r3
            r0.z = r5
            java.lang.Object r2 = r11.lock(r6, r0)
            if (r2 != r1) goto L5b
            goto L95
        L5b:
            r2 = r3
        L5c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            java.lang.String r7 = "JUNIOR_GRADUATION_DIALOG_SHOWN_KEY_"
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L79
            r5.append(r10)     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = r5.toString()     // Catch: java.lang.Throwable -> L79
            ne0.j r5 = r9.f142240a     // Catch: java.lang.Throwable -> L79
            java.lang.Object r5 = r5.get(r10)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L7e
            boolean r10 = r5.booleanValue()     // Catch: java.lang.Throwable -> L79
            goto La2
        L79:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
            goto Laa
        L7e:
            skm.p0 r5 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L79
            elm.f r5 = elm.f.f127540b     // Catch: java.lang.Throwable -> L79
            gb8.e r7 = new gb8.e     // Catch: java.lang.Throwable -> L79
            r7.<init>(r9, r10, r6, r3)     // Catch: java.lang.Throwable -> L79
            r0.u = r6     // Catch: java.lang.Throwable -> L79
            r0.v = r11     // Catch: java.lang.Throwable -> L79
            r0.f142233w = r2     // Catch: java.lang.Throwable -> L79
            r0.z = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r10 = skm.e0.J(r5, r7, r0)     // Catch: java.lang.Throwable -> L79
            if (r10 != r1) goto L96
        L95:
            return r1
        L96:
            r8 = r11
            r11 = r10
            r10 = r8
        L99:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L2f
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L2f
            r8 = r11
            r11 = r10
            r10 = r8
        La2:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch: java.lang.Throwable -> L79
            r11.unlock(r6)
            return r10
        Laa:
            r10.unlock(r6)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gb8.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof gb8.f
            if (r0 == 0) goto L13
            r0 = r11
            gb8.f r0 = (gb8.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            gb8.f r0 = new gb8.f
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f142238x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L44
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r10 = r0.v
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L2d
            goto L87
        L2d:
            r11 = move-exception
            goto L93
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            int r10 = r0.f142237w
            hlm.a r2 = r0.v
            java.lang.String r6 = r0.u
            yhm.o.b(r11)
            r11 = r2
            r2 = r10
            r10 = r6
            goto L59
        L44:
            yhm.o.b(r11)
            r0.u = r10
            hlm.c r11 = r9.f142242c
            r0.v = r11
            r2 = 0
            r0.f142237w = r2
            r0.z = r4
            java.lang.Object r6 = r11.lock(r5, r0)
            if (r6 != r1) goto L59
            goto L85
        L59:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f
            java.lang.String r7 = "JUNIOR_GRADUATION_DIALOG_SHOWN_KEY_"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L8f
            r6.append(r10)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r10 = r6.toString()     // Catch: java.lang.Throwable -> L8f
            ne0.j r6 = r9.f142240a     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L8f
            r6.f(r10, r7)     // Catch: java.lang.Throwable -> L8f
            skm.p0 r6 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L8f
            elm.f r6 = elm.f.f127540b     // Catch: java.lang.Throwable -> L8f
            gb8.e r7 = new gb8.e     // Catch: java.lang.Throwable -> L8f
            r7.<init>(r9, r10, r5, r4)     // Catch: java.lang.Throwable -> L8f
            r0.u = r5     // Catch: java.lang.Throwable -> L8f
            r0.v = r11     // Catch: java.lang.Throwable -> L8f
            r0.f142237w = r2     // Catch: java.lang.Throwable -> L8f
            r0.z = r3     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r10 = skm.e0.J(r6, r7, r0)     // Catch: java.lang.Throwable -> L8f
            if (r10 != r1) goto L86
        L85:
            return r1
        L86:
            r10 = r11
        L87:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r10.unlock(r5)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L8f:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L93:
            r10.unlock(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gb8.g.b(java.lang.String, gim.c):java.lang.Object");
    }
}
