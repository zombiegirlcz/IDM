package xg8;

import com.revolut.feature.junior_graduation.impl.service.JuniorGraduationService;
import kg.o;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wtc.b0;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorGraduationService f305631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sf0.h f305632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f305633c;
    public final ue0.c d;
    public final o e;
    public final x4l.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ao.h f305634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ao.h f305635h;
    public final ao.h i;

    public j(JuniorGraduationService juniorGraduationService, sf0.h serverErrorParser, ne0.j memoryCache, ue0.c storage, o gson) {
        Intrinsics.checkNotNullParameter(juniorGraduationService, "juniorGraduationService");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.f305631a = juniorGraduationService;
        this.f305632b = serverErrorParser;
        this.f305633c = memoryCache;
        this.d = storage;
        this.e = gson;
        int i = 6;
        Continuation continuation = null;
        this.f = new x4l.c(new b0(this, continuation, i), new b(this, i), new x2g.b(this, 23), new x0f.g(this, continuation, 15), new wa7.j(this, continuation, 10));
        this.f305634g = new ao.h(20, new b(this, 1));
        this.f305635h = new ao.h(20, new b(this, 2));
        this.i = new ao.h(20, new b(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(xg8.j r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xg8.j.a(xg8.j, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof xg8.f
            if (r0 == 0) goto L13
            r0 = r6
            xg8.f r0 = (xg8.f) r0
            int r1 = r0.f305627w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305627w = r1
            goto L18
        L13:
            xg8.f r0 = new xg8.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305627w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            ao.h r6 = r4.i
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            efm.d0 r5 = r6.k(r5)
            r0.f305627w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xg8.j.b(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof xg8.g
            if (r0 == 0) goto L13
            r0 = r6
            xg8.g r0 = (xg8.g) r0
            int r1 = r0.f305628w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305628w = r1
            goto L18
        L13:
            xg8.g r0 = new xg8.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305628w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L46
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            xg8.h r6 = new xg8.h
            r2 = 0
            r4 = 0
            r6.<init>(r5, r4, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            r0.f305628w = r3
            java.lang.Object r6 = skm.e0.J(r2, r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.String r0 = "onIo(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xg8.j.c(gim.c):java.lang.Object");
    }
}
