package u3b;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ehe.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f276886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f276887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.e f276888c;
    public final List d;

    public f(aw0.e footerModel, TextLocalisedClause title, TextLocalisedClause subTitle, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f276886a = title;
        this.f276887b = subTitle;
        this.f276888c = footerModel;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f276886a.equals(fVar.f276886a) && this.f276887b.equals(fVar.f276887b) && this.f276888c.equals(fVar.f276888c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + n.c(this.f276888c, t61.a.a(this.f276886a.hashCode() * 31, 31, this.f276887b), 31);
    }
}
