package bbk;

import au0.u0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit.views.navbar.AvatarNavBarMenuItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f14328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AvatarNavBarMenuItem f14329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel f14330c;
    public final aw0.k d;
    public final u0 e;

    public j(TextLocalisedClause title, AvatarNavBarMenuItem schemeLogo, AvatarModel avatar, aw0.k label, u0 page) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(schemeLogo, "schemeLogo");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(page, "page");
        this.f14328a = title;
        this.f14329b = schemeLogo;
        this.f14330c = avatar;
        this.d = label;
        this.e = page;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f14328a, jVar.f14328a) && this.f14329b.equals(jVar.f14329b) && this.f14330c.equals(jVar.f14330c) && this.d.equals(jVar.d) && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f14330c.hashCode() + ((this.f14329b.hashCode() + (this.f14328a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
