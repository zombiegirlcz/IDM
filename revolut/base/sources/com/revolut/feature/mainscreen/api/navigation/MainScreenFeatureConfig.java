package com.revolut.feature.mainscreen.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "Lcom/revolut/retail/core/navigation/feature/FeatureConfig;", "Companion", "WithInnerConfiguration", "JustShow", "AppEntry", "StartFromOutside", "WithAction", "s49/a", "a", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$AppEntry;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$JustShow;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$StartFromOutside;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$WithAction;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$WithInnerConfiguration;", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class MainScreenFeatureConfig implements FeatureConfig {

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$AppEntry;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "<init>", "()V", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppEntry extends MainScreenFeatureConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppEntry f78069a = new AppEntry();

        @NotNull
        public static final Parcelable.Creator<AppEntry> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppEntry.f78069a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppEntry[i];
            }
        }

        private AppEntry() {
            s49.a aVar = s49.a.AS_TOP;
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

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$JustShow;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class JustShow extends MainScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<JustShow> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s49.a f78070a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new JustShow(s49.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new JustShow[i];
            }
        }

        public JustShow(s49.a launchMode) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            this.f78070a = launchMode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof JustShow) && this.f78070a == ((JustShow) obj2).f78070a;
        }

        public final int hashCode() {
            return this.f78070a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78070a.name());
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$StartFromOutside;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StartFromOutside extends MainScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<StartFromOutside> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MainContainerNavigationId.MainContainerScreenId f78071a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StartFromOutside((MainContainerNavigationId.MainContainerScreenId) parcel.readParcelable(StartFromOutside.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StartFromOutside[i];
            }
        }

        public StartFromOutside(MainContainerNavigationId.MainContainerScreenId screenId) {
            Intrinsics.checkNotNullParameter(screenId, "screenId");
            s49.a aVar = s49.a.AS_TOP;
            this.f78071a = screenId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StartFromOutside) && Intrinsics.f(this.f78071a, ((StartFromOutside) obj2).f78071a);
        }

        public final int hashCode() {
            return this.f78071a.f78082a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78071a, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$WithAction;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithAction extends MainScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<WithAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s49.a f78072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MainContainerActionData f78073b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithAction(s49.a.valueOf(parcel.readString()), (MainContainerActionData) parcel.readParcelable(WithAction.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithAction[i];
            }
        }

        public WithAction(s49.a launchMode, MainContainerActionData actionData) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(actionData, "actionData");
            this.f78072a = launchMode;
            this.f78073b = actionData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithAction)) {
                return false;
            }
            WithAction withAction = (WithAction) obj2;
            return this.f78072a == withAction.f78072a && Intrinsics.f(this.f78073b, withAction.f78073b);
        }

        public final int hashCode() {
            return this.f78073b.hashCode() + (this.f78072a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78072a.name());
            dest.writeParcelable(this.f78073b, i);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig$WithInnerConfiguration;", "Lcom/revolut/feature/mainscreen/api/navigation/MainScreenFeatureConfig;", "", "toString", "()Ljava/lang/String;", "retail_feature_main_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithInnerConfiguration extends MainScreenFeatureConfig {

        @NotNull
        public static final Parcelable.Creator<WithInnerConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s49.a f78074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MainContainerInnerConfiguration f78075b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithInnerConfiguration(s49.a.valueOf(parcel.readString()), (MainContainerInnerConfiguration) parcel.readParcelable(WithInnerConfiguration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithInnerConfiguration[i];
            }
        }

        public WithInnerConfiguration(s49.a launchMode, MainContainerInnerConfiguration innerConfiguration) {
            Intrinsics.checkNotNullParameter(launchMode, "launchMode");
            Intrinsics.checkNotNullParameter(innerConfiguration, "innerConfiguration");
            this.f78074a = launchMode;
            this.f78075b = innerConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof WithInnerConfiguration)) {
                return false;
            }
            WithInnerConfiguration withInnerConfiguration = (WithInnerConfiguration) obj2;
            return this.f78074a == withInnerConfiguration.f78074a && Intrinsics.f(this.f78075b, withInnerConfiguration.f78075b);
        }

        public final int hashCode() {
            return this.f78075b.hashCode() + (this.f78074a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f78074a.name());
            dest.writeParcelable(this.f78075b, i);
        }
    }
}
