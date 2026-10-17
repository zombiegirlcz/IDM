package o97;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class y implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f223135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f223136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f223137c;
    public final GlobalSearchContext d;
    public final Object e;
    public Object f;

    public /* synthetic */ y(m0 m0Var, Object obj2, String str, int i) {
        this(m0Var, (i & 2) != 0 ? null : obj2, (i & 4) != 0 ? null : str, null, null, null);
    }

    public static y a(y yVar, String str, GlobalSearchContext globalSearchContext, Object obj2, int i) {
        m0 sourceIdentifier = yVar.f223135a;
        Object obj3 = yVar.f223136b;
        if ((i & 4) != 0) {
            str = yVar.f223137c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            globalSearchContext = yVar.d;
        }
        GlobalSearchContext globalSearchContext2 = globalSearchContext;
        if ((i & 16) != 0) {
            obj2 = yVar.e;
        }
        Object obj4 = yVar.f;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        return new y(sourceIdentifier, obj3, str2, globalSearchContext2, obj2, obj4);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        Object obj2 = this.f223136b;
        com.revolut.analytics.ads.model.a aVar = obj2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) obj2 : null;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        Object obj2 = this.f223136b;
        com.revolut.analytics.ads.model.a aVar = obj2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) obj2 : null;
        if (aVar != null) {
            return aVar.N0();
        }
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f223135a, yVar.f223135a) && Intrinsics.f(this.f223136b, yVar.f223136b) && Intrinsics.f(this.f223137c, yVar.f223137c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        Object obj2 = this.f223136b;
        com.revolut.analytics.ads.model.a aVar = obj2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) obj2 : null;
        if (aVar != null) {
            return aVar.getPosition();
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f223135a.hashCode() * 31;
        Object obj2 = this.f223136b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        String str = this.f223137c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        GlobalSearchContext globalSearchContext = this.d;
        int iHashCode4 = (iHashCode3 + (globalSearchContext == null ? 0 : globalSearchContext.hashCode())) * 31;
        Object obj3 = this.e;
        int iHashCode5 = (iHashCode4 + (obj3 == null ? 0 : obj3.hashCode())) * 31;
        Object obj4 = this.f;
        return iHashCode5 + (obj4 != null ? obj4.hashCode() : 0);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        Object obj2 = this.f223136b;
        com.revolut.analytics.ads.model.a aVar = obj2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) obj2 : null;
        if (aVar != null) {
            return aVar.n1();
        }
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        Object obj2 = this.f223136b;
        com.revolut.analytics.ads.model.a aVar = obj2 instanceof com.revolut.analytics.ads.model.a ? (com.revolut.analytics.ads.model.a) obj2 : null;
        if (aVar != null) {
            return aVar.o0();
        }
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return new ViewableRecordItem$Type.Impression(null, getPosition(), J0(), N0(), o0(), n1());
    }

    public y(m0 sourceIdentifier, Object obj2, String str, GlobalSearchContext globalSearchContext, Object obj3, Object obj4) {
        Intrinsics.checkNotNullParameter(sourceIdentifier, "sourceIdentifier");
        this.f223135a = sourceIdentifier;
        this.f223136b = obj2;
        this.f223137c = str;
        this.d = globalSearchContext;
        this.e = obj3;
        this.f = obj4;
    }
}
