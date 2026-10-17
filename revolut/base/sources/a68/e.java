package a68;

import com.revolut.feature.junior.account_activation.api.JuniorAccountActivationApi$Toggles$JuniorAsyncClaimProcessing;
import efm.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import r58.c;
import rh8.n0;
import skm.p0;
import te0.w;
import te8.z;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements q58.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hj8.a f1561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te8.e f1562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f1563c;
    public final z d;
    public final v58.d e;
    public final ic8.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0 f1564g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f1565h;
    public final gte.a i;

    public e(hj8.a juniorProfileInteractor, te8.e juniorAccountInteractor, n walletInteractor, z juniorProductsInteractor, v58.d juniorAccountActivationRepository, ic8.b juniorCardRequestInteractor, n0 pollingInteractor, l claimAccountPollingInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountInteractor, "juniorAccountInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorAccountActivationRepository, "juniorAccountActivationRepository");
        Intrinsics.checkNotNullParameter(juniorCardRequestInteractor, "juniorCardRequestInteractor");
        Intrinsics.checkNotNullParameter(pollingInteractor, "pollingInteractor");
        Intrinsics.checkNotNullParameter(claimAccountPollingInteractor, "claimAccountPollingInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f1561a = juniorProfileInteractor;
        this.f1562b = juniorAccountInteractor;
        this.f1563c = walletInteractor;
        this.d = juniorProductsInteractor;
        this.e = juniorAccountActivationRepository;
        this.f = juniorCardRequestInteractor;
        this.f1564g = pollingInteractor;
        this.f1565h = claimAccountPollingInteractor;
        this.i = featureToggleInteractor;
    }

    public static final d0 a(e eVar, r58.c cVar) {
        eVar.getClass();
        if (Intrinsics.f(cVar, c.a.f251541a) || Intrinsics.f(cVar, c.d.f251544a) || Intrinsics.f(cVar, c.C1388c.f251543a) || Intrinsics.f(cVar, c.b.f251542a)) {
            return w.j(cVar);
        }
        if (!Intrinsics.f(cVar, c.e.f251545a)) {
            throw new NoWhenBranchMatchedException();
        }
        p0 p0Var = p0.f264001a;
        pfm.z zVarD = pd.b.n(elm.f.f127540b, new c(eVar, null, 0)).D(cVar);
        Intrinsics.checkNotNullExpressionValue(zVarD, "toSingleDefault(...)");
        return zVarD;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        if (r7 != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(r58.a r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a68.a
            if (r0 == 0) goto L13
            r0 = r8
            a68.a r0 = (a68.a) r0
            int r1 = r0.f1557w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1557w = r1
            goto L18
        L13:
            a68.a r0 = new a68.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1557w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L7a
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            yhm.m r8 = (yhm.m) r8
            java.lang.Object r7 = r8.f314193a
            goto L62
        L3d:
            yhm.o.b(r8)
            goto L51
        L41:
            yhm.o.b(r8)
            r0.f1557w = r5
            v58.d r8 = r6.e
            v58.h r8 = (v58.h) r8
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L51
            goto L79
        L51:
            pi8.a r8 = (pi8.a) r8
            java.lang.String r7 = r8.f236459a
            kf8.i r8 = kf8.i.BANKING
            r0.f1557w = r4
            rh8.n0 r2 = r6.f1564g
            java.lang.Object r7 = r2.a(r7, r8, r0)
            if (r7 != r1) goto L62
            goto L79
        L62:
            yhm.o.b(r7)
            r0.f1557w = r3
            a68.d r7 = new a68.d
            r8 = 0
            r2 = 0
            r7.<init>(r6, r2, r8)
            java.lang.Object r7 = skm.e0.G(r7, r0)
            if (r7 != r1) goto L75
            goto L77
        L75:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L77:
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a68.e.b(r58.a, gim.c):java.lang.Object");
    }

    public final ufm.i c(r58.b request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (((jte.d) this.i).c(JuniorAccountActivationApi$Toggles$JuniorAsyncClaimProcessing.f76617c)) {
            p0 p0Var = p0.f264001a;
            ufm.i iVar = new ufm.i(w.o0(elm.f.f127540b, new a1a.a(this, request, null, 10)), new a31.e(new a08.e(1, this, e.class, "handleClaimAccountActivationResult", "handleClaimAccountActivationResult(Lcom/revolut/feature/junior/account_activation/api/model/ClaimAccountActivationResult;)Lio/reactivex/Single;", 0, 6), 26), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return iVar;
        }
        v58.h hVar = (v58.h) this.e;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        ao.h hVar2 = hVar.d;
        Intrinsics.checkNotNullParameter(request, "<this>");
        d0 d0VarK = hVar2.k(new u58.d(request.f251540a));
        a31.e eVar = new a31.e(new a08.e(1, this, e.class, "handleClaimAccountActivationResult", "handleClaimAccountActivationResult(Lcom/revolut/feature/junior/account_activation/api/model/ClaimAccountActivationResult;)Lio/reactivex/Single;", 0, 7), 25);
        d0VarK.getClass();
        ufm.i iVar2 = new ufm.i(d0VarK, eVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar2, "flatMap(...)");
        return iVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(r58.d r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof a68.b
            if (r0 == 0) goto L13
            r0 = r8
            a68.b r0 = (a68.b) r0
            int r1 = r0.f1558w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1558w = r1
            goto L18
        L13:
            a68.b r0 = new a68.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f1558w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            goto L68
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r8)
            goto L55
        L37:
            yhm.o.b(r8)
            r0.f1558w = r4
            v58.d r8 = r6.e
            v58.h r8 = (v58.h) r8
            r8.getClass()
            v06.i r2 = new v06.i
            r4 = 11
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r7, r2, r0)
            if (r7 != r1) goto L55
            goto L67
        L55:
            r0.f1558w = r3
            a68.d r7 = new a68.d
            r7.<init>(r6, r5, r3)
            java.lang.Object r7 = skm.e0.G(r7, r0)
            if (r7 != r1) goto L63
            goto L65
        L63:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L65:
            if (r7 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a68.e.d(r58.d, gim.c):java.lang.Object");
    }
}
