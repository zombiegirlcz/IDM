package com.revolut.feature.referrals.shared.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pwa.n;
import yhm.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "InviteCampaignHomeFeatureConfig", "InviteCampaignHomeNavigationDestination", "ReferralsTroubleshooterNavigationDestination", "AllReferralsTroubleshooterNavigationDestination", "C2BReferralsNavigationDestination", "SalaryReferralIneligibleDestination", "Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$InviteCampaignHomeFeatureConfig;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ReferralsBizFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$AllReferralsTroubleshooterNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllReferralsTroubleshooterNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AllReferralsTroubleshooterNavigationDestination f81830a = new AllReferralsTroubleshooterNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<AllReferralsTroubleshooterNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AllReferralsTroubleshooterNavigationDestination.f81830a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllReferralsTroubleshooterNavigationDestination[i];
            }
        }

        private AllReferralsTroubleshooterNavigationDestination() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof AllReferralsTroubleshooterNavigationDestination);
        }

        public final int hashCode() {
            return 1880961268;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$C2BReferralsNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C2BReferralsNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2BReferralsNavigationDestination f81831a = new C2BReferralsNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<C2BReferralsNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return C2BReferralsNavigationDestination.f81831a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C2BReferralsNavigationDestination[i];
            }
        }

        private C2BReferralsNavigationDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$InviteCampaignHomeFeatureConfig;", "Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @d
    public static final /* data */ class InviteCampaignHomeFeatureConfig extends ReferralsBizFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<InviteCampaignHomeFeatureConfig> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final ActivityAnimation f81832g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f81833h;
        public final boolean i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f81834j;
        public final n k;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ActivityAnimation activityAnimation = (ActivityAnimation) parcel.readParcelable(InviteCampaignHomeFeatureConfig.class.getClassLoader());
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                return new InviteCampaignHomeFeatureConfig(activityAnimation, z3, parcel.readInt() == 0 ? z : true, parcel.readString(), n.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteCampaignHomeFeatureConfig[i];
            }
        }

        public InviteCampaignHomeFeatureConfig() {
            this(null, 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ActivityAnimation getF75028j() {
            return this.f81832g;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteCampaignHomeFeatureConfig)) {
                return false;
            }
            InviteCampaignHomeFeatureConfig inviteCampaignHomeFeatureConfig = (InviteCampaignHomeFeatureConfig) obj2;
            return Intrinsics.f(this.f81832g, inviteCampaignHomeFeatureConfig.f81832g) && this.f81833h == inviteCampaignHomeFeatureConfig.f81833h && this.i == inviteCampaignHomeFeatureConfig.i && Intrinsics.f(this.f81834j, inviteCampaignHomeFeatureConfig.f81834j) && this.k == inviteCampaignHomeFeatureConfig.k;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            ActivityAnimation activityAnimation = this.f81832g;
            int iC = j6.a.c(j6.a.c((activityAnimation == null ? 0 : activityAnimation.hashCode()) * 31, 31, this.f81833h), 31, this.i);
            String str = this.f81834j;
            return this.k.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81832g, i);
            dest.writeInt(this.f81833h ? 1 : 0);
            dest.writeInt(this.i ? 1 : 0);
            dest.writeString(this.f81834j);
            dest.writeString(this.k.name());
        }

        public /* synthetic */ InviteCampaignHomeFeatureConfig(n nVar, int i) {
            this(null, false, false, null, (i & 16) != 0 ? n.STANDARD : nVar);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InviteCampaignHomeFeatureConfig(ActivityAnimation activityAnimation, boolean z, boolean z3, String str, n referralCampaignV4Type) {
            super(activityAnimation, new InviteCampaignHomeNavigationDestination(str, referralCampaignV4Type, z, z3), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.f81832g = activityAnimation;
            this.f81833h = z;
            this.i = z3;
            this.f81834j = str;
            this.k = referralCampaignV4Type;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$InviteCampaignHomeNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InviteCampaignHomeNavigationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<InviteCampaignHomeNavigationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f81835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81837c;
        public final n d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InviteCampaignHomeNavigationDestination(parcel.readString(), n.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InviteCampaignHomeNavigationDestination[i];
            }
        }

        public InviteCampaignHomeNavigationDestination() {
            this(false, false, null, null, 15);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InviteCampaignHomeNavigationDestination)) {
                return false;
            }
            InviteCampaignHomeNavigationDestination inviteCampaignHomeNavigationDestination = (InviteCampaignHomeNavigationDestination) obj2;
            return this.f81835a == inviteCampaignHomeNavigationDestination.f81835a && this.f81836b == inviteCampaignHomeNavigationDestination.f81836b && Intrinsics.f(this.f81837c, inviteCampaignHomeNavigationDestination.f81837c) && this.d == inviteCampaignHomeNavigationDestination.d;
        }

        public final int hashCode() {
            int iC = j6.a.c(Boolean.hashCode(this.f81835a) * 31, 31, this.f81836b);
            String str = this.f81837c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f81835a ? 1 : 0);
            dest.writeInt(this.f81836b ? 1 : 0);
            dest.writeString(this.f81837c);
            dest.writeString(this.d.name());
        }

        public InviteCampaignHomeNavigationDestination(String str, n referralCampaignV4Type, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(referralCampaignV4Type, "referralCampaignV4Type");
            this.f81835a = z;
            this.f81836b = z3;
            this.f81837c = str;
            this.d = referralCampaignV4Type;
        }

        public /* synthetic */ InviteCampaignHomeNavigationDestination(boolean z, boolean z3, String str, n nVar, int i) {
            this((i & 4) != 0 ? null : str, (i & 8) != 0 ? n.STANDARD : nVar, (i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z3);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$ReferralsTroubleshooterNavigationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReferralsTroubleshooterNavigationDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReferralsTroubleshooterNavigationDestination f81838a = new ReferralsTroubleshooterNavigationDestination();

        @NotNull
        public static final Parcelable.Creator<ReferralsTroubleshooterNavigationDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReferralsTroubleshooterNavigationDestination.f81838a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReferralsTroubleshooterNavigationDestination[i];
            }
        }

        private ReferralsTroubleshooterNavigationDestination() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof ReferralsTroubleshooterNavigationDestination);
        }

        public final int hashCode() {
            return 219769707;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/referrals/shared/ui/api/navigation/ReferralsBizFeatureConfig$SalaryReferralIneligibleDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SalaryReferralIneligibleDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SalaryReferralIneligibleDestination f81839a = new SalaryReferralIneligibleDestination();

        @NotNull
        public static final Parcelable.Creator<SalaryReferralIneligibleDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SalaryReferralIneligibleDestination.f81839a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SalaryReferralIneligibleDestination[i];
            }
        }

        private SalaryReferralIneligibleDestination() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof SalaryReferralIneligibleDestination);
        }

        public final int hashCode() {
            return 442268943;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
