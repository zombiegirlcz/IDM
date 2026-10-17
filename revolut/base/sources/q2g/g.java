package q2g;

import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f241647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f241648b;

    public g(TextClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f241647a = title;
        this.f241648b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f241648b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f241647a.equals(gVar.f241647a) && this.f241648b.equals(gVar.f241648b);
    }

    public final int hashCode() {
        return this.f241648b.hashCode() + (this.f241647a.hashCode() * 31);
    }
}
