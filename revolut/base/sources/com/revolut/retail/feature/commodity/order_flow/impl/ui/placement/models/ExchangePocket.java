package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wd6.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/placement/models/ExchangePocket;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExchangePocket implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ExchangePocket> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f99901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f99902c;
    public final i d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExchangePocket(parcel.readString(), parcel.readString(), parcel.readLong(), i.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ExchangePocket[i];
        }
    }

    public ExchangePocket(String id10, String currency, long j2, i type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f99900a = id10;
        this.f99901b = currency;
        this.f99902c = j2;
        this.d = type;
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
        return Intrinsics.f(this.f99900a, exchangePocket.f99900a) && Intrinsics.f(this.f99901b, exchangePocket.f99901b) && this.f99902c == exchangePocket.f99902c && this.d == exchangePocket.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + d.c(p.a.c(this.f99900a.hashCode() * 31, 31, this.f99901b), 31, this.f99902c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99900a);
        dest.writeString(this.f99901b);
        dest.writeLong(this.f99902c);
        dest.writeString(this.d.name());
    }
}
