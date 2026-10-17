package bs5;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f18067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18068b;

    public b(TextClause title, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f18067a = title;
        this.f18068b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f18068b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f18067a.equals(bVar.f18067a) && this.f18068b.equals(bVar.f18068b);
    }

    public final int hashCode() {
        return this.f18068b.hashCode() + (this.f18067a.hashCode() * 31);
    }
}
