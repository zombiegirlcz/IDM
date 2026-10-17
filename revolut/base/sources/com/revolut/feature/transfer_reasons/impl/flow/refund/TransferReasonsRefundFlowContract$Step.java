package com.revolut.feature.transfer_reasons.impl.flow.refund;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfo;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SelectTransaction", "ReasonsList", "ReasonsSearch", "AdditionalInfoStep", "AmountAllocation", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$AdditionalInfoStep;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$AmountAllocation;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$ReasonsList;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$ReasonsSearch;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$SelectTransaction;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferReasonsRefundFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$AdditionalInfoStep;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoStep extends TransferReasonsRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfoStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfo f92359a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AdditionalInfoStep((AdditionalInfo) parcel.readParcelable(AdditionalInfoStep.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AdditionalInfoStep[i];
            }
        }

        public AdditionalInfoStep(AdditionalInfo info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f92359a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalInfoStep) && Intrinsics.f(this.f92359a, ((AdditionalInfoStep) obj2).f92359a);
        }

        public final int hashCode() {
            return this.f92359a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92359a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$AmountAllocation;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountAllocation extends TransferReasonsRefundFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountAllocation f92360a = new AmountAllocation();

        @NotNull
        public static final Parcelable.Creator<AmountAllocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountAllocation.f92360a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AmountAllocation[i];
            }
        }

        private AmountAllocation() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$ReasonsList;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReasonsList extends TransferReasonsRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReasonsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ttf.b f92361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f92362b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ttf.b bVarValueOf = ttf.b.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ReasonsList.class, parcel, arrayList, iE, 1);
                }
                return new ReasonsList(bVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReasonsList[i];
            }
        }

        public ReasonsList(ttf.b catalogue, ArrayList categories) {
            Intrinsics.checkNotNullParameter(catalogue, "catalogue");
            Intrinsics.checkNotNullParameter(categories, "categories");
            this.f92361a = catalogue;
            this.f92362b = categories;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ReasonsList)) {
                return false;
            }
            ReasonsList reasonsList = (ReasonsList) obj2;
            return this.f92361a == reasonsList.f92361a && this.f92362b.equals(reasonsList.f92362b);
        }

        public final int hashCode() {
            return this.f92362b.hashCode() + (this.f92361a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92361a.name());
            Iterator itY = j6.a.y(this.f92362b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$ReasonsSearch;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReasonsSearch extends TransferReasonsRefundFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReasonsSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferReasonCategory f92363a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReasonsSearch((TransferReasonCategory) parcel.readParcelable(ReasonsSearch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReasonsSearch[i];
            }
        }

        public ReasonsSearch(TransferReasonCategory category) {
            Intrinsics.checkNotNullParameter(category, "category");
            this.f92363a = category;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReasonsSearch) && Intrinsics.f(this.f92363a, ((ReasonsSearch) obj2).f92363a);
        }

        public final int hashCode() {
            return this.f92363a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92363a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step$SelectTransaction;", "Lcom/revolut/feature/transfer_reasons/impl/flow/refund/TransferReasonsRefundFlowContract$Step;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SelectTransaction extends TransferReasonsRefundFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SelectTransaction f92364a = new SelectTransaction();

        @NotNull
        public static final Parcelable.Creator<SelectTransaction> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SelectTransaction.f92364a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTransaction[i];
            }
        }

        private SelectTransaction() {
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

    private TransferReasonsRefundFlowContract$Step() {
    }
}
