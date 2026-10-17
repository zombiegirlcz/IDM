package com.revolut.feature.credit.card.api.models.credit_limit_cap;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/credit_limit_cap/ImpactedCardholder;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ImpactedCardholder implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ImpactedCardholder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68723c;
    public final d d;
    public final d e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ImpactedCardholder(parcel.readString(), parcel.readString(), parcel.readString(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ImpactedCardholder[i];
        }
    }

    public ImpactedCardholder(String cardholderId, String firstName, String lastName, d currentMonthlyLimit, d cappedMonthlyLimit) {
        Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(currentMonthlyLimit, "currentMonthlyLimit");
        Intrinsics.checkNotNullParameter(cappedMonthlyLimit, "cappedMonthlyLimit");
        this.f68721a = cardholderId;
        this.f68722b = firstName;
        this.f68723c = lastName;
        this.d = currentMonthlyLimit;
        this.e = cappedMonthlyLimit;
        this.f = com.google.android.gms.internal.mlkit_vision_face.a.o(firstName, " ", lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ImpactedCardholder)) {
            return false;
        }
        ImpactedCardholder impactedCardholder = (ImpactedCardholder) obj2;
        return Intrinsics.f(this.f68721a, impactedCardholder.f68721a) && Intrinsics.f(this.f68722b, impactedCardholder.f68722b) && Intrinsics.f(this.f68723c, impactedCardholder.f68723c) && Intrinsics.f(this.d, impactedCardholder.d) && Intrinsics.f(this.e, impactedCardholder.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + v7.c(p.a.c(p.a.c(this.f68721a.hashCode() * 31, 31, this.f68722b), 31, this.f68723c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68721a);
        dest.writeString(this.f68722b);
        dest.writeString(this.f68723c);
        dest.writeSerializable(this.d);
        dest.writeSerializable(this.e);
    }
}
