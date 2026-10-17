package nf9;

import g72.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f214881c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f214882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f214883b;

    static {
        wi0.a aVar = wi0.b.Companion;
        aVar.getClass();
        wi0.b bVar = wi0.b.D2;
        aVar.getClass();
        wi0.b bVar2 = wi0.b.y2;
        aVar.getClass();
        wi0.b bVar3 = wi0.b.A;
        aVar.getClass();
        wi0.b bVar4 = wi0.b.Y1;
        aVar.getClass();
        wi0.b bVar5 = wi0.b.y0;
        aVar.getClass();
        wi0.b bVar6 = wi0.b.T0;
        aVar.getClass();
        wi0.b bVar7 = wi0.b.l2;
        aVar.getClass();
        f214881c = v.k(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, wi0.b.f297734c);
    }

    public f(ang.f userInteractor, g multibancoInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(multibancoInteractor, "multibancoInteractor");
        this.f214882a = userInteractor;
        this.f214883b = multibancoInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof nf9.d
            if (r0 == 0) goto L13
            r0 = r5
            nf9.d r0 = (nf9.d) r0
            int r1 = r0.f214878w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214878w = r1
            goto L18
        L13:
            nf9.d r0 = new nf9.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214878w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L42
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            ang.f r5 = r4.f214882a
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f214878w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            do3.n r5 = (do3.n) r5
            wi0.b r5 = do3.q.y(r5)
            java.util.List r0 = nf9.f.f214881c
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L56:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            r3 = r2
            wi0.b r3 = (wi0.b) r3
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r5)
            if (r3 == 0) goto L56
            goto L6b
        L6a:
            r2 = 0
        L6b:
            wi0.b r2 = (wi0.b) r2
            if (r2 != 0) goto L76
            java.lang.Object r5 = zhm.d0.b0(r0)
            wi0.b r5 = (wi0.b) r5
            return r5
        L76:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nf9.f.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof nf9.e
            if (r0 == 0) goto L13
            r0 = r8
            nf9.e r0 = (nf9.e) r0
            int r1 = r0.f214880x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214880x = r1
            goto L18
        L13:
            nf9.e r0 = new nf9.e
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214880x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            wi0.b r0 = r0.u
            yhm.o.b(r8)
            goto L64
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            yhm.o.b(r8)
            goto L45
        L39:
            yhm.o.b(r8)
            r0.f214880x = r5
            java.io.Serializable r8 = r7.a(r0)
            if (r8 != r1) goto L45
            goto L60
        L45:
            wi0.b r8 = (wi0.b) r8
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.y2
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r8, r2)
            if (r2 == 0) goto L6f
            r0.u = r8
            r0.f214880x = r4
            g72.g r2 = r7.f214883b
            java.lang.Object r0 = r2.j(r0)
            if (r0 != r1) goto L61
        L60:
            return r1
        L61:
            r6 = r0
            r0 = r8
            r8 = r6
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L6e
            nf9.a r3 = nf9.a.MULTIBANCO
        L6e:
            r8 = r0
        L6f:
            nf9.b r0 = new nf9.b
            r0.<init>(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nf9.f.b(gim.c):java.lang.Object");
    }
}
