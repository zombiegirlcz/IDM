package xp7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f307892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f307893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f307894c;

    public g(TextLocalisedClause footer, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f307892a = items;
        this.f307893b = footer;
        this.f307894c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f307892a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f307892a.equals(gVar.f307892a) && this.f307893b.equals(gVar.f307893b) && this.f307894c == gVar.f307894c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f307894c) + t61.a.a(this.f307892a.hashCode() * 31, 31, this.f307893b);
    }
}
