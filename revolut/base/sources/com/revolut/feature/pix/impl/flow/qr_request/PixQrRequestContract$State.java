package com.revolut.feature.pix.impl.flow.qr_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pix.api.model.PixKey;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pix/impl/flow/qr_request/PixQrRequestContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PixQrRequestContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PixQrRequestContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PixKey f80713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f80714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f80715c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PixQrRequestContract$State((PixKey) parcel.readParcelable(PixQrRequestContract$State.class.getClassLoader()), (d) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PixQrRequestContract$State[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PixQrRequestContract$State() {
        this((PixKey) null, (d) (0 == true ? 1 : 0), 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PixQrRequestContract$State)) {
            return false;
        }
        PixQrRequestContract$State pixQrRequestContract$State = (PixQrRequestContract$State) obj2;
        return Intrinsics.f(this.f80713a, pixQrRequestContract$State.f80713a) && Intrinsics.f(this.f80714b, pixQrRequestContract$State.f80714b) && Intrinsics.f(this.f80715c, pixQrRequestContract$State.f80715c);
    }

    public final int hashCode() {
        PixKey pixKey = this.f80713a;
        int iHashCode = (pixKey == null ? 0 : pixKey.hashCode()) * 31;
        d dVar = this.f80714b;
        int iHashCode2 = (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str = this.f80715c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80713a, i);
        dest.writeSerializable(this.f80714b);
        dest.writeString(this.f80715c);
    }

    public PixQrRequestContract$State(PixKey pixKey, d dVar, String str) {
        this.f80713a = pixKey;
        this.f80714b = dVar;
        this.f80715c = str;
    }

    public /* synthetic */ PixQrRequestContract$State(PixKey pixKey, d dVar, int i) {
        this((i & 1) != 0 ? null : pixKey, (i & 2) != 0 ? null : dVar, (String) null);
    }
}
