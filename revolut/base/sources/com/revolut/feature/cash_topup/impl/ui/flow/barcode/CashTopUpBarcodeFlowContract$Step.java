package com.revolut.feature.cash_topup.impl.ui.flow.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Barcode", "Instructions", "Map", "DeleteConfirmation", "LocationDetails", "SelectStoreToReportIssue", "ModalStep", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Barcode;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$DeleteConfirmation;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Instructions;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$LocationDetails;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Map;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$ModalStep;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$SelectStoreToReportIssue;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CashTopUpBarcodeFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Barcode;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Barcode extends CashTopUpBarcodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Barcode f65644a = new Barcode();

        @NotNull
        public static final Parcelable.Creator<Barcode> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Barcode.f65644a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Barcode[i];
            }
        }

        private Barcode() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$DeleteConfirmation;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DeleteConfirmation extends CashTopUpBarcodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DeleteConfirmation f65645a = new DeleteConfirmation();

        @NotNull
        public static final Parcelable.Creator<DeleteConfirmation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DeleteConfirmation.f65645a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DeleteConfirmation[i];
            }
        }

        private DeleteConfirmation() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Instructions;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Instructions extends CashTopUpBarcodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Instructions f65646a = new Instructions();

        @NotNull
        public static final Parcelable.Creator<Instructions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Instructions.f65646a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Instructions[i];
            }
        }

        private Instructions() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$LocationDetails;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class LocationDetails extends CashTopUpBarcodeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<LocationDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CashTopUpLocationInfo f65647a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new LocationDetails((CashTopUpLocationInfo) parcel.readParcelable(LocationDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LocationDetails[i];
            }
        }

        public LocationDetails(CashTopUpLocationInfo location) {
            Intrinsics.checkNotNullParameter(location, "location");
            this.f65647a = location;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LocationDetails) && Intrinsics.f(this.f65647a, ((LocationDetails) obj2).f65647a);
        }

        public final int hashCode() {
            return this.f65647a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f65647a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$Map;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "<init>", "()V", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Map extends CashTopUpBarcodeFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Map f65648a = new Map();

        @NotNull
        public static final Parcelable.Creator<Map> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Map.f65648a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Map[i];
            }
        }

        private Map() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$ModalStep;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "<init>", "()V", "ReportIssue", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$ModalStep$ReportIssue;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends CashTopUpBarcodeFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$ModalStep$ReportIssue;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReportIssue extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<ReportIssue> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65649a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ReportIssue(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ReportIssue[i];
                }
            }

            public ReportIssue(String str) {
                this.f65649a = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ReportIssue) && Intrinsics.f(this.f65649a, ((ReportIssue) obj2).f65649a);
            }

            public final int hashCode() {
                String str = this.f65649a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f65649a);
            }
        }

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step$SelectStoreToReportIssue;", "Lcom/revolut/feature/cash_topup/impl/ui/flow/barcode/CashTopUpBarcodeFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cash_topup_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectStoreToReportIssue extends CashTopUpBarcodeFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelectStoreToReportIssue> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65650a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectStoreToReportIssue(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectStoreToReportIssue[i];
            }
        }

        public SelectStoreToReportIssue(String str) {
            this.f65650a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectStoreToReportIssue) && Intrinsics.f(this.f65650a, ((SelectStoreToReportIssue) obj2).f65650a);
        }

        public final int hashCode() {
            String str = this.f65650a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f65650a);
        }
    }

    private CashTopUpBarcodeFlowContract$Step() {
    }
}
