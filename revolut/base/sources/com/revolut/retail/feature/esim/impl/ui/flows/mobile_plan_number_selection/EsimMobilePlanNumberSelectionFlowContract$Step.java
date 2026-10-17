package com.revolut.retail.feature.esim.impl.ui.flows.mobile_plan_number_selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberOption;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "PhoneNumberSelections", "TransferNumberToRevolut", "FeaturedNumberSelection", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$FeaturedNumberSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$PhoneNumberSelections;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$TransferNumberToRevolut;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class EsimMobilePlanNumberSelectionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$FeaturedNumberSelection;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FeaturedNumberSelection extends EsimMobilePlanNumberSelectionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FeaturedNumberSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f100724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EsimFeaturedPhoneNumberOption f100725b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FeaturedNumberSelection(parcel.readString(), (EsimFeaturedPhoneNumberOption) parcel.readParcelable(FeaturedNumberSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FeaturedNumberSelection[i];
            }
        }

        public FeaturedNumberSelection(String mobilePlanId, EsimFeaturedPhoneNumberOption featuredOption) {
            Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
            Intrinsics.checkNotNullParameter(featuredOption, "featuredOption");
            this.f100724a = mobilePlanId;
            this.f100725b = featuredOption;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FeaturedNumberSelection)) {
                return false;
            }
            FeaturedNumberSelection featuredNumberSelection = (FeaturedNumberSelection) obj2;
            return Intrinsics.f(this.f100724a, featuredNumberSelection.f100724a) && Intrinsics.f(this.f100725b, featuredNumberSelection.f100725b);
        }

        public final int hashCode() {
            return this.f100725b.f100256a.hashCode() + (this.f100724a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100724a);
            dest.writeParcelable(this.f100725b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$PhoneNumberSelections;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PhoneNumberSelections extends EsimMobilePlanNumberSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PhoneNumberSelections f100726a = new PhoneNumberSelections();

        @NotNull
        public static final Parcelable.Creator<PhoneNumberSelections> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PhoneNumberSelections.f100726a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PhoneNumberSelections[i];
            }
        }

        private PhoneNumberSelections() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step$TransferNumberToRevolut;", "Lcom/revolut/retail/feature/esim/impl/ui/flows/mobile_plan_number_selection/EsimMobilePlanNumberSelectionFlowContract$Step;", "<init>", "()V", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class TransferNumberToRevolut extends EsimMobilePlanNumberSelectionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TransferNumberToRevolut f100727a = new TransferNumberToRevolut();

        @NotNull
        public static final Parcelable.Creator<TransferNumberToRevolut> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return TransferNumberToRevolut.f100727a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TransferNumberToRevolut[i];
            }
        }

        private TransferNumberToRevolut() {
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

    private EsimMobilePlanNumberSelectionFlowContract$Step() {
    }
}
