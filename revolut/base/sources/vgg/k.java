package vgg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f289164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f289165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f289166c;
    public final Object d;
    public final List e;
    public final List f;

    public k(List pages, UrlImage avatarImage, TextClause title, Clause subtitle, List menuItems, List actions) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f289164a = pages;
        this.f289165b = avatarImage;
        this.f289166c = title;
        this.d = subtitle;
        this.e = menuItems;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f289164a, kVar.f289164a) && this.f289165b.equals(kVar.f289165b) && this.f289166c.equals(kVar.f289166c) && this.d.equals(kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.b(v7.b(v7.g(this.f289165b, this.f289164a.hashCode() * 31, 31), 31, this.f289166c), 31, this.d), 31, this.e);
    }
}
