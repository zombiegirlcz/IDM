package com.revolut.feature.retail.reverywhere.impl.web_app;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "AppConfiguration", "Url", "Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData$Url;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReverywhereWebAppScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppConfiguration extends ReverywhereWebAppScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AppConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82919b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82920c;
        public final boolean d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new AppConfiguration(string, string2, string3, z3, parcel.readInt() == 0 ? z : true);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppConfiguration[i];
            }
        }

        public AppConfiguration(String appSubdomain, String appName, String str, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(appSubdomain, "appSubdomain");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f82918a = appSubdomain;
            this.f82919b = appName;
            this.f82920c = str;
            this.d = z;
            this.e = z3;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF82922b() {
            return this.f82919b;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.e;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF82923c() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AppConfiguration)) {
                return false;
            }
            AppConfiguration appConfiguration = (AppConfiguration) obj2;
            return Intrinsics.f(this.f82918a, appConfiguration.f82918a) && Intrinsics.f(this.f82919b, appConfiguration.f82919b) && Intrinsics.f(this.f82920c, appConfiguration.f82920c) && this.d == appConfiguration.d && this.e == appConfiguration.e;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f82918a.hashCode() * 31, 31, this.f82919b);
            String str = this.f82920c;
            return Boolean.hashCode(this.e) + j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82918a);
            dest.writeString(this.f82919b);
            dest.writeString(this.f82920c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData$Url;", "Lcom/revolut/feature/retail/reverywhere/impl/web_app/ReverywhereWebAppScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url extends ReverywhereWebAppScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82923c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Url(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public Url(String url2, String appName, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f82921a = url2;
            this.f82922b = appName;
            this.f82923c = z;
            this.d = z3;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF82922b() {
            return this.f82922b;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
            return this.d;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.web_app.ReverywhereWebAppScreenContract$InputData
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getF82923c() {
            return this.f82923c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Url)) {
                return false;
            }
            Url url2 = (Url) obj2;
            return Intrinsics.f(this.f82921a, url2.f82921a) && Intrinsics.f(this.f82922b, url2.f82922b) && this.f82923c == url2.f82923c && this.d == url2.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + j6.a.c(p.a.c(this.f82921a.hashCode() * 31, 31, this.f82922b), 31, this.f82923c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82921a);
            dest.writeString(this.f82922b);
            dest.writeInt(this.f82923c ? 1 : 0);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    private ReverywhereWebAppScreenContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF82922b();

    /* JADX INFO: renamed from: b */
    public abstract boolean getD();

    /* JADX INFO: renamed from: c */
    public abstract boolean getF82923c();
}
