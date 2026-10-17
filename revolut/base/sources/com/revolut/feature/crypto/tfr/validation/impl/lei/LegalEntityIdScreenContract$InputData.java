package com.revolut.feature.crypto.tfr.validation.impl.lei;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto/tfr/validation/impl/lei/LegalEntityIdScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_tfr_validation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegalEntityIdScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LegalEntityIdScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71042b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LegalEntityIdScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LegalEntityIdScreenContract$InputData[i];
        }
    }

    public LegalEntityIdScreenContract$InputData(String counterpartyId, String companyName) {
        Intrinsics.checkNotNullParameter(counterpartyId, "counterpartyId");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.f71041a = counterpartyId;
        this.f71042b = companyName;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LegalEntityIdScreenContract$InputData)) {
            return false;
        }
        LegalEntityIdScreenContract$InputData legalEntityIdScreenContract$InputData = (LegalEntityIdScreenContract$InputData) obj2;
        return Intrinsics.f(this.f71041a, legalEntityIdScreenContract$InputData.f71041a) && Intrinsics.f(this.f71042b, legalEntityIdScreenContract$InputData.f71042b);
    }

    public final int hashCode() {
        return this.f71042b.hashCode() + (this.f71041a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71041a);
        dest.writeString(this.f71042b);
    }
}
