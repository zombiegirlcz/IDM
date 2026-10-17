package et6;

import com.revolut.core.model.account.AccountId;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements gr6.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.m f129323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ppk.f f129324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f129325c;
    public final whf.b d;
    public final wsg.n e;

    public s3(gr6.m freelancerPocketsInteractor, ppk.f ratesInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, whf.b transactionContentProvider, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionContentProvider, "transactionContentProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f129323a = freelancerPocketsInteractor;
        this.f129324b = ratesInteractor;
        this.f129325c = transactionsInteractor;
        this.d = transactionContentProvider;
        this.e = walletInteractor;
    }

    public final Flow a(ds6.f0 direction, LocalDate startDate, LocalDate endDate, Set selectedCategories, Set selectedCurrencies) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        Intrinsics.checkNotNullParameter(selectedCurrencies, "selectedCurrencies");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarC = ((i2) this.f129323a).c(loadingStrategy);
        w4l.j jVar = w4l.j.f294644c;
        return boh.f.e(zh9.u0.m(dVarC, rd0.e.b(this.e.J(AccountId.Personal.f51414a, jVar))), new ael.u0((Object) this, startDate, endDate, (Collection) selectedCategories, (Object) selectedCurrencies, (Enum) direction, 2));
    }
}
