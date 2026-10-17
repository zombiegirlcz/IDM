package ma;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203844b;

    public g(Data navigationHubContent, List transactions) {
        Intrinsics.checkNotNullParameter(navigationHubContent, "navigationHubContent");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f203843a = navigationHubContent;
        this.f203844b = transactions;
    }

    public static g a(g gVar, Data navigationHubContent, List transactions, int i) {
        if ((i & 1) != 0) {
            navigationHubContent = gVar.f203843a;
        }
        if ((i & 2) != 0) {
            transactions = gVar.f203844b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(navigationHubContent, "navigationHubContent");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        return new g(navigationHubContent, transactions);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f203843a, gVar.f203843a) && Intrinsics.f(this.f203844b, gVar.f203844b);
    }

    public final int hashCode() {
        return this.f203844b.hashCode() + (this.f203843a.hashCode() * 31);
    }

    public final String toString() {
        return "DomainState(navigationHubContent=" + this.f203843a + ", transactions=" + this.f203844b + ")";
    }
}
