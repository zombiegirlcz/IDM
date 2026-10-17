package vy5;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import nce.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements pfe.b {

    @NotNull
    public static final x Companion = new x();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final TransactionContext f293161m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f293162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uy5.f f293163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f293164c;
    public final ssi.o d;
    public final x79.a e;
    public final zy5.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final utk.f f293165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p56.a f293166h;
    public final wsg.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e95.a f293167j;
    public final wda.r k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wa7.m f293168l;

    static {
        Priority.HIGH high = new Priority.HIGH("Transactions widget [CurrencyAccountDataSource]");
        TransactionContext.TransactionData[] elements = {TransactionContext.TransactionData.MERCHANT_PAYMENTS, TransactionContext.TransactionData.ACQUIRING_CASHBACK};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f293161m = new TransactionContext(high, new TransactionContext.DataSet.Excluded(kotlin.collections.d.y0(elements)));
    }

    public i0(v0 mapper, uy5.f interactor, ang.f userInteractor, ssi.o transactionsWidgetUiModel, e1 seeAllNaviCommandProvider, x79.a onHoldAccountInteractor, zy5.a currencyEmptyStateProvider, utk.f alternativeFeaturesProvider, p56.a removePocketInteractor, wsg.n walletInteractor, e95.a overdraftHomeAccountInteractor, wda.r pocketDetailsPreviewSource, wa7.m hiddenAccountsInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(seeAllNaviCommandProvider, "seeAllNaviCommandProvider");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(currencyEmptyStateProvider, "currencyEmptyStateProvider");
        Intrinsics.checkNotNullParameter(alternativeFeaturesProvider, "alternativeFeaturesProvider");
        Intrinsics.checkNotNullParameter(removePocketInteractor, "removePocketInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(overdraftHomeAccountInteractor, "overdraftHomeAccountInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsPreviewSource, "pocketDetailsPreviewSource");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f293162a = mapper;
        this.f293163b = interactor;
        this.f293164c = userInteractor;
        this.d = transactionsWidgetUiModel;
        this.e = onHoldAccountInteractor;
        this.f = currencyEmptyStateProvider;
        this.f293165g = alternativeFeaturesProvider;
        this.f293166h = removePocketInteractor;
        this.i = walletInteractor;
        this.f293167j = overdraftHomeAccountInteractor;
        this.k = pocketDetailsPreviewSource;
        this.f293168l = hiddenAccountsInteractor;
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        efm.d0 iVar;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        v0.Companion.getClass();
        String allPocketsId = v0.f293220q;
        io3.l type = io3.l.CURRENT;
        p0 p0Var = (p0) this.f293163b;
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(allPocketsId, "allPocketsId");
        Intrinsics.checkNotNullParameter(type, "type");
        efm.r rVarC = p0Var.c(type, allPocketsId, zhm.y0.b(accountId));
        p0Var.getClass();
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(allPocketsId, "allPocketsId");
        RecurringPaymentAccount.Personal recurringPaymentAccount = RecurringPaymentAccount.Personal.f89320a;
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        String str = accountId.f89729a;
        if (Intrinsics.f(str, allPocketsId)) {
            iVar = efm.d0.m(a.C1197a.f214179a);
            Intrinsics.checkNotNullExpressionValue(iVar, "just(...)");
        } else {
            efm.d0 d0VarZ = p0Var.f293198a.z(com.revolut.feature.subscriptions.models.a.a(recurringPaymentAccount), str);
            vx9.w wVar = new vx9.w(new l0(p0Var, 1), 13);
            d0VarZ.getClass();
            iVar = new ufm.i(d0VarZ, wVar, 1);
        }
        efm.r rVarX = iVar.x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        efm.r map = te0.w.l(rVarC, rVarX).map(new vx9.w(new cia.b(this, accountId, 5), 9));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // pfe.b
    public final Flow d(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        wkm.l lVarQ = vkm.q.Q(b(accountId), new vdl.c1((Continuation) null, this, 26));
        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
        Flow flowC = vkm.q.C(lVarQ, oji.e.f225788b);
        if (flowC != null) {
            return flowC;
        }
        r6.b.D("transactionsSectionParamsFlow must not be null");
        return vkm.i.f290039a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vy5.e0
            if (r0 == 0) goto L13
            r0 = r7
            vy5.e0 r0 = (vy5.e0) r0
            int r1 = r0.f293149w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f293149w = r1
            goto L1a
        L13:
            vy5.e0 r0 = new vy5.e0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f293149w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            io3.l r7 = io3.l.CURRENT
            uy5.f r2 = r5.f293163b
            vy5.p0 r2 = (vy5.p0) r2
            efm.r r7 = r2.a(r7)
            cia.b r2 = new cia.b
            r4 = 6
            r2.<init>(r6, r4)
            efm.r r6 = nim.a.w(r7, r2)
            r7 = 3
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r2, r7)
            r0.f293149w = r3
            java.lang.Object r7 = nim.a.c(r6, r0)
            if (r7 != r1) goto L57
            return r1
        L57:
            io3.d r7 = (io3.d) r7
            long r0 = r7.i
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L79
            xfe.c r6 = new xfe.c
            dj0.d r0 = new dj0.d
            long r1 = r7.i
            xi0.a r3 = xi0.b.Companion
            java.lang.String r7 = r7.f163147c
            r3.getClass()
            xi0.b r7 = xi0.a.a(r7)
            r0.<init>(r1, r7)
            r6.<init>(r0)
            return r6
        L79:
            xfe.a$b r6 = xfe.a.b.f305242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.i0.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if (nim.a.a(r11, r0) != r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountId r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vy5.i0.h(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // pfe.b
    public final Object i(ProductAccountId productAccountId, gim.c cVar) {
        HomeFeedWidgetContext.Personal.INSTANCE.getClass();
        return new sfe.z(HomeFeedWidgetContext.Personal.Companion.a());
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        vkm.f fVarM = vkm.q.m(new g0(accountId, this, null));
        Intrinsics.checkNotNullParameter(skm.p0.f264001a, "<this>");
        return vkm.q.C(fVarM, oji.e.f225788b);
    }
}
