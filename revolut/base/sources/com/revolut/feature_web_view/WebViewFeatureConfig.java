package com.revolut.feature_web_view;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yhm.d;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_web_view/WebViewFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_web_view_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class WebViewFeatureConfig implements FeatureConfig {

    @NotNull
    public static final Parcelable.Creator<WebViewFeatureConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f98152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f98153c;
    public final int d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f98154g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98155h;
    public final Parcelable i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f98156j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f98157l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f98158m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f98159n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f98160p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f98161q;

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            boolean z4;
            boolean z6;
            boolean z11;
            boolean z12;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            Clause clause = (Clause) parcel.readParcelable(WebViewFeatureConfig.class.getClassLoader());
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            boolean z29 = false;
            boolean z31 = true;
            boolean z41 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z29 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z3 = true;
                z4 = z;
            } else {
                z3 = true;
                z31 = z;
                z4 = z31;
            }
            String string2 = parcel.readString();
            Parcelable parcelable = parcel.readParcelable(WebViewFeatureConfig.class.getClassLoader());
            boolean z49 = z4;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                z6 = z49;
                z49 = z3;
            } else {
                z6 = z49;
            }
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            if (parcel.readInt() != 0) {
                z11 = z6;
                z6 = z3;
            } else {
                z11 = z6;
            }
            if (parcel.readInt() != 0) {
                z12 = z11;
                z11 = z3;
            } else {
                z12 = z11;
            }
            if (parcel.readInt() != 0) {
                z12 = z3;
            }
            return new WebViewFeatureConfig(string, clause, i, i2, z41, z29, z31, string2, parcelable, string3, z49, z6, string4, string5, string6, z11, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebViewFeatureConfig[i];
        }
    }

    public WebViewFeatureConfig(String url2, Clause clause, int i, int i2, boolean z, boolean z3, boolean z4, String str, Parcelable parcelable, String str2, boolean z6, boolean z11, String str3, String str4, String str5, boolean z12, boolean z29) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f98151a = url2;
        this.f98152b = clause;
        this.f98153c = i;
        this.d = i2;
        this.e = z;
        this.f = z3;
        this.f98154g = z4;
        this.f98155h = str;
        this.i = parcelable;
        this.f98156j = str2;
        this.k = z6;
        this.f98157l = str3;
        this.f98158m = str4;
        this.f98159n = str5;
        this.o = z11;
        this.f98160p = z12;
        this.f98161q = z29;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WebViewFeatureConfig)) {
            return false;
        }
        WebViewFeatureConfig webViewFeatureConfig = (WebViewFeatureConfig) obj2;
        return Intrinsics.f(this.f98151a, webViewFeatureConfig.f98151a) && Intrinsics.f(this.f98152b, webViewFeatureConfig.f98152b) && this.f98153c == webViewFeatureConfig.f98153c && this.d == webViewFeatureConfig.d && this.e == webViewFeatureConfig.e && this.f == webViewFeatureConfig.f && this.f98154g == webViewFeatureConfig.f98154g && Intrinsics.f(this.f98155h, webViewFeatureConfig.f98155h) && Intrinsics.f(this.i, webViewFeatureConfig.i) && Intrinsics.f(this.f98156j, webViewFeatureConfig.f98156j) && this.k == webViewFeatureConfig.k && Intrinsics.f(this.f98157l, webViewFeatureConfig.f98157l) && Intrinsics.f(this.f98158m, webViewFeatureConfig.f98158m) && Intrinsics.f(this.f98159n, webViewFeatureConfig.f98159n) && this.o == webViewFeatureConfig.o && this.f98160p == webViewFeatureConfig.f98160p && this.f98161q == webViewFeatureConfig.f98161q;
    }

    public final int hashCode() {
        int iHashCode = this.f98151a.hashCode() * 31;
        Clause clause = this.f98152b;
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.b(this.d, j6.a.b(this.f98153c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31), 31, this.e), 31, this.f), 31, this.f98154g);
        String str = this.f98155h;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Parcelable parcelable = this.i;
        int iHashCode3 = (iHashCode2 + (parcelable == null ? 0 : parcelable.hashCode())) * 31;
        String str2 = this.f98156j;
        int iC2 = j6.a.c((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.k);
        String str3 = this.f98157l;
        int iHashCode4 = (iC2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f98158m;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f98159n;
        return Boolean.hashCode(this.f98161q) + j6.a.c(j6.a.c((iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31, 31, this.o), 31, this.f98160p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98151a);
        dest.writeParcelable(this.f98152b, i);
        dest.writeInt(this.f98153c);
        dest.writeInt(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f98154g ? 1 : 0);
        dest.writeString(this.f98155h);
        dest.writeParcelable(this.i, i);
        dest.writeString(this.f98156j);
        dest.writeInt(this.k ? 1 : 0);
        dest.writeString(this.f98157l);
        dest.writeString(this.f98158m);
        dest.writeString(this.f98159n);
        dest.writeInt(this.o ? 1 : 0);
        dest.writeInt(this.f98160p ? 1 : 0);
        dest.writeInt(this.f98161q ? 1 : 0);
    }

    public /* synthetic */ WebViewFeatureConfig(String str, Clause clause, int i, boolean z, boolean z3, boolean z4, int i2) {
        this(str, (i2 & 2) != 0 ? null : clause, (i2 & 4) != 0 ? R$drawable.uikit_icn_24_back : i, R$drawable.uikit_icn_24_back, (i2 & 16) == 0, z, z3, null, null, (i2 & 512) == 0 ? "CREDIT_CONSENTS_WEB_VIEW_FLOW" : null, (i2 & 1024) == 0, (i2 & 16384) != 0, null, null, null, false, (i2 & 65536) != 0 ? false : z4);
    }
}
