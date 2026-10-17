package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.e;
import wp5.y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeLinkedOrderSpec;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangeLinkedOrderSpec implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangeLinkedOrderSpec> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f72126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f72127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Pair f72128c;
    public final d d;
    public final Double e;
    public final Double f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangeLinkedOrderSpec(parcel.readDouble(), e.valueOf(parcel.readString()), (Pair) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangeLinkedOrderSpec[i];
        }
    }

    public ExchangeLinkedOrderSpec(double d, e exchangeMode, Pair currencyPair, d amount, Double d5, Double d6) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f72126a = d;
        this.f72127b = exchangeMode;
        this.f72128c = currencyPair;
        this.d = amount;
        this.e = d5;
        this.f = d6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangeLinkedOrderSpec)) {
            return false;
        }
        ExchangeLinkedOrderSpec exchangeLinkedOrderSpec = (ExchangeLinkedOrderSpec) obj2;
        return Double.compare(this.f72126a, exchangeLinkedOrderSpec.f72126a) == 0 && this.f72127b == exchangeLinkedOrderSpec.f72127b && Intrinsics.f(this.f72128c, exchangeLinkedOrderSpec.f72128c) && Intrinsics.f(this.d, exchangeLinkedOrderSpec.d) && Intrinsics.f(this.e, exchangeLinkedOrderSpec.e) && Intrinsics.f(this.f, exchangeLinkedOrderSpec.f);
    }

    public final int hashCode() {
        int iC = v7.c((this.f72128c.hashCode() + y.g(this.f72127b, Double.hashCode(this.f72126a) * 31, 31)) * 31, 31, this.d);
        Double d = this.e;
        int iHashCode = (iC + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.f;
        return iHashCode + (d5 != null ? d5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeDouble(this.f72126a);
        dest.writeString(this.f72127b.name());
        dest.writeSerializable(this.f72128c);
        dest.writeSerializable(this.d);
        Double d = this.e;
        if (d == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
        }
        Double d5 = this.f;
        if (d5 == null) {
            dest.writeInt(0);
        } else {
            org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d5);
        }
    }
}
