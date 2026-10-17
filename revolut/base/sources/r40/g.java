package r40;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f251334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f251335c;
    public final Integer d;

    public g(List items, TextLocalisedClause title, boolean z, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f251333a = items;
        this.f251334b = title;
        this.f251335c = z;
        this.d = num;
    }

    @Override // jki.n
    public final List c() {
        return this.f251333a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f251333a, gVar.f251333a) && this.f251334b.equals(gVar.f251334b) && this.f251335c == gVar.f251335c && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(t61.a.a(this.f251333a.hashCode() * 31, 31, this.f251334b), 31, this.f251335c), 31, false);
        Integer num = this.d;
        return iC + (num != null ? num.hashCode() : 0);
    }
}
