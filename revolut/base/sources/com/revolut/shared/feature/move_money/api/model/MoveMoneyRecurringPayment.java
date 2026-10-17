package com.revolut.shared.feature.move_money.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared.recurring_payments.models.WalletAutomation;
import ibd.a;
import ibd.e;
import ibd.f;
import ibd.h;
import ibd.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/shared/feature/move_money/api/model/MoveMoneyRecurringPayment;", "Libd/i;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_shared_move_money_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoveMoneyRecurringPayment implements i, Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f104804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f104805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104806c;
    public final Long d;
    public final String e;
    public final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f104807g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final WalletAutomation f104808h;
    public final String i;

    @NotNull
    public static final Parcelable.Creator<MoveMoneyRecurringPayment> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoveMoneyRecurringPayment((e) parcel.readSerializable(), f.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), (a) parcel.readSerializable(), (a) parcel.readSerializable(), (WalletAutomation) parcel.readParcelable(MoveMoneyRecurringPayment.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoveMoneyRecurringPayment[i];
        }
    }

    public MoveMoneyRecurringPayment(e recurringPaymentShort, f state, String currency, Long l2, String str, a aVar, a aVar2, WalletAutomation walletAutomation, String str2) {
        Intrinsics.checkNotNullParameter(recurringPaymentShort, "recurringPaymentShort");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f104804a = recurringPaymentShort;
        this.f104805b = state;
        this.f104806c = currency;
        this.d = l2;
        this.e = str;
        this.f = aVar;
        this.f104807g = aVar2;
        this.f104808h = walletAutomation;
        this.i = str2;
    }

    @Override // ibd.i
    public final Period L() {
        return this.f104804a.f160151b;
    }

    @Override // ibd.i
    public final LocalDate Q() {
        return this.f104804a.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoveMoneyRecurringPayment)) {
            return false;
        }
        MoveMoneyRecurringPayment moveMoneyRecurringPayment = (MoveMoneyRecurringPayment) obj2;
        return Intrinsics.f(this.f104804a, moveMoneyRecurringPayment.f104804a) && this.f104805b == moveMoneyRecurringPayment.f104805b && Intrinsics.f(this.f104806c, moveMoneyRecurringPayment.f104806c) && Intrinsics.f(this.d, moveMoneyRecurringPayment.d) && Intrinsics.f(this.e, moveMoneyRecurringPayment.e) && Intrinsics.f(this.f, moveMoneyRecurringPayment.f) && Intrinsics.f(this.f104807g, moveMoneyRecurringPayment.f104807g) && Intrinsics.f(this.f104808h, moveMoneyRecurringPayment.f104808h) && Intrinsics.f(this.i, moveMoneyRecurringPayment.i);
    }

    @Override // ibd.i
    public final String getId() {
        return this.f104804a.f160150a;
    }

    @Override // ibd.i
    public final Boolean getRecurring() {
        return this.f104804a.f160153g;
    }

    @Override // ibd.i
    public final h getType() {
        return this.f104804a.f160152c;
    }

    public final int hashCode() {
        int iC = p.a.c((this.f104805b.hashCode() + (this.f104804a.hashCode() * 31)) * 31, 31, this.f104806c);
        Long l2 = this.d;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        a aVar2 = this.f104807g;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        WalletAutomation walletAutomation = this.f104808h;
        int iHashCode5 = (iHashCode4 + (walletAutomation == null ? 0 : walletAutomation.hashCode())) * 31;
        String str2 = this.i;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // ibd.i
    public final LocalDate n2() {
        return this.f104804a.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f104804a);
        dest.writeString(this.f104805b.name());
        dest.writeString(this.f104806c);
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            m72.b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f104807g);
        dest.writeParcelable(this.f104808h, i);
        dest.writeString(this.i);
    }
}
