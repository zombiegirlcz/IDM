package le3;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.categorisation.api.model.CategorisationFilter;
import com.revolut.retail.feature.api.AnalyticsAccount;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import tof.i7;
import zh9.u0;
import zhm.d0;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class w implements ge3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l5i.q f194501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f194502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f194503c;
    public final ge3.a d;
    public final x e;
    public final ConcurrentHashMap f;

    public w(l5i.q analyticsTransactionsInteractor, l80.e dateProvider, ue0.c storage, ge3.a analyticsPocketsInteractor, x savingsAnalyticsTransactionFilterInteractor) {
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(analyticsPocketsInteractor, "analyticsPocketsInteractor");
        Intrinsics.checkNotNullParameter(savingsAnalyticsTransactionFilterInteractor, "savingsAnalyticsTransactionFilterInteractor");
        this.f194501a = analyticsTransactionsInteractor;
        this.f194502b = dateProvider;
        this.f194503c = storage;
        this.d = analyticsPocketsInteractor;
        this.e = savingsAnalyticsTransactionFilterInteractor;
        this.f = new ConcurrentHashMap();
    }

    public final DateTime a(DateTime dateTime) {
        return dateTime.getMillis() == 0 ? ((l80.f) this.f194502b).g() : dateTime;
    }

    public final Flow b(List accounts) {
        akg.n nVarV;
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        if (accounts.isEmpty()) {
            return new go.g(new Data(null, new IllegalArgumentException("Unable to provide date for empty accounts"), false, 5, null), 2);
        }
        List<AnalyticsAccount> list = accounts;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (AnalyticsAccount analyticsAccount : list) {
            final Interval interval = new Interval(new DateTime(0L), ((l80.f) this.f194502b).g());
            if ((analyticsAccount instanceof AnalyticsAccount.Joint) || (analyticsAccount instanceof AnalyticsAccount.Junior) || (analyticsAccount instanceof AnalyticsAccount.Linked) || (analyticsAccount instanceof AnalyticsAccount.Personal) || (analyticsAccount instanceof AnalyticsAccount.Pro)) {
                final int i = 0;
                nVarV = nim.a.v(((f) this.d).e(y0.b(analyticsAccount)), new Function1() { // from class: le3.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i) {
                            case 0:
                                Set it8 = (Set) obj2;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return new CategorisationFilter(null, new CategorisationFilter.Scope.PocketsIdSet(it8), interval, null, null, null, null, null, null, null, 1017);
                            default:
                                i7 filter = (i7) obj2;
                                Intrinsics.checkNotNullParameter(filter, "filter");
                                return new CategorisationFilter(null, CategorisationFilter.Scope.Empty.f65753a, interval, null, filter, null, null, null, null, null, 1001);
                        }
                    }
                });
            } else {
                if (!(analyticsAccount instanceof AnalyticsAccount.Savings)) {
                    throw new NoWhenBranchMatchedException();
                }
                final int i2 = 1;
                nVarV = nim.a.v(this.e.a((AnalyticsAccount.Savings) analyticsAccount), new Function1() { // from class: le3.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i2) {
                            case 0:
                                Set it8 = (Set) obj2;
                                Intrinsics.checkNotNullParameter(it8, "it");
                                return new CategorisationFilter(null, new CategorisationFilter.Scope.PocketsIdSet(it8), interval, null, null, null, null, null, null, null, 1017);
                            default:
                                i7 filter = (i7) obj2;
                                Intrinsics.checkNotNullParameter(filter, "filter");
                                return new CategorisationFilter(null, CategorisationFilter.Scope.Empty.f65753a, interval, null, filter, null, null, null, null, null, 1001);
                        }
                    }
                });
            }
            Continuation continuation = null;
            final int i3 = 1;
            arrayList.add(vkm.q.q(new vkm.y(new lb0.b0(this, analyticsAccount, continuation, 5), t1.E(c8g.c.d(nim.a.v(xam.a.h(new l1g.e(this, continuation, 28), nVarV), new Function1(this) { // from class: le3.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f194498b;

                {
                    this.f194498b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            List it8 = (List) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            DateTime dateTime = (DateTime) d0.u0(it8);
                            return dateTime == null ? ((l80.f) this.f194498b.f194502b).g() : dateTime;
                        default:
                            DateTime date = (DateTime) obj2;
                            Intrinsics.checkNotNullParameter(date, "date");
                            return this.f194498b.a(date);
                    }
                }
            }), new l9k.v(this, analyticsAccount, 14))))));
        }
        final int i5 = 0;
        return nim.a.v(u0.k(arrayList), new Function1(this) { // from class: le3.u

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f194498b;

            {
                this.f194498b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        List it8 = (List) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        DateTime dateTime = (DateTime) d0.u0(it8);
                        return dateTime == null ? ((l80.f) this.f194498b.f194502b).g() : dateTime;
                    default:
                        DateTime date = (DateTime) obj2;
                        Intrinsics.checkNotNullParameter(date, "date");
                        return this.f194498b.a(date);
                }
            }
        });
    }
}
