package e2j;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f122124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f122125c;

    public h(TextLocalisedClause title, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f122123a = items;
        this.f122124b = z;
        this.f122125c = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f122123a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f122123a, hVar.f122123a) && this.f122124b == hVar.f122124b && this.f122125c.equals(hVar.f122125c);
    }

    public final int hashCode() {
        return this.f122125c.hashCode() + j6.a.c(this.f122123a.hashCode() * 31, 31, this.f122124b);
    }
}
