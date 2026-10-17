package yr4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f316118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f316119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f316120c;
    public final gs4.a d;
    public final AvatarModel.State e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NavBarWithContainerBackground f316121g;

    public c(MoneyClause title, Clause topSubtitle, CompositeClause description, gs4.a image, AvatarModel.State imageState, List actions, NavBarWithContainerBackground.ImageBackground imageBackground) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(topSubtitle, "topSubtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(imageState, "imageState");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f316118a = title;
        this.f316119b = topSubtitle;
        this.f316120c = description;
        this.d = image;
        this.e = imageState;
        this.f = actions;
        this.f316121g = imageBackground;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f316118a.equals(cVar.f316118a) && this.f316119b.equals(cVar.f316119b) && this.f316120c.equals(cVar.f316120c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f316121g, cVar.f316121g);
    }

    public final int hashCode() {
        int iD = p.a.d((this.e.hashCode() + ((this.d.hashCode() + l.c(this.f316120c, p.a.b(this.f316118a.hashCode() * 31, 31, this.f316119b), 31)) * 31)) * 31, 31, this.f);
        NavBarWithContainerBackground navBarWithContainerBackground = this.f316121g;
        return iD + (navBarWithContainerBackground == null ? 0 : navBarWithContainerBackground.hashCode());
    }
}
