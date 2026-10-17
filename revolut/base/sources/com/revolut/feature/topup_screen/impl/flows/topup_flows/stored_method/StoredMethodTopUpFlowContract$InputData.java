package com.revolut.feature.topup_screen.impl.flows.topup_flows.stored_method;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flows/topup_flows/stored_method/StoredMethodTopUpFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoredMethodTopUpFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<StoredMethodTopUpFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f91020c;
    public final TopUpContext d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoredMethodTopUpFlowContract$InputData(parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (TopUpContext) parcel.readParcelable(StoredMethodTopUpFlowContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoredMethodTopUpFlowContract$InputData[i];
        }
    }

    public StoredMethodTopUpFlowContract$InputData(String storedMethodAccountId, String issuerInstitutionId, d topUpAmount, TopUpContext topUpContext) {
        Intrinsics.checkNotNullParameter(storedMethodAccountId, "storedMethodAccountId");
        Intrinsics.checkNotNullParameter(issuerInstitutionId, "issuerInstitutionId");
        Intrinsics.checkNotNullParameter(topUpAmount, "topUpAmount");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f91018a = storedMethodAccountId;
        this.f91019b = issuerInstitutionId;
        this.f91020c = topUpAmount;
        this.d = topUpContext;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoredMethodTopUpFlowContract$InputData)) {
            return false;
        }
        StoredMethodTopUpFlowContract$InputData storedMethodTopUpFlowContract$InputData = (StoredMethodTopUpFlowContract$InputData) obj2;
        return Intrinsics.f(this.f91018a, storedMethodTopUpFlowContract$InputData.f91018a) && Intrinsics.f(this.f91019b, storedMethodTopUpFlowContract$InputData.f91019b) && Intrinsics.f(this.f91020c, storedMethodTopUpFlowContract$InputData.f91020c) && Intrinsics.f(this.d, storedMethodTopUpFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.c(p.a.c(this.f91018a.hashCode() * 31, 31, this.f91019b), 31, this.f91020c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91018a);
        dest.writeString(this.f91019b);
        dest.writeSerializable(this.f91020c);
        dest.writeParcelable(this.d, i);
    }
}
