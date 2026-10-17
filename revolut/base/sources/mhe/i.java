package mhe;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import kotlin.jvm.internal.Intrinsics;
import yfe.h;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TotalWealthCategoryKey f205557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h.a f205558b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f205559c;
    public final ViewableRecordItem$Type.ViewableRecord d;
    public final AnalyticsContext e;

    public i(TotalWealthCategoryKey categoryKey, h.a snapshot, String identifier, ViewableRecordItem$Type.ViewableRecord viewableRecordType, AnalyticsContext analyticsContext) {
        Intrinsics.checkNotNullParameter(categoryKey, "categoryKey");
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
        this.f205557a = categoryKey;
        this.f205558b = snapshot;
        this.f205559c = identifier;
        this.d = viewableRecordType;
        this.e = analyticsContext;
    }

    @Override // mhe.j
    public final TotalWealthCategoryKey a() {
        return this.f205557a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f205557a.equals(iVar.f205557a) && Intrinsics.f(this.f205558b, iVar.f205558b) && Intrinsics.f(this.f205559c, iVar.f205559c) && this.d.equals(iVar.d) && this.e.equals(iVar.e);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.e;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f205559c;
    }

    public final int hashCode() {
        return AnalyticsContext.a(this.e.f50296a) + ((this.d.hashCode() + p.a.c((this.f205558b.hashCode() + (this.f205557a.hashCode() * 31)) * 31, 31, this.f205559c)) * 31);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.d;
    }
}
