package e2f;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f122078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f122079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f122080c;
    public final Object d;
    public final List e;
    public final List f;

    public o(List pages, UrlImage avatarImage, TextClause title, Clause subtitle, List menuItems, List actions) {
        Intrinsics.checkNotNullParameter(pages, "pages");
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f122078a = pages;
        this.f122079b = avatarImage;
        this.f122080c = title;
        this.d = subtitle;
        this.e = menuItems;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f122078a, oVar.f122078a) && this.f122079b.equals(oVar.f122079b) && this.f122080c.equals(oVar.f122080c) && this.d.equals(oVar.d) && Intrinsics.f(this.e, oVar.e) && Intrinsics.f(this.f, oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.d(p.a.b(v7.b(v7.g(this.f122079b, this.f122078a.hashCode() * 31, 31), 31, this.f122080c), 31, this.d), 31, this.e);
    }
}
