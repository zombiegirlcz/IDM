package com.revolut.retail.common.ui.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.abexperiments.models.Experiment;
import com.revolut.feature.abexperiments.models.ReleaseFlagExperiment;
import com.revolut.feature.toggles.models.DevelopmentOnlyFeatureDefinition;
import com.revolut.feature.toggles.models.LocalFeatureState;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class Toggles {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$AccountDetailsSurfacing;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountDetailsSurfacing extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AccountDetailsSurfacing f98561c = new AccountDetailsSurfacing();

        @NotNull
        public static final Parcelable.Creator<AccountDetailsSurfacing> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountDetailsSurfacing.f98561c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountDetailsSurfacing[i];
            }
        }

        private AccountDetailsSurfacing() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("accountDetailsSurfacing");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$AmountV2;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountV2 extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final AmountV2 f98562c = new AmountV2();

        @NotNull
        public static final Parcelable.Creator<AmountV2> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountV2.f98562c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountV2[i];
            }
        }

        private AmountV2() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("newAmountScreen");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$BarrelAnimationUpdate;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BarrelAnimationUpdate extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final BarrelAnimationUpdate f98563c = new BarrelAnimationUpdate();

        @NotNull
        public static final Parcelable.Creator<BarrelAnimationUpdate> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return BarrelAnimationUpdate.f98563c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BarrelAnimationUpdate[i];
            }
        }

        private BarrelAnimationUpdate() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("barrelAnimationUpdate");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ChartsRedesign;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ChartsRedesign extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ChartsRedesign f98564c = new ChartsRedesign();

        @NotNull
        public static final Parcelable.Creator<ChartsRedesign> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ChartsRedesign.f98564c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChartsRedesign[i];
            }
        }

        private ChartsRedesign() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chartsRedesign");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ControllerStatusDialogDisplayer;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ControllerStatusDialogDisplayer extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ControllerStatusDialogDisplayer f98565c = new ControllerStatusDialogDisplayer();

        @NotNull
        public static final Parcelable.Creator<ControllerStatusDialogDisplayer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ControllerStatusDialogDisplayer.f98565c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ControllerStatusDialogDisplayer[i];
            }
        }

        private ControllerStatusDialogDisplayer() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("androidControllerStatusDialogDisplayer2");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$CustomNumericKeyboard;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CustomNumericKeyboard extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final CustomNumericKeyboard f98566c = new CustomNumericKeyboard();

        @NotNull
        public static final Parcelable.Creator<CustomNumericKeyboard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CustomNumericKeyboard.f98566c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomNumericKeyboard[i];
            }
        }

        private CustomNumericKeyboard() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("customNumericKeyboard");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$DeeplinkRestrictions;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeeplinkRestrictions extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final DeeplinkRestrictions f98567c = new DeeplinkRestrictions();

        @NotNull
        public static final Parcelable.Creator<DeeplinkRestrictions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeeplinkRestrictions.f98567c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeeplinkRestrictions[i];
            }
        }

        private DeeplinkRestrictions() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("deeplinkRestrictions");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$EdgeToEdgeContent;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EdgeToEdgeContent extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EdgeToEdgeContent f98568c = new EdgeToEdgeContent();

        @NotNull
        public static final Parcelable.Creator<EdgeToEdgeContent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EdgeToEdgeContent.f98568c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EdgeToEdgeContent[i];
            }
        }

        private EdgeToEdgeContent() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("edgeToEdgeContent");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ExpandableAnimation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ExpandableAnimation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ExpandableAnimation f98569c = new ExpandableAnimation();

        @NotNull
        public static final Parcelable.Creator<ExpandableAnimation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ExpandableAnimation.f98569c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExpandableAnimation[i];
            }
        }

        private ExpandableAnimation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("expandableAnimation2");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$FadeInLoading;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FadeInLoading extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FadeInLoading f98570c = new FadeInLoading();

        @NotNull
        public static final Parcelable.Creator<FadeInLoading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FadeInLoading.f98570c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FadeInLoading[i];
            }
        }

        private FadeInLoading() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("fadeInLoading");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ForceRuntimeBlurUnsupported;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ForceRuntimeBlurUnsupported extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ForceRuntimeBlurUnsupported f98571a = new ForceRuntimeBlurUnsupported();

        @NotNull
        public static final Parcelable.Creator<ForceRuntimeBlurUnsupported> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ForceRuntimeBlurUnsupported.f98571a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ForceRuntimeBlurUnsupported[i];
            }
        }

        private ForceRuntimeBlurUnsupported() {
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        /* JADX INFO: renamed from: T3 */
        public final boolean getF71625b() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$FullScreenWallpapers;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FullScreenWallpapers extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final FullScreenWallpapers f98572c = new FullScreenWallpapers();

        @NotNull
        public static final Parcelable.Creator<FullScreenWallpapers> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FullScreenWallpapers.f98572c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FullScreenWallpapers[i];
            }
        }

        private FullScreenWallpapers() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("fullScreenWallpapers");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$HideableTabBarLabels;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class HideableTabBarLabels extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final HideableTabBarLabels f98573c = new HideableTabBarLabels();

        @NotNull
        public static final Parcelable.Creator<HideableTabBarLabels> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return HideableTabBarLabels.f98573c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new HideableTabBarLabels[i];
            }
        }

        private HideableTabBarLabels() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("hiddableTabBar");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$IconsRedesign;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconsRedesign extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final IconsRedesign f98574c = new IconsRedesign();

        @NotNull
        public static final Parcelable.Creator<IconsRedesign> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IconsRedesign.f98574c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IconsRedesign[i];
            }
        }

        private IconsRedesign() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("iconsV2");
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$KompotPersistentModelStorage;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KompotPersistentModelStorage extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KompotPersistentModelStorage f98575a = new KompotPersistentModelStorage();

        @NotNull
        public static final Parcelable.Creator<KompotPersistentModelStorage> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KompotPersistentModelStorage.f98575a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KompotPersistentModelStorage[i];
            }
        }

        private KompotPersistentModelStorage() {
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        /* JADX INFO: renamed from: T3 */
        public final boolean getF71625b() {
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$LineChartsRedesign;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LineChartsRedesign extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final LineChartsRedesign f98576c = new LineChartsRedesign();

        @NotNull
        public static final Parcelable.Creator<LineChartsRedesign> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return LineChartsRedesign.f98576c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LineChartsRedesign[i];
            }
        }

        private LineChartsRedesign() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("chartDesignUpdates2026");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$MaskedInputCommitTextFix;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MaskedInputCommitTextFix extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MaskedInputCommitTextFix f98577c = new MaskedInputCommitTextFix();

        @NotNull
        public static final Parcelable.Creator<MaskedInputCommitTextFix> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MaskedInputCommitTextFix.f98577c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MaskedInputCommitTextFix[i];
            }
        }

        private MaskedInputCommitTextFix() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("maskedInputCommitTextFix");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$MediaPickerCropPhotoDocument;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MediaPickerCropPhotoDocument extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MediaPickerCropPhotoDocument f98578c = new MediaPickerCropPhotoDocument();

        @NotNull
        public static final Parcelable.Creator<MediaPickerCropPhotoDocument> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MediaPickerCropPhotoDocument.f98578c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MediaPickerCropPhotoDocument[i];
            }
        }

        private MediaPickerCropPhotoDocument() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("mediaPickerCropPhotoDocument");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$MoveMoneyFaceliftGlobal;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MoveMoneyFaceliftGlobal extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final MoveMoneyFaceliftGlobal f98579c = new MoveMoneyFaceliftGlobal();

        @NotNull
        public static final Parcelable.Creator<MoveMoneyFaceliftGlobal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MoveMoneyFaceliftGlobal.f98579c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoveMoneyFaceliftGlobal[i];
            }
        }

        private MoveMoneyFaceliftGlobal() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("moveMoneyFaceliftGlobal");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ParticlesTheme;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ParticlesTheme extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ParticlesTheme f98580c = new ParticlesTheme();

        @NotNull
        public static final Parcelable.Creator<ParticlesTheme> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ParticlesTheme.f98580c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ParticlesTheme[i];
            }
        }

        private ParticlesTheme() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("particlesThemeEnabled");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$PaymentsChatVisualEnhancements;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentsChatVisualEnhancements extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final PaymentsChatVisualEnhancements f98581c = new PaymentsChatVisualEnhancements();

        @NotNull
        public static final Parcelable.Creator<PaymentsChatVisualEnhancements> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PaymentsChatVisualEnhancements.f98581c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentsChatVisualEnhancements[i];
            }
        }

        private PaymentsChatVisualEnhancements() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("paymentsChatVisualEnhancements");
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ProductIntrosDebugMode;", "Lcom/revolut/feature/toggles/models/DevelopmentOnlyFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductIntrosDebugMode extends DevelopmentOnlyFeatureDefinition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductIntrosDebugMode f98582a = new ProductIntrosDebugMode();

        @NotNull
        public static final Parcelable.Creator<ProductIntrosDebugMode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductIntrosDebugMode.f98582a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductIntrosDebugMode[i];
            }
        }

        private ProductIntrosDebugMode() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.toggles.models.FeatureDefinition
        public final LocalFeatureState s5() {
            return new LocalFeatureState.Binary(false);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ProgressiveBlurNavigation;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProgressiveBlurNavigation extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ProgressiveBlurNavigation f98583c = new ProgressiveBlurNavigation();

        @NotNull
        public static final Parcelable.Creator<ProgressiveBlurNavigation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProgressiveBlurNavigation.f98583c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProgressiveBlurNavigation[i];
            }
        }

        private ProgressiveBlurNavigation() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("progressiveBlurNavigation");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ReflectiveSurface;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReflectiveSurface extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ReflectiveSurface f98584c = new ReflectiveSurface();

        @NotNull
        public static final Parcelable.Creator<ReflectiveSurface> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReflectiveSurface.f98584c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReflectiveSurface[i];
            }
        }

        private ReflectiveSurface() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("reflectiveSurface");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$RevampedPlanBackgrounds;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevampedPlanBackgrounds extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final RevampedPlanBackgrounds f98585c = new RevampedPlanBackgrounds();

        @NotNull
        public static final Parcelable.Creator<RevampedPlanBackgrounds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevampedPlanBackgrounds.f98585c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevampedPlanBackgrounds[i];
            }
        }

        private RevampedPlanBackgrounds() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("revampedPlanBackgrounds");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ScrollFooterRefinement;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ScrollFooterRefinement extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ScrollFooterRefinement f98586c = new ScrollFooterRefinement();

        @NotNull
        public static final Parcelable.Creator<ScrollFooterRefinement> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ScrollFooterRefinement.f98586c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScrollFooterRefinement[i];
            }
        }

        private ScrollFooterRefinement() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("scrollFooterRefinement");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$SeasonalPasscodeGreeting;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeasonalPasscodeGreeting extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SeasonalPasscodeGreeting f98587c = new SeasonalPasscodeGreeting();

        @NotNull
        public static final Parcelable.Creator<SeasonalPasscodeGreeting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeasonalPasscodeGreeting.f98587c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeasonalPasscodeGreeting[i];
            }
        }

        private SeasonalPasscodeGreeting() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("seasonalPasscodeGreeting");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$SwipeActionsRevamp;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SwipeActionsRevamp extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SwipeActionsRevamp f98588c = new SwipeActionsRevamp();

        @NotNull
        public static final Parcelable.Creator<SwipeActionsRevamp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SwipeActionsRevamp.f98588c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwipeActionsRevamp[i];
            }
        }

        private SwipeActionsRevamp() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("swipeActionsRevamp");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$SwipeableMainScreenOverlays;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SwipeableMainScreenOverlays extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final SwipeableMainScreenOverlays f98589c = new SwipeableMainScreenOverlays();

        @NotNull
        public static final Parcelable.Creator<SwipeableMainScreenOverlays> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SwipeableMainScreenOverlays.f98589c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SwipeableMainScreenOverlays[i];
            }
        }

        private SwipeableMainScreenOverlays() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("swipeableMainScreenOverlays");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$TabBarGlowingBorder;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TabBarGlowingBorder extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TabBarGlowingBorder f98590c = new TabBarGlowingBorder();

        @NotNull
        public static final Parcelable.Creator<TabBarGlowingBorder> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TabBarGlowingBorder.f98590c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TabBarGlowingBorder[i];
            }
        }

        private TabBarGlowingBorder() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("tabBarGlowingBorder");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$TabBarInteractivity;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TabBarInteractivity extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TabBarInteractivity f98591c = new TabBarInteractivity();

        @NotNull
        public static final Parcelable.Creator<TabBarInteractivity> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TabBarInteractivity.f98591c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TabBarInteractivity[i];
            }
        }

        private TabBarInteractivity() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("tabBarInteractivity");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$TitleTransition;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TitleTransition extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TitleTransition f98592c = new TitleTransition();

        @NotNull
        public static final Parcelable.Creator<TitleTransition> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TitleTransition.f98592c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TitleTransition[i];
            }
        }

        private TitleTransition() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("titleTransition");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$ToolboxPopupMenu;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ToolboxPopupMenu extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final ToolboxPopupMenu f98593c = new ToolboxPopupMenu();

        @NotNull
        public static final Parcelable.Creator<ToolboxPopupMenu> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ToolboxPopupMenu.f98593c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ToolboxPopupMenu[i];
            }
        }

        private ToolboxPopupMenu() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("toolboxPopupMenu");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$TransparentPaletteEverywhere;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransparentPaletteEverywhere extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final TransparentPaletteEverywhere f98594c = new TransparentPaletteEverywhere();

        @NotNull
        public static final Parcelable.Creator<TransparentPaletteEverywhere> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransparentPaletteEverywhere.f98594c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransparentPaletteEverywhere[i];
            }
        }

        private TransparentPaletteEverywhere() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("transparentPaletteEverywhere");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$UnifiedAvatarsBackgrounds;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnifiedAvatarsBackgrounds extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final UnifiedAvatarsBackgrounds f98595c = new UnifiedAvatarsBackgrounds();

        @NotNull
        public static final Parcelable.Creator<UnifiedAvatarsBackgrounds> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UnifiedAvatarsBackgrounds.f98595c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UnifiedAvatarsBackgrounds[i];
            }
        }

        private UnifiedAvatarsBackgrounds() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("unifiedAvatarsBackgrounds");
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/common/ui/api/Toggles$WorldCupPasscodeGreeting;", "Lcom/revolut/feature/toggles/models/RemoteFeatureDefinition;", "<init>", "()V", "retail_common_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WorldCupPasscodeGreeting extends RemoteFeatureDefinition {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final WorldCupPasscodeGreeting f98596c = new WorldCupPasscodeGreeting();

        @NotNull
        public static final Parcelable.Creator<WorldCupPasscodeGreeting> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WorldCupPasscodeGreeting.f98596c;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WorldCupPasscodeGreeting[i];
            }
        }

        private WorldCupPasscodeGreeting() {
        }

        @Override // com.revolut.feature.toggles.models.RemoteFeatureDefinition
        public final Experiment a() {
            return new ReleaseFlagExperiment("worldCupPasscodeGreeting");
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

    private Toggles() {
    }

    public static List a() {
        return v.k(AmountV2.f98562c, KompotPersistentModelStorage.f98575a, ProductIntrosDebugMode.f98582a, SwipeableMainScreenOverlays.f98589c, ProgressiveBlurNavigation.f98583c, ControllerStatusDialogDisplayer.f98565c, EdgeToEdgeContent.f98568c, HideableTabBarLabels.f98573c, MoveMoneyFaceliftGlobal.f98579c, AccountDetailsSurfacing.f98561c, CustomNumericKeyboard.f98566c, DeeplinkRestrictions.f98567c, FullScreenWallpapers.f98572c, RevampedPlanBackgrounds.f98585c, UnifiedAvatarsBackgrounds.f98595c, ExpandableAnimation.f98569c, ToolboxPopupMenu.f98593c, ReflectiveSurface.f98584c, MediaPickerCropPhotoDocument.f98578c, ChartsRedesign.f98564c, TitleTransition.f98592c, LineChartsRedesign.f98576c, WorldCupPasscodeGreeting.f98596c, SeasonalPasscodeGreeting.f98587c, TabBarInteractivity.f98591c, TabBarGlowingBorder.f98590c, MaskedInputCommitTextFix.f98577c, PaymentsChatVisualEnhancements.f98581c, ForceRuntimeBlurUnsupported.f98571a, TransparentPaletteEverywhere.f98594c, IconsRedesign.f98574c, SwipeActionsRevamp.f98588c, ParticlesTheme.f98580c, ScrollFooterRefinement.f98586c, BarrelAnimationUpdate.f98563c, FadeInLoading.f98570c);
    }
}
