package m2e;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements zn.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f201957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f201958b;

    public b(Object obj2, a aVar) {
        this.f201957a = obj2;
        this.f201958b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f201957a, bVar.f201957a) && Intrinsics.f(this.f201958b, bVar.f201958b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // zn.d
    public final String getIdentifier() {
        String identifier;
        a aVar = this.f201958b;
        if (aVar != null && (identifier = aVar.getIdentifier()) != null) {
            return identifier;
        }
        Object obj2 = this.f201957a;
        return String.valueOf(obj2 != null ? obj2.hashCode() : 0);
    }

    public final int hashCode() {
        Object obj2 = this.f201957a;
        int iHashCode = (obj2 == null ? 0 : obj2.hashCode()) * 31;
        a aVar = this.f201958b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // zn.d
    public final ViewableRecordItem$Type p0() {
        a aVar = this.f201958b;
        return aVar != null ? aVar.e : new ViewableRecordItem$Type.ViewableRecord(null);
    }
}
