package kd8;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd8.i f182820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j2 f182821b;

    public e(gd8.i juniorConsentRepository) {
        Intrinsics.checkNotNullParameter(juniorConsentRepository, "juniorConsentRepository");
        this.f182820a = juniorConsentRepository;
        this.f182821b = vkm.q.c(h0.f322473a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, java.lang.String r6, v6d.a r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof kd8.c
            if (r0 == 0) goto L13
            r0 = r8
            kd8.c r0 = (kd8.c) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            kd8.c r0 = new kd8.c
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f182815x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            v6d.a r7 = r0.f182814w
            java.lang.String r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            r0.u = r5
            r0.v = r6
            r0.f182814w = r7
            r0.z = r3
            java.lang.Object r8 = r4.b(r6, r7, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.String r8 = "HARDCODED_CONSENT_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
            if (r5 == 0) goto L67
        L4f:
            vkm.j2 r5 = r4.f182821b
            java.lang.Object r8 = r5.getValue()
            r0 = r8
            java.util.Set r0 = (java.util.Set) r0
            kd8.b r1 = new kd8.b
            r1.<init>(r6, r7)
            java.util.LinkedHashSet r0 = zhm.a1.m(r0, r1)
            boolean r5 = r5.h(r8, r0)
            if (r5 == 0) goto L4f
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.e.a(java.lang.String, java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    public final Object b(String str, v6d.a aVar, gim.c cVar) throws Throwable {
        gd8.p pVar = (gd8.p) this.f182820a;
        pVar.getClass();
        gd8.o oVar = new gd8.o(pVar, str, aVar, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, oVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r5, java.lang.String r6, v6d.a r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof kd8.d
            if (r0 == 0) goto L13
            r0 = r8
            kd8.d r0 = (kd8.d) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            kd8.d r0 = new kd8.d
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f182818x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            v6d.a r7 = r0.f182817w
            java.lang.String r6 = r0.v
            java.lang.String r5 = r0.u
            yhm.o.b(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            yhm.o.b(r8)
            r0.u = r5
            r0.v = r6
            r0.f182817w = r7
            r0.z = r3
            java.lang.Object r8 = r4.d(r6, r7, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            java.lang.String r8 = "HARDCODED_CONSENT_ID"
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r5, r8)
            if (r5 == 0) goto L67
        L4f:
            vkm.j2 r5 = r4.f182821b
            java.lang.Object r8 = r5.getValue()
            r0 = r8
            java.util.Set r0 = (java.util.Set) r0
            kd8.b r1 = new kd8.b
            r1.<init>(r6, r7)
            java.util.LinkedHashSet r0 = zhm.a1.j(r0, r1)
            boolean r5 = r5.h(r8, r0)
            if (r5 == 0) goto L4f
        L67:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.e.c(java.lang.String, java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    public final Object d(String str, v6d.a aVar, gim.c cVar) throws Throwable {
        gd8.p pVar = (gd8.p) this.f182820a;
        pVar.getClass();
        gd8.o oVar = new gd8.o(pVar, str, aVar, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, oVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public final akg.n e(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(f(loadingStrategy), new k7c.n(juniorId, 7));
    }

    public final t38.e f(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        gd8.p pVar = (gd8.p) this.f182820a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new t38.e(rd0.e.b(pVar.f.e(Unit.f186387a, loadingStrategy)), 24, this.f182821b, new gsd.d(3, 2, null));
    }
}
