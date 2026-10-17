package y4f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f310905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f310906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f310907c;

    public i(Data brokerageAccountInformation, Data portfolioBalanceDetails, Data holdingsInformationContent) {
        Intrinsics.checkNotNullParameter(brokerageAccountInformation, "brokerageAccountInformation");
        Intrinsics.checkNotNullParameter(portfolioBalanceDetails, "portfolioBalanceDetails");
        Intrinsics.checkNotNullParameter(holdingsInformationContent, "holdingsInformationContent");
        this.f310905a = brokerageAccountInformation;
        this.f310906b = portfolioBalanceDetails;
        this.f310907c = holdingsInformationContent;
    }

    public static i a(i iVar, Data brokerageAccountInformation, Data portfolioBalanceDetails, Data holdingsInformationContent, int i) {
        if ((i & 1) != 0) {
            brokerageAccountInformation = iVar.f310905a;
        }
        if ((i & 2) != 0) {
            portfolioBalanceDetails = iVar.f310906b;
        }
        if ((i & 4) != 0) {
            holdingsInformationContent = iVar.f310907c;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(brokerageAccountInformation, "brokerageAccountInformation");
        Intrinsics.checkNotNullParameter(portfolioBalanceDetails, "portfolioBalanceDetails");
        Intrinsics.checkNotNullParameter(holdingsInformationContent, "holdingsInformationContent");
        return new i(brokerageAccountInformation, portfolioBalanceDetails, holdingsInformationContent);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f310905a, iVar.f310905a) && Intrinsics.f(this.f310906b, iVar.f310906b) && Intrinsics.f(this.f310907c, iVar.f310907c);
    }

    public final int hashCode() {
        return this.f310907c.hashCode() + kii.e.c(this.f310906b, this.f310905a.hashCode() * 31, 31);
    }
}
