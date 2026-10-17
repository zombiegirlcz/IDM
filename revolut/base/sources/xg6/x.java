package xg6;

import com.revolut.feature.external_accounts.impl.repository.network.MandateService;
import efm.d0;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import tc7.m0;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final th6.w f305610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oe6.a f305611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f80.a f305612c;
    public final ang.f d;

    public x(th6.w repository, oe6.a externalInstitutionsInteractor, f80.a uriHelper, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(externalInstitutionsInteractor, "externalInstitutionsInteractor");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f305610a = repository;
        this.f305611b = externalInstitutionsInteractor;
        this.f305612c = uriHelper;
        this.d = userInteractor;
    }

    public static vkm.d b(x xVar, String id10) {
        xVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        th6.w wVar = xVar.f305610a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        return rd0.e.b(wVar.e.f(id10, false));
    }

    public final ufm.i a(String institutionId, dj0.d limitPerTransfer, dj0.d limitPerMonth, dj0.d dVar) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        th6.w wVar = this.f305610a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(limitPerTransfer, "limitPerTransfer");
        Intrinsics.checkNotNullParameter(limitPerMonth, "limitPerMonth");
        MandateService mandateService = wVar.f271298a;
        uh6.e eVar = new uh6.e(institutionId, new uh6.d(mo3.a.p(limitPerTransfer), mo3.a.p(limitPerMonth)), dVar != null ? mo3.a.p(dVar) : null);
        MandateService.Companion aVar = MandateService.INSTANCE;
        d0<uh6.f> d0VarCreateMandate = mandateService.createMandate(eVar, new wj0.b("CREATE_MANDATE_IDEMPOTENCY_TAG"));
        th6.u uVar = th6.u.f;
        m0 m0Var = new m0(3);
        d0VarCreateMandate.getClass();
        ufm.i iVar = new ufm.i(d0VarCreateMandate, m0Var, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.i iVar2 = new ufm.i(te0.w.i0(iVar), new k(new wma.e(1, this.f305612c, f80.a.class, "parse", "parse(Ljava/lang/String;)Landroid/net/Uri;", 0, 25), 5), 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof xg6.v
            if (r0 == 0) goto L13
            r0 = r5
            xg6.v r0 = (xg6.v) r0
            int r1 = r0.f305608w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f305608w = r1
            goto L18
        L13:
            xg6.v r0 = new xg6.v
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f305608w
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
            ang.f r5 = r4.d
            r2 = 0
            efm.d0 r5 = r5.f(r2)
            r0.f305608w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L42
            return r1
        L42:
            do3.n r5 = (do3.n) r5
            com.revolut.feature.address.models.Address r5 = r5.k
            if (r5 == 0) goto L53
            java.lang.String r5 = r5.getCountry()
            if (r5 == 0) goto L53
            wi0.b r5 = com.bumptech.glide.d.c(r5)
            goto L54
        L53:
            r5 = 0
        L54:
            boolean r5 = com.bumptech.glide.d.q(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xg6.x.c(gim.c):java.lang.Object");
    }

    public final ufm.i d(String mandateId) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        th6.w wVar = this.f305610a;
        w4l.f fVar = wVar.d;
        Unit unit = Unit.f186387a;
        sfm.b bVarG = fVar.g(unit, true).g(wVar.d.f(unit, false));
        Intrinsics.checkNotNullExpressionValue(bVarG, "andThen(...)");
        d0 d0VarFirstOrError = m70.a.g(bVarG, null, null, 3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        int i = 4;
        ufm.i iVar = new ufm.i(mra.d.H(ue0.e.F(d0VarFirstOrError, f0.f322471a), 2000L, new f28.b0(mandateId, 25)), new k(new xf0.h(mandateId, i), i), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final pfm.r e(String mandateId) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        th6.w wVar = this.f305610a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        pfm.a aVarE = wVar.f271298a.revokeMandate(mandateId).e(new pfm.h(new rzc.b(wVar, mandateId, 16), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return te0.w.g0(aVarE);
    }

    public final pfm.r f(dj0.d topupAmount, String mandateId, boolean z) {
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        th6.w wVar = this.f305610a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(topupAmount, "topupAmount");
        pfm.h hVar = new pfm.h(new b7c.b(wVar, mandateId, topupAmount, z, 3), 1);
        Intrinsics.checkNotNullExpressionValue(hVar, "defer(...)");
        return te0.w.g0(hVar);
    }
}
