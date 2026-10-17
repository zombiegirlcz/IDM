package tga;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements zn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f271114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wga.i f271115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f271116c;
    public final Parcelable d;
    public final ViewableRecordItem$Type.ViewableRecord e;

    public e(d0 context, wga.i banner, String identifier, AnalyticsContext analyticsContext, ViewableRecordItem$Type.ViewableRecord viewableRecordType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(viewableRecordType, "viewableRecordType");
        this.f271114a = context;
        this.f271115b = banner;
        this.f271116c = identifier;
        this.d = analyticsContext;
        this.e = viewableRecordType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f271114a, eVar.f271114a) && Intrinsics.f(this.f271115b, eVar.f271115b) && Intrinsics.f(this.f271116c, eVar.f271116c) && Intrinsics.f(this.d, eVar.d) && this.e.equals(eVar.e);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getAnalyticsContext */
    public final Parcelable getD() {
        return this.d;
    }

    @Override // zn.d
    /* JADX INFO: renamed from: getIdentifier */
    public final String getF100566c() {
        return this.f271116c;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f271115b.hashCode() + (this.f271114a.hashCode() * 31)) * 31, 31, this.f271116c);
        Parcelable parcelable = this.d;
        return this.e.hashCode() + ((iC + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
    }

    @Override // zn.d
    /* JADX INFO: renamed from: p0 */
    public final ViewableRecordItem$Type getE() {
        return this.e;
    }
}
