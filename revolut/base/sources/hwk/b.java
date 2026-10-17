package hwk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f156283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f156284b;

    public b(TextLocalisedClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f156283a = title;
        this.f156284b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f156284b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f156283a.equals(bVar.f156283a) && this.f156284b.equals(bVar.f156284b);
    }

    public final int hashCode() {
        return this.f156284b.hashCode() + (this.f156283a.hashCode() * 31);
    }
}
