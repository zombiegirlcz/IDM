package adg;

import cli.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f3348b;

    public k(CompositeClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f3347a = items;
        this.f3348b = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f3347a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f3347a.equals(kVar.f3347a) && this.f3348b.equals(kVar.f3348b);
    }

    public final int hashCode() {
        return this.f3348b.hashCode() + (this.f3347a.hashCode() * 31);
    }
}
