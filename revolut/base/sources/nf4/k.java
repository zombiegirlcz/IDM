package nf4;

import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.AnimatedResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f214813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f214814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TagViewData f214815c;
    public final Clause d;
    public final Image e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f214816g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f214817h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f214818j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Clause f214819l;

    public k(int i, TextLocalisedClause textLocalisedClause, List list) {
        this(textLocalisedClause, null, null, null, null, false, false, i, list, f0.f322471a, false, null);
    }

    @Override // cli.p
    public final List c() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f214813a, kVar.f214813a) && Intrinsics.f(this.f214814b, kVar.f214814b) && Intrinsics.f(this.f214815c, kVar.f214815c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && this.f214816g == kVar.f214816g && this.f214817h == kVar.f214817h && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f214818j, kVar.f214818j) && this.k == kVar.k && Intrinsics.f(this.f214819l, kVar.f214819l);
    }

    public final int hashCode() {
        int iHashCode = this.f214813a.hashCode() * 31;
        Clause clause = this.f214814b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        TagViewData tagViewData = this.f214815c;
        int iHashCode3 = (iHashCode2 + (tagViewData == null ? 0 : tagViewData.hashCode())) * 31;
        Clause clause2 = this.d;
        int iHashCode4 = (iHashCode3 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.e;
        int iC = j6.a.c(p.a.d(p.a.d(j6.a.b(this.f214817h, j6.a.c(j6.a.c((iHashCode4 + (image == null ? 0 : image.hashCode())) * 31, 31, this.f), 31, this.f214816g), 31), 31, this.i), 31, this.f214818j), 31, this.k);
        Clause clause3 = this.f214819l;
        return iC + (clause3 != null ? clause3.hashCode() : 0);
    }

    public k(TextLocalisedClause title, Clause clause, TagViewData tagViewData, TextLocalisedClause textLocalisedClause, AnimatedResourceImage animatedResourceImage, boolean z, boolean z3, int i, List items, List bottomItems, boolean z4, TextLocalisedClause textLocalisedClause2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(bottomItems, "bottomItems");
        this.f214813a = title;
        this.f214814b = clause;
        this.f214815c = tagViewData;
        this.d = textLocalisedClause;
        this.e = animatedResourceImage;
        this.f = z;
        this.f214816g = z3;
        this.f214817h = i;
        this.i = items;
        this.f214818j = bottomItems;
        this.k = z4;
        this.f214819l = textLocalisedClause2;
    }
}
