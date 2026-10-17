package xng;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f307498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f307499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f307500c;
    public final Image d;
    public final Clause e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f307501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f307502h;

    public k(Clause title, Clause clause, Clause clause2, Image image, Clause buttonClause, boolean z, boolean z3, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonClause, "buttonClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f307498a = title;
        this.f307499b = clause;
        this.f307500c = clause2;
        this.d = image;
        this.e = buttonClause;
        this.f = z;
        this.f307501g = z3;
        this.f307502h = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f307502h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f307498a, kVar.f307498a) && Intrinsics.f(this.f307499b, kVar.f307499b) && Intrinsics.f(this.f307500c, kVar.f307500c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && this.f == kVar.f && this.f307501g == kVar.f307501g && Intrinsics.f(this.f307502h, kVar.f307502h);
    }

    public final int hashCode() {
        int iHashCode = this.f307498a.hashCode() * 31;
        Clause clause = this.f307499b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f307500c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Image image = this.d;
        return this.f307502h.hashCode() + j6.a.c(j6.a.c(p.a.a((iHashCode3 + (image != null ? image.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f307501g);
    }
}
