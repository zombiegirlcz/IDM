package com.revolut.feature.profile.impl.ui.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.profile.impl.ui.profile.screens.notification_setting_details.NotificationSettingsDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"com/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ProfileMain", "Account", "PublicExperiments", "AppSettings", "AutoEarnRewards", "ThemeCustomisation", "AboutUs", "NotificationSettings", "Settings", "NotificationSettingDetails", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AboutUs;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$Account;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AppSettings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AutoEarnRewards;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$NotificationSettingDetails;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$NotificationSettings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$ProfileMain;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$PublicExperiments;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$Settings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$ThemeCustomisation;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProfileFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AboutUs;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AboutUs extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AboutUs f81422a = new AboutUs();

        @NotNull
        public static final Parcelable.Creator<AboutUs> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AboutUs.f81422a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AboutUs[i];
            }
        }

        private AboutUs() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$Account;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Account extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Account f81423a = new Account();

        @NotNull
        public static final Parcelable.Creator<Account> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Account.f81423a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Account[i];
            }
        }

        private Account() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AppSettings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppSettings extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppSettings f81424a = new AppSettings();

        @NotNull
        public static final Parcelable.Creator<AppSettings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppSettings.f81424a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppSettings[i];
            }
        }

        private AppSettings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$AutoEarnRewards;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AutoEarnRewards extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AutoEarnRewards f81425a = new AutoEarnRewards();

        @NotNull
        public static final Parcelable.Creator<AutoEarnRewards> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AutoEarnRewards.f81425a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AutoEarnRewards[i];
            }
        }

        private AutoEarnRewards() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$NotificationSettingDetails;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotificationSettingDetails extends ProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NotificationSettingDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NotificationSettingsDetails f81426a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotificationSettingDetails(NotificationSettingsDetails.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationSettingDetails[i];
            }
        }

        public NotificationSettingDetails(NotificationSettingsDetails details) {
            Intrinsics.checkNotNullParameter(details, "details");
            this.f81426a = details;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotificationSettingDetails) && Intrinsics.f(this.f81426a, ((NotificationSettingDetails) obj2).f81426a);
        }

        public final int hashCode() {
            return this.f81426a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f81426a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$ProfileMain;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProfileMain extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProfileMain f81428a = new ProfileMain();

        @NotNull
        public static final Parcelable.Creator<ProfileMain> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProfileMain.f81428a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProfileMain[i];
            }
        }

        private ProfileMain() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$PublicExperiments;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PublicExperiments extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PublicExperiments f81429a = new PublicExperiments();

        @NotNull
        public static final Parcelable.Creator<PublicExperiments> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PublicExperiments.f81429a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PublicExperiments[i];
            }
        }

        private PublicExperiments() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$Settings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Settings extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Settings f81430a = new Settings();

        @NotNull
        public static final Parcelable.Creator<Settings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Settings.f81430a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Settings[i];
            }
        }

        private Settings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$ThemeCustomisation;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "<init>", "()V", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThemeCustomisation extends ProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThemeCustomisation f81431a = new ThemeCustomisation();

        @NotNull
        public static final Parcelable.Creator<ThemeCustomisation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThemeCustomisation.f81431a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemeCustomisation[i];
            }
        }

        private ThemeCustomisation() {
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

    private ProfileFlowContract$Step() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step$NotificationSettings;", "Lcom/revolut/feature/profile/impl/ui/profile/ProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NotificationSettings extends ProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NotificationSettings> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f81427a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NotificationSettings((Clause) parcel.readParcelable(NotificationSettings.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NotificationSettings[i];
            }
        }

        public NotificationSettings(Clause clause) {
            this.f81427a = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NotificationSettings) && Intrinsics.f(this.f81427a, ((NotificationSettings) obj2).f81427a);
        }

        public final int hashCode() {
            Clause clause = this.f81427a;
            if (clause == null) {
                return 0;
            }
            return clause.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f81427a, i);
        }

        public NotificationSettings() {
            this(null);
        }
    }
}
