package et6;

import com.revolut.core.model.account.AccountId;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements gr6.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.v1 f129247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f129248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f129249c;

    public i2(au6.v1 freelancerPocketsRepository, ppk.f ratesInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(freelancerPocketsRepository, "freelancerPocketsRepository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f129247a = freelancerPocketsRepository;
        this.f129248b = ratesInteractor;
        this.f129249c = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof et6.g2
            if (r0 == 0) goto L13
            r0 = r12
            et6.g2 r0 = (et6.g2) r0
            int r1 = r0.f129232y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129232y = r1
            goto L18
        L13:
            et6.g2 r0 = new et6.g2
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f129230w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129232y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            xi0.b r11 = r0.v
            au6.v1 r2 = r0.u
            yhm.o.b(r12)
        L39:
            r6 = r11
            r5 = r2
            goto L56
        L3c:
            yhm.o.b(r12)
            wsg.n r12 = r10.f129249c
            com.revolut.core.model.account.AccountId$Personal r2 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r12 = r12.E(r2)
            au6.v1 r2 = r10.f129247a
            r0.u = r2
            r0.v = r11
            r0.f129232y = r4
            java.lang.Object r12 = nim.a.b(r12, r0)
            if (r12 != r1) goto L39
            goto L79
        L56:
            java.lang.String r11 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            r7 = r12
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f129232y = r3
            r5.getClass()
            akl.s1 r4 = new akl.s1
            r9 = 12
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L7a
        L79:
            return r1
        L7a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.i2.a(xi0.b, gim.c):java.lang.Object");
    }

    public final akg.n b(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(zh9.u0.m(c(loadingStrategy), rd0.e.b(this.f129249c.J(AccountId.Personal.f51414a, loadingStrategy))), new r1(7));
    }

    public final vkm.d c(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(osg.b.g(this.f129249c, loadingStrategy, io3.l.MERCHANT, null, io3.i.INTERNAL, null, null, null, 116));
    }

    public final akg.n d(xi0.b baseCurrency, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Continuation continuation = null;
        return nim.a.v(zh9.u0.m(c(loadingStrategy), nim.a.v(vkm.q.Q(new u1(new vkm.v1(new e38.c(this, continuation, 26)), baseCurrency, 1), new eh9.j(continuation, loadingStrategy, this, 4)), new dv5.p(12, baseCurrency))), new dv5.p(11, baseCurrency));
    }

    public final Object e(boolean z, gim.c cVar) {
        wsg.n nVar = this.f129249c;
        if (z) {
            Object objA = nim.a.a(nVar.l0(true), cVar);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
        }
        Object objA2 = nim.a.a(nVar.k0(AccountId.Personal.f51414a), cVar);
        return objA2 == fim.a.COROUTINE_SUSPENDED ? objA2 : Unit.f186387a;
    }
}
