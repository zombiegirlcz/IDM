package com.revolut.feature.crypto.tfr.validation.impl.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto/tfr/validation/impl/data/models/CounterpartyUpdateData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CounterpartyUpdateData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CounterpartyUpdateData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qm5.a f71032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OwnershipPayloadData f71034c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CounterpartyUpdateData(qm5.a.valueOf(parcel.readString()), parcel.readString(), (OwnershipPayloadData) parcel.readParcelable(CounterpartyUpdateData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CounterpartyUpdateData[i];
        }
    }

    public CounterpartyUpdateData(qm5.a status, String ownershipMethod, OwnershipPayloadData ownershipPayloadData) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(ownershipMethod, "ownershipMethod");
        this.f71032a = status;
        this.f71033b = ownershipMethod;
        this.f71034c = ownershipPayloadData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CounterpartyUpdateData)) {
            return false;
        }
        CounterpartyUpdateData counterpartyUpdateData = (CounterpartyUpdateData) obj2;
        return this.f71032a == counterpartyUpdateData.f71032a && Intrinsics.f(this.f71033b, counterpartyUpdateData.f71033b) && Intrinsics.f(this.f71034c, counterpartyUpdateData.f71034c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f71032a.hashCode() * 31, 31, this.f71033b);
        OwnershipPayloadData ownershipPayloadData = this.f71034c;
        return iC + (ownershipPayloadData == null ? 0 : ownershipPayloadData.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71032a.name());
        dest.writeString(this.f71033b);
        dest.writeParcelable(this.f71034c, i);
    }
}
