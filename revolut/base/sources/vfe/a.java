package vfe;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f288606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f288607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f288608c;

    public a(Clause clause, ProductSpaceIdentifier spaceId, List subSpaces) {
        Intrinsics.checkNotNullParameter(spaceId, "spaceId");
        Intrinsics.checkNotNullParameter(subSpaces, "subSpaces");
        this.f288606a = spaceId;
        this.f288607b = clause;
        this.f288608c = subSpaces;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f288606a, aVar.f288606a) && Intrinsics.f(this.f288607b, aVar.f288607b) && Intrinsics.f(this.f288608c, aVar.f288608c);
    }

    public final int hashCode() {
        int iHashCode = this.f288606a.hashCode() * 31;
        Clause clause = this.f288607b;
        return this.f288608c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
