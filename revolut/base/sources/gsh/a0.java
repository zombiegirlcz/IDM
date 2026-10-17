package gsh;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.v1;

/* JADX INFO: loaded from: classes10.dex */
public final class a0 {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f146461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f146462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f146463c;
    public final hlm.c d;
    public final hlm.c e;
    public final ConcurrentHashMap f;

    public a0(ue0.c storage, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f146461a = storage;
        this.f146462b = scope;
        this.d = hlm.d.a();
        this.e = hlm.d.a();
        this.f = new ConcurrentHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r4.h(r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, dsh.i r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof gsh.q
            if (r0 == 0) goto L13
            r0 = r10
            gsh.q r0 = (gsh.q) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            gsh.q r0 = new gsh.q
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L54
            if (r2 == r5) goto L45
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r10)
            goto La2
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.f146510y
            hlm.c r9 = r0.f146509x
            java.lang.String r2 = r0.f146508w
            gsh.a0 r4 = r0.v
            dsh.i r5 = r0.u
            yhm.o.b(r10)
            goto L85
        L45:
            int r8 = r0.f146510y
            java.lang.String r9 = r0.f146508w
            gsh.a0 r2 = r0.v
            dsh.i r5 = r0.u
            yhm.o.b(r10)
            r10 = r8
            r8 = r9
            r9 = r5
            goto L6a
        L54:
            yhm.o.b(r10)
            r0.u = r9
            r0.v = r7
            r0.f146508w = r8
            r10 = 0
            r0.f146510y = r10
            r0.B = r5
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L69
            goto La1
        L69:
            r2 = r7
        L6a:
            hlm.c r5 = r2.e
            r0.u = r9
            r0.v = r2
            r0.f146508w = r8
            r0.f146509x = r5
            r0.f146510y = r10
            r0.B = r4
            java.lang.Object r4 = r5.lock(r6, r0)
            if (r4 != r1) goto L7f
            goto La1
        L7f:
            r4 = r5
            r5 = r9
            r9 = r4
            r4 = r2
            r2 = r8
            r8 = r10
        L85:
            gsh.p r10 = r4.c(r2)     // Catch: java.lang.Throwable -> La5
            r10.a(r5)     // Catch: java.lang.Throwable -> La5
            r9.unlock(r6)
            r0.u = r6
            r0.v = r6
            r0.f146508w = r6
            r0.f146509x = r6
            r0.f146510y = r8
            r0.B = r3
            java.lang.Object r8 = r4.h(r0)
            if (r8 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        La5:
            r8 = move-exception
            r9.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.a(java.lang.String, dsh.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof gsh.r
            if (r0 == 0) goto L13
            r0 = r9
            gsh.r r0 = (gsh.r) r0
            int r1 = r0.f146513y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146513y = r1
            goto L18
        L13:
            gsh.r r0 = new gsh.r
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f146511w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146513y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            hlm.a r0 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L2d
            goto L80
        L2d:
            r9 = move-exception
            goto L88
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L37:
            int r2 = r0.v
            hlm.a r4 = r0.u
            yhm.o.b(r9)
            r9 = r4
            goto L5a
        L40:
            yhm.o.b(r9)
            boolean r9 = r8.f146463c
            if (r9 == 0) goto L4a
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L4a:
            hlm.c r9 = r8.d
            r0.u = r9
            r2 = 0
            r0.v = r2
            r0.f146513y = r4
            java.lang.Object r4 = r9.lock(r5, r0)
            if (r4 != r1) goto L5a
            goto L7e
        L5a:
            boolean r4 = r8.f146463c     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L69
            kotlin.Unit r0 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L64
            r9.unlock(r5)
            return r0
        L64:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L88
        L69:
            skm.p0 r4 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L64
            elm.f r4 = elm.f.f127540b     // Catch: java.lang.Throwable -> L64
            gqh.o r6 = new gqh.o     // Catch: java.lang.Throwable -> L64
            r6.<init>(r8, r5, r3)     // Catch: java.lang.Throwable -> L64
            r0.u = r9     // Catch: java.lang.Throwable -> L64
            r0.v = r2     // Catch: java.lang.Throwable -> L64
            r0.f146513y = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = skm.e0.J(r4, r6, r0)     // Catch: java.lang.Throwable -> L64
            if (r0 != r1) goto L7f
        L7e:
            return r1
        L7f:
            r0 = r9
        L80:
            kotlin.Unit r9 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            r0.unlock(r5)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L88:
            r0.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.b(gim.c):java.lang.Object");
    }

    public final p c(String str) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = this.f;
        Object pVar = concurrentHashMap.get(str);
        if (pVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (pVar = new p()))) != null) {
            pVar = objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(pVar, "getOrPut(...)");
        return (p) pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r4.h(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof gsh.t
            if (r0 == 0) goto L13
            r0 = r9
            gsh.t r0 = (gsh.t) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            gsh.t r0 = new gsh.t
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r9)
            goto Lb3
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            int r10 = r0.f146517y
            hlm.c r11 = r0.f146516x
            java.lang.String r2 = r0.f146515w
            gsh.a0 r4 = r0.v
            java.util.List r5 = r0.u
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r9)
            goto L93
        L4b:
            int r10 = r0.f146517y
            java.lang.String r11 = r0.f146515w
            gsh.a0 r2 = r0.v
            java.util.List r5 = r0.u
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r9)
            r9 = r10
            r10 = r11
            r11 = r5
            goto L75
        L5c:
            yhm.o.b(r9)
            r9 = r11
            java.util.List r9 = (java.util.List) r9
            r0.u = r9
            r0.v = r8
            r0.f146515w = r10
            r9 = 0
            r0.f146517y = r9
            r0.B = r5
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L74
            goto Lb2
        L74:
            r2 = r8
        L75:
            hlm.c r5 = r2.e
            r7 = r11
            java.util.List r7 = (java.util.List) r7
            r0.u = r7
            r0.v = r2
            r0.f146515w = r10
            r0.f146516x = r5
            r0.f146517y = r9
            r0.B = r4
            java.lang.Object r4 = r5.lock(r6, r0)
            if (r4 != r1) goto L8d
            goto Lb2
        L8d:
            r4 = r5
            r5 = r11
            r11 = r4
            r4 = r2
            r2 = r10
            r10 = r9
        L93:
            gsh.p r9 = r4.c(r2)     // Catch: java.lang.Throwable -> Lb6
            boolean r9 = r9.d(r5)     // Catch: java.lang.Throwable -> Lb6
            r11.unlock(r6)
            if (r9 == 0) goto Lb3
            r0.u = r6
            r0.v = r6
            r0.f146515w = r6
            r0.f146516x = r6
            r0.f146517y = r10
            r0.B = r3
            java.lang.Object r9 = r4.h(r0)
            if (r9 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb6:
            r9 = move-exception
            r11.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.d(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (r4.h(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r9, java.lang.String r10, java.util.List r11) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof gsh.u
            if (r0 == 0) goto L13
            r0 = r9
            gsh.u r0 = (gsh.u) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            gsh.u r0 = new gsh.u
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.z
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.B
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5c
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.util.List r10 = r0.u
            java.util.List r10 = (java.util.List) r10
            yhm.o.b(r9)
            goto Lb3
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            int r10 = r0.f146520y
            hlm.c r11 = r0.f146519x
            java.lang.String r2 = r0.f146518w
            gsh.a0 r4 = r0.v
            java.util.List r5 = r0.u
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r9)
            goto L93
        L4b:
            int r10 = r0.f146520y
            java.lang.String r11 = r0.f146518w
            gsh.a0 r2 = r0.v
            java.util.List r5 = r0.u
            java.util.List r5 = (java.util.List) r5
            yhm.o.b(r9)
            r9 = r10
            r10 = r11
            r11 = r5
            goto L75
        L5c:
            yhm.o.b(r9)
            r9 = r11
            java.util.List r9 = (java.util.List) r9
            r0.u = r9
            r0.v = r8
            r0.f146518w = r10
            r9 = 0
            r0.f146520y = r9
            r0.B = r5
            java.lang.Object r2 = r8.b(r0)
            if (r2 != r1) goto L74
            goto Lb2
        L74:
            r2 = r8
        L75:
            hlm.c r5 = r2.e
            r7 = r11
            java.util.List r7 = (java.util.List) r7
            r0.u = r7
            r0.v = r2
            r0.f146518w = r10
            r0.f146519x = r5
            r0.f146520y = r9
            r0.B = r4
            java.lang.Object r4 = r5.lock(r6, r0)
            if (r4 != r1) goto L8d
            goto Lb2
        L8d:
            r4 = r5
            r5 = r11
            r11 = r4
            r4 = r2
            r2 = r10
            r10 = r9
        L93:
            gsh.p r9 = r4.c(r2)     // Catch: java.lang.Throwable -> Lb6
            boolean r9 = r9.c(r5)     // Catch: java.lang.Throwable -> Lb6
            r11.unlock(r6)
            if (r9 == 0) goto Lb3
            r0.u = r6
            r0.v = r6
            r0.f146518w = r6
            r0.f146519x = r6
            r0.f146520y = r10
            r0.B = r3
            java.lang.Object r9 = r4.h(r0)
            if (r9 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        Lb6:
            r9 = move-exception
            r11.unlock(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.e(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    public final Object f(gim.c cVar, String str, boolean z) throws Throwable {
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new au.c0(this, str, z, null, 6), cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    public final Object g(String str, Map map, gim.c cVar) throws Throwable {
        f23.y yVar = new f23.y(str, map, this, null, 12);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, yVar, cVar);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (skm.e0.J(r7, r2, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof gsh.v
            if (r0 == 0) goto L13
            r0 = r7
            gsh.v r0 = (gsh.v) r0
            int r1 = r0.f146521w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f146521w = r1
            goto L18
        L13:
            gsh.v r0 = new gsh.v
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f146521w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L56
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L42
        L36:
            yhm.o.b(r7)
            r0.f146521w = r4
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r1) goto L42
            goto L55
        L42:
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            gsh.w r2 = new gsh.w
            r4 = 0
            r5 = 0
            r2.<init>(r6, r4, r5)
            r0.f146521w = r3
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L56
        L55:
            return r1
        L56:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r2.h(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r8, java.lang.String r9, dsh.e r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof gsh.x
            if (r0 == 0) goto L13
            r0 = r11
            gsh.x r0 = (gsh.x) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            gsh.x r0 = new gsh.x
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r11)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.z
            hlm.c r9 = r0.f146527y
            java.lang.String r10 = r0.f146526x
            gsh.a0 r2 = r0.f146525w
            dsh.e r4 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)
            goto L90
        L47:
            int r8 = r0.z
            java.lang.String r9 = r0.f146526x
            gsh.a0 r10 = r0.f146525w
            dsh.e r2 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r11)
            r11 = r2
            r2 = r10
            r10 = r11
            r11 = r8
            r8 = r9
            r9 = r5
            goto L73
        L5b:
            yhm.o.b(r11)
            r0.u = r9
            r0.v = r10
            r0.f146525w = r7
            r0.f146526x = r8
            r11 = 0
            r0.z = r11
            r0.C = r5
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L72
            goto Lb1
        L72:
            r2 = r7
        L73:
            hlm.c r5 = r2.e
            r0.u = r9
            r0.v = r10
            r0.f146525w = r2
            r0.f146526x = r8
            r0.f146527y = r5
            r0.z = r11
            r0.C = r4
            java.lang.Object r4 = r5.lock(r6, r0)
            if (r4 != r1) goto L8a
            goto Lb1
        L8a:
            r4 = r5
            r5 = r9
            r9 = r4
            r4 = r10
            r10 = r8
            r8 = r11
        L90:
            gsh.p r10 = r2.c(r10)     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.e(r5, r4)     // Catch: java.lang.Throwable -> Lb5
            r9.unlock(r6)
            if (r10 == 0) goto Lb2
            r0.u = r6
            r0.v = r6
            r0.f146525w = r6
            r0.f146526x = r6
            r0.f146527y = r6
            r0.z = r8
            r0.C = r3
            java.lang.Object r8 = r2.h(r0)
            if (r8 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb5:
            r8 = move-exception
            r9.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.i(java.lang.String, java.lang.String, dsh.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00dc, code lost:
    
        if (r8.h(r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r11, int r12, int r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.j(java.lang.String, int, int, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
    
        if (r2.h(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r8, dsh.t r9, dsh.t r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof gsh.z
            if (r0 == 0) goto L13
            r0 = r11
            gsh.z r0 = (gsh.z) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            gsh.z r0 = new gsh.z
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L5b
            if (r2 == r5) goto L47
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r11)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            int r8 = r0.z
            hlm.c r9 = r0.f146533y
            java.lang.String r10 = r0.f146532x
            gsh.a0 r2 = r0.f146531w
            dsh.t r4 = r0.v
            dsh.t r5 = r0.u
            yhm.o.b(r11)
            goto L90
        L47:
            int r8 = r0.z
            java.lang.String r9 = r0.f146532x
            gsh.a0 r10 = r0.f146531w
            dsh.t r2 = r0.v
            dsh.t r5 = r0.u
            yhm.o.b(r11)
            r11 = r2
            r2 = r10
            r10 = r11
            r11 = r8
            r8 = r9
            r9 = r5
            goto L73
        L5b:
            yhm.o.b(r11)
            r0.u = r9
            r0.v = r10
            r0.f146531w = r7
            r0.f146532x = r8
            r11 = 0
            r0.z = r11
            r0.C = r5
            java.lang.Object r2 = r7.b(r0)
            if (r2 != r1) goto L72
            goto Lb1
        L72:
            r2 = r7
        L73:
            hlm.c r5 = r2.e
            r0.u = r9
            r0.v = r10
            r0.f146531w = r2
            r0.f146532x = r8
            r0.f146533y = r5
            r0.z = r11
            r0.C = r4
            java.lang.Object r4 = r5.lock(r6, r0)
            if (r4 != r1) goto L8a
            goto Lb1
        L8a:
            r4 = r5
            r5 = r9
            r9 = r4
            r4 = r10
            r10 = r8
            r8 = r11
        L90:
            gsh.p r10 = r2.c(r10)     // Catch: java.lang.Throwable -> Lb5
            boolean r10 = r10.f(r5, r4)     // Catch: java.lang.Throwable -> Lb5
            r9.unlock(r6)
            if (r10 == 0) goto Lb2
            r0.u = r6
            r0.v = r6
            r0.f146531w = r6
            r0.f146532x = r6
            r0.f146533y = r6
            r0.z = r8
            r0.C = r3
            java.lang.Object r8 = r2.h(r0)
            if (r8 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lb5:
            r8 = move-exception
            r9.unlock(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: gsh.a0.k(java.lang.String, dsh.t, dsh.t, gim.c):java.lang.Object");
    }

    public final Flow l(String contextKey) {
        Intrinsics.checkNotNullParameter(contextKey, "contextKey");
        return this.f146463c ? c(contextKey).f146506a : new v1(new w(this, contextKey, null, 1));
    }
}
