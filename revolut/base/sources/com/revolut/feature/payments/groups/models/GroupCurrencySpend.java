package com.revolut.feature.payments.groups.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/groups/models/GroupCurrencySpend;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupCurrencySpend implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GroupCurrencySpend> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f79500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f79501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f79502c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GroupCurrencySpend((d) parcel.readSerializable(), (d) parcel.readSerializable(), (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupCurrencySpend[i];
        }
    }

    public GroupCurrencySpend(d amount, d amountInBaseCurrency, b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(amountInBaseCurrency, "amountInBaseCurrency");
        this.f79500a = currency;
        this.f79501b = amount;
        this.f79502c = amountInBaseCurrency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof GroupCurrencySpend)) {
            return false;
        }
        GroupCurrencySpend groupCurrencySpend = (GroupCurrencySpend) obj2;
        return Intrinsics.f(this.f79500a, groupCurrencySpend.f79500a) && Intrinsics.f(this.f79501b, groupCurrencySpend.f79501b) && Intrinsics.f(this.f79502c, groupCurrencySpend.f79502c);
    }

    public final int hashCode() {
        return this.f79502c.hashCode() + v7.c(this.f79500a.hashCode() * 31, 31, this.f79501b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f79500a);
        dest.writeSerializable(this.f79501b);
        dest.writeSerializable(this.f79502c);
    }
}
