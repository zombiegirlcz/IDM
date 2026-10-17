package iug;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f168596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f168597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f168598c;
    public final List d;

    public i(Clause clause, TextLocalisedClause buttonText, List items, boolean z) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168596a = clause;
        this.f168597b = buttonText;
        this.f168598c = z;
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
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f168596a, iVar.f168596a) && Intrinsics.f(this.f168597b, iVar.f168597b) && this.f168598c == iVar.f168598c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f168596a;
        return this.d.hashCode() + j6.a.c(t61.a.a((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f168597b), 31, this.f168598c);
    }

    public /* synthetic */ i(TextLocalisedClause textLocalisedClause, List list) {
        this(null, textLocalisedClause, list, false);
    }
}
