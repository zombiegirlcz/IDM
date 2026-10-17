package n50;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f212483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f212484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f212485c;
    public final boolean d;
    public final List e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f212486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f212487h;

    public i(Clause title, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, List menuItems, UrlImage urlImage, ResourceImage resourceImage, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f212483a = title;
        this.f212484b = textLocalisedClause;
        this.f212485c = z;
        this.d = z3;
        this.e = menuItems;
        this.f = urlImage;
        this.f212486g = resourceImage;
        this.f212487h = textLocalisedClause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f212483a.equals(iVar.f212483a) && Intrinsics.f(this.f212484b, iVar.f212484b) && this.f212485c == iVar.f212485c && this.d == iVar.d && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f212486g, iVar.f212486g) && Intrinsics.f(this.f212487h, iVar.f212487h);
    }

    public final int hashCode() {
        int iHashCode = this.f212483a.hashCode() * 31;
        Clause clause = this.f212484b;
        int iD = p.a.d(j6.a.c(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f212485c), 31, this.d), 31, this.e);
        Image image = this.f;
        int iHashCode2 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f212486g;
        int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        Clause clause2 = this.f212487h;
        return iHashCode3 + (clause2 != null ? clause2.hashCode() : 0);
    }
}
