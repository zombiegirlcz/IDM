package mhe;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.jvm.internal.Intrinsics;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f205554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.c f205555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205556c;
    public final ViewableRecordItem$Type.ViewableRecord d;
    public final AnalyticsContext e;

    public h(TotalWealthCategoryKey categoryKey, h.c snapshot, String identifier, ViewableRecordItem$Type.ViewableRecord viewableRecordType, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
        this.f205554a = categoryKey;
        this.f205555b = snapshot;
        this.f205556c = identifier;
        this.d = viewableRecordType;
        this.e = analyticsContext;
    }

    @Override // mhe.j
    public final TotalWealthCategoryKey a() {
        return this.f205554a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f205554a.equals(hVar.f205554a) && Intrinsics.f(this.f205555b, hVar.f205555b) && Intrinsics.f(this.f205556c, hVar.f205556c) && this.d.equals(hVar.d) && this.e.equals(hVar.e);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.e;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f205556c;
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.e.f50296a) + ((this.d.hashCode() + p.a.c((this.f205555b.hashCode() + (this.f205554a.hashCode() * 31)) * 31, 31, this.f205556c)) * 31);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.d;
    }
}
