package le3;

import com.revolut.domain.interactors.transactions.Priority;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f194492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u71.a f194493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mq9.f f194494c;
    public final p d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f194495g;

    public s(com.revolut.domain.interactors.transactions.a transactionsInteractor, u71.a splitBillRepository, mq9.f paymentsGroupsInteractor, p categorisationTransactionFilterInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(splitBillRepository, "splitBillRepository");
        Intrinsics.checkNotNullParameter(paymentsGroupsInteractor, "paymentsGroupsInteractor");
        Intrinsics.checkNotNullParameter(categorisationTransactionFilterInteractor, "categorisationTransactionFilterInteractor");
        this.f194492a = transactionsInteractor;
        this.f194493b = splitBillRepository;
        this.f194494c = paymentsGroupsInteractor;
        this.d = categorisationTransactionFilterInteractor;
        final int i = 1;
        this.e = yhm.j.b(new Function0(this) { // from class: le3.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194491b;

            {
                this.f194491b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f194491b.f194493b.observeSplitBills(false).distinctUntilChanged().replay(1).e();
                    case 1:
                        s sVar = this.f194491b;
                        return pd.b.r(((mr9.a) sVar.f194494c).i(false), new q(sVar, 0)).distinctUntilChanged().replay(1).e();
                    default:
                        s sVar2 = this.f194491b;
                        return pd.b.r(((mr9.a) sVar2.f194494c).i(false), new q(sVar2, 1)).distinctUntilChanged().replay(1).e();
                }
            }
        });
        final int i2 = 2;
        this.f = yhm.j.b(new Function0(this) { // from class: le3.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194491b;

            {
                this.f194491b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f194491b.f194493b.observeSplitBills(false).distinctUntilChanged().replay(1).e();
                    case 1:
                        s sVar = this.f194491b;
                        return pd.b.r(((mr9.a) sVar.f194494c).i(false), new q(sVar, 0)).distinctUntilChanged().replay(1).e();
                    default:
                        s sVar2 = this.f194491b;
                        return pd.b.r(((mr9.a) sVar2.f194494c).i(false), new q(sVar2, 1)).distinctUntilChanged().replay(1).e();
                }
            }
        });
        final int i3 = 0;
        this.f194495g = yhm.j.b(new Function0(this) { // from class: le3.r

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ s f194491b;

            {
                this.f194491b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f194491b.f194493b.observeSplitBills(false).distinctUntilChanged().replay(1).e();
                    case 1:
                        s sVar = this.f194491b;
                        return pd.b.r(((mr9.a) sVar.f194494c).i(false), new q(sVar, 0)).distinctUntilChanged().replay(1).e();
                    default:
                        s sVar2 = this.f194491b;
                        return pd.b.r(((mr9.a) sVar2.f194494c).i(false), new q(sVar2, 1)).distinctUntilChanged().replay(1).e();
                }
            }
        });
    }

    public final efm.r a(CategorisationFilter categorisationFilter, List transactionUpdatesScopes, Priority transactionPriority) {
        Intrinsics.checkNotNullParameter(categorisationFilter, "categorisationFilter");
        Intrinsics.checkNotNullParameter(transactionUpdatesScopes, "transactionUpdatesScopes");
        Intrinsics.checkNotNullParameter(transactionPriority, "transactionPriority");
        return pd.b.r(mif.a.e(pd.b.r(this.d.a(categorisationFilter), new khg.s(this, 26, transactionUpdatesScopes, transactionPriority)), (efm.r) this.f194495g.getValue(), (efm.r) this.e.getValue()), new q(this, 2));
    }
}
