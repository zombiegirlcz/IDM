package tn7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f272328c;

    public g(TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f272326a = items;
        this.f272327b = z;
        this.f272328c = title;
    }

    @Override // jki.n
    public final List c() {
        return this.f272326a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f272326a, gVar.f272326a) && this.f272327b == gVar.f272327b && this.f272328c.equals(gVar.f272328c);
    }

    public final int hashCode() {
        return this.f272328c.hashCode() + j6.a.c(this.f272326a.hashCode() * 31, 31, this.f272327b);
    }
}
