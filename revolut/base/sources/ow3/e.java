package ow3;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import prl.k;
import skm.e0;
import skm.p0;
import xq3.j;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q24.c f230300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f230301b;

    public e(q24.c repository, j creditApplicationInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        this.f230300a = repository;
        this.f230301b = creditApplicationInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (xq3.j.g(r5.f230301b, r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ft3.h1 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ow3.d
            if (r0 == 0) goto L13
            r0 = r7
            ow3.d r0 = (ow3.d) r0
            int r1 = r0.f230299x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230299x = r1
            goto L18
        L13:
            ow3.d r0 = new ow3.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230299x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ft3.h1 r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            java.lang.String r7 = r6.f137835a
            r0.u = r6
            r0.f230299x = r4
            java.lang.Object r7 = r5.d(r7, r0)
            if (r7 != r1) goto L48
            goto L5b
        L48:
            ft3.d1 r6 = r6.f137836b
            java.util.Set r6 = zhm.y0.b(r6)
            r7 = 0
            r0.u = r7
            r0.f230299x = r3
            xq3.j r7 = r5.f230301b
            java.lang.Object r6 = xq3.j.g(r7, r6, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ow3.e.a(ft3.h1, gim.c):java.lang.Object");
    }

    public final Object b(String str, gim.c cVar) throws Throwable {
        q24.c cVar2 = this.f230300a;
        cVar2.getClass();
        q24.a aVar = new q24.a(cVar2, str, null, 0);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public final Object c(String str, String str2, gim.c cVar) {
        q24.c cVar2 = this.f230300a;
        cVar2.getClass();
        q24.b bVar = new q24.b(cVar2, str, str2, null, 0);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, bVar, cVar);
    }

    public final Object d(String str, gim.c cVar) throws Throwable {
        q24.c cVar2 = this.f230300a;
        cVar2.getClass();
        q24.a aVar = new q24.a(cVar2, str, null, 3);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, aVar, cVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    public final Object e(String str, uu3.a aVar, gim.i iVar) throws Throwable {
        q24.c cVar = this.f230300a;
        cVar.getClass();
        k kVar = new k(13, aVar, cVar, str, (Continuation) null);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, kVar, iVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }
}
