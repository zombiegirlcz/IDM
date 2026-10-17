package com.revolut.feature.topup_screen.impl.flows.topup_flows.mandate;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/mandate/MandateTopupFlowContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MandateTopupFlowContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MandateTopupFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f91003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpContext f91005c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MandateTopupFlowContract$InputData((d) parcel.readSerializable(), parcel.readString(), (TopUpContext) parcel.readParcelable(MandateTopupFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MandateTopupFlowContract$InputData[i];
        }
    }

    public MandateTopupFlowContract$InputData(d amount, String mandateId, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(mandateId, "mandateId");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f91003a = amount;
        this.f91004b = mandateId;
        this.f91005c = topUpContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MandateTopupFlowContract$InputData)) {
            return false;
        }
        MandateTopupFlowContract$InputData mandateTopupFlowContract$InputData = (MandateTopupFlowContract$InputData) obj2;
        return Intrinsics.f(this.f91003a, mandateTopupFlowContract$InputData.f91003a) && Intrinsics.f(this.f91004b, mandateTopupFlowContract$InputData.f91004b) && Intrinsics.f(this.f91005c, mandateTopupFlowContract$InputData.f91005c);
    }

    public final int hashCode() {
        return this.f91005c.hashCode() + p.a.c(this.f91003a.hashCode() * 31, 31, this.f91004b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f91003a);
        dest.writeString(this.f91004b);
        dest.writeParcelable(this.f91005c, i);
    }
}
