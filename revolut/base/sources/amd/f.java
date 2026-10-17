package amd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f6320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f6321c;
    public final Clause d;
    public final Image e;
    public final CircleBadgeModel f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l0 f6322g;

    public f(Clause title, Clause clause, MoneyClause moneyClause, Clause clause2, Image image, CircleBadgeModel circleBadgeModel, l0 parcel, int i) {
        clause = (i & 2) != 0 ? null : clause;
        clause2 = (i & 8) != 0 ? null : clause2;
        circleBadgeModel = (i & 32) != 0 ? null : circleBadgeModel;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f6319a = title;
        this.f6320b = clause;
        this.f6321c = moneyClause;
        this.d = clause2;
        this.e = image;
        this.f = circleBadgeModel;
        this.f6322g = parcel;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f6319a.equals(fVar.f6319a) && Intrinsics.f(this.f6320b, fVar.f6320b) && Intrinsics.f(this.f6321c, fVar.f6321c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && this.f6322g.equals(fVar.f6322g);
    }

    public final int hashCode() {
        int iHashCode = this.f6319a.hashCode() * 31;
        Clause clause = this.f6320b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f6321c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Clause clause3 = this.d;
        int iC = a10.b.c(this.e, (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31, 31);
        CircleBadgeModel circleBadgeModel = this.f;
        return (this.f6322g.hashCode() + ((iC + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31)) * 31;
    }
}
