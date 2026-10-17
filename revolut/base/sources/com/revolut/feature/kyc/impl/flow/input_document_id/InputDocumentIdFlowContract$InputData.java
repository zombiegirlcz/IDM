package com.revolut.feature.kyc.impl.flow.input_document_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/flow/input_document_id/InputDocumentIdFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputDocumentIdFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InputDocumentIdFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f77690b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDocumentIdFlowContract$InputData((b) parcel.readSerializable(), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputDocumentIdFlowContract$InputData[i];
        }
    }

    public InputDocumentIdFlowContract$InputData(b citizenship, l selectedKycDoc) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(selectedKycDoc, "selectedKycDoc");
        this.f77689a = citizenship;
        this.f77690b = selectedKycDoc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputDocumentIdFlowContract$InputData)) {
            return false;
        }
        InputDocumentIdFlowContract$InputData inputDocumentIdFlowContract$InputData = (InputDocumentIdFlowContract$InputData) obj2;
        return Intrinsics.f(this.f77689a, inputDocumentIdFlowContract$InputData.f77689a) && Intrinsics.f(this.f77690b, inputDocumentIdFlowContract$InputData.f77690b);
    }

    public final int hashCode() {
        return this.f77690b.hashCode() + (this.f77689a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77689a);
        dest.writeSerializable(this.f77690b);
    }
}
