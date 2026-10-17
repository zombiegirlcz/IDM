package b9c;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f13705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f13706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f13707c;
    public final boolean d;
    public final TextLocalisedClause e;

    public g(TextClause headerTitle, TextClause subtitle, List items, boolean z, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f13705a = headerTitle;
        this.f13706b = subtitle;
        this.f13707c = items;
        this.d = z;
        this.e = buttonText;
    }

    @Override // jki.n
    public final List c() {
        return this.f13707c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f13705a.equals(gVar.f13705a) && this.f13706b.equals(gVar.f13706b) && Intrinsics.f(this.f13707c, gVar.f13707c) && this.d == gVar.d && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(p.a.d(v7.b(this.f13705a.hashCode() * 31, 31, this.f13706b), 31, this.f13707c), 31, this.d);
    }
}
