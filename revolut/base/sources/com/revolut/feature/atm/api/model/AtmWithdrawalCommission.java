package com.revolut.feature.atm.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r6.b;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/atm/api/model/AtmWithdrawalCommission;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_atm_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AtmWithdrawalCommission implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AtmWithdrawalCommission> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f63140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f63141b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AtmWithdrawalCommission(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AtmWithdrawalCommission[i];
        }
    }

    public AtmWithdrawalCommission(Float f, d dVar) {
        this.f63140a = f;
        this.f63141b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AtmWithdrawalCommission)) {
            return false;
        }
        AtmWithdrawalCommission atmWithdrawalCommission = (AtmWithdrawalCommission) obj2;
        return Intrinsics.f(this.f63140a, atmWithdrawalCommission.f63140a) && Intrinsics.f(this.f63141b, atmWithdrawalCommission.f63141b);
    }

    public final int hashCode() {
        Float f = this.f63140a;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        d dVar = this.f63141b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Float f = this.f63140a;
        if (f == null) {
            dest.writeInt(0);
        } else {
            b.p(dest, 1, f);
        }
        dest.writeSerializable(this.f63141b);
    }
}
