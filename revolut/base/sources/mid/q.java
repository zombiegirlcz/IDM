package mid;

import android.os.Parcelable;
import com.revolut.feature.shops.api.model.ShopsCampaignOffer;
import com.revolut.feature.shops.api.model.ShopsContext;
import com.revolut.feature.shops.api.model.ShopsDeeplinkOffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f205747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205748c;
    public final String d;
    public final ShopsContext e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f205749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f205750h;
    public final String i;

    public q(String id10, String title, String str, String logoUrl, ShopsContext shopsContext, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        Intrinsics.checkNotNullParameter(shopsContext, "shopsContext");
        this.f205746a = id10;
        this.f205747b = title;
        this.f205748c = str;
        this.d = logoUrl;
        this.e = shopsContext;
        this.f = i;
        this.f205749g = logoUrl;
        this.f205750h = shopsContext.getF87036t();
        this.i = shopsContext instanceof ShopsCampaignOffer ? ((ShopsCampaignOffer) shopsContext).u : shopsContext instanceof ShopsDeeplinkOffer ? ((ShopsDeeplinkOffer) shopsContext).f87044c : "";
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: J0 */
    public final String getF89900g() {
        return this.i;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: N0 */
    public final String getF89901h() {
        return this.f205749g;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: R0 */
    public final Integer getF78052h() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f205746a, qVar.f205746a) && Intrinsics.f(this.f205747b, qVar.f205747b) && Intrinsics.f(this.f205748c, qVar.f205748c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && this.f == qVar.f;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: getPosition */
    public final Integer getF78051g() {
        return Integer.valueOf(this.f);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f205746a.hashCode() * 31, 31, this.f205747b);
        String str = this.f205748c;
        return Integer.hashCode(this.f) + ((this.e.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d)) * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: n1 */
    public final String getK() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    /* JADX INFO: renamed from: o0 */
    public final String getF() {
        return this.f205750h;
    }
}
