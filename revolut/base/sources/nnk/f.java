package nnk;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f217716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f217717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f217718c;

    public f(TextClause title, List menuItems, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f217716a = title;
        this.f217717b = menuItems;
        this.f217718c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f217718c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f217716a.equals(fVar.f217716a) && Intrinsics.f(this.f217717b, fVar.f217717b) && Intrinsics.f(this.f217718c, fVar.f217718c);
    }

    public final int hashCode() {
        return this.f217718c.hashCode() + p.a.d(this.f217716a.hashCode() * 31, 31, this.f217717b);
    }
}
