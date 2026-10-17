package rfb;

import com.revolut.feature.retail.salary_account.api.domain.SalaryAccountDestination$SalaryHub;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f253748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KompotDestination f253749b;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f253748a == aVar.f253748a && Intrinsics.f(this.f253749b, aVar.f253749b);
    }

    public final int hashCode() {
        return this.f253749b.hashCode() + (Boolean.hashCode(this.f253748a) * 31);
    }

    public a(boolean z, KompotDestination entryNavigationDestination) {
        Intrinsics.checkNotNullParameter(entryNavigationDestination, "entryNavigationDestination");
        this.f253748a = z;
        this.f253749b = entryNavigationDestination;
    }

    public /* synthetic */ a(int i) {
        this(false, SalaryAccountDestination$SalaryHub.f82951a);
    }
}
