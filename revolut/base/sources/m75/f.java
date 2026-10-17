package m75;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f203323a;

    public f(Data refinancedCreditsList) {
        Intrinsics.checkNotNullParameter(refinancedCreditsList, "refinancedCreditsList");
        this.f203323a = refinancedCreditsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f203323a, ((f) obj2).f203323a);
    }

    public final int hashCode() {
        return this.f203323a.hashCode();
    }
}
