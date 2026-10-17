package fx4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f138723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f138724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f138725c;
    public final boolean d;

    public d(String id10, TextLocalisedClause name, TextClause textClause, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f138723a = id10;
        this.f138724b = name;
        this.f138725c = textClause;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f138723a, dVar.f138723a) && this.f138724b.equals(dVar.f138724b) && Intrinsics.f(this.f138725c, dVar.f138725c) && this.d == dVar.d;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f138723a.hashCode() * 31, 31, this.f138724b);
        Clause clause = this.f138725c;
        return Boolean.hashCode(this.d) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
