package com.revolut.feature.pix.impl.flow.alias_registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/alias_registration/AliasRegistrationContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasRegistrationContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AliasRegistrationContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AliasRegistrationType f80575b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AliasRegistrationContract$InputData((AccountId) parcel.readParcelable(AliasRegistrationContract$InputData.class.getClassLoader()), (AliasRegistrationType) parcel.readParcelable(AliasRegistrationContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasRegistrationContract$InputData[i];
        }
    }

    public AliasRegistrationContract$InputData(AccountId accountId, AliasRegistrationType aliasRegistrationType) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80574a = accountId;
        this.f80575b = aliasRegistrationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AliasRegistrationContract$InputData)) {
            return false;
        }
        AliasRegistrationContract$InputData aliasRegistrationContract$InputData = (AliasRegistrationContract$InputData) obj2;
        return Intrinsics.f(this.f80574a, aliasRegistrationContract$InputData.f80574a) && Intrinsics.f(this.f80575b, aliasRegistrationContract$InputData.f80575b);
    }

    public final int hashCode() {
        int iHashCode = this.f80574a.hashCode() * 31;
        AliasRegistrationType aliasRegistrationType = this.f80575b;
        return iHashCode + (aliasRegistrationType == null ? 0 : aliasRegistrationType.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80574a, i);
        dest.writeParcelable(this.f80575b, i);
    }
}
