package com.revolut.feature.pix.impl.flow.qr_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrRequestContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PixQrRequestContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccountId f80710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PixKey f80711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f80712c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrRequestContract$InputData((AccountId) parcel.readParcelable(PixQrRequestContract$InputData.class.getClassLoader()), (PixKey) parcel.readParcelable(PixQrRequestContract$InputData.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrRequestContract$InputData[i];
        }
    }

    public PixQrRequestContract$InputData(AccountId accountId, PixKey pixKey, d dVar) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f80710a = accountId;
        this.f80711b = pixKey;
        this.f80712c = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrRequestContract$InputData)) {
            return false;
        }
        PixQrRequestContract$InputData pixQrRequestContract$InputData = (PixQrRequestContract$InputData) obj2;
        return Intrinsics.f(this.f80710a, pixQrRequestContract$InputData.f80710a) && Intrinsics.f(this.f80711b, pixQrRequestContract$InputData.f80711b) && Intrinsics.f(this.f80712c, pixQrRequestContract$InputData.f80712c);
    }

    public final int hashCode() {
        int iHashCode = this.f80710a.hashCode() * 31;
        PixKey pixKey = this.f80711b;
        int iHashCode2 = (iHashCode + (pixKey == null ? 0 : pixKey.hashCode())) * 31;
        d dVar = this.f80712c;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80710a, i);
        dest.writeParcelable(this.f80711b, i);
        dest.writeSerializable(this.f80712c);
    }
}
