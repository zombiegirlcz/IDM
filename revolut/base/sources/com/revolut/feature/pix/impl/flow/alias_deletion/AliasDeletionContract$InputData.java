package com.revolut.feature.pix.impl.flow.alias_deletion;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/alias_deletion/AliasDeletionContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AliasDeletionContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AliasDeletionContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f80569b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AliasDeletionContract$InputData((AccountId) parcel.readParcelable(AliasDeletionContract$InputData.class.getClassLoader()), (PixKey) parcel.readParcelable(AliasDeletionContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AliasDeletionContract$InputData[i];
        }
    }

    public AliasDeletionContract$InputData(AccountId accountId, PixKey key) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f80568a = accountId;
        this.f80569b = key;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AliasDeletionContract$InputData)) {
            return false;
        }
        AliasDeletionContract$InputData aliasDeletionContract$InputData = (AliasDeletionContract$InputData) obj2;
        return Intrinsics.f(this.f80568a, aliasDeletionContract$InputData.f80568a) && Intrinsics.f(this.f80569b, aliasDeletionContract$InputData.f80569b);
    }

    public final int hashCode() {
        return this.f80569b.hashCode() + (this.f80568a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80568a, i);
        dest.writeParcelable(this.f80569b, i);
    }
}
