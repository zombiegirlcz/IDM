package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.models;

import android.os.Parcel;
import android.os.Parcelable;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/models/MultiIbanPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiIbanPayload implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultiIbanPayload> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f80874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f80875c;
    public final xi0.b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MultiIbanPayload((b) parcel.readSerializable(), parcel.readString(), l.valueOf(parcel.readString()), (xi0.b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultiIbanPayload[i];
        }
    }

    public MultiIbanPayload(b selectedCountry, String walletId, l pocketType, xi0.b currency) {
        Intrinsics.checkNotNullParameter(selectedCountry, "selectedCountry");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f80873a = selectedCountry;
        this.f80874b = walletId;
        this.f80875c = pocketType;
        this.d = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultiIbanPayload)) {
            return false;
        }
        MultiIbanPayload multiIbanPayload = (MultiIbanPayload) obj2;
        return Intrinsics.f(this.f80873a, multiIbanPayload.f80873a) && Intrinsics.f(this.f80874b, multiIbanPayload.f80874b) && this.f80875c == multiIbanPayload.f80875c && Intrinsics.f(this.d, multiIbanPayload.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.c(this.f80875c, p.a.c(this.f80873a.f297794a.hashCode() * 31, 31, this.f80874b), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80873a);
        dest.writeString(this.f80874b);
        dest.writeString(this.f80875c.name());
        dest.writeSerializable(this.d);
    }
}
