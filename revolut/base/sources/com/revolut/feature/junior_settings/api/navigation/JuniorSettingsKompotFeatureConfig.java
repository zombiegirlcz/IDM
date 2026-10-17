package com.revolut.feature.junior_settings.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "DefaultDestination", "SecurityAndPrivacyDestination", "SecurityAndPrivacy", "InitialStep", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$SecurityAndPrivacy;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorSettingsKompotFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$DefaultDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefaultDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DefaultDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InitialStep f77259b;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DefaultDestination(parcel.readString(), (InitialStep) parcel.readParcelable(DefaultDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultDestination[i];
            }
        }

        public DefaultDestination(String juniorId, InitialStep initialStep) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(initialStep, "initialStep");
            this.f77258a = juniorId;
            this.f77259b = initialStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DefaultDestination)) {
                return false;
            }
            DefaultDestination defaultDestination = (DefaultDestination) obj2;
            return Intrinsics.f(this.f77258a, defaultDestination.f77258a) && Intrinsics.f(this.f77259b, defaultDestination.f77259b);
        }

        public final int hashCode() {
            return this.f77259b.hashCode() + (this.f77258a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77258a);
            dest.writeParcelable(this.f77259b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep;", "Landroid/os/Parcelable;", "Home", "SecurityAndPrivacy", "AppAccess", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$AppAccess;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$Home;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$SecurityAndPrivacy;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InitialStep extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$AppAccess;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep;", "<init>", "()V", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AppAccess implements InitialStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AppAccess f77260a = new AppAccess();

            @NotNull
            public static final Parcelable.Creator<AppAccess> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AppAccess.f77260a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AppAccess[i];
                }
            }

            private AppAccess() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$Home;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep;", "<init>", "()V", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Home implements InitialStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Home f77261a = new Home();

            @NotNull
            public static final Parcelable.Creator<Home> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Home.f77261a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Home[i];
                }
            }

            private Home() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep$SecurityAndPrivacy;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$InitialStep;", "<init>", "()V", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SecurityAndPrivacy implements InitialStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SecurityAndPrivacy f77262a = new SecurityAndPrivacy();

            @NotNull
            public static final Parcelable.Creator<SecurityAndPrivacy> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SecurityAndPrivacy.f77262a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SecurityAndPrivacy[i];
                }
            }

            private SecurityAndPrivacy() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$SecurityAndPrivacy;", "Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityAndPrivacy extends JuniorSettingsKompotFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f77263g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecurityAndPrivacy(String juniorId) {
            super(null, new SecurityAndPrivacyDestination(juniorId), false, null, 0, 60);
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f77263g = juniorId;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SecurityAndPrivacy) && Intrinsics.f(this.f77263g, ((SecurityAndPrivacy) obj2).f77263g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f77263g.hashCode();
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_settings/api/navigation/JuniorSettingsKompotFeatureConfig$SecurityAndPrivacyDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_settings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecurityAndPrivacyDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SecurityAndPrivacyDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77264a;

        /* JADX INFO: loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecurityAndPrivacyDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecurityAndPrivacyDestination[i];
            }
        }

        public SecurityAndPrivacyDestination(String juniorId) {
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            this.f77264a = juniorId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SecurityAndPrivacyDestination) && Intrinsics.f(this.f77264a, ((SecurityAndPrivacyDestination) obj2).f77264a);
        }

        public final int hashCode() {
            return this.f77264a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77264a);
        }
    }
}
