package zn;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f323638c;
    public final Integer d;
    public final Integer e;
    public final String f;

    public c(Integer num, Integer num2, String str, String str2, String str3, String str4) {
        this.f323636a = str;
        this.f323637b = str2;
        this.f323638c = str3;
        this.d = num;
        this.e = num2;
        this.f = str4;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f323636a, cVar.f323636a) && Intrinsics.f(this.f323637b, cVar.f323637b) && Intrinsics.f(this.f323638c, cVar.f323638c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f323636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f323637b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f323638c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.e;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f323638c;
    }
}
