package com.revolut.feature.transfer_reasons.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfo;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsSuggestion;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\t\u0004\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\t\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"com/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Initial", "ReasonsList", "ReasonsSearch", "AmountAllocation", "ReuseDeclaration", "AdditionalInfoStep", "IsRefund", "Refund", "ChooseAction", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$AdditionalInfoStep;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$AmountAllocation;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ChooseAction;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$Initial;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$IsRefund;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReasonsList;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReasonsSearch;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$Refund;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReuseDeclaration;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TransferReasonsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$AdditionalInfoStep;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AdditionalInfoStep extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AdditionalInfoStep> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdditionalInfo f92335a;

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
            this.f92335a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AdditionalInfoStep) && Intrinsics.f(this.f92335a, ((AdditionalInfoStep) obj2).f92335a);
        }

        public final int hashCode() {
            return this.f92335a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92335a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$AmountAllocation;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AmountAllocation extends TransferReasonsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AmountAllocation f92336a = new AmountAllocation();

        @NotNull
        public static final Parcelable.Creator<AmountAllocation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AmountAllocation.f92336a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ChooseAction;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseAction extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChooseAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ttf.a f92338b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChooseAction(parcel.readString(), (ttf.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChooseAction[i];
            }
        }

        public ChooseAction(String transactionId, ttf.a transactionTransferReasons) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(transactionTransferReasons, "transactionTransferReasons");
            this.f92337a = transactionId;
            this.f92338b = transactionTransferReasons;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ChooseAction)) {
                return false;
            }
            ChooseAction chooseAction = (ChooseAction) obj2;
            return Intrinsics.f(this.f92337a, chooseAction.f92337a) && Intrinsics.f(this.f92338b, chooseAction.f92338b);
        }

        public final int hashCode() {
            return this.f92338b.hashCode() + (this.f92337a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92337a);
            dest.writeSerializable(this.f92338b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$Initial;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial extends TransferReasonsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f92339a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f92339a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$IsRefund;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "<init>", "()V", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IsRefund extends TransferReasonsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IsRefund f92340a = new IsRefund();

        @NotNull
        public static final Parcelable.Creator<IsRefund> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IsRefund.f92340a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IsRefund[i];
            }
        }

        private IsRefund() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReasonsList;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReasonsList extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReasonsList> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ttf.b f92341a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f92342b;

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
            this.f92341a = catalogue;
            this.f92342b = categories;
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
            return this.f92341a == reasonsList.f92341a && this.f92342b.equals(reasonsList.f92342b);
        }

        public final int hashCode() {
            return this.f92342b.hashCode() + (this.f92341a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92341a.name());
            Iterator itY = j6.a.y(this.f92342b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReasonsSearch;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReasonsSearch extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReasonsSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferReasonCategory f92343a;

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
            this.f92343a = category;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReasonsSearch) && Intrinsics.f(this.f92343a, ((ReasonsSearch) obj2).f92343a);
        }

        public final int hashCode() {
            return this.f92343a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92343a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$Refund;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Refund extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Refund> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferReasonsRequest f92344a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Refund((TransferReasonsRequest) parcel.readParcelable(Refund.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Refund[i];
            }
        }

        public Refund(TransferReasonsRequest reasonsRequest) {
            Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
            this.f92344a = reasonsRequest;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Refund) && Intrinsics.f(this.f92344a, ((Refund) obj2).f92344a);
        }

        public final int hashCode() {
            return this.f92344a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92344a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step$ReuseDeclaration;", "Lcom/revolut/feature/transfer_reasons/impl/flow/TransferReasonsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ReuseDeclaration extends TransferReasonsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ReuseDeclaration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TransferReasonsSuggestion f92345a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ReuseDeclaration((TransferReasonsSuggestion) parcel.readParcelable(ReuseDeclaration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReuseDeclaration[i];
            }
        }

        public ReuseDeclaration(TransferReasonsSuggestion suggestion) {
            Intrinsics.checkNotNullParameter(suggestion, "suggestion");
            this.f92345a = suggestion;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ReuseDeclaration) && Intrinsics.f(this.f92345a, ((ReuseDeclaration) obj2).f92345a);
        }

        public final int hashCode() {
            return this.f92345a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f92345a, i);
        }
    }

    private TransferReasonsFlowContract$Step() {
    }
}
