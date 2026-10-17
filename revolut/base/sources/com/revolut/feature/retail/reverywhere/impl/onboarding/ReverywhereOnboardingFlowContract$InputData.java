package com.revolut.feature.retail.reverywhere.impl.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.reverywhere.api.model.ReverywhereMiniAppName;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.navigable.TransitionAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "<init>", "()V", "AppConfiguration", "Url", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData$Url;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReverywhereOnboardingFlowContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData$AppConfiguration;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AppConfiguration extends ReverywhereOnboardingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AppConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReverywhereMiniAppName f82900c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f82901g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TransitionAnimation f82902h;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                ReverywhereMiniAppName reverywhereMiniAppName = (ReverywhereMiniAppName) parcel.readParcelable(AppConfiguration.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new AppConfiguration(string, string2, reverywhereMiniAppName, z4, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), (TransitionAnimation) parcel.readParcelable(AppConfiguration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppConfiguration[i];
            }
        }

        public AppConfiguration(String appSubdomain, String appName, ReverywhereMiniAppName miniAppName, boolean z, boolean z3, boolean z4, String str, TransitionAnimation transitionAnimation) {
            Intrinsics.checkNotNullParameter(appSubdomain, "appSubdomain");
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            this.f82898a = appSubdomain;
            this.f82899b = appName;
            this.f82900c = miniAppName;
            this.d = z;
            this.e = z3;
            this.f = z4;
            this.f82901g = str;
            this.f82902h = transitionAnimation;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReverywhereMiniAppName getF82905c() {
            return this.f82900c;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
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
            return Intrinsics.f(this.f82898a, appConfiguration.f82898a) && Intrinsics.f(this.f82899b, appConfiguration.f82899b) && Intrinsics.f(this.f82900c, appConfiguration.f82900c) && this.d == appConfiguration.d && this.e == appConfiguration.e && this.f == appConfiguration.f && Intrinsics.f(this.f82901g, appConfiguration.f82901g) && Intrinsics.f(this.f82902h, appConfiguration.f82902h);
        }

        public final int hashCode() {
            int iC = j6.a.c(j6.a.c(j6.a.c((this.f82900c.hashCode() + p.a.c(this.f82898a.hashCode() * 31, 31, this.f82899b)) * 31, 31, this.d), 31, this.e), 31, this.f);
            String str = this.f82901g;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            TransitionAnimation transitionAnimation = this.f82902h;
            return iHashCode + (transitionAnimation != null ? transitionAnimation.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82898a);
            dest.writeString(this.f82899b);
            dest.writeParcelable(this.f82900c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
            dest.writeString(this.f82901g);
            dest.writeParcelable(this.f82902h, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData$Url;", "Lcom/revolut/feature/retail/reverywhere/impl/onboarding/ReverywhereOnboardingFlowContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_retail_reverywhere_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url extends ReverywhereOnboardingFlowContract$InputData {

        @NotNull
        public static final Parcelable.Creator<Url> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ReverywhereMiniAppName f82905c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                ReverywhereMiniAppName reverywhereMiniAppName = (ReverywhereMiniAppName) parcel.readParcelable(Url.class.getClassLoader());
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new Url(string, string2, reverywhereMiniAppName, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Url[i];
            }
        }

        public Url(String url2, String appName, ReverywhereMiniAppName miniAppName, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(appName, "appName");
            Intrinsics.checkNotNullParameter(miniAppName, "miniAppName");
            this.f82903a = url2;
            this.f82904b = appName;
            this.f82905c = miniAppName;
            this.d = z;
            this.e = z3;
            this.f = z4;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ReverywhereMiniAppName getF82905c() {
            return this.f82905c;
        }

        @Override // com.revolut.feature.retail.reverywhere.impl.onboarding.ReverywhereOnboardingFlowContract$InputData
        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getD() {
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
            if (!(obj2 instanceof Url)) {
                return false;
            }
            Url url2 = (Url) obj2;
            return Intrinsics.f(this.f82903a, url2.f82903a) && Intrinsics.f(this.f82904b, url2.f82904b) && Intrinsics.f(this.f82905c, url2.f82905c) && this.d == url2.d && this.e == url2.e && this.f == url2.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f82905c.hashCode() + p.a.c(this.f82903a.hashCode() * 31, 31, this.f82904b)) * 31, 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82903a);
            dest.writeString(this.f82904b);
            dest.writeParcelable(this.f82905c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
        }
    }

    private ReverywhereOnboardingFlowContract$InputData() {
    }

    /* JADX INFO: renamed from: a */
    public abstract ReverywhereMiniAppName getF82905c();

    /* JADX INFO: renamed from: b */
    public abstract boolean getD();
}
