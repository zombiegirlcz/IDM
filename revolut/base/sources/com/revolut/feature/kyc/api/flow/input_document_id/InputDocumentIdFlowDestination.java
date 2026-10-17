package com.revolut.feature.kyc.api.flow.input_document_id;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/api/flow/input_document_id/InputDocumentIdFlowDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_kyc_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputDocumentIdFlowDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<InputDocumentIdFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f77471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f77472b;

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InputDocumentIdFlowDestination((b) parcel.readSerializable(), (l) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InputDocumentIdFlowDestination[i];
        }
    }

    public InputDocumentIdFlowDestination(b citizenship, l selectedDocument) {
        Intrinsics.checkNotNullParameter(citizenship, "citizenship");
        Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
        this.f77471a = citizenship;
        this.f77472b = selectedDocument;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InputDocumentIdFlowDestination)) {
            return false;
        }
        InputDocumentIdFlowDestination inputDocumentIdFlowDestination = (InputDocumentIdFlowDestination) obj2;
        return Intrinsics.f(this.f77471a, inputDocumentIdFlowDestination.f77471a) && Intrinsics.f(this.f77472b, inputDocumentIdFlowDestination.f77472b);
    }

    public final int hashCode() {
        return this.f77472b.hashCode() + (this.f77471a.f297794a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f77471a);
        dest.writeSerializable(this.f77472b);
    }
}
