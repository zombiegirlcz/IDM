package com.revolut.feature.credit.card.api.models.creditcard;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ll4.b0;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/creditcard/CreditCardSecurityDeposit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardSecurityDeposit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardSecurityDeposit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f68756c;
    public final long d;
    public final long e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f68757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WithdrawalAvailability f68758h;
    public final b0 i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardSecurityDeposit(parcel.readString(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readLong(), parcel.readLong(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : WithdrawalAvailability.CREATOR.createFromParcel(parcel), b0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardSecurityDeposit[i];
        }
    }

    public CreditCardSecurityDeposit(String pocketId, long j2, b currency, long j3, long j5, int i, boolean z, WithdrawalAvailability withdrawalAvailability, b0 securityCoverage) {
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(securityCoverage, "securityCoverage");
        this.f68754a = pocketId;
        this.f68755b = j2;
        this.f68756c = currency;
        this.d = j3;
        this.e = j5;
        this.f = i;
        this.f68757g = z;
        this.f68758h = withdrawalAvailability;
        this.i = securityCoverage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardSecurityDeposit)) {
            return false;
        }
        CreditCardSecurityDeposit creditCardSecurityDeposit = (CreditCardSecurityDeposit) obj2;
        return Intrinsics.f(this.f68754a, creditCardSecurityDeposit.f68754a) && this.f68755b == creditCardSecurityDeposit.f68755b && Intrinsics.f(this.f68756c, creditCardSecurityDeposit.f68756c) && this.d == creditCardSecurityDeposit.d && this.e == creditCardSecurityDeposit.e && this.f == creditCardSecurityDeposit.f && this.f68757g == creditCardSecurityDeposit.f68757g && Intrinsics.f(this.f68758h, creditCardSecurityDeposit.f68758h) && this.i == creditCardSecurityDeposit.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.b(this.f, d.c(d.c(l.j(this.f68756c, d.c(this.f68754a.hashCode() * 31, 31, this.f68755b), 31), 31, this.d), 31, this.e), 31), 31, this.f68757g);
        WithdrawalAvailability withdrawalAvailability = this.f68758h;
        return this.i.hashCode() + ((iC + (withdrawalAvailability == null ? 0 : withdrawalAvailability.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68754a);
        dest.writeLong(this.f68755b);
        dest.writeSerializable(this.f68756c);
        dest.writeLong(this.d);
        dest.writeLong(this.e);
        dest.writeInt(this.f);
        dest.writeInt(this.f68757g ? 1 : 0);
        WithdrawalAvailability withdrawalAvailability = this.f68758h;
        if (withdrawalAvailability == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            withdrawalAvailability.writeToParcel(dest, i);
        }
        dest.writeString(this.i.name());
    }
}
