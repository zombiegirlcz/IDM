package com.revolut.feature.freelancer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy;", "Landroid/os/Parcelable;", "NavigateToMain", "NavigateToCustom", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy$NavigateToCustom;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy$NavigateToMain;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface FreelancerOnboardingNavStrategy extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy$NavigateToCustom;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateToCustom implements FreelancerOnboardingNavStrategy {

        @NotNull
        public static final Parcelable.Creator<NavigateToCustom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f73260a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateToCustom((NaviCommand) parcel.readParcelable(NavigateToCustom.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToCustom[i];
            }
        }

        public NavigateToCustom(NaviCommand nextNaviCommand) {
            Intrinsics.checkNotNullParameter(nextNaviCommand, "nextNaviCommand");
            this.f73260a = nextNaviCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateToCustom) && Intrinsics.f(this.f73260a, ((NavigateToCustom) obj2).f73260a);
        }

        public final int hashCode() {
            return this.f73260a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f73260a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy$NavigateToMain;", "Lcom/revolut/feature/freelancer/api/navigation/FreelancerOnboardingNavStrategy;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NavigateToMain implements FreelancerOnboardingNavStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NavigateToMain f73261a = new NavigateToMain();

        @NotNull
        public static final Parcelable.Creator<NavigateToMain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NavigateToMain.f73261a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateToMain[i];
            }
        }

        private NavigateToMain() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
