package yse;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.z1;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f316457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mk0.a f316458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hlm.c f316459c;
    public final j2 d;
    public final j2 e;
    public final z1 f;

    public e(ue0.c storage, mk0.a personalisationStorage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(personalisationStorage, "personalisationStorage");
        this.f316457a = storage;
        this.f316458b = personalisationStorage;
        this.f316459c = hlm.d.a();
        this.d = q.c(null);
        this.e = q.c(h0.f322473a);
        this.f = q.b(0, 7, null);
    }

    public final Flow a() {
        Companion.getClass();
        Intrinsics.checkNotNullParameter("CLOSED_TIPS", "id");
        return q.q(q.J(this.f316458b.f(new tk0.e("CLOSED_TIPS")), new y5j.e(this.f, 21)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
    
        if (skm.e0.J(r6, r7, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof yse.c
            if (r0 == 0) goto L13
            r0 = r7
            yse.c r0 = (yse.c) r0
            int r1 = r0.f316453x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f316453x = r1
            goto L18
        L13:
            yse.c r0 = new yse.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f316453x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L93
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.util.ArrayList r6 = r0.u
            yhm.o.b(r7)
            goto L7c
        L38:
            yhm.o.b(r7)
            yse.a r7 = yse.e.Companion
            r7.getClass()
            java.lang.String r7 = "id"
            java.lang.String r2 = "CLOSED_TIPS"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r7)
            tk0.e r7 = new tk0.e
            r7.<init>(r2)
            mk0.a r2 = r5.f316458b
            java.lang.Object r7 = r2.a(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L5d
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.ArrayList r7 = zhm.d0.f1(r7)
            goto L62
        L5d:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L62:
            boolean r2 = r7.contains(r6)
            if (r2 == 0) goto L6b
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L6b:
            r7.add(r6)
            r0.u = r7
            r0.f316453x = r4
            vkm.z1 r6 = r5.f
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L7b
            goto L92
        L7b:
            r6 = r7
        L7c:
            yg6.v r7 = new yg6.v
            r2 = 23
            r4 = 0
            r7.<init>(r5, r6, r4, r2)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            r0.u = r4
            r0.f316453x = r3
            java.lang.Object r6 = skm.e0.J(r6, r7, r0)
            if (r6 != r1) goto L93
        L92:
            return r1
        L93:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yse.e.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
    
        if (skm.e0.J(r4, r11, r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v9, types: [hlm.a] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.util.List r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof yse.d
            if (r0 == 0) goto L13
            r0 = r11
            yse.d r0 = (yse.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            yse.d r0 = new yse.d
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f316455x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            hlm.a r10 = r0.v
            java.util.List r0 = r0.u
            java.util.List r0 = (java.util.List) r0
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L32
            goto Lb7
        L32:
            r11 = move-exception
            goto Lbf
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            int r10 = r0.f316454w
            hlm.a r2 = r0.v
            java.util.List r4 = r0.u
            java.util.List r4 = (java.util.List) r4
            yhm.o.b(r11)
            r8 = r2
            r2 = r10
            r10 = r8
            goto L9f
        L4c:
            yhm.o.b(r11)
            vkm.j2 r11 = r9.d
            java.lang.Object r11 = r11.getValue()
            java.util.Map r11 = (java.util.Map) r11
            if (r11 != 0) goto L5a
            goto L7f
        L5a:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r10 = r10.iterator()
        L65:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L7e
            java.lang.Object r6 = r10.next()
            r7 = r6
            cte.a r7 = (cte.a) r7
            java.lang.String r7 = r7.f108659a
            boolean r7 = r11.containsKey(r7)
            if (r7 != 0) goto L65
            r2.add(r6)
            goto L65
        L7e:
            r10 = r2
        L7f:
            boolean r11 = r10.isEmpty()
            if (r11 == 0) goto L88
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        L88:
            r11 = r10
            java.util.List r11 = (java.util.List) r11
            r0.u = r11
            hlm.c r11 = r9.f316459c
            r0.v = r11
            r2 = 0
            r0.f316454w = r2
            r0.z = r4
            java.lang.Object r4 = r11.lock(r5, r0)
            if (r4 != r1) goto L9d
            goto Lb6
        L9d:
            r4 = r10
            r10 = r11
        L9f:
            yk6.m r11 = new yk6.m     // Catch: java.lang.Throwable -> L32
            r11.<init>(r9, r4, r5)     // Catch: java.lang.Throwable -> L32
            skm.p0 r4 = skm.p0.f264001a     // Catch: java.lang.Throwable -> L32
            elm.f r4 = elm.f.f127540b     // Catch: java.lang.Throwable -> L32
            r0.u = r5     // Catch: java.lang.Throwable -> L32
            r0.v = r10     // Catch: java.lang.Throwable -> L32
            r0.f316454w = r2     // Catch: java.lang.Throwable -> L32
            r0.z = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = skm.e0.J(r4, r11, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r1) goto Lb7
        Lb6:
            return r1
        Lb7:
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L32
            r10.unlock(r5)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        Lbf:
            r10.unlock(r5)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: yse.e.c(java.util.List, gim.c):java.lang.Object");
    }
}
