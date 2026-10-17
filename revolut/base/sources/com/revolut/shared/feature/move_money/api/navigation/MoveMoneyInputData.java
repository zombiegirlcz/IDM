package com.revolut.shared.feature.move_money.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "ExtraConfiguration", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoveMoneyInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Action f104833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NaviCommand f104834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f104835c;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "Landroid/os/Parcelable;", "LockAmount", "HideOptionsButton", "CustomCtaTitle", "TargetAmountAwareSecondAccountPreselection", "SuppressSuccessDialog", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$CustomCtaTitle;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$HideOptionsButton;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$LockAmount;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$SuppressSuccessDialog;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$TargetAmountAwareSecondAccountPreselection;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface ExtraConfiguration extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$CustomCtaTitle;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "", "toString", "()Ljava/lang/String;", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CustomCtaTitle implements ExtraConfiguration {

            @NotNull
            public static final Parcelable.Creator<CustomCtaTitle> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f104836a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CustomCtaTitle((Clause) parcel.readParcelable(CustomCtaTitle.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CustomCtaTitle[i];
                }
            }

            public CustomCtaTitle(Clause title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f104836a = title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CustomCtaTitle) && Intrinsics.f(this.f104836a, ((CustomCtaTitle) obj2).f104836a);
            }

            public final int hashCode() {
                return this.f104836a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104836a, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$HideOptionsButton;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class HideOptionsButton implements ExtraConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final HideOptionsButton f104837a = new HideOptionsButton();

            @NotNull
            public static final Parcelable.Creator<HideOptionsButton> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return HideOptionsButton.f104837a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new HideOptionsButton[i];
                }
            }

            private HideOptionsButton() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$LockAmount;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class LockAmount implements ExtraConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final LockAmount f104838a = new LockAmount();

            @NotNull
            public static final Parcelable.Creator<LockAmount> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return LockAmount.f104838a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new LockAmount[i];
                }
            }

            private LockAmount() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$SuppressSuccessDialog;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class SuppressSuccessDialog implements ExtraConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SuppressSuccessDialog f104839a = new SuppressSuccessDialog();

            @NotNull
            public static final Parcelable.Creator<SuppressSuccessDialog> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return SuppressSuccessDialog.f104839a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SuppressSuccessDialog[i];
                }
            }

            private SuppressSuccessDialog() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration$TargetAmountAwareSecondAccountPreselection;", "Lcom/revolut/shared/feature/move_money/api/navigation/MoveMoneyInputData$ExtraConfiguration;", "<init>", "()V", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class TargetAmountAwareSecondAccountPreselection implements ExtraConfiguration {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final TargetAmountAwareSecondAccountPreselection f104840a = new TargetAmountAwareSecondAccountPreselection();

            @NotNull
            public static final Parcelable.Creator<TargetAmountAwareSecondAccountPreselection> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return TargetAmountAwareSecondAccountPreselection.f104840a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new TargetAmountAwareSecondAccountPreselection[i];
                }
            }

            private TargetAmountAwareSecondAccountPreselection() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Action action = (Action) j6.a.f(parcel, "parcel", MoveMoneyInputData.class);
            NaviCommand naviCommand = (NaviCommand) parcel.readParcelable(MoveMoneyInputData.class.getClassLoader());
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(MoveMoneyInputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new MoveMoneyInputData(action, naviCommand, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyInputData[i];
        }
    }

    public MoveMoneyInputData(Action action, NaviCommand naviCommand, Set extraConfigurations) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extraConfigurations, "extraConfigurations");
        this.f104833a = action;
        this.f104834b = naviCommand;
        this.f104835c = extraConfigurations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyInputData)) {
            return false;
        }
        MoveMoneyInputData moveMoneyInputData = (MoveMoneyInputData) obj2;
        return Intrinsics.f(this.f104833a, moveMoneyInputData.f104833a) && Intrinsics.f(this.f104834b, moveMoneyInputData.f104834b) && Intrinsics.f(this.f104835c, moveMoneyInputData.f104835c);
    }

    public final int hashCode() {
        int iHashCode = this.f104833a.hashCode() * 31;
        NaviCommand naviCommand = this.f104834b;
        return this.f104835c.hashCode() + ((iHashCode + (naviCommand == null ? 0 : naviCommand.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104833a, i);
        dest.writeParcelable(this.f104834b, i);
        Iterator itV = n.v(this.f104835c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public MoveMoneyInputData(Action action, Set set, int i) {
        this(action, (i & 2) != 0 ? null : DummyCommand.f98635a, (i & 4) != 0 ? h0.f322473a : set);
    }
}
