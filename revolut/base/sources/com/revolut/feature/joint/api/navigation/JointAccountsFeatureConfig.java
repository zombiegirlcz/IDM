package com.revolut.feature.joint.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.joint.api.models.JointDeeplink;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n38.d0;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Deeplink", "WithdrawFlow", "Invite", "Limits", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Invite;", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Limits;", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$WithdrawFlow;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JointAccountsFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Deeplink;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Deeplink implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<Deeplink> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JointDeeplink f76489a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Deeplink((JointDeeplink) parcel.readParcelable(Deeplink.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Deeplink[i];
            }
        }

        public Deeplink(JointDeeplink deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.f76489a = deeplink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Deeplink) && Intrinsics.f(this.f76489a, ((Deeplink) obj2).f76489a);
        }

        public final int hashCode() {
            return this.f76489a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76489a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Invite;", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Invite extends JointAccountsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final d0 f76490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f76491h;

        public Invite() {
            this((d0) null, 3);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Invite)) {
                return false;
            }
            Invite invite = (Invite) obj2;
            return Intrinsics.f(this.f76490g, invite.f76490g) && this.f76491h == invite.f76491h;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            d0 d0Var = this.f76490g;
            return Boolean.hashCode(this.f76491h) + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
        }

        public /* synthetic */ Invite(d0 d0Var, int i) {
            this((i & 1) != 0 ? null : d0Var, false);
        }

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Invite$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f76492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f76493b;

            /* JADX INFO: loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((d0) parcel.readSerializable(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(d0 d0Var, boolean z) {
                this.f76492a = d0Var;
                this.f76493b = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f76492a, destination.f76492a) && this.f76493b == destination.f76493b;
            }

            public final int hashCode() {
                d0 d0Var = this.f76492a;
                return Boolean.hashCode(this.f76493b) + ((d0Var == null ? 0 : d0Var.hashCode()) * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f76492a);
                dest.writeInt(this.f76493b ? 1 : 0);
            }

            public /* synthetic */ Destination() {
                this(null, false);
            }
        }

        public Invite(d0 d0Var, boolean z) {
            super(new Destination(d0Var, z));
            this.f76490g = d0Var;
            this.f76491h = z;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Limits;", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limits extends JointAccountsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final AccountId.Joint f76494g;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$Limits$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AccountId.Joint f76495a;

            /* JADX INFO: loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((AccountId.Joint) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(AccountId.Joint accountId) {
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f76495a = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Destination) && Intrinsics.f(this.f76495a, ((Destination) obj2).f76495a);
            }

            public final int hashCode() {
                return this.f76495a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f76495a, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Limits(AccountId.Joint accountId) {
            super(new Destination(accountId));
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f76494g = accountId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Limits) && Intrinsics.f(this.f76494g, ((Limits) obj2).f76494g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f76494g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$WithdrawFlow;", "Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig;", "", "toString", "()Ljava/lang/String;", "Destination", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithdrawFlow extends JointAccountsFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f76496g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AccountId f76497h;

        /* JADX INFO: loaded from: classes13.dex */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/joint/api/navigation/JointAccountsFeatureConfig$WithdrawFlow$Destination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_joint_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Destination implements KompotDestination {

            @NotNull
            public static final Parcelable.Creator<Destination> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f76498a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AccountId f76499b;

            /* JADX INFO: loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Destination((b) parcel.readSerializable(), (AccountId) parcel.readParcelable(Destination.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Destination[i];
                }
            }

            public Destination(b currency, AccountId accountId) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(accountId, "accountId");
                this.f76498a = currency;
                this.f76499b = accountId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Destination)) {
                    return false;
                }
                Destination destination = (Destination) obj2;
                return Intrinsics.f(this.f76498a, destination.f76498a) && Intrinsics.f(this.f76499b, destination.f76499b);
            }

            public final int hashCode() {
                return this.f76499b.hashCode() + (this.f76498a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.f76498a);
                dest.writeParcelable(this.f76499b, i);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithdrawFlow(b currency, AccountId.Joint accountId) {
            super(new Destination(currency, accountId));
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            this.f76496g = currency;
            this.f76497h = accountId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithdrawFlow)) {
                return false;
            }
            WithdrawFlow withdrawFlow = (WithdrawFlow) obj2;
            return Intrinsics.f(this.f76496g, withdrawFlow.f76496g) && Intrinsics.f(this.f76497h, withdrawFlow.f76497h);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f76497h.hashCode() + (this.f76496g.hashCode() * 31);
        }
    }

    public JointAccountsFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    /* JADX INFO: renamed from: a */
    public final ActivityAnimation getF98953g() {
        return null;
    }
}
