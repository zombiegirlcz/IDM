package gd2;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f143038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f143039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f143040c;
    public final aw0.i d;

    public f(AbstractList items, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, aw0.i footerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        this.f143038a = items;
        this.f143039b = title;
        this.f143040c = textLocalisedClause;
        this.d = footerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f143038a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f143038a, fVar.f143038a) && this.f143039b.equals(fVar.f143039b) && Intrinsics.f(this.f143040c, fVar.f143040c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f143038a.hashCode() * 31, 31, this.f143039b);
        Clause clause = this.f143040c;
        return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
