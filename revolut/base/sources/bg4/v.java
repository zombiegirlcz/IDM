package bg4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class v implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f15116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f15117c;
    public final aw0.i d;

    public v(aw0.e eVar, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f15115a = items;
        this.f15116b = title;
        this.f15117c = textLocalisedClause;
        this.d = eVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f15115a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f15115a, vVar.f15115a) && this.f15116b.equals(vVar.f15116b) && Intrinsics.f(this.f15117c, vVar.f15117c) && Intrinsics.f(this.d, vVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f15115a.hashCode() * 31, 31, this.f15116b);
        Clause clause = this.f15117c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        aw0.i iVar = this.d;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
