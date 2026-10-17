package com.revolut.feature.retail.reverywhere.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "AppConfiguration", "Url", "Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp$Url;", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReverywhereWebApp implements KompotDestination {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppConfiguration extends ReverywhereWebApp {

        @NotNull
        public static final Parcelable.Creator<AppConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82894c;
        public final boolean d;
        public final TransitionAnimation e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AppConfiguration(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (TransitionAnimation) parcel.readParcelable(AppConfiguration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppConfiguration[i];
            }
        }

        public AppConfiguration(String appSubdomain, String appName, String str, boolean z, TransitionAnimation transitionAnimation) {
            Intrinsics.checkNotNullParameter(appSubdomain, "appSubdomain");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f82892a = appSubdomain;
            this.f82893b = appName;
            this.f82894c = str;
            this.d = z;
            this.e = transitionAnimation;
        }

        @Override // aii.d0
        /* JADX INFO: renamed from: Y0, reason: from getter */
        public final TransitionAnimation getE() {
            return this.e;
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
            return Intrinsics.f(this.f82892a, appConfiguration.f82892a) && Intrinsics.f(this.f82893b, appConfiguration.f82893b) && Intrinsics.f(this.f82894c, appConfiguration.f82894c) && this.d == appConfiguration.d && Intrinsics.f(this.e, appConfiguration.e);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f82892a.hashCode() * 31, 31, this.f82893b);
            String str = this.f82894c;
            int iC2 = j6.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            TransitionAnimation transitionAnimation = this.e;
            return iC2 + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82892a);
            dest.writeString(this.f82893b);
            dest.writeString(this.f82894c);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp$Url;", "Lcom/revolut/feature/retail/reverywhere/api/navigation/ReverywhereWebApp;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url extends ReverywhereWebApp {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82896b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Url(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public Url(String url2, String appName) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f82895a = url2;
            this.f82896b = appName;
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
            return Intrinsics.f(this.f82895a, url2.f82895a) && Intrinsics.f(this.f82896b, url2.f82896b);
        }

        public final int hashCode() {
            return this.f82896b.hashCode() + (this.f82895a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82895a);
            dest.writeString(this.f82896b);
        }
    }

    private ReverywhereWebApp() {
    }
}
