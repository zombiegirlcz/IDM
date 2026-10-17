package xnf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f307479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f307480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307481c;
    public final Image d;
    public final Image e;
    public final CircleIconBadge f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f307482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f307483h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f307484j;

    public b(Clause title, TextClause description, Clause secondDescription, Image icon, Image image, CircleIconBadge circleIconBadge, String str, List menuItems, boolean z) {
        f0 actionItems = f0.f322471a;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        this.f307479a = title;
        this.f307480b = description;
        this.f307481c = secondDescription;
        this.d = icon;
        this.e = image;
        this.f = circleIconBadge;
        this.f307482g = str;
        this.f307483h = menuItems;
        this.i = actionItems;
        this.f307484j = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f307479a.equals(bVar.f307479a) && this.f307480b.equals(bVar.f307480b) && this.f307481c.equals(bVar.f307481c) && this.d.equals(bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f307482g, bVar.f307482g) && Intrinsics.f(this.f307483h, bVar.f307483h) && Intrinsics.f(this.i, bVar.i) && this.f307484j == bVar.f307484j;
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, p.a.a(v7.b(this.f307479a.hashCode() * 31, 31, this.f307480b), 31, this.f307481c), 961);
        Image image = this.e;
        int iHashCode = (iC + (image == null ? 0 : image.hashCode())) * 31;
        CircleIconBadge circleIconBadge = this.f;
        int iHashCode2 = (iHashCode + (circleIconBadge == null ? 0 : circleIconBadge.hashCode())) * 31;
        String str = this.f307482g;
        return Boolean.hashCode(this.f307484j) + p.a.d(p.a.b((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f307483h), 31, this.i);
    }
}
