package com.revolut.feature.credit.card.impl.ui.description.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/description/flow/CreditCardBeDrivenDescriptionFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardBeDrivenDescriptionFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardBeDrivenDescriptionFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pl4.a f69216b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardBeDrivenDescriptionFlowContract$InputData(parcel.readString(), pl4.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardBeDrivenDescriptionFlowContract$InputData[i];
        }
    }

    public CreditCardBeDrivenDescriptionFlowContract$InputData(String facilityId, pl4.a type) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f69215a = facilityId;
        this.f69216b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardBeDrivenDescriptionFlowContract$InputData)) {
            return false;
        }
        CreditCardBeDrivenDescriptionFlowContract$InputData creditCardBeDrivenDescriptionFlowContract$InputData = (CreditCardBeDrivenDescriptionFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69215a, creditCardBeDrivenDescriptionFlowContract$InputData.f69215a) && this.f69216b == creditCardBeDrivenDescriptionFlowContract$InputData.f69216b;
    }

    public final int hashCode() {
        return this.f69216b.hashCode() + (this.f69215a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69215a);
        dest.writeString(this.f69216b.name());
    }
}
