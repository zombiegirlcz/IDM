package com.revolut.feature.bank_transfer.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.address.models.Address;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/bank_transfer/models/UltimateDebtor;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_bank_transfer_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UltimateDebtor implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<UltimateDebtor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Address f64086b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UltimateDebtor(parcel.readString(), (Address) parcel.readParcelable(UltimateDebtor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UltimateDebtor[i];
        }
    }

    public UltimateDebtor(String name, Address address) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.f64085a = name;
        this.f64086b = address;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UltimateDebtor)) {
            return false;
        }
        UltimateDebtor ultimateDebtor = (UltimateDebtor) obj2;
        return Intrinsics.f(this.f64085a, ultimateDebtor.f64085a) && Intrinsics.f(this.f64086b, ultimateDebtor.f64086b);
    }

    public final int hashCode() {
        return this.f64086b.hashCode() + (this.f64085a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64085a);
        dest.writeParcelable(this.f64086b, i);
    }
}
