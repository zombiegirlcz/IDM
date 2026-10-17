package com.revolut.feature.credit.forbearance.application.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Companion", "Agreements", "a", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceKompotFeatureConfig$Agreements;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ForbearanceKompotFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceKompotFeatureConfig$Agreements;", "Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AgreementsNavigationDestination", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Agreements extends ForbearanceKompotFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<Agreements> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f69928g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final ActivityAnimation f69929h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/forbearance/application/api/navigation/ForbearanceKompotFeatureConfig$Agreements$AgreementsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_credit_forbearance_application_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AgreementsNavigationDestination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<AgreementsNavigationDestination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f69930a;

            /* JADX INFO: loaded from: classes22.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AgreementsNavigationDestination(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AgreementsNavigationDestination[i];
                }
            }

            public AgreementsNavigationDestination(String str) {
                this.f69930a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof AgreementsNavigationDestination) && Intrinsics.f(this.f69930a, ((AgreementsNavigationDestination) obj2).f69930a);
            }

            public final int hashCode() {
                String str = this.f69930a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f69930a);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Agreements(parcel.readString(), (ActivityAnimation) parcel.readParcelable(Agreements.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Agreements[i];
            }
        }

        public Agreements(String str, ActivityAnimation activityAnimation) {
            super(activityAnimation, new AgreementsNavigationDestination(str), false, Integer.valueOf(LDSFile.EF_DG15_TAG), 0, 52);
            this.f69928g = str;
            this.f69929h = activityAnimation;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF69929h() {
            return this.f69929h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Agreements)) {
                return false;
            }
            Agreements agreements = (Agreements) obj2;
            return Intrinsics.f(this.f69928g, agreements.f69928g) && Intrinsics.f(this.f69929h, agreements.f69929h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f69928g;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            ActivityAnimation activityAnimation = this.f69929h;
            return iHashCode + (activityAnimation != null ? activityAnimation.hashCode() : 0);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69928g);
            dest.writeParcelable(this.f69929h, i);
        }
    }
}
