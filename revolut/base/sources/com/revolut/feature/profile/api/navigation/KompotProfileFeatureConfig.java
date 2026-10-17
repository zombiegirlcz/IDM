package com.revolut.feature.profile.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import soa.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "Settings", "AppSettings", "SelfTermination", "SettingsDestination", "NotificationSettingDetailsDestination", "AppSettingsDestination", "ProfileAccountDestination", "AppearanceDestination", "AppInterfaceDestination", "ExperimentsDestination", "DocumentsDestination", "ProfileAddressDestination", "SelfTerminationDestination", "NotificationSettingsDestination", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$AppSettings;", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$SelfTermination;", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$Settings;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KompotProfileFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$AppInterfaceDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppInterfaceDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppInterfaceDestination f81327a = new AppInterfaceDestination();

        @NotNull
        public static final Parcelable.Creator<AppInterfaceDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppInterfaceDestination.f81327a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppInterfaceDestination[i];
            }
        }

        private AppInterfaceDestination() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$AppSettings;", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppSettings extends KompotProfileFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AppSettings f81328g = new AppSettings();

        @NotNull
        public static final Parcelable.Creator<AppSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppSettings.f81328g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppSettings[i];
            }
        }

        private AppSettings() {
            super(AppSettingsDestination.f81329a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$AppSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppSettingsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppSettingsDestination f81329a = new AppSettingsDestination();

        @NotNull
        public static final Parcelable.Creator<AppSettingsDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppSettingsDestination.f81329a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppSettingsDestination[i];
            }
        }

        private AppSettingsDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$AppearanceDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppearanceDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppearanceDestination f81330a = new AppearanceDestination();

        @NotNull
        public static final Parcelable.Creator<AppearanceDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppearanceDestination.f81330a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppearanceDestination[i];
            }
        }

        private AppearanceDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$DocumentsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<DocumentsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DocumentsPage f81331a;

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsDestination((DocumentsPage) parcel.readParcelable(DocumentsDestination.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsDestination[i];
            }
        }

        public DocumentsDestination() {
            this(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsDestination) && Intrinsics.f(this.f81331a, ((DocumentsDestination) obj2).f81331a);
        }

        public final int hashCode() {
            return this.f81331a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81331a, i);
        }

        public DocumentsDestination(DocumentsPage page) {
            Intrinsics.checkNotNullParameter(page, "page");
            this.f81331a = page;
        }

        public /* synthetic */ DocumentsDestination(int i) {
            this(DocumentsPage.DocumentList.f81297a);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$ExperimentsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExperimentsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ExperimentsDestination f81332a = new ExperimentsDestination();

        @NotNull
        public static final Parcelable.Creator<ExperimentsDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExperimentsDestination.f81332a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExperimentsDestination[i];
            }
        }

        private ExperimentsDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$NotificationSettingDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotificationSettingDetailsDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<NotificationSettingDetailsDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f81333a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotificationSettingDetailsDestination((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationSettingDetailsDestination[i];
            }
        }

        public NotificationSettingDetailsDestination(b setting) {
            Intrinsics.checkNotNullParameter(setting, "setting");
            this.f81333a = setting;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotificationSettingDetailsDestination) && Intrinsics.f(this.f81333a, ((NotificationSettingDetailsDestination) obj2).f81333a);
        }

        public final int hashCode() {
            return this.f81333a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81333a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$NotificationSettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NotificationSettingsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NotificationSettingsDestination f81334a = new NotificationSettingsDestination();

        @NotNull
        public static final Parcelable.Creator<NotificationSettingsDestination> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NotificationSettingsDestination.f81334a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationSettingsDestination[i];
            }
        }

        private NotificationSettingsDestination() {
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

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$ProfileAccountDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfileAccountDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileAccountDestination f81335a = new ProfileAccountDestination();

        @NotNull
        public static final Parcelable.Creator<ProfileAccountDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfileAccountDestination.f81335a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileAccountDestination[i];
            }
        }

        private ProfileAccountDestination() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$SelfTermination;", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfTermination extends KompotProfileFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<SelfTermination> CREATOR = new a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f81337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f81338h;
        public final boolean i;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfTermination(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfTermination[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelfTermination(String closeAccountDeeplink, String str, boolean z) {
            super(new SelfTerminationDestination(closeAccountDeeplink, str, z));
            Intrinsics.checkNotNullParameter(closeAccountDeeplink, "closeAccountDeeplink");
            this.f81337g = closeAccountDeeplink;
            this.f81338h = str;
            this.i = z;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelfTermination)) {
                return false;
            }
            SelfTermination selfTermination = (SelfTermination) obj2;
            return Intrinsics.f(this.f81337g, selfTermination.f81337g) && Intrinsics.f(this.f81338h, selfTermination.f81338h) && this.i == selfTermination.i;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            int iHashCode = this.f81337g.hashCode() * 31;
            String str = this.f81338h;
            return Boolean.hashCode(this.i) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81337g);
            dest.writeString(this.f81338h);
            dest.writeInt(this.i ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$SelfTerminationDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfTerminationDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<SelfTerminationDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f81341c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfTerminationDestination(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfTerminationDestination[i];
            }
        }

        public SelfTerminationDestination(String closeAccountDeeplink, String str, boolean z) {
            Intrinsics.checkNotNullParameter(closeAccountDeeplink, "closeAccountDeeplink");
            this.f81339a = closeAccountDeeplink;
            this.f81340b = str;
            this.f81341c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SelfTerminationDestination)) {
                return false;
            }
            SelfTerminationDestination selfTerminationDestination = (SelfTerminationDestination) obj2;
            return Intrinsics.f(this.f81339a, selfTerminationDestination.f81339a) && Intrinsics.f(this.f81340b, selfTerminationDestination.f81340b) && this.f81341c == selfTerminationDestination.f81341c;
        }

        public final int hashCode() {
            int iHashCode = this.f81339a.hashCode() * 31;
            String str = this.f81340b;
            return Boolean.hashCode(this.f81341c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81339a);
            dest.writeString(this.f81340b);
            dest.writeInt(this.f81341c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$Settings;", "Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends KompotProfileFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Settings f81342g = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f81342g;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
            super(SettingsDestination.f81343a);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: loaded from: classes13.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$SettingsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SettingsDestination implements KompotDestination {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SettingsDestination f81343a = new SettingsDestination();

        @NotNull
        public static final Parcelable.Creator<SettingsDestination> CREATOR = new a();

        /* JADX INFO: loaded from: classes5.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SettingsDestination.f81343a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SettingsDestination[i];
            }
        }

        private SettingsDestination() {
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

    public KompotProfileFeatureConfig(KompotDestination kompotDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) kompotDestination, false, (Integer) null, 0, 60);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/api/navigation/KompotProfileFeatureConfig$ProfileAddressDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProfileAddressDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<ProfileAddressDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f81336a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProfileAddressDestination(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileAddressDestination[i];
            }
        }

        public ProfileAddressDestination(boolean z) {
            this.f81336a = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProfileAddressDestination) && this.f81336a == ((ProfileAddressDestination) obj2).f81336a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f81336a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f81336a ? 1 : 0);
        }

        public ProfileAddressDestination() {
            this(true);
        }
    }
}
