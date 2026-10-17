package rnd;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.retail.feature.api.AnalyticsAccountsSelection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import vkm.j2;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class y implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f255646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f255647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g48.r0 f255648c;
    public final gr6.a d;
    public final cge.h e;
    public final v0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f255649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y91.b f255650h;
    public final ge3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f255651j;
    public final wa7.m k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w0 f255652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f255653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f255654n;

    public y(wsg.n walletInteractor, al4.n creditCardInteractor, g48.r0 jointAccountsInteractor, gr6.a freelancerInteractor, cge.h productAccountsInfoProvider, v0 savingsAnalyticsAccountProvider, c0 juniorAnalyticsAccountProvider, y91.b accountsProductFeatureChecker, ge3.a analyticsPocketInteractor, i analyticsAccountMetadataProvider, wa7.m hiddenAccountsInteractor, w0 totalWealthTransactionSourcesProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(freelancerInteractor, "freelancerInteractor");
        Intrinsics.checkNotNullParameter(productAccountsInfoProvider, "productAccountsInfoProvider");
        Intrinsics.checkNotNullParameter(savingsAnalyticsAccountProvider, "savingsAnalyticsAccountProvider");
        Intrinsics.checkNotNullParameter(juniorAnalyticsAccountProvider, "juniorAnalyticsAccountProvider");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(analyticsPocketInteractor, "analyticsPocketInteractor");
        Intrinsics.checkNotNullParameter(analyticsAccountMetadataProvider, "analyticsAccountMetadataProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(totalWealthTransactionSourcesProvider, "totalWealthTransactionSourcesProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f255646a = walletInteractor;
        this.f255647b = creditCardInteractor;
        this.f255648c = jointAccountsInteractor;
        this.d = freelancerInteractor;
        this.e = productAccountsInfoProvider;
        this.f = savingsAnalyticsAccountProvider;
        this.f255649g = juniorAnalyticsAccountProvider;
        this.f255650h = accountsProductFeatureChecker;
        this.i = analyticsPocketInteractor;
        this.f255651j = analyticsAccountMetadataProvider;
        this.k = hiddenAccountsInteractor;
        this.f255652l = totalWealthTransactionSourcesProvider;
        this.f255653m = featureToggleInteractor;
        od0.i.Companion.getClass();
        od0.i iVar = od0.i.f224256b;
        vkm.q.c(iVar);
        this.f255654n = vkm.q.c(iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(rnd.y r5, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof rnd.n
            if (r0 == 0) goto L13
            r0 = r7
            rnd.n r0 = (rnd.n) r0
            int r1 = r0.f255623w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f255623w = r1
            goto L18
        L13:
            rnd.n r0 = new rnd.n
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f255623w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L83
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            r7 = 0
            if (r6 == 0) goto L3a
            com.revolut.feature.tab.accounts.models.ProductId r2 = r6.getF89727a()
            goto L3b
        L3a:
            r2 = r7
        L3b:
            com.revolut.feature.tab.accounts.models.ProductId r4 = com.revolut.feature.tab.accounts.models.ProductId.CREDIT
            if (r2 != r4) goto L88
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r6.getF89728b()
            com.revolut.feature.tab.accounts.models.ProductAccountId$Payload r6 = r6.f89730b
            boolean r2 = r6 instanceof com.revolut.feature.credit.models.CreditAccountType
            if (r2 == 0) goto L4c
            com.revolut.feature.credit.models.CreditAccountType r6 = (com.revolut.feature.credit.models.CreditAccountType) r6
            goto L4d
        L4c:
            r6 = r7
        L4d:
            boolean r2 = r6 instanceof com.revolut.feature.credit.models.CreditAccountType.CreditCard
            if (r2 == 0) goto L54
            com.revolut.feature.credit.models.CreditAccountType$CreditCard r6 = (com.revolut.feature.credit.models.CreditAccountType.CreditCard) r6
            goto L55
        L54:
            r6 = r7
        L55:
            if (r6 == 0) goto L88
            java.lang.String r6 = r6.f70624b
            if (r6 == 0) goto L88
            r0.f255623w = r3
            al4.n r5 = r5.f255647b
            w4l.h r2 = w4l.h.f294642c
            om4.x2 r5 = (om4.x2) r5
            akg.n r5 = r5.h(r6, r2)
            rnd.k r6 = new rnd.k
            r2 = 0
            r6.<init>(r2)
            akg.n r5 = nim.a.v(r5, r6)
            rhj.m r6 = new rhj.m
            r2 = 28
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r7, r6, r3)
            java.lang.Object r7 = vkm.q.z(r5, r0)
            if (r7 != r1) goto L83
            return r1
        L83:
            com.revolut.retail.feature.api.AnalyticsAccount$Personal$CreditCard r7 = (com.revolut.retail.feature.api.AnalyticsAccount.Personal.CreditCard) r7
            if (r7 == 0) goto L88
            return r7
        L88:
            com.revolut.retail.feature.api.AnalyticsAccount$Personal$All r5 = com.revolut.retail.feature.api.AnalyticsAccount.Personal.All.f99192a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rnd.y.a(rnd.y, com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value, gim.c):java.lang.Object");
    }

    public static final jhi.k b(y yVar, ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        return nim.a.u(new v(2, null), rd0.e.e(nim.a.A(new njj.l(new qna.n(productAccountDescriptor$Value != null ? new go.g(productAccountDescriptor$Value, 2) : yVar.e.b(ibb.c.f160140a), yVar, 21), 27), new k(3)), zhm.h0.f322473a, new t(3, null)));
    }

    public static final t38.e c(y yVar) {
        return new t38.e(rd0.e.b(osg.b.g(yVar.f255646a, w4l.h.f294642c, null, null, io3.i.EXTERNAL, null, null, null, LDSFile.EF_DG4_TAG)), 24, yVar.k.k(), new x(yVar, null));
    }

    public final jhi.k d() {
        le3.f fVar = (le3.f) this.i;
        vkm.y yVarY = cj9.c.y(nim.a.v(zh9.u0.i(cj9.c.y(nim.a.v(fVar.d(), new rm2.s(29))), cj9.c.y(nim.a.v(fVar.f(io3.l.CURRENT, io3.i.INTERNAL, AccountId.Personal.f51414a), new k(1))), cj9.c.y(nim.a.v(fVar.c(), new k(5)))), new k(2)));
        v0 v0Var = this.f;
        Continuation continuation = null;
        vkm.y yVarY2 = cj9.c.y(xam.a.h(new u0(v0Var, null), toh.d.g(v0Var.f255640a, null, 3)));
        vkm.y yVarE = e();
        et6.g gVar = (et6.g) this.d;
        w4l.h hVar = w4l.h.f294642c;
        vkm.y yVarY3 = cj9.c.y(xam.a.h(new rk9.d(this, continuation, 9), gVar.d(hVar)));
        vkm.y yVarY4 = cj9.c.y(new v1(new rm6.c(this, continuation, 4)));
        c0 c0Var = this.f255649g;
        wkm.l lVarL = ((nj8.n) c0Var.f255597b).l(hVar);
        return nim.a.u(new qkg.a(2, 10, continuation), zh9.u0.i(zh9.u0.i(yVarY, yVarY2, yVarE), zh9.u0.i(yVarY3, yVarY4, cj9.c.y(new t38.e(((jte.d) c0Var.f255596a).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c) ? nim.a.v(zh9.u0.m(lVarL, c0Var.f255598c.b(hVar)), new k(c0Var, 6)) : nim.a.v(lVarL, new k(c0Var, 7)), 24, c0Var.d.k(), new b0(c0Var, null)))), cj9.c.y(xam.a.h(new rf9.h(v0Var, continuation, 1), new njj.l(new ae8.c(bla.b.b(v0Var.f, "YOUTH"), 25), 28)))));
    }

    public final vkm.y e() {
        Continuation continuation = null;
        return cj9.c.y(vkm.q.Q(new v1(new rhl.b(this, continuation, 3)), new u(continuation, this, 1)));
    }

    public final Unit f(AnalyticsAccountsSelection analyticsAccountsSelection) {
        od0.i.Companion.getClass();
        od0.i iVarA = od0.h.a(analyticsAccountsSelection);
        j2 j2Var = this.f255654n;
        j2Var.getClass();
        j2Var.g(null, iVarA);
        return Unit.f186387a;
    }
}
