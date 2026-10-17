package com.revolut.feature.acquiring.card_reader.order.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT;", "Landroid/os/Parcelable;", "<init>", "()V", "Unknown", "VAT", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT$Unknown;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT$VAT;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductVAT implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT$Unknown;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT;", "<init>", "()V", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Unknown extends ProductVAT {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unknown f60582a = new Unknown();

        @NotNull
        public static final Parcelable.Creator<Unknown> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Unknown.f60582a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unknown[i];
            }
        }

        private Unknown() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT$VAT;", "Lcom/revolut/feature/acquiring/card_reader/order/api/model/ProductVAT;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class VAT extends ProductVAT {

        @NotNull
        public static final Parcelable.Creator<VAT> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f60583a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new VAT(parcel.readDouble());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new VAT[i];
            }
        }

        public VAT(double d) {
            this.f60583a = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof VAT) && Double.compare(this.f60583a, ((VAT) obj2).f60583a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.f60583a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeDouble(this.f60583a);
        }
    }

    private ProductVAT() {
    }
}
