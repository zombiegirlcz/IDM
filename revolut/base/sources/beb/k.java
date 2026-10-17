package beb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f14740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14741c;
    public final aw0.e d;

    public k(List items, TextLocalisedClause title, f0 menuItems, aw0.e footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f14739a = items;
        this.f14740b = title;
        this.f14741c = menuItems;
        this.d = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f14739a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f14739a, kVar.f14739a) && this.f14740b.equals(kVar.f14740b) && Intrinsics.f(this.f14741c, kVar.f14741c) && this.d.equals(kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(t61.a.a(this.f14739a.hashCode() * 31, 31, this.f14740b), 31, this.f14741c);
    }
}
