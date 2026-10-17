package ywg;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f317431b;

    public f(aim.e items, TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317430a = title;
        this.f317431b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f317431b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f317430a.equals(fVar.f317430a) && Intrinsics.f(this.f317431b, fVar.f317431b);
    }

    public final int hashCode() {
        return this.f317431b.hashCode() + (this.f317430a.hashCode() * 31);
    }
}
