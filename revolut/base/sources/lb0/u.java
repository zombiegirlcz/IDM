package lb0;

import com.revolut.feature.backend_flow.domain.models.PhoneInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class u implements s7a.c0, w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PhoneInputItem.Country f193564b;

    public u(String itemId, PhoneInputItem.Country country) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(country, "country");
        this.f193563a = itemId;
        this.f193564b = country;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f193563a, uVar.f193563a) && Intrinsics.f(this.f193564b, uVar.f193564b);
    }

    @Override // lb0.w
    public final String getItemId() {
        return this.f193563a;
    }

    public final int hashCode() {
        return this.f193564b.hashCode() + (this.f193563a.hashCode() * 31);
    }
}
