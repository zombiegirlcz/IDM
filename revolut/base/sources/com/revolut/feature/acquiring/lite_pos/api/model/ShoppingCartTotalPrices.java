package com.revolut.feature.acquiring.lite_pos.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.c;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/acquiring/lite_pos/api/model/ShoppingCartTotalPrices;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_acquiring_lite_pos_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShoppingCartTotalPrices implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f60691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f60692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f60693c;

    @NotNull
    public static final Parcelable.Creator<ShoppingCartTotalPrices> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShoppingCartTotalPrices((d) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ShoppingCartTotalPrices[i];
        }
    }

    static {
        c cVar = d.Companion;
        cVar.getClass();
        d dVar = d.e;
        cVar.getClass();
        cVar.getClass();
        new ShoppingCartTotalPrices(dVar, dVar, dVar);
    }

    public ShoppingCartTotalPrices(d subtotalAmount, d totalTaxAmount, d totalAmount) {
        Intrinsics.checkNotNullParameter(subtotalAmount, "subtotalAmount");
        Intrinsics.checkNotNullParameter(totalTaxAmount, "totalTaxAmount");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        this.f60691a = subtotalAmount;
        this.f60692b = totalTaxAmount;
        this.f60693c = totalAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ShoppingCartTotalPrices)) {
            return false;
        }
        ShoppingCartTotalPrices shoppingCartTotalPrices = (ShoppingCartTotalPrices) obj2;
        return Intrinsics.f(this.f60691a, shoppingCartTotalPrices.f60691a) && Intrinsics.f(this.f60692b, shoppingCartTotalPrices.f60692b) && Intrinsics.f(this.f60693c, shoppingCartTotalPrices.f60693c);
    }

    public final int hashCode() {
        return this.f60693c.hashCode() + v7.c(this.f60691a.hashCode() * 31, 31, this.f60692b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f60691a);
        dest.writeSerializable(this.f60692b);
        dest.writeSerializable(this.f60693c);
    }
}
