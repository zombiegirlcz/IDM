package wo7;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import h30.l;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f298901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f298902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f298903c;
    public final TextLocalisedClause d;

    public g(aim.e items, boolean z, CompositeClause button, TextLocalisedClause footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f298901a = items;
        this.f298902b = z;
        this.f298903c = button;
        this.d = footer;
    }

    @Override // jki.n
    public final List c() {
        return this.f298901a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298901a, gVar.f298901a) && this.f298902b == gVar.f298902b && this.f298903c.equals(gVar.f298903c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.c(this.f298903c, j6.a.c(this.f298901a.hashCode() * 31, 31, this.f298902b), 31);
    }
}
