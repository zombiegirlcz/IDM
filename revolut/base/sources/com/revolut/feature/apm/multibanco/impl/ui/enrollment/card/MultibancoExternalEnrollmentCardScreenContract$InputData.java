package com.revolut.feature.apm.multibanco.impl.ui.enrollment.card;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/multibanco/impl/ui/enrollment/card/MultibancoExternalEnrollmentCardScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_multibanco_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultibancoExternalEnrollmentCardScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MultibancoExternalEnrollmentCardScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62586b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultibancoExternalEnrollmentCardScreenContract$InputData(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultibancoExternalEnrollmentCardScreenContract$InputData[i];
        }
    }

    public MultibancoExternalEnrollmentCardScreenContract$InputData(String cardId, boolean z) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        this.f62585a = cardId;
        this.f62586b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultibancoExternalEnrollmentCardScreenContract$InputData)) {
            return false;
        }
        MultibancoExternalEnrollmentCardScreenContract$InputData multibancoExternalEnrollmentCardScreenContract$InputData = (MultibancoExternalEnrollmentCardScreenContract$InputData) obj2;
        return Intrinsics.f(this.f62585a, multibancoExternalEnrollmentCardScreenContract$InputData.f62585a) && this.f62586b == multibancoExternalEnrollmentCardScreenContract$InputData.f62586b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f62586b) + (this.f62585a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62585a);
        dest.writeInt(this.f62586b ? 1 : 0);
    }
}
