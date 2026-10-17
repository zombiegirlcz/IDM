package com.revolut.feature.shared.help_centre.impl.main;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Main", "SeeAllQuickActions", "QuickHelpWithCard", "SelectCardToViewPinCode", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$Main;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$QuickHelpWithCard;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$SeeAllQuickActions;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$SelectCardToViewPinCode;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HelpFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$Main;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Main implements HelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Main f86379a = new Main();

        @NotNull
        public static final Parcelable.Creator<Main> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Main.f86379a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Main[i];
            }
        }

        private Main() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$QuickHelpWithCard;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QuickHelpWithCard implements HelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QuickHelpWithCard f86380a = new QuickHelpWithCard();

        @NotNull
        public static final Parcelable.Creator<QuickHelpWithCard> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QuickHelpWithCard.f86380a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QuickHelpWithCard[i];
            }
        }

        private QuickHelpWithCard() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$SeeAllQuickActions;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SeeAllQuickActions implements HelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SeeAllQuickActions f86381a = new SeeAllQuickActions();

        @NotNull
        public static final Parcelable.Creator<SeeAllQuickActions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SeeAllQuickActions.f86381a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllQuickActions[i];
            }
        }

        private SeeAllQuickActions() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step$SelectCardToViewPinCode;", "Lcom/revolut/feature/shared/help_centre/impl/main/HelpFlowContract$Step;", "<init>", "()V", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectCardToViewPinCode implements HelpFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectCardToViewPinCode f86382a = new SelectCardToViewPinCode();

        @NotNull
        public static final Parcelable.Creator<SelectCardToViewPinCode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectCardToViewPinCode.f86382a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectCardToViewPinCode[i];
            }
        }

        private SelectCardToViewPinCode() {
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
