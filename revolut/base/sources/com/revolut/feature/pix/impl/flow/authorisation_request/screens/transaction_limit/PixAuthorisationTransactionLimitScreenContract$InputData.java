package com.revolut.feature.pix.impl.flow.authorisation_request.screens.transaction_limit;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/authorisation_request/screens/transaction_limit/PixAuthorisationTransactionLimitScreenContract$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixAuthorisationTransactionLimitScreenContract$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixAuthorisationTransactionLimitScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f80600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f80601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80602c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixAuthorisationTransactionLimitScreenContract$InputData((d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixAuthorisationTransactionLimitScreenContract$InputData[i];
        }
    }

    public PixAuthorisationTransactionLimitScreenContract$InputData(d dVar, d dVar2, String authorisationId) {
        Intrinsics.checkNotNullParameter(authorisationId, "authorisationId");
        this.f80600a = authorisationId;
        this.f80601b = dVar;
        this.f80602c = dVar2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixAuthorisationTransactionLimitScreenContract$InputData)) {
            return false;
        }
        PixAuthorisationTransactionLimitScreenContract$InputData pixAuthorisationTransactionLimitScreenContract$InputData = (PixAuthorisationTransactionLimitScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80600a, pixAuthorisationTransactionLimitScreenContract$InputData.f80600a) && Intrinsics.f(this.f80601b, pixAuthorisationTransactionLimitScreenContract$InputData.f80601b) && Intrinsics.f(this.f80602c, pixAuthorisationTransactionLimitScreenContract$InputData.f80602c);
    }

    public final int hashCode() {
        int iHashCode = this.f80600a.hashCode() * 31;
        d dVar = this.f80601b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        d dVar2 = this.f80602c;
        return iHashCode2 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f80600a);
        dest.writeSerializable(this.f80601b);
        dest.writeSerializable(this.f80602c);
    }
}
