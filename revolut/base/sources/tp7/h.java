package tp7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f273305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f273306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f273307c;
    public final boolean d;

    public h(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f273305a = items;
        this.f273306b = title;
        this.f273307c = textLocalisedClause;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f273305a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f273305a.equals(hVar.f273305a) && this.f273306b.equals(hVar.f273306b) && Intrinsics.f(this.f273307c, hVar.f273307c) && this.d == hVar.d;
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f273305a.hashCode() * 31, 31, this.f273306b);
        Clause clause = this.f273307c;
        return Boolean.hashCode(this.d) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
