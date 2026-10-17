package kw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f190195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f190196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f190197c;
    public final Clause d;

    public k() {
        this((ResourceImage) null, (Clause) null, (TextLocalisedClause) null, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f190195a, kVar.f190195a) && Intrinsics.f(this.f190196b, kVar.f190196b) && Intrinsics.f(this.f190197c, kVar.f190197c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f190195a.hashCode() * 31, 31, this.f190196b);
        Clause clause = this.f190197c;
        int iHashCode = (iD + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }

    public k(Image navigationIcon, List menuItems, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f190195a = navigationIcon;
        this.f190196b = menuItems;
        this.f190197c = clause;
        this.d = clause2;
    }

    public k(ResourceImage resourceImage, Clause clause, TextLocalisedClause textLocalisedClause, int i) {
        this((i & 1) != 0 ? new ResourceImage(R$drawable.uikit_icn_24_back, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : resourceImage, f0.f322471a, (i & 4) != 0 ? null : clause, (i & 8) != 0 ? null : textLocalisedClause);
    }
}
