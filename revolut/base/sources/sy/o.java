package sy;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f266551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266552b;

    public o(Clause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f266551a = title;
        this.f266552b = menuItems;
    }

    @Override // sy.p
    public final List a() {
        return this.f266552b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f266551a.equals(oVar.f266551a) && this.f266552b.equals(oVar.f266552b);
    }

    public final int hashCode() {
        return this.f266552b.hashCode() + (this.f266551a.hashCode() * 31);
    }
}
