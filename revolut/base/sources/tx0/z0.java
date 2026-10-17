package tx0;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f275286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarWithContainerBackground.VideoBackground f275287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f275288c;
    public final TextClause d;

    public z0(String id10, NavBarWithContainerBackground.VideoBackground background, TextClause title, TextClause buttonText) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f275286a = id10;
        this.f275287b = background;
        this.f275288c = title;
        this.d = buttonText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return Intrinsics.f(this.f275286a, z0Var.f275286a) && this.f275287b.equals(z0Var.f275287b) && this.f275288c.equals(z0Var.f275288c) && this.d.equals(z0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b((this.f275287b.hashCode() + (this.f275286a.hashCode() * 31)) * 31, 31, this.f275288c);
    }
}
