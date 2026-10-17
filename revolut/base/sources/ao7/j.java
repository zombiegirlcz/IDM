package ao7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f7912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f7913c;

    public j(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f7911a = items;
        this.f7912b = title;
        this.f7913c = subtitle;
    }

    @Override // jki.n
    public final List c() {
        return this.f7911a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f7911a, jVar.f7911a) && this.f7912b.equals(jVar.f7912b) && this.f7913c.equals(jVar.f7913c);
    }

    public final int hashCode() {
        return this.f7913c.hashCode() + t61.a.a(this.f7911a.hashCode() * 31, 31, this.f7912b);
    }
}
