package raf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f252831b;

    public i(TextLocalisedClause toolbarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f252830a = items;
        this.f252831b = toolbarTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f252830a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f252830a, iVar.f252830a) && this.f252831b.equals(iVar.f252831b);
    }

    public final int hashCode() {
        return this.f252831b.hashCode() + (this.f252830a.hashCode() * 31);
    }
}
