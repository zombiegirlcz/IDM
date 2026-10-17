package bva;

import a19.e;
import brc.h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ne0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f18975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ue0.c f18976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x4l.c f18977c;

    public d(j memoryCache, ue0.c storage) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f18975a = memoryCache;
        this.f18976b = storage;
        Continuation continuation = null;
        this.f18977c = new x4l.c(new e(3, 17, continuation), new bq7.j(this, 16), new bhi.c(this, 26), new h(this, continuation, 11), new awd.b(this, continuation, 13));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r3.f(r9, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bva.b
            if (r0 == 0) goto L13
            r0 = r9
            bva.b r0 = (bva.b) r0
            int r1 = r0.f18972x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18972x = r1
            goto L18
        L13:
            bva.b r0 = new bva.b
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18972x
            x4l.c r3 = r7.f18977c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)
            goto L69
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L56
        L3b:
            yhm.o.b(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            w4l.j r2 = w4l.j.f294644c
            vkm.d r9 = r3.b(r9, r2)
            r2 = 3
            jhi.b r9 = mo3.a.g(r9, r6, r6, r2)
            r0.u = r8
            r0.f18972x = r5
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L56
            goto L68
        L56:
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r8 = zhm.a1.j(r9, r8)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            r0.u = r6
            r0.f18972x = r4
            java.lang.Object r8 = r3.f(r9, r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bva.d.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (r3.f(r9, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof bva.c
            if (r0 == 0) goto L13
            r0 = r9
            bva.c r0 = (bva.c) r0
            int r1 = r0.f18974x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18974x = r1
            goto L18
        L13:
            bva.c r0 = new bva.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f18974x
            x4l.c r3 = r7.f18977c
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            yhm.o.b(r9)
            goto L69
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L56
        L3b:
            yhm.o.b(r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            w4l.j r2 = w4l.j.f294644c
            vkm.d r9 = r3.b(r9, r2)
            r2 = 3
            jhi.b r9 = mo3.a.g(r9, r6, r6, r2)
            r0.u = r8
            r0.f18974x = r5
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L56
            goto L68
        L56:
            java.util.Set r9 = (java.util.Set) r9
            java.util.LinkedHashSet r8 = zhm.a1.m(r9, r8)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            r0.u = r6
            r0.f18974x = r4
            java.lang.Object r8 = r3.f(r9, r8, r0)
            if (r8 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bva.d.b(java.lang.String, gim.c):java.lang.Object");
    }
}
