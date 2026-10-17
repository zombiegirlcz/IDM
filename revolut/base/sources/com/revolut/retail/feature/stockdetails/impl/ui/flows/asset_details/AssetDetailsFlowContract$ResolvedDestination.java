package com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.structured_note.details.api.ui.note_details.NoteDetailsContract$InputData;
import com.revolut.feature.wealth.mutual_funds.api.ui.details.MutualFundDetailsContract$InputData;
import com.revolut.feature.wealth.private_equity.api.ui.details.FundDetailsContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.bond_details.BondDetailsControllerContract$InputData;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsControllerContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StockDetails", "EtfDetails", "BondDetails", "CfdDetails", "PrivateMarketDetails", "MutualFundDetails", "StructuredNoteDetails", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$BondDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$CfdDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$EtfDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$MutualFundDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$PrivateMarketDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$StockDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$StructuredNoteDetails;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AssetDetailsFlowContract$ResolvedDestination extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$BondDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BondDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<BondDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BondDetailsControllerContract$InputData f103825a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BondDetails(BondDetailsControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BondDetails[i];
            }
        }

        public BondDetails(BondDetailsControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103825a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BondDetails) && Intrinsics.f(this.f103825a, ((BondDetails) obj2).f103825a);
        }

        public final int hashCode() {
            return this.f103825a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103825a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$CfdDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CfdDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<CfdDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CfdDetailsControllerContract$InputData f103826a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CfdDetails(CfdDetailsControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CfdDetails[i];
            }
        }

        public CfdDetails(CfdDetailsControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103826a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CfdDetails) && Intrinsics.f(this.f103826a, ((CfdDetails) obj2).f103826a);
        }

        public final int hashCode() {
            return this.f103826a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103826a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$EtfDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EtfDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<EtfDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EtfDetailsFlowControllerContract$InputData f103827a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EtfDetails(EtfDetailsFlowControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EtfDetails[i];
            }
        }

        public EtfDetails(EtfDetailsFlowControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103827a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof EtfDetails) && Intrinsics.f(this.f103827a, ((EtfDetails) obj2).f103827a);
        }

        public final int hashCode() {
            return this.f103827a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103827a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$MutualFundDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MutualFundDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<MutualFundDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MutualFundDetailsContract$InputData f103828a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MutualFundDetails((MutualFundDetailsContract$InputData) parcel.readParcelable(MutualFundDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MutualFundDetails[i];
            }
        }

        public MutualFundDetails(MutualFundDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103828a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MutualFundDetails) && Intrinsics.f(this.f103828a, ((MutualFundDetails) obj2).f103828a);
        }

        public final int hashCode() {
            return this.f103828a.f95714a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103828a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$PrivateMarketDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PrivateMarketDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<PrivateMarketDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FundDetailsContract$InputData f103829a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PrivateMarketDetails((FundDetailsContract$InputData) parcel.readParcelable(PrivateMarketDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PrivateMarketDetails[i];
            }
        }

        public PrivateMarketDetails(FundDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103829a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PrivateMarketDetails) && Intrinsics.f(this.f103829a, ((PrivateMarketDetails) obj2).f103829a);
        }

        public final int hashCode() {
            return this.f103829a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103829a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$StockDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StockDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<StockDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StockDetailsFlowControllerContract$InputData f103830a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StockDetails(StockDetailsFlowControllerContract$InputData.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StockDetails[i];
            }
        }

        public StockDetails(StockDetailsFlowControllerContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103830a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StockDetails) && Intrinsics.f(this.f103830a, ((StockDetails) obj2).f103830a);
        }

        public final int hashCode() {
            return this.f103830a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103830a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination$StructuredNoteDetails;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/asset_details/AssetDetailsFlowContract$ResolvedDestination;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StructuredNoteDetails implements AssetDetailsFlowContract$ResolvedDestination {

        @NotNull
        public static final Parcelable.Creator<StructuredNoteDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NoteDetailsContract$InputData f103831a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new StructuredNoteDetails((NoteDetailsContract$InputData) parcel.readParcelable(StructuredNoteDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StructuredNoteDetails[i];
            }
        }

        public StructuredNoteDetails(NoteDetailsContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f103831a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StructuredNoteDetails) && Intrinsics.f(this.f103831a, ((StructuredNoteDetails) obj2).f103831a);
        }

        public final int hashCode() {
            return this.f103831a.f88859a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f103831a, i);
        }
    }
}
