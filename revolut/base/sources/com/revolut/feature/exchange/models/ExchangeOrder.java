package com.revolut.feature.exchange.models;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import wd6.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrder;", "Landroid/os/Parcelable;", "<init>", "()V", "Active", "Completed", "Failed", "Lcom/revolut/feature/exchange/models/ExchangeOrder$Active;", "Lcom/revolut/feature/exchange/models/ExchangeOrder$Completed;", "Lcom/revolut/feature/exchange/models/ExchangeOrder$Failed;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ExchangeOrder implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrder$Active;", "Lcom/revolut/feature/exchange/models/ExchangeOrder;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Active extends ExchangeOrder {

        @NotNull
        public static final Parcelable.Creator<Active> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrderInfo f72129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExchangeOrderInfo f72130b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<ExchangeOrderInfo> creator = ExchangeOrderInfo.CREATOR;
                return new Active(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Active[i];
            }
        }

        public Active(ExchangeOrderInfo orderInfo, ExchangeOrderInfo exchangeOrderInfo) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            this.f72129a = orderInfo;
            this.f72130b = exchangeOrderInfo;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ExchangeOrderInfo getF72134a() {
            return this.f72129a;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ExchangeOrderInfo getF72135b() {
            return this.f72130b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Active)) {
                return false;
            }
            Active active = (Active) obj2;
            return Intrinsics.f(this.f72129a, active.f72129a) && Intrinsics.f(this.f72130b, active.f72130b);
        }

        public final int hashCode() {
            int iHashCode = this.f72129a.hashCode() * 31;
            ExchangeOrderInfo exchangeOrderInfo = this.f72130b;
            return iHashCode + (exchangeOrderInfo == null ? 0 : exchangeOrderInfo.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72129a.writeToParcel(dest, i);
            ExchangeOrderInfo exchangeOrderInfo = this.f72130b;
            if (exchangeOrderInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                exchangeOrderInfo.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrder$Completed;", "Lcom/revolut/feature/exchange/models/ExchangeOrder;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Completed extends ExchangeOrder {

        @NotNull
        public static final Parcelable.Creator<Completed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrderInfo f72131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExchangeOrderInfo f72132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final double f72133c;
        public final d d;
        public final d e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<ExchangeOrderInfo> creator = ExchangeOrderInfo.CREATOR;
                return new Completed(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readDouble(), (d) parcel.readSerializable(), (d) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Completed[i];
            }
        }

        public Completed(ExchangeOrderInfo orderInfo, ExchangeOrderInfo exchangeOrderInfo, double d, d exchangedBaseAmount, d exchangedCounterAmount) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            Intrinsics.checkNotNullParameter(exchangedBaseAmount, "exchangedBaseAmount");
            Intrinsics.checkNotNullParameter(exchangedCounterAmount, "exchangedCounterAmount");
            this.f72131a = orderInfo;
            this.f72132b = exchangeOrderInfo;
            this.f72133c = d;
            this.d = exchangedBaseAmount;
            this.e = exchangedCounterAmount;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ExchangeOrderInfo getF72134a() {
            return this.f72131a;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ExchangeOrderInfo getF72135b() {
            return this.f72132b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Completed)) {
                return false;
            }
            Completed completed = (Completed) obj2;
            return Intrinsics.f(this.f72131a, completed.f72131a) && Intrinsics.f(this.f72132b, completed.f72132b) && Double.compare(this.f72133c, completed.f72133c) == 0 && Intrinsics.f(this.d, completed.d) && Intrinsics.f(this.e, completed.e);
        }

        public final int hashCode() {
            int iHashCode = this.f72131a.hashCode() * 31;
            ExchangeOrderInfo exchangeOrderInfo = this.f72132b;
            return this.e.hashCode() + v7.c(b.c((iHashCode + (exchangeOrderInfo == null ? 0 : exchangeOrderInfo.hashCode())) * 31, this.f72133c, 31), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72131a.writeToParcel(dest, i);
            ExchangeOrderInfo exchangeOrderInfo = this.f72132b;
            if (exchangeOrderInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                exchangeOrderInfo.writeToParcel(dest, i);
            }
            dest.writeDouble(this.f72133c);
            dest.writeSerializable(this.d);
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/exchange/models/ExchangeOrder$Failed;", "Lcom/revolut/feature/exchange/models/ExchangeOrder;", "", "toString", "()Ljava/lang/String;", "feature_exchange_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Failed extends ExchangeOrder {

        @NotNull
        public static final Parcelable.Creator<Failed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrderInfo f72134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExchangeOrderInfo f72135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f72136c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                Parcelable.Creator<ExchangeOrderInfo> creator = ExchangeOrderInfo.CREATOR;
                return new Failed(creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Failed[i];
            }
        }

        public Failed(ExchangeOrderInfo orderInfo, ExchangeOrderInfo exchangeOrderInfo, g error) {
            Intrinsics.checkNotNullParameter(orderInfo, "orderInfo");
            Intrinsics.checkNotNullParameter(error, "error");
            this.f72134a = orderInfo;
            this.f72135b = exchangeOrderInfo;
            this.f72136c = error;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: a, reason: from getter */
        public final ExchangeOrderInfo getF72134a() {
            return this.f72134a;
        }

        @Override // com.revolut.feature.exchange.models.ExchangeOrder
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ExchangeOrderInfo getF72135b() {
            return this.f72135b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj2;
            return Intrinsics.f(this.f72134a, failed.f72134a) && Intrinsics.f(this.f72135b, failed.f72135b) && this.f72136c == failed.f72136c;
        }

        public final int hashCode() {
            int iHashCode = this.f72134a.hashCode() * 31;
            ExchangeOrderInfo exchangeOrderInfo = this.f72135b;
            return this.f72136c.hashCode() + ((iHashCode + (exchangeOrderInfo == null ? 0 : exchangeOrderInfo.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f72134a.writeToParcel(dest, i);
            ExchangeOrderInfo exchangeOrderInfo = this.f72135b;
            if (exchangeOrderInfo == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                exchangeOrderInfo.writeToParcel(dest, i);
            }
            dest.writeString(this.f72136c.name());
        }
    }

    private ExchangeOrder() {
    }

    /* JADX INFO: renamed from: a */
    public abstract ExchangeOrderInfo getF72134a();

    /* JADX INFO: renamed from: b */
    public abstract ExchangeOrderInfo getF72135b();
}
