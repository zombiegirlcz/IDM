package izd;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f169876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f169877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f169878c;
    public final TextLocalisedClause d;

    public h(ArrayList items, Clause selectButtonClause, boolean z, TextLocalisedClause navBarButtonClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(selectButtonClause, "selectButtonClause");
        Intrinsics.checkNotNullParameter(navBarButtonClause, "navBarButtonClause");
        this.f169876a = items;
        this.f169877b = selectButtonClause;
        this.f169878c = z;
        this.d = navBarButtonClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f169876a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f169876a.equals(hVar.f169876a) && this.f169877b.equals(hVar.f169877b) && this.f169878c == hVar.f169878c && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.c(p.a.b(this.f169876a.hashCode() * 31, 31, this.f169877b), 31, this.f169878c);
    }
}
