package oqk;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.filter.TransactionsFilterWithContext;
import com.revolut.feature.transactions.api.kompot.TransactionListApi$Toggles$HomeTotalWealth2;
import com.revolut.feature.unified_transactions.api.filter.UnifiedTransactionsFilter;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import tof.i7;
import tof.q6;

/* JADX INFO: loaded from: classes11.dex */
public final class g0 implements ssi.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qsi.g f227937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qpa.b f227938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f227939c;
    public final sjf.e d;
    public final x71.b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kge.d f227940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f227941h;
    public final mhf.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final nhf.a f227942j;
    public final ks0.n k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jxa.l f227943l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final rkg.d f227944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fd0.d f227945n;
    public volatile boolean o;

    public g0(qsi.g transactionItemsProvider, qpa.b pushMessagesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, sjf.e transactionsPerformanceTracker, m transactionsWidgetMapper, x71.b pendingTransactionsLoaderRepository, b retailAccountCustomizationInteractor, kge.d accountNotificationRepository, gte.a featureToggleInteractor, mhf.b transactionsFilterInteractor, nhf.a unitedWalletInteractor, ks0.n unifiedTransactionsInteractor, jxa.l unifiedTransactionsLoader, rkg.d unifiedTransactionListItemMapper, fd0.d cache) {
        Intrinsics.checkNotNullParameter(transactionItemsProvider, "transactionItemsProvider");
        Intrinsics.checkNotNullParameter(pushMessagesInteractor, "pushMessagesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsPerformanceTracker, "transactionsPerformanceTracker");
        Intrinsics.checkNotNullParameter(transactionsWidgetMapper, "transactionsWidgetMapper");
        Intrinsics.checkNotNullParameter(pendingTransactionsLoaderRepository, "pendingTransactionsLoaderRepository");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        Intrinsics.checkNotNullParameter(accountNotificationRepository, "accountNotificationRepository");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionsFilterInteractor, "transactionsFilterInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(unifiedTransactionsInteractor, "unifiedTransactionsInteractor");
        Intrinsics.checkNotNullParameter(unifiedTransactionsLoader, "unifiedTransactionsLoader");
        Intrinsics.checkNotNullParameter(unifiedTransactionListItemMapper, "unifiedTransactionListItemMapper");
        Intrinsics.checkNotNullParameter(cache, "cache");
        this.f227937a = transactionItemsProvider;
        this.f227938b = pushMessagesInteractor;
        this.f227939c = transactionsInteractor;
        this.d = transactionsPerformanceTracker;
        this.e = pendingTransactionsLoaderRepository;
        this.f = retailAccountCustomizationInteractor;
        this.f227940g = accountNotificationRepository;
        this.f227941h = featureToggleInteractor;
        this.i = transactionsFilterInteractor;
        this.f227942j = unitedWalletInteractor;
        this.k = unifiedTransactionsInteractor;
        this.f227943l = unifiedTransactionsLoader;
        this.f227944m = unifiedTransactionListItemMapper;
        this.f227945n = cache;
    }

    public final efm.r b(s sVar) {
        TransactionContext transactionContext;
        AccountId accountId = sVar.e;
        List list = sVar.f227985c;
        boolean zC = ((jte.d) this.f227941h).c(TransactionListApi$Toggles$HomeTotalWealth2.f91962c);
        fd0.d dVar = this.f227945n;
        if (zC) {
            q6[] q6VarArr = (q6[]) list.toArray(new q6[0]);
            t tVar = (t) dVar.c(sVar);
            if (tVar == null) {
                tVar = new t(zhm.f0.f322471a, false, false);
            }
            boolean z = tVar.f227988a;
            List list2 = tVar.f227989b;
            boolean z3 = tVar.f227990c;
            efm.r rVarC = rd0.e.c(this.f227943l.c((q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length)), kotlin.coroutines.g.f186406a);
            final q6[] q6VarArr2 = (q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length);
            final int i = 0;
            efm.r rVarCompose = rVarC.compose(new efm.x(this) { // from class: oqk.o

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ g0 f227973b;

                {
                    this.f227973b = this;
                }

                @Override // efm.x
                public final efm.w apply(efm.r observable) {
                    switch (i) {
                        case 0:
                            Intrinsics.checkNotNullParameter(observable, "observable");
                            ifm.b bVar = new ifm.b();
                            return observable.doOnSubscribe(new oq3.f(15, new p(bVar, this.f227973b, q6VarArr2))).doFinally(new q(bVar, 2));
                        default:
                            Intrinsics.checkNotNullParameter(observable, "observable");
                            ifm.b bVar2 = new ifm.b();
                            return observable.doOnSubscribe(new oq3.f(14, new p(this.f227973b, q6VarArr2, bVar2))).doFinally(new q(bVar2, 0));
                    }
                }
            }).switchMap(new oq3.f(21, new n(sVar, this))).compose(new ag.p(this, 13, accountId, (q6[]) Arrays.copyOf(q6VarArr, q6VarArr.length)));
            Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
            efm.r rVarDistinctUntilChanged = ue0.e.E(rVarCompose, new t(list2, z, z3)).startWith(new t(list2, z, z3)).distinctUntilChanged();
            Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
            return rVarDistinctUntilChanged;
        }
        q6[] q6VarArr3 = (q6[]) list.toArray(new q6[0]);
        t tVar2 = (t) dVar.c(sVar);
        if (tVar2 == null) {
            tVar2 = new t(zhm.f0.f322471a, false, false);
        }
        boolean z4 = tVar2.f227988a;
        List list3 = tVar2.f227989b;
        boolean z6 = tVar2.f227990c;
        TransactionsFilterWithContext transactionsFilterWithContext = sVar.f227983a.f94567a;
        i7 i7Var = transactionsFilterWithContext != null ? transactionsFilterWithContext.f91956a : null;
        if (transactionsFilterWithContext == null || (transactionContext = transactionsFilterWithContext.f91957b) == null) {
            TransactionContext.INSTANCE.getClass();
            transactionContext = TransactionContext.f60264c;
        }
        TransactionContext transactionContext2 = transactionContext;
        efm.r rVarM = ((mjf.b0) this.f227939c).m((q6[]) Arrays.copyOf(q6VarArr3, q6VarArr3.length));
        final q6[] q6VarArr4 = (q6[]) Arrays.copyOf(q6VarArr3, q6VarArr3.length);
        final int i2 = 1;
        efm.r rVarCompose2 = rVarM.compose(new efm.x(this) { // from class: oqk.o

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g0 f227973b;

            {
                this.f227973b = this;
            }

            @Override // efm.x
            public final efm.w apply(efm.r observable) {
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(observable, "observable");
                        ifm.b bVar = new ifm.b();
                        return observable.doOnSubscribe(new oq3.f(15, new p(bVar, this.f227973b, q6VarArr4))).doFinally(new q(bVar, 2));
                    default:
                        Intrinsics.checkNotNullParameter(observable, "observable");
                        ifm.b bVar2 = new ifm.b();
                        return observable.doOnSubscribe(new oq3.f(14, new p(this.f227973b, q6VarArr4, bVar2))).doFinally(new q(bVar2, 0));
                }
            }
        }).switchMap(new oq3.f(13, new n68.w(sVar, this, i7Var, transactionContext2, 21))).compose(new ag.p(this, 13, accountId, (q6[]) Arrays.copyOf(q6VarArr3, q6VarArr3.length)));
        Intrinsics.checkNotNullExpressionValue(rVarCompose2, "compose(...)");
        efm.r rVarDistinctUntilChanged2 = ue0.e.E(rVarCompose2, new t(list3, z4, z6)).startWith(new t(list3, z4, z6)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged2;
    }

    public final efm.r c(nie.c cVar) {
        if (cVar != null) {
            ProductId f89727a = cVar.getF89727a();
            return rd0.e.c(new olf.e(this.f227940g.t(cVar.getF89728b(), f89727a), 5), kotlin.coroutines.g.f186406a);
        }
        od0.i.Companion.getClass();
        efm.r rVarJust = efm.r.just(od0.i.f224256b);
        Intrinsics.h(rVarJust);
        return rVarJust;
    }

    public final efm.r d(Data params, boolean z) {
        efm.r rVarA0;
        Intrinsics.checkNotNullParameter(params, "params");
        nie.g gVar = (nie.g) params.getContent();
        s sVarE = gVar != null ? e(gVar, z) : null;
        if (sVarE == null) {
            List listA = m.a(!params.getLoading(), z);
            if (listA == null || (rVarA0 = te0.w.h(listA)) == null) {
                rVarA0 = efm.r.empty();
            }
        } else {
            efm.r rVarC = c(sVarE.f227987h);
            efm.r rVarG = m70.a.g(this.f.b(), null, new oq3.e(4), 1);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            efm.r rVarPublish = rVarG.publish(new m3l.d(11, new fjm.j(7)));
            Intrinsics.checkNotNullExpressionValue(rVarPublish, "publish(...)");
            rVarA0 = te0.w.a0(te0.w.m(rVarC, ue0.e.E(rVarPublish, 2), b(sVarE)), new l3d.f(this, sVarE, z));
        }
        efm.r rVarDoOnNext = rVarA0.doOnNext(new oq3.f(20, new c(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public final s e(nie.g gVar, boolean z) {
        i7 i7Var;
        if (!(gVar instanceof ssi.n)) {
            if (!(gVar instanceof lkg.a)) {
                throw new IllegalStateException("Retail doesn't support different instances of TransactionWidgetParams. see [com.revolut.feature.tab.accounts.models.TransactionWidgetParams] for more info");
            }
            lkg.a aVar = (lkg.a) gVar;
            return new s(aVar.f196419a, null, aVar.f196420b, aVar.f196421c, AccountId.Personal.f51414a, RecurringPaymentAccount.Personal.f89320a, zhm.h0.f322473a, null, z);
        }
        if (((jte.d) this.f227941h).c(TransactionListApi$Toggles$HomeTotalWealth2.f91962c)) {
            ssi.n nVar = (ssi.n) gVar;
            i7Var = nVar.f265419a;
            i7 i7VarA = mhf.b.a(this.i, i7Var, null, ifk.b.L(nVar.i), 2);
            if (i7VarA != null) {
                i7Var = i7VarA;
            }
        } else {
            i7Var = ((ssi.n) gVar).f265419a;
        }
        ssi.n nVar2 = (ssi.n) gVar;
        return new s(new UnifiedTransactionsFilter(new TransactionsFilterWithContext(i7Var, nVar2.f265421c), 2), nVar2.f265420b, nVar2.d, nVar2.e, nVar2.f, nVar2.f265422g, nVar2.i, nVar2.f265423h, z);
    }
}
