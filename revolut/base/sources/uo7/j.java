package uo7;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f281578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f281579c;

    public j(TextLocalisedClause footer, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f281577a = items;
        this.f281578b = footer;
        this.f281579c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f281577a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f281577a.equals(jVar.f281577a) && this.f281578b.equals(jVar.f281578b) && this.f281579c == jVar.f281579c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f281579c) + t61.a.a(this.f281577a.hashCode() * 31, 31, this.f281578b);
    }
}
