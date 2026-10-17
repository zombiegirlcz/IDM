package sug;

import com.revolut.feature.wealth.account_closure.api.domain.model.AccountClosureCompetitorCompanyChoice;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f265759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountClosureCompetitorCompanyChoice f265760b;

    public f(List companies, AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice) {
        Intrinsics.checkNotNullParameter(companies, "companies");
        this.f265759a = companies;
        this.f265760b = accountClosureCompetitorCompanyChoice;
    }

    public static f a(f fVar, AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice) {
        List companies = fVar.f265759a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(companies, "companies");
        return new f(companies, accountClosureCompetitorCompanyChoice);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f265759a, fVar.f265759a) && Intrinsics.f(this.f265760b, fVar.f265760b);
    }

    public final int hashCode() {
        int iHashCode = this.f265759a.hashCode() * 31;
        AccountClosureCompetitorCompanyChoice accountClosureCompetitorCompanyChoice = this.f265760b;
        return iHashCode + (accountClosureCompetitorCompanyChoice == null ? 0 : accountClosureCompetitorCompanyChoice.hashCode());
    }
}
