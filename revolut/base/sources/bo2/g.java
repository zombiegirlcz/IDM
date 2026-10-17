package bo2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f17277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17278c;

    public g(aim.e items, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f17276a = items;
        this.f17277b = subtitle;
        this.f17278c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f17276a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f17276a, gVar.f17276a) && this.f17277b.equals(gVar.f17277b) && this.f17278c == gVar.f17278c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17278c) + t61.a.a(this.f17276a.hashCode() * 31, 31, this.f17277b);
    }
}
