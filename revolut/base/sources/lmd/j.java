package lmd;

import com.revolut.core.model.account.AccountId;
import efm.r;
import kotlin.jvm.internal.Intrinsics;
import l5i.q;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements xld.f {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qmd.g f196969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f196970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f196971c;
    public final q d;
    public final le3.i e;

    public j(qmd.g projectedSpendRepository, xua.a recurringPaymentInteractor, n walletInteractor, q analyticsTransactionsInteractor, le3.i analyticsRatesInteractor) {
        Intrinsics.checkNotNullParameter(projectedSpendRepository, "projectedSpendRepository");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(analyticsTransactionsInteractor, "analyticsTransactionsInteractor");
        Intrinsics.checkNotNullParameter(analyticsRatesInteractor, "analyticsRatesInteractor");
        this.f196969a = projectedSpendRepository;
        this.f196970b = recurringPaymentInteractor;
        this.f196971c = walletInteractor;
        this.d = analyticsTransactionsInteractor;
        this.e = analyticsRatesInteractor;
    }

    public final r a(Interval interval, AccountId accountId) {
        Intrinsics.checkNotNullParameter(interval, "interval");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        DateTime dateTimeNow = DateTime.now();
        Intrinsics.checkNotNullExpressionValue(dateTimeNow, "now(...)");
        DateTime start = interval.getStart();
        Intrinsics.checkNotNullExpressionValue(start, "getStart(...)");
        Comparable comparableK = cim.c.k(dateTimeNow, start);
        Intrinsics.checkNotNullExpressionValue(comparableK, "maxOf(...)");
        DateTime end2 = interval.getEnd();
        Intrinsics.checkNotNullExpressionValue(end2, "getEnd(...)");
        return b((DateTime) comparableK, end2, accountId);
    }

    public final r b(DateTime dateTime, DateTime dateTime2, AccountId accountId) {
        String id10 = null;
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        if (joint != null) {
            id10 = joint.f51413b;
            Intrinsics.checkNotNullParameter(id10, "id");
        }
        return nim.a.w(xua.a.b(this.f196970b, id10, 1), new h(dateTime, dateTime2, this));
    }
}
