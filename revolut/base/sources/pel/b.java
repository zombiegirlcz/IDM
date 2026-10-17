package pel;

import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Amount f235398b;

    public b(String id10, Amount amount) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f235397a = id10;
        this.f235398b = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f235397a, bVar.f235397a) && Intrinsics.f(this.f235398b, bVar.f235398b);
    }

    @Override // pel.f
    public final String getId() {
        return this.f235397a;
    }

    public final int hashCode() {
        return this.f235398b.hashCode() + (this.f235397a.hashCode() * 31);
    }
}
