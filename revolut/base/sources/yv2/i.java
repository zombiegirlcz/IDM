package yv2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f317108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f317110c;
    public final Clause d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f317111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f317112h;
    public final boolean i;

    public i() {
        this(null, null, null, null, null, false, false, 511);
    }

    @Override // cli.p
    public final List c() {
        return this.f317108a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f317108a, iVar.f317108a) && Intrinsics.f(this.f317109b, iVar.f317109b) && Intrinsics.f(this.f317110c, iVar.f317110c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && this.f317111g == iVar.f317111g && this.f317112h == iVar.f317112h && this.i == iVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f317108a.hashCode() * 31;
        Clause clause = this.f317109b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f317110c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
        Clause clause4 = this.e;
        int iHashCode5 = (iHashCode4 + (clause4 == null ? 0 : clause4.hashCode())) * 31;
        Image image = this.f;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c((iHashCode5 + (image != null ? image.hashCode() : 0)) * 31, 31, this.f317111g), 31, this.f317112h);
    }

    public i(List items, Clause clause, Clause clause2, Clause clause3, Clause clause4, Image image, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317108a = items;
        this.f317109b = clause;
        this.f317110c = clause2;
        this.d = clause3;
        this.e = clause4;
        this.f = image;
        this.f317111g = z;
        this.f317112h = z3;
        this.i = z4;
    }

    public i(List list, TextLocalisedQuantityClause textLocalisedQuantityClause, Clause clause, Clause clause2, TextLocalisedClause textLocalisedClause, boolean z, boolean z3, int i) {
        this((i & 1) != 0 ? f0.f322471a : list, (i & 2) != 0 ? null : textLocalisedQuantityClause, (i & 4) != 0 ? null : clause, (i & 8) != 0 ? null : clause2, (i & 16) != 0 ? null : textLocalisedClause, null, (i & 64) == 0, (i & 128) != 0 ? false : z, (i & 256) != 0 ? false : z3);
    }
}
