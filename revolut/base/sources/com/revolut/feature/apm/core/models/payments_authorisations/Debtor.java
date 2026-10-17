package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Debtor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Debtor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Debtor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f62015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Identification f62016b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Debtor(parcel.readString(), parcel.readInt() == 0 ? null : Identification.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Debtor[i];
        }
    }

    public Debtor(String name, Identification identification) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f62015a = name;
        this.f62016b = identification;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Debtor)) {
            return false;
        }
        Debtor debtor = (Debtor) obj2;
        return Intrinsics.f(this.f62015a, debtor.f62015a) && Intrinsics.f(this.f62016b, debtor.f62016b);
    }

    public final int hashCode() {
        int iHashCode = this.f62015a.hashCode() * 31;
        Identification identification = this.f62016b;
        return iHashCode + (identification == null ? 0 : identification.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f62015a);
        Identification identification = this.f62016b;
        if (identification == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            identification.writeToParcel(dest, i);
        }
    }
}
