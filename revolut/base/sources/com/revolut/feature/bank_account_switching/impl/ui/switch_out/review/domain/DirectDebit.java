package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain;

import android.os.Parcel;
import android.os.Parcelable;
import fva.e;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/bank_account_switching/impl/ui/switch_out/review/domain/DirectDebit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDebit implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DirectDebit> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f64063c;
    public final Long d;
    public final String e;
    public final LocalDate f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDebit(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : e.valueOf(parcel.readString()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString(), (LocalDate) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDebit[i];
        }
    }

    public DirectDebit(String title, String str, e eVar, Long l2, String currency, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f64061a = title;
        this.f64062b = str;
        this.f64063c = eVar;
        this.d = l2;
        this.e = currency;
        this.f = localDate;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDebit)) {
            return false;
        }
        DirectDebit directDebit = (DirectDebit) obj2;
        return Intrinsics.f(this.f64061a, directDebit.f64061a) && Intrinsics.f(this.f64062b, directDebit.f64062b) && this.f64063c == directDebit.f64063c && Intrinsics.f(this.d, directDebit.d) && Intrinsics.f(this.e, directDebit.e) && Intrinsics.f(this.f, directDebit.f);
    }

    public final int hashCode() {
        int iHashCode = this.f64061a.hashCode() * 31;
        String str = this.f64062b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f64063c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        Long l2 = this.d;
        int iC = p.a.c((iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31, 31, this.e);
        LocalDate localDate = this.f;
        return iC + (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64061a);
        dest.writeString(this.f64062b);
        e eVar = this.f64063c;
        if (eVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(eVar.name());
        }
        Long l2 = this.d;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        dest.writeString(this.e);
        dest.writeSerializable(this.f);
    }
}
