package com.revolut.feature.retail.cfd.impl.screens.margin;

import android.os.Parcel;
import android.os.Parcelable;
import ej0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType", "Landroid/os/Parcelable;", "Market", "Limit", "Stop", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Limit;", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Market;", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Stop;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Limit;", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limit implements CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f82223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e2b.a f82224b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Limit[i];
            }
        }

        public Limit(b targetPrice) {
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            this.f82223a = targetPrice;
            this.f82224b = e2b.a.LIMIT;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Limit) && Intrinsics.f(this.f82223a, ((Limit) obj2).f82223a);
        }

        @Override // com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final e2b.a getF82228b() {
            return this.f82224b;
        }

        public final int hashCode() {
            return this.f82223a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82223a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Market;", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Market implements CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Market f82225a = new Market();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e2b.a f82226b = e2b.a.MARKET;

        @NotNull
        public static final Parcelable.Creator<Market> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Market.f82225a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Market[i];
            }
        }

        private Market() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType
        /* JADX INFO: renamed from: getType */
        public final e2b.a getF82228b() {
            return f82226b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType$Stop;", "Lcom/revolut/feature/retail/cfd/impl/screens/margin/CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Stop implements CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType {

        @NotNull
        public static final Parcelable.Creator<Stop> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f82227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e2b.a f82228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Stop((b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Stop[i];
            }
        }

        public Stop(b targetPrice) {
            Intrinsics.checkNotNullParameter(targetPrice, "targetPrice");
            this.f82227a = targetPrice;
            this.f82228b = e2b.a.STOP;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Stop) && Intrinsics.f(this.f82227a, ((Stop) obj2).f82227a);
        }

        @Override // com.revolut.feature.retail.cfd.impl.screens.margin.CfdMarginBreakdownControllerContract$CfdMarginBreakdownOrderType
        /* JADX INFO: renamed from: getType, reason: from getter */
        public final e2b.a getF82228b() {
            return this.f82228b;
        }

        public final int hashCode() {
            return this.f82227a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f82227a);
        }
    }

    /* JADX INFO: renamed from: getType */
    e2b.a getF82228b();
}
