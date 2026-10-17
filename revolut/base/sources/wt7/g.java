package wt7;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f299830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f299831c;
    public final List d;
    public final String e;
    public final boolean f;

    public g(List items, TextClause title, boolean z, List tabs, String str, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.f299829a = items;
        this.f299830b = title;
        this.f299831c = z;
        this.d = tabs;
        this.e = str;
        this.f = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f299829a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f299829a, gVar.f299829a) && this.f299830b.equals(gVar.f299830b) && this.f299831c == gVar.f299831c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        int iD = p.a.d(j6.a.c(v7.b(this.f299829a.hashCode() * 31, 31, this.f299830b), 31, this.f299831c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
