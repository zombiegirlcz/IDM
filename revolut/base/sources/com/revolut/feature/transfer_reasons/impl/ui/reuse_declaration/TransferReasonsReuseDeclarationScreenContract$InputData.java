package com.revolut.feature.transfer_reasons.impl.ui.reuse_declaration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsSuggestion;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/reuse_declaration/TransferReasonsReuseDeclarationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsReuseDeclarationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsReuseDeclarationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonsSuggestion f92393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92394b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferReasonsReuseDeclarationScreenContract$InputData((TransferReasonsSuggestion) parcel.readParcelable(TransferReasonsReuseDeclarationScreenContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsReuseDeclarationScreenContract$InputData[i];
        }
    }

    public TransferReasonsReuseDeclarationScreenContract$InputData(TransferReasonsSuggestion suggestion, String pocketId) {
        Intrinsics.checkNotNullParameter(suggestion, "suggestion");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        this.f92393a = suggestion;
        this.f92394b = pocketId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsReuseDeclarationScreenContract$InputData)) {
            return false;
        }
        TransferReasonsReuseDeclarationScreenContract$InputData transferReasonsReuseDeclarationScreenContract$InputData = (TransferReasonsReuseDeclarationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f92393a, transferReasonsReuseDeclarationScreenContract$InputData.f92393a) && Intrinsics.f(this.f92394b, transferReasonsReuseDeclarationScreenContract$InputData.f92394b);
    }

    public final int hashCode() {
        return this.f92394b.hashCode() + (this.f92393a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92393a, i);
        dest.writeString(this.f92394b);
    }
}
