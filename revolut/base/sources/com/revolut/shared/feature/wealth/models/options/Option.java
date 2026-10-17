package com.revolut.shared.feature.wealth.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import h30.l;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/options/Option;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Option implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Option> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f105139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f105140c;
    public final qel.b d;
    public final int e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qel.a f105141g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Option(parcel.readString(), (b) parcel.readSerializable(), (xi0.b) parcel.readSerializable(), qel.b.valueOf(parcel.readString()), parcel.readInt(), (LocalDate) parcel.readSerializable(), qel.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Option[i];
        }
    }

    public Option(String ref2, b strikePrice, xi0.b currency, qel.b contractType, int i, LocalDate expirationDate, qel.a status) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(strikePrice, "strikePrice");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(expirationDate, "expirationDate");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f105138a = ref2;
        this.f105139b = strikePrice;
        this.f105140c = currency;
        this.d = contractType;
        this.e = i;
        this.f = expirationDate;
        this.f105141g = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof Option)) {
            return false;
        }
        Option option = (Option) obj2;
        return Intrinsics.f(this.f105138a, option.f105138a) && Intrinsics.f(this.f105139b, option.f105139b) && Intrinsics.f(this.f105140c, option.f105140c) && this.d == option.d && this.e == option.e && Intrinsics.f(this.f, option.f) && this.f105141g == option.f105141g;
    }

    public final int hashCode() {
        return this.f105141g.hashCode() + y.a(j6.a.b(this.e, (this.d.hashCode() + l.j(this.f105140c, org.bouncycastle.jcajce.provider.digest.a.d(this.f105139b, this.f105138a.hashCode() * 31, 31), 31)) * 31, 31), 31, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105138a);
        dest.writeSerializable(this.f105139b);
        dest.writeSerializable(this.f105140c);
        dest.writeString(this.d.name());
        dest.writeInt(this.e);
        dest.writeSerializable(this.f);
        dest.writeString(this.f105141g.name());
    }
}
