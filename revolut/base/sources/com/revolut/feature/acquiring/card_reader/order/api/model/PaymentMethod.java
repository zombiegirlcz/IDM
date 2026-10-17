package com.revolut.feature.acquiring.card_reader.order.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ya1.m;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/PaymentMethod;", "Landroid/os/Parcelable;", "<init>", "()V", "Wallet", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/PaymentMethod$Wallet;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PaymentMethod implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/PaymentMethod$Wallet;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/PaymentMethod;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Wallet extends PaymentMethod {

        @NotNull
        public static final Parcelable.Creator<Wallet> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f60580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f60581c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Wallet(parcel.readString(), m.valueOf(parcel.readString()), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Wallet[i];
            }
        }

        public Wallet(String id10, m type, d balance) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(balance, "balance");
            this.f60579a = id10;
            this.f60580b = type;
            this.f60581c = balance;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Wallet)) {
                return false;
            }
            Wallet wallet = (Wallet) obj2;
            return Intrinsics.f(this.f60579a, wallet.f60579a) && this.f60580b == wallet.f60580b && Intrinsics.f(this.f60581c, wallet.f60581c);
        }

        @Override // com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod
        public final String getCurrency() {
            return this.f60581c.f115083b.f306286a;
        }

        public final int hashCode() {
            return this.f60581c.hashCode() + ((this.f60580b.hashCode() + (this.f60579a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60579a);
            dest.writeString(this.f60580b.name());
            dest.writeSerializable(this.f60581c);
        }
    }

    private PaymentMethod() {
    }

    public abstract String getCurrency();
}
