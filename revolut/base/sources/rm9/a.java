package rm9;

import com.revolut.feature.payees.impl.ui.OwnerType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OwnerType f255211a;

    public a(OwnerType payeeType) {
        Intrinsics.checkNotNullParameter(payeeType, "payeeType");
        this.f255211a = payeeType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f255211a, ((a) obj2).f255211a);
    }

    public final int hashCode() {
        return this.f255211a.hashCode();
    }
}
