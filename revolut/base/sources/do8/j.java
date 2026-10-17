package do8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f116454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f116455b;

    public j(TextLocalisedClause title, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f116454a = title;
        this.f116455b = menuItems;
    }

    @Override // do8.m
    public final List a() {
        return this.f116455b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f116454a.equals(jVar.f116454a) && Intrinsics.f(this.f116455b, jVar.f116455b);
    }

    public final int hashCode() {
        return this.f116455b.hashCode() + (this.f116454a.hashCode() * 31);
    }
}
