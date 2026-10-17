package dq7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f116924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f116925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f116926c;

    public g(aim.e items, TextLocalisedClause title, TextLocalisedClause description) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f116924a = items;
        this.f116925b = title;
        this.f116926c = description;
    }

    @Override // jki.n
    public final List c() {
        return this.f116924a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f116924a, gVar.f116924a) && this.f116925b.equals(gVar.f116925b) && this.f116926c.equals(gVar.f116926c);
    }

    public final int hashCode() {
        return this.f116926c.hashCode() + t61.a.a(this.f116924a.hashCode() * 31, 31, this.f116925b);
    }
}
