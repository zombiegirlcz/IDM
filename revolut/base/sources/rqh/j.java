package rqh;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f256545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f256546b;

    public j(TextLocalisedClause toolbarTitle, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f256545a = toolbarTitle;
        this.f256546b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f256546b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f256545a.equals(jVar.f256545a) && Intrinsics.f(this.f256546b, jVar.f256546b);
    }

    public final int hashCode() {
        return this.f256546b.hashCode() + (this.f256545a.hashCode() * 31);
    }
}
