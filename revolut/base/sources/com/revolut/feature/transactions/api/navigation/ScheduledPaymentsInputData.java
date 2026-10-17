package com.revolut.feature.transactions.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "InitialAction", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScheduledPaymentsInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScheduledPaymentsInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecurringPaymentAccount f91971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InitialAction f91973c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction;", "Landroid/os/Parcelable;", "ShowSuccessShotDialog", "ShowConfirmationShotDialog", "Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction$ShowConfirmationShotDialog;", "Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction$ShowSuccessShotDialog;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InitialAction extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction$ShowConfirmationShotDialog;", "Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowConfirmationShotDialog implements InitialAction {

            @NotNull
            public static final Parcelable.Creator<ShowConfirmationShotDialog> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f91974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Image f91975b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowConfirmationShotDialog((Clause) parcel.readParcelable(ShowConfirmationShotDialog.class.getClassLoader()), (Image) parcel.readParcelable(ShowConfirmationShotDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowConfirmationShotDialog[i];
                }
            }

            public ShowConfirmationShotDialog(Clause text, Image image) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(image, "image");
                this.f91974a = text;
                this.f91975b = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ShowConfirmationShotDialog)) {
                    return false;
                }
                ShowConfirmationShotDialog showConfirmationShotDialog = (ShowConfirmationShotDialog) obj2;
                return Intrinsics.f(this.f91974a, showConfirmationShotDialog.f91974a) && Intrinsics.f(this.f91975b, showConfirmationShotDialog.f91975b);
            }

            public final int hashCode() {
                return this.f91975b.hashCode() + (this.f91974a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f91974a, i);
                dest.writeParcelable(this.f91975b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction$ShowSuccessShotDialog;", "Lcom/revolut/feature/transactions/api/navigation/ScheduledPaymentsInputData$InitialAction;", "", "toString", "()Ljava/lang/String;", "retail_feature_transactions_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowSuccessShotDialog implements InitialAction {

            @NotNull
            public static final Parcelable.Creator<ShowSuccessShotDialog> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f91976a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowSuccessShotDialog((Clause) parcel.readParcelable(ShowSuccessShotDialog.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowSuccessShotDialog[i];
                }
            }

            public ShowSuccessShotDialog(Clause text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f91976a = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ShowSuccessShotDialog) && Intrinsics.f(this.f91976a, ((ShowSuccessShotDialog) obj2).f91976a);
            }

            public final int hashCode() {
                return this.f91976a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f91976a, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScheduledPaymentsInputData((RecurringPaymentAccount) parcel.readParcelable(ScheduledPaymentsInputData.class.getClassLoader()), parcel.readInt() != 0, (InitialAction) parcel.readParcelable(ScheduledPaymentsInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScheduledPaymentsInputData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScheduledPaymentsInputData() {
        this((RecurringPaymentAccount) null, (InitialAction) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScheduledPaymentsInputData)) {
            return false;
        }
        ScheduledPaymentsInputData scheduledPaymentsInputData = (ScheduledPaymentsInputData) obj2;
        return Intrinsics.f(this.f91971a, scheduledPaymentsInputData.f91971a) && this.f91972b == scheduledPaymentsInputData.f91972b && Intrinsics.f(this.f91973c, scheduledPaymentsInputData.f91973c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f91971a.hashCode() * 31, 31, this.f91972b);
        InitialAction initialAction = this.f91973c;
        return iC + (initialAction == null ? 0 : initialAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f91971a, i);
        dest.writeInt(this.f91972b ? 1 : 0);
        dest.writeParcelable(this.f91973c, i);
    }

    public ScheduledPaymentsInputData(RecurringPaymentAccount recurringPaymentAccount, boolean z, InitialAction initialAction) {
        Intrinsics.checkNotNullParameter(recurringPaymentAccount, "recurringPaymentAccount");
        this.f91971a = recurringPaymentAccount;
        this.f91972b = z;
        this.f91973c = initialAction;
    }

    public /* synthetic */ ScheduledPaymentsInputData(RecurringPaymentAccount recurringPaymentAccount, InitialAction initialAction, int i) {
        this((i & 1) != 0 ? RecurringPaymentAccount.Personal.f89320a : recurringPaymentAccount, (i & 2) == 0, (i & 4) != 0 ? null : initialAction);
    }
}
