package com.revolut.feature.transfer.core.api.ui.reference;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer/core/api/ui/reference/ReferenceInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_transfer_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReferenceInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ReferenceInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f92160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f92161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92162c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReferenceInputData(parcel.readInt(), (Clause) parcel.readParcelable(ReferenceInputData.class.getClassLoader()), (Clause) parcel.readParcelable(ReferenceInputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ReferenceInputData[i];
        }
    }

    public ReferenceInputData(int i, Clause title, Clause label, String reference) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(reference, "reference");
        this.f92160a = title;
        this.f92161b = label;
        this.f92162c = i;
        this.d = reference;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ReferenceInputData)) {
            return false;
        }
        ReferenceInputData referenceInputData = (ReferenceInputData) obj2;
        return Intrinsics.f(this.f92160a, referenceInputData.f92160a) && Intrinsics.f(this.f92161b, referenceInputData.f92161b) && this.f92162c == referenceInputData.f92162c && Intrinsics.f(this.d, referenceInputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + j6.a.b(this.f92162c, p.a.a(this.f92160a.hashCode() * 31, 31, this.f92161b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f92160a, i);
        dest.writeParcelable(this.f92161b, i);
        dest.writeInt(this.f92162c);
        dest.writeString(this.d);
    }
}
