package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.esim.api.model.EsimSubscriptionPhoneNumber;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory", "Landroid/os/Parcelable;", "PrimaryNumber", "SecondaryNumber", "PortInEligible", "PortInPending", "PortOutPending", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortInEligible;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortInPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortOutPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PrimaryNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$SecondaryNumber;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortInEligible;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortInEligible implements EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory {

        @NotNull
        public static final Parcelable.Creator<PortInEligible> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101226b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortInEligible((EsimSubscriptionPhoneNumber) parcel.readParcelable(PortInEligible.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortInEligible[i];
            }
        }

        public PortInEligible(EsimSubscriptionPhoneNumber phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101225a = phoneNumber;
            this.f101226b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortInEligible)) {
                return false;
            }
            PortInEligible portInEligible = (PortInEligible) obj2;
            return Intrinsics.f(this.f101225a, portInEligible.f101225a) && this.f101226b == portInEligible.f101226b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101226b) + (this.f101225a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory
        /* JADX INFO: renamed from: v1, reason: from getter */
        public final EsimSubscriptionPhoneNumber getF101234a() {
            return this.f101225a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101225a, i);
            dest.writeInt(this.f101226b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortInPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortInPending implements EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory {

        @NotNull
        public static final Parcelable.Creator<PortInPending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortInPending((EsimSubscriptionPhoneNumber) parcel.readParcelable(PortInPending.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortInPending[i];
            }
        }

        public PortInPending(EsimSubscriptionPhoneNumber phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101227a = phoneNumber;
            this.f101228b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortInPending)) {
                return false;
            }
            PortInPending portInPending = (PortInPending) obj2;
            return Intrinsics.f(this.f101227a, portInPending.f101227a) && this.f101228b == portInPending.f101228b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101228b) + (this.f101227a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory
        /* JADX INFO: renamed from: v1, reason: from getter */
        public final EsimSubscriptionPhoneNumber getF101234a() {
            return this.f101227a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101227a, i);
            dest.writeInt(this.f101228b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PortOutPending;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PortOutPending implements EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory {

        @NotNull
        public static final Parcelable.Creator<PortOutPending> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101229a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101230b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f101231c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PortOutPending((EsimSubscriptionPhoneNumber) parcel.readParcelable(PortOutPending.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PortOutPending[i];
            }
        }

        public PortOutPending(EsimSubscriptionPhoneNumber phoneNumber, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101229a = phoneNumber;
            this.f101230b = z;
            this.f101231c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PortOutPending)) {
                return false;
            }
            PortOutPending portOutPending = (PortOutPending) obj2;
            return Intrinsics.f(this.f101229a, portOutPending.f101229a) && this.f101230b == portOutPending.f101230b && this.f101231c == portOutPending.f101231c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101231c) + j6.a.c(this.f101229a.hashCode() * 31, 31, this.f101230b);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory
        /* JADX INFO: renamed from: v1, reason: from getter */
        public final EsimSubscriptionPhoneNumber getF101234a() {
            return this.f101229a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101229a, i);
            dest.writeInt(this.f101230b ? 1 : 0);
            dest.writeInt(this.f101231c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$PrimaryNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrimaryNumber implements EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory {

        @NotNull
        public static final Parcelable.Creator<PrimaryNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101233b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrimaryNumber((EsimSubscriptionPhoneNumber) parcel.readParcelable(PrimaryNumber.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrimaryNumber[i];
            }
        }

        public PrimaryNumber(EsimSubscriptionPhoneNumber phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101232a = phoneNumber;
            this.f101233b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PrimaryNumber)) {
                return false;
            }
            PrimaryNumber primaryNumber = (PrimaryNumber) obj2;
            return Intrinsics.f(this.f101232a, primaryNumber.f101232a) && this.f101233b == primaryNumber.f101233b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101233b) + (this.f101232a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory
        /* JADX INFO: renamed from: v1, reason: from getter */
        public final EsimSubscriptionPhoneNumber getF101234a() {
            return this.f101232a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101232a, i);
            dest.writeInt(this.f101233b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory$SecondaryNumber;", "Lcom/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_my_numbers/EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SecondaryNumber implements EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory {

        @NotNull
        public static final Parcelable.Creator<SecondaryNumber> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EsimSubscriptionPhoneNumber f101234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f101235b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SecondaryNumber((EsimSubscriptionPhoneNumber) parcel.readParcelable(SecondaryNumber.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SecondaryNumber[i];
            }
        }

        public SecondaryNumber(EsimSubscriptionPhoneNumber phoneNumber, boolean z) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.f101234a = phoneNumber;
            this.f101235b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SecondaryNumber)) {
                return false;
            }
            SecondaryNumber secondaryNumber = (SecondaryNumber) obj2;
            return Intrinsics.f(this.f101234a, secondaryNumber.f101234a) && this.f101235b == secondaryNumber.f101235b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f101235b) + (this.f101234a.hashCode() * 31);
        }

        @Override // com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_my_numbers.EsimMobilePlanMyNumbersScreenContract$EsimPhoneNumberCategory
        /* JADX INFO: renamed from: v1, reason: from getter */
        public final EsimSubscriptionPhoneNumber getF101234a() {
            return this.f101234a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f101234a, i);
            dest.writeInt(this.f101235b ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: v1 */
    EsimSubscriptionPhoneNumber getF101234a();
}
