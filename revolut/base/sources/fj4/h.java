package fj4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f135532b;

    public h(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f135531a = items;
        this.f135532b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f135531a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f135531a, hVar.f135531a) && this.f135532b.equals(hVar.f135532b);
    }

    public final int hashCode() {
        return this.f135532b.hashCode() + (this.f135531a.hashCode() * 31);
    }
}
