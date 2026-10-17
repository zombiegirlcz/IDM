package pya;

import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f240715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f240716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f240717c;
    public final Clause d;
    public final List e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ProgressStyle f240718g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Image f240719h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Clause f240720j;
    public final List k;

    public h(TextClause title, Clause clause, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, List menuItems, ContactImage contactImage, ProgressStyle progressStyle, LayeredImage layeredImage, boolean z, TextLocalisedClause textLocalisedClause3, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f240715a = title;
        this.f240716b = clause;
        this.f240717c = textLocalisedClause;
        this.d = textLocalisedClause2;
        this.e = menuItems;
        this.f = contactImage;
        this.f240718g = progressStyle;
        this.f240719h = layeredImage;
        this.i = z;
        this.f240720j = textLocalisedClause3;
        this.k = items;
    }

    @Override // cli.p
    public final List c() {
        return this.k;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f240715a.equals(hVar.f240715a) && Intrinsics.f(this.f240716b, hVar.f240716b) && Intrinsics.f(this.f240717c, hVar.f240717c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f240718g, hVar.f240718g) && Intrinsics.f(this.f240719h, hVar.f240719h) && this.i == hVar.i && Intrinsics.f(this.f240720j, hVar.f240720j) && Intrinsics.f(this.k, hVar.k);
    }

    public final int hashCode() {
        int iHashCode = this.f240715a.hashCode() * 31;
        Clause clause = this.f240716b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f240717c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iD = p.a.d((iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31, this.e);
        Image image = this.f;
        int iHashCode4 = (iD + (image == null ? 0 : image.hashCode())) * 31;
        ProgressStyle progressStyle = this.f240718g;
        int iHashCode5 = (iHashCode4 + (progressStyle == null ? 0 : progressStyle.hashCode())) * 31;
        Image image2 = this.f240719h;
        int iC = j6.a.c((iHashCode5 + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.i);
        Clause clause4 = this.f240720j;
        return this.k.hashCode() + ((iC + (clause4 != null ? clause4.hashCode() : 0)) * 31);
    }
}
