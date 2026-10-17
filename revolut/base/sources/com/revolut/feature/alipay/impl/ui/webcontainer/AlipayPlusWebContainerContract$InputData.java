package com.revolut.feature.alipay.impl.ui.webcontainer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/alipay/impl/ui/webcontainer/AlipayPlusWebContainerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_alipay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AlipayPlusWebContainerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AlipayPlusWebContainerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f61092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f61093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f61094c;
    public final String d;
    public final String e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f61095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f61096h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AlipayPlusWebContainerContract$InputData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AlipayPlusWebContainerContract$InputData[i];
        }
    }

    public AlipayPlusWebContainerContract$InputData(String url2, String str, String str2, String bizScenario, String requestId, boolean z, String h5ErrorPageUrl, String pageId) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(bizScenario, "bizScenario");
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        Intrinsics.checkNotNullParameter(h5ErrorPageUrl, "h5ErrorPageUrl");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        this.f61092a = url2;
        this.f61093b = str;
        this.f61094c = str2;
        this.d = bizScenario;
        this.e = requestId;
        this.f = z;
        this.f61095g = h5ErrorPageUrl;
        this.f61096h = pageId;
    }

    public final String a() {
        boolean z = this.f;
        String str = this.f61092a;
        if (!z || !a0.H(str, "http://", true)) {
            return str;
        }
        String strSubstring = str.substring(7);
        return t61.a.p(strSubstring, "substring(...)", "https://", strSubstring);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AlipayPlusWebContainerContract$InputData)) {
            return false;
        }
        AlipayPlusWebContainerContract$InputData alipayPlusWebContainerContract$InputData = (AlipayPlusWebContainerContract$InputData) obj2;
        return Intrinsics.f(this.f61092a, alipayPlusWebContainerContract$InputData.f61092a) && Intrinsics.f(this.f61093b, alipayPlusWebContainerContract$InputData.f61093b) && Intrinsics.f(this.f61094c, alipayPlusWebContainerContract$InputData.f61094c) && Intrinsics.f(this.d, alipayPlusWebContainerContract$InputData.d) && Intrinsics.f(this.e, alipayPlusWebContainerContract$InputData.e) && this.f == alipayPlusWebContainerContract$InputData.f && Intrinsics.f(this.f61095g, alipayPlusWebContainerContract$InputData.f61095g) && Intrinsics.f(this.f61096h, alipayPlusWebContainerContract$InputData.f61096h);
    }

    public final int hashCode() {
        int iHashCode = this.f61092a.hashCode() * 31;
        String str = this.f61093b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f61094c;
        return this.f61096h.hashCode() + p.a.c(j6.a.c(p.a.c(p.a.c((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f61095g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f61092a);
        dest.writeString(this.f61093b);
        dest.writeString(this.f61094c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeString(this.f61095g);
        dest.writeString(this.f61096h);
    }
}
