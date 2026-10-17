package com.revolut.feature_exchange.api.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_exchange/api/models/ExchangePocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_exchange_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangePocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangePocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96822a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f96823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f96824c;
    public final long d;
    public final i e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangePocket(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangePocket[i];
        }
    }

    public ExchangePocket(String id10, String currency, long j2, long j3, i type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f96822a = id10;
        this.f96823b = currency;
        this.f96824c = j2;
        this.d = j3;
        this.e = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ExchangePocket)) {
            return false;
        }
        ExchangePocket exchangePocket = (ExchangePocket) obj2;
        return Intrinsics.f(this.f96822a, exchangePocket.f96822a) && Intrinsics.f(this.f96823b, exchangePocket.f96823b) && this.f96824c == exchangePocket.f96824c && this.d == exchangePocket.d && this.e == exchangePocket.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + d.c(d.c(p.a.c(this.f96822a.hashCode() * 31, 31, this.f96823b), 31, this.f96824c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96822a);
        dest.writeString(this.f96823b);
        dest.writeLong(this.f96824c);
        dest.writeLong(this.d);
        dest.writeString(this.e.name());
    }
}
