package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/Beneficiary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Beneficiary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Beneficiary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f105175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cfl.a f105177c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Beneficiary((UUID) parcel.readSerializable(), parcel.readString(), parcel.readInt() == 0 ? null : cfl.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Beneficiary[i];
        }
    }

    public Beneficiary(UUID id10, String displayName, cfl.a aVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        this.f105175a = id10;
        this.f105176b = displayName;
        this.f105177c = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Beneficiary)) {
            return false;
        }
        Beneficiary beneficiary = (Beneficiary) obj2;
        return Intrinsics.f(this.f105175a, beneficiary.f105175a) && Intrinsics.f(this.f105176b, beneficiary.f105176b) && this.f105177c == beneficiary.f105177c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f105175a.hashCode() * 31, 31, this.f105176b);
        cfl.a aVar = this.f105177c;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f105175a);
        dest.writeString(this.f105176b);
        cfl.a aVar = this.f105177c;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
    }
}
