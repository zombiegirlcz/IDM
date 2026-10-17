package km1;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f185672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f185673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f185674c;

    public f(TextLocalisedClause titleClause, TextLocalisedClause searchClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        Intrinsics.checkNotNullParameter(searchClause, "searchClause");
        this.f185672a = items;
        this.f185673b = titleClause;
        this.f185674c = searchClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f185672a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f185672a, fVar.f185672a) && this.f185673b.equals(fVar.f185673b) && this.f185674c.equals(fVar.f185674c);
    }

    public final int hashCode() {
        return this.f185674c.hashCode() + t61.a.a(this.f185672a.hashCode() * 31, 31, this.f185673b);
    }
}
