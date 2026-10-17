package vs9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f291752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f291753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f291754c;

    public i(TextLocalisedClause title, TextLocalisedClause description, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f291752a = items;
        this.f291753b = title;
        this.f291754c = description;
    }

    @Override // jki.n
    public final List c() {
        return this.f291752a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f291752a, iVar.f291752a) && this.f291753b.equals(iVar.f291753b) && this.f291754c.equals(iVar.f291754c);
    }

    public final int hashCode() {
        return this.f291754c.hashCode() + t61.a.a(this.f291752a.hashCode() * 31, 31, this.f291753b);
    }
}
