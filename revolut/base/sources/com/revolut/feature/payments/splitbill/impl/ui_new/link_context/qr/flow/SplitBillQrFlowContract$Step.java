package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "QrScreen", "GenerateNewLink", "EditSplit", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$EditSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$GenerateNewLink;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$QrScreen;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitBillQrFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$EditSplit;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditSplit implements SplitBillQrFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EditSplit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f79866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f79867b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EditSplit((d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EditSplit[i];
            }
        }

        public EditSplit(d dVar, String linkId) {
            Intrinsics.checkNotNullParameter(linkId, "linkId");
            this.f79866a = linkId;
            this.f79867b = dVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EditSplit)) {
                return false;
            }
            EditSplit editSplit = (EditSplit) obj2;
            return Intrinsics.f(this.f79866a, editSplit.f79866a) && Intrinsics.f(this.f79867b, editSplit.f79867b);
        }

        public final int hashCode() {
            int iHashCode = this.f79866a.hashCode() * 31;
            d dVar = this.f79867b;
            return iHashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f79866a);
            dest.writeSerializable(this.f79867b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$GenerateNewLink;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step;", "<init>", "()V", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GenerateNewLink implements SplitBillQrFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GenerateNewLink f79868a = new GenerateNewLink();

        @NotNull
        public static final Parcelable.Creator<GenerateNewLink> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GenerateNewLink.f79868a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GenerateNewLink[i];
            }
        }

        private GenerateNewLink() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step$QrScreen;", "Lcom/revolut/feature/payments/splitbill/impl/ui_new/link_context/qr/flow/SplitBillQrFlowContract$Step;", "<init>", "()V", "feature_payments_splitbill_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class QrScreen implements SplitBillQrFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final QrScreen f79869a = new QrScreen();

        @NotNull
        public static final Parcelable.Creator<QrScreen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return QrScreen.f79869a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new QrScreen[i];
            }
        }

        private QrScreen() {
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
