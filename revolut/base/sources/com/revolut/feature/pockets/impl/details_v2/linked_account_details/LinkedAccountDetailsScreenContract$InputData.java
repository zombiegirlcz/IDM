package com.revolut.feature.pockets.impl.details_v2.linked_account_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import io3.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/linked_account_details/LinkedAccountDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LinkedAccountDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<LinkedAccountDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f80812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f80813b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LinkedAccountDetailsScreenContract$InputData((AccountId) parcel.readParcelable(LinkedAccountDetailsScreenContract$InputData.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkedAccountDetailsScreenContract$InputData[i];
        }
    }

    public LinkedAccountDetailsScreenContract$InputData(AccountId accountId, d pocket) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80812a = pocket;
        this.f80813b = accountId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LinkedAccountDetailsScreenContract$InputData)) {
            return false;
        }
        LinkedAccountDetailsScreenContract$InputData linkedAccountDetailsScreenContract$InputData = (LinkedAccountDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80812a, linkedAccountDetailsScreenContract$InputData.f80812a) && Intrinsics.f(this.f80813b, linkedAccountDetailsScreenContract$InputData.f80813b);
    }

    public final int hashCode() {
        return this.f80813b.hashCode() + (this.f80812a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80812a);
        dest.writeParcelable(this.f80813b, i);
    }
}
