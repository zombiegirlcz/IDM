package q65;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f242496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f242497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f242498c;
    public final boolean d;

    public i(aim.e items, TextLocalisedClause title, TextLocalisedClause subtitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f242496a = items;
        this.f242497b = title;
        this.f242498c = subtitle;
        this.d = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f242496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f242496a, iVar.f242496a) && this.f242497b.equals(iVar.f242497b) && this.f242498c.equals(iVar.f242498c) && this.d == iVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + t61.a.a(t61.a.a(this.f242496a.hashCode() * 31, 31, this.f242497b), 31, this.f242498c);
    }
}
