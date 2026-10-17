package com.revolut.feature.cards.models.revolutcard;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/cards/models/revolutcard/RevolutCardOtp;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_cards_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutCardOtp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevolutCardOtp> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65546c;
    public final LocationMismatch d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutCardOtp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : LocationMismatch.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutCardOtp[i];
        }
    }

    public RevolutCardOtp(String cardId, String id10, String otp, LocationMismatch locationMismatch, String str) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(otp, "otp");
        this.f65544a = cardId;
        this.f65545b = id10;
        this.f65546c = otp;
        this.d = locationMismatch;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutCardOtp)) {
            return false;
        }
        RevolutCardOtp revolutCardOtp = (RevolutCardOtp) obj2;
        return Intrinsics.f(this.f65544a, revolutCardOtp.f65544a) && Intrinsics.f(this.f65545b, revolutCardOtp.f65545b) && Intrinsics.f(this.f65546c, revolutCardOtp.f65546c) && Intrinsics.f(this.d, revolutCardOtp.d) && Intrinsics.f(this.e, revolutCardOtp.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f65544a.hashCode() * 31, 31, this.f65545b), 31, this.f65546c);
        LocationMismatch locationMismatch = this.d;
        int iHashCode = (iC + (locationMismatch == null ? 0 : locationMismatch.hashCode())) * 31;
        String str = this.e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65544a);
        dest.writeString(this.f65545b);
        dest.writeString(this.f65546c);
        LocationMismatch locationMismatch = this.d;
        if (locationMismatch == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            locationMismatch.writeToParcel(dest, i);
        }
        dest.writeString(this.e);
    }
}
