package to2;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f272506c;

    public l(TextLocalisedClause subtitleClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(subtitleClause, "subtitleClause");
        this.f272504a = items;
        this.f272505b = z;
        this.f272506c = subtitleClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f272504a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f272504a, lVar.f272504a) && this.f272505b == lVar.f272505b && this.f272506c.equals(lVar.f272506c);
    }

    public final int hashCode() {
        return this.f272506c.hashCode() + j6.a.c(this.f272504a.hashCode() * 31, 31, this.f272505b);
    }
}
