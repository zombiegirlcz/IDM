package ind;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f162824c;
    public final List d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String id10, dj0.d amount, f0 selectedCategories) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(selectedCategories, "selectedCategories");
        this.f162823b = id10;
        this.f162824c = amount;
        this.d = selectedCategories;
    }

    @Override // ind.x
    public final String a() {
        return this.f162823b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f162823b, rVar.f162823b) && Intrinsics.f(this.f162824c, rVar.f162824c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(this.f162823b.hashCode() * 31, 31, this.f162824c);
    }
}
