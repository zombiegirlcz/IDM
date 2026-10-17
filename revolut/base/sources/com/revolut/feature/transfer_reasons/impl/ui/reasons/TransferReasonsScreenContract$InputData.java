package com.revolut.feature.transfer_reasons.impl.ui.reasons;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.interactor.TransferReasonsRequest;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/transfer_reasons/impl/ui/reasons/TransferReasonsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f92391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TransferReasonCategory f92392c;
    public final TransferReasonsRequest d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(TransferReasonsScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new TransferReasonsScreenContract$InputData(bVarValueOf, arrayList, (TransferReasonCategory) parcel.readParcelable(TransferReasonsScreenContract$InputData.class.getClassLoader()), (TransferReasonsRequest) parcel.readParcelable(TransferReasonsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsScreenContract$InputData[i];
        }
    }

    public TransferReasonsScreenContract$InputData(b catalogue, ArrayList categories, TransferReasonCategory transferReasonCategory, TransferReasonsRequest reasonsRequest) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(reasonsRequest, "reasonsRequest");
        this.f92390a = catalogue;
        this.f92391b = categories;
        this.f92392c = transferReasonCategory;
        this.d = reasonsRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsScreenContract$InputData)) {
            return false;
        }
        TransferReasonsScreenContract$InputData transferReasonsScreenContract$InputData = (TransferReasonsScreenContract$InputData) obj2;
        return this.f92390a == transferReasonsScreenContract$InputData.f92390a && this.f92391b.equals(transferReasonsScreenContract$InputData.f92391b) && Intrinsics.f(this.f92392c, transferReasonsScreenContract$InputData.f92392c) && Intrinsics.f(this.d, transferReasonsScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f92391b, this.f92390a.hashCode() * 31, 31);
        TransferReasonCategory transferReasonCategory = this.f92392c;
        return this.d.hashCode() + ((iB + (transferReasonCategory == null ? 0 : transferReasonCategory.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92390a.name());
        Iterator itY = j6.a.y(this.f92391b, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f92392c, i);
        dest.writeParcelable(this.d, i);
    }
}
