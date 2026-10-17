package pf4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f235454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f235455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f235456c;
    public final boolean d;
    public final TextLocalisedClause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f235457g;

    public q(ResourceImage resourceImage, TextLocalisedClause title, ResourceImage resourceImage2, boolean z, TextLocalisedClause value, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f235454a = resourceImage;
        this.f235455b = title;
        this.f235456c = resourceImage2;
        this.d = z;
        this.e = value;
        this.f = textLocalisedClause;
        this.f235457g = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f235454a, qVar.f235454a) && this.f235455b.equals(qVar.f235455b) && Intrinsics.f(this.f235456c, qVar.f235456c) && this.d == qVar.d && this.e.equals(qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f235457g, qVar.f235457g);
    }

    public final int hashCode() {
        Image image = this.f235454a;
        int iA = t61.a.a((image == null ? 0 : image.hashCode()) * 31, 31, this.f235455b);
        Image image2 = this.f235456c;
        int iA2 = t61.a.a(j6.a.c((iA + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.d), 31, this.e);
        Clause clause = this.f;
        return this.f235457g.hashCode() + ((iA2 + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
