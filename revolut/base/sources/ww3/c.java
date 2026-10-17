package ww3;

import c34.e;
import ft3.g1;
import ft3.h1;
import kotlin.jvm.internal.Intrinsics;
import vkm.d;
import w4l.f;
import w4l.k;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f300597a;

    public c(e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f300597a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ft3.h1 r12, pu3.a r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ww3.a
            if (r0 == 0) goto L13
            r0 = r14
            ww3.a r0 = (ww3.a) r0
            int r1 = r0.f300594y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300594y = r1
            goto L18
        L13:
            ww3.a r0 = new ww3.a
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f300592w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300594y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            pu3.b r12 = r0.v
            yhm.o.b(r14)
            return r12
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            ft3.h1 r12 = r0.u
            yhm.o.b(r14)
            goto L5c
        L3b:
            yhm.o.b(r14)
            r0.u = r12
            r0.f300594y = r4
            c34.e r6 = r11.f300597a
            r6.getClass()
            a1a.c r5 = new a1a.c
            r10 = 29
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r12, r5, r0)
            if (r14 != r1) goto L5b
            goto L75
        L5b:
            r12 = r7
        L5c:
            pu3.b r14 = (pu3.b) r14
            w4l.i r13 = w4l.i.f294643c
            vkm.d r12 = r11.b(r13, r12)
            r13 = 3
            kotlinx.coroutines.flow.Flow r12 = nz8.d.j(r12, r9, r13)
            r0.u = r9
            r0.v = r14
            r0.f300594y = r3
            java.lang.Object r12 = vkm.q.z(r12, r0)
            if (r12 != r1) goto L76
        L75:
            return r1
        L76:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ww3.c.a(ft3.h1, pu3.a, gim.c):java.lang.Object");
    }

    public final d b(k loadingStrategy, h1 productPayload) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        e eVar = this.f300597a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(productPayload, "productPayload");
        f fVar = eVar.e;
        Intrinsics.checkNotNullParameter(productPayload, "<this>");
        return rd0.e.b(fVar.e(new js3.a(g1.h(productPayload.f137836b), productPayload.f137835a), loadingStrategy));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (vkm.q.z(r12, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(ft3.h1 r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof ww3.b
            if (r0 == 0) goto L13
            r0 = r14
            ww3.b r0 = (ww3.b) r0
            int r1 = r0.f300596x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f300596x = r1
            goto L18
        L13:
            ww3.b r0 = new ww3.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f300596x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L74
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            ft3.h1 r12 = r0.u
            yhm.o.b(r14)
            goto L5e
        L39:
            yhm.o.b(r14)
            r0.u = r12
            r0.f300596x = r4
            c34.e r6 = r11.f300597a
            r6.getClass()
            c34.d r5 = new c34.d
            r10 = 0
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5a:
            if (r12 != r1) goto L5d
            goto L73
        L5d:
            r12 = r7
        L5e:
            w4l.i r13 = w4l.i.f294643c
            vkm.d r12 = r11.b(r13, r12)
            r13 = 3
            kotlinx.coroutines.flow.Flow r12 = nz8.d.j(r12, r9, r13)
            r0.u = r9
            r0.f300596x = r3
            java.lang.Object r12 = vkm.q.z(r12, r0)
            if (r12 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ww3.c.c(ft3.h1, java.lang.String, gim.c):java.lang.Object");
    }
}
