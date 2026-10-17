package com.revolut.feature.credit.card.impl.ui.instalment.create;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType", "Landroid/os/Parcelable;", "OverduePlans", "RestrictedInstalmentPlans", "ActiveForbearance", "UtilizationLimit", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$ActiveForbearance;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$OverduePlans;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$RestrictedInstalmentPlans;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$UtilizationLimit;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstalmentFlowContract$IneligibilityDialogType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$ActiveForbearance;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveForbearance implements InstalmentFlowContract$IneligibilityDialogType {

        @NotNull
        public static final Parcelable.Creator<ActiveForbearance> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDate f69314a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveForbearance((LocalDate) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveForbearance[i];
            }
        }

        public ActiveForbearance(LocalDate endDate) {
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            this.f69314a = endDate;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActiveForbearance) && Intrinsics.f(this.f69314a, ((ActiveForbearance) obj2).f69314a);
        }

        public final int hashCode() {
            return this.f69314a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69314a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$OverduePlans;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OverduePlans implements InstalmentFlowContract$IneligibilityDialogType {

        @NotNull
        public static final Parcelable.Creator<OverduePlans> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f69316b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OverduePlans((d) parcel.readSerializable(), (wi0.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OverduePlans[i];
            }
        }

        public OverduePlans(d minimumDue, wi0.b countryCode) {
            Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            this.f69315a = minimumDue;
            this.f69316b = countryCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OverduePlans)) {
                return false;
            }
            OverduePlans overduePlans = (OverduePlans) obj2;
            return Intrinsics.f(this.f69315a, overduePlans.f69315a) && Intrinsics.f(this.f69316b, overduePlans.f69316b);
        }

        public final int hashCode() {
            return this.f69316b.f297794a.hashCode() + (this.f69315a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69315a);
            dest.writeSerializable(this.f69316b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$RestrictedInstalmentPlans;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RestrictedInstalmentPlans implements InstalmentFlowContract$IneligibilityDialogType {

        @NotNull
        public static final Parcelable.Creator<RestrictedInstalmentPlans> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f69317a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RestrictedInstalmentPlans((d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RestrictedInstalmentPlans[i];
            }
        }

        public RestrictedInstalmentPlans(d minimumDue) {
            Intrinsics.checkNotNullParameter(minimumDue, "minimumDue");
            this.f69317a = minimumDue;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RestrictedInstalmentPlans) && Intrinsics.f(this.f69317a, ((RestrictedInstalmentPlans) obj2).f69317a);
        }

        public final int hashCode() {
            return this.f69317a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f69317a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType$UtilizationLimit;", "Lcom/revolut/feature/credit/card/impl/ui/instalment/create/InstalmentFlowContract$IneligibilityDialogType;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UtilizationLimit implements InstalmentFlowContract$IneligibilityDialogType {

        @NotNull
        public static final Parcelable.Creator<UtilizationLimit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f69319b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UtilizationLimit((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UtilizationLimit[i];
            }
        }

        public UtilizationLimit(d amount, String percentage) {
            Intrinsics.checkNotNullParameter(percentage, "percentage");
            Intrinsics.checkNotNullParameter(amount, "amount");
            this.f69318a = percentage;
            this.f69319b = amount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UtilizationLimit)) {
                return false;
            }
            UtilizationLimit utilizationLimit = (UtilizationLimit) obj2;
            return Intrinsics.f(this.f69318a, utilizationLimit.f69318a) && Intrinsics.f(this.f69319b, utilizationLimit.f69319b);
        }

        public final int hashCode() {
            return this.f69319b.hashCode() + (this.f69318a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69318a);
            dest.writeSerializable(this.f69319b);
        }
    }
}
