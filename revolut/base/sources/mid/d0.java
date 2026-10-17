package mid;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.feature.rev_points.models.EarningBadge;
import com.revolut.feature.shops.api.model.ShopsContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements com.revolut.analytics.ads.model.a, fd0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f205692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205693c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f205694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f205695h;
    public final EarningBadge i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f205696j;

    public d0(String id10, v0 type, String title, String logoUrl, String backgroundImageUrl, String str, String str2, String str3, EarningBadge earningBadge, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        this.f205691a = id10;
        this.f205692b = type;
        this.f205693c = title;
        this.d = logoUrl;
        this.e = backgroundImageUrl;
        this.f = str;
        this.f205694g = str2;
        this.f205695h = str3;
        this.i = earningBadge;
        this.f205696j = i;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0 */
    public final String getE() {
        return this.f205692b.b();
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0 */
    public final String getF() {
        return this.e;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: R0 */
    public final Integer getF78052h() {
        return null;
    }

    @Override // fd0.c
    public final String a() {
        return this.f205691a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f205691a, d0Var.f205691a) && Intrinsics.f(this.f205692b, d0Var.f205692b) && Intrinsics.f(this.f205693c, d0Var.f205693c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f) && Intrinsics.f(this.f205694g, d0Var.f205694g) && Intrinsics.f(this.f205695h, d0Var.f205695h) && Intrinsics.f(this.i, d0Var.i) && this.f205696j == d0Var.f205696j;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: getPosition */
    public final Integer getF78051g() {
        return Integer.valueOf(this.f205696j);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c((this.f205692b.hashCode() + (this.f205691a.hashCode() * 31)) * 31, 31, this.f205693c), 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f205694g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f205695h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EarningBadge earningBadge = this.i;
        return Integer.hashCode(this.f205696j) + ((iHashCode3 + (earningBadge != null ? earningBadge.hashCode() : 0)) * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: n1 */
    public final String getI() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0 */
    public final String getD() {
        ShopsContext shopsContextA = this.f205692b.a();
        if (shopsContextA != null) {
            return shopsContextA.getF87036t();
        }
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return new ViewableRecordItem$Type.Impression(null, Integer.valueOf(this.f205696j), this.f205692b.b(), this.e, getD(), null);
    }
}
