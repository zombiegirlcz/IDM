package pf4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.r2;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResourceImage f235459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f235460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f235461c;
    public final Image d;
    public final r2 e;
    public final List f;

    public s(ResourceImage navigationImage, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, Image backgroundImage, r2 r2Var, List menuItems) {
        Intrinsics.checkNotNullParameter(navigationImage, "navigationImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f235459a = navigationImage;
        this.f235460b = title;
        this.f235461c = textLocalisedClause;
        this.d = backgroundImage;
        this.e = r2Var;
        this.f = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f235459a.equals(sVar.f235459a) && this.f235460b.equals(sVar.f235460b) && Intrinsics.f(this.f235461c, sVar.f235461c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && Intrinsics.f(this.f, sVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f235459a.hashCode() * 31, 31, this.f235460b);
        Clause clause = this.f235461c;
        int iC = a10.b.c(this.d, (iA + (clause == null ? 0 : clause.hashCode())) * 31, 31);
        r2 r2Var = this.e;
        return this.f.hashCode() + ((iC + (r2Var != null ? r2Var.hashCode() : 0)) * 31);
    }
}
