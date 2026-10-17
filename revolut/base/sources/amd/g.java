package amd;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f6324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f6325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f6326c;
    public final Clause d;
    public final c0 e;
    public final AnalyticsContext f;

    public g(Image image, Clause title, Clause clause, Clause clause2, c0 parcel, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f6324a = image;
        this.f6325b = title;
        this.f6326c = clause;
        this.d = clause2;
        this.e = parcel;
        this.f = analyticsContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f6324a, gVar.f6324a) && Intrinsics.f(this.f6325b, gVar.f6325b) && Intrinsics.f(this.f6326c, gVar.f6326c) && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e) && this.f.equals(gVar.f);
    }

    public final int hashCode() {
        int iA = p.a.a(this.f6324a.hashCode() * 31, 31, this.f6325b);
        Clause clause = this.f6326c;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return AnalyticsContext.a(this.f.f50296a) + ((this.e.hashCode() + ((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31)) * 31);
    }
}
