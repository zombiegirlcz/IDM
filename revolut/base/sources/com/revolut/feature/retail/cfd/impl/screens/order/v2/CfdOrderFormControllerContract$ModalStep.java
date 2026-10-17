package com.revolut.feature.retail.cfd.impl.screens.order.v2;

import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "TargetPrice", "Tutorial", "ExposureBreakdown", "ReduceOnlyInfo", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$ExposureBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$ReduceOnlyInfo;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$TargetPrice;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$Tutorial;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdOrderFormControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$ExposureBreakdown;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExposureBreakdown implements CfdOrderFormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ExposureBreakdown> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82239a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BigDecimal f82240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f82241c;
        public final CfdExposureBreakdownTarget d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ExposureBreakdown(parcel.readString(), (BigDecimal) parcel.readSerializable(), g.valueOf(parcel.readString()), (CfdExposureBreakdownTarget) parcel.readParcelable(ExposureBreakdown.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ExposureBreakdown[i];
            }
        }

        public ExposureBreakdown(String instrumentRef, BigDecimal quantity, g tradeSide, CfdExposureBreakdownTarget exposureTarget) {
            Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            Intrinsics.checkNotNullParameter(exposureTarget, "exposureTarget");
            this.f82239a = instrumentRef;
            this.f82240b = quantity;
            this.f82241c = tradeSide;
            this.d = exposureTarget;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ExposureBreakdown)) {
                return false;
            }
            ExposureBreakdown exposureBreakdown = (ExposureBreakdown) obj2;
            return Intrinsics.f(this.f82239a, exposureBreakdown.f82239a) && Intrinsics.f(this.f82240b, exposureBreakdown.f82240b) && this.f82241c == exposureBreakdown.f82241c && Intrinsics.f(this.d, exposureBreakdown.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + y.b(this.f82241c, t61.a.d(this.f82240b, this.f82239a.hashCode() * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82239a);
            dest.writeSerializable(this.f82240b);
            dest.writeString(this.f82241c.name());
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$ReduceOnlyInfo;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ReduceOnlyInfo implements CfdOrderFormControllerContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ReduceOnlyInfo f82242a = new ReduceOnlyInfo();

        @NotNull
        public static final Parcelable.Creator<ReduceOnlyInfo> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ReduceOnlyInfo.f82242a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ReduceOnlyInfo[i];
            }
        }

        private ReduceOnlyInfo() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$TargetPrice;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TargetPrice implements CfdOrderFormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<TargetPrice> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e2b.a f82243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f82244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82245c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TargetPrice(e2b.a.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TargetPrice[i];
            }
        }

        public TargetPrice(e2b.a orderType, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82243a = orderType;
            this.f82244b = z;
            this.f82245c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof TargetPrice)) {
                return false;
            }
            TargetPrice targetPrice = (TargetPrice) obj2;
            return this.f82243a == targetPrice.f82243a && this.f82244b == targetPrice.f82244b && this.f82245c == targetPrice.f82245c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f82245c) + j6.a.c(this.f82243a.hashCode() * 31, 31, this.f82244b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82243a.name());
            dest.writeInt(this.f82244b ? 1 : 0);
            dest.writeInt(this.f82245c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep$Tutorial;", "Lcom/revolut/feature/retail/cfd/impl/screens/order/v2/CfdOrderFormControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tutorial implements CfdOrderFormControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Tutorial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e2b.a f82246a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tutorial(e2b.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tutorial[i];
            }
        }

        public Tutorial(e2b.a orderType) {
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            this.f82246a = orderType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tutorial) && this.f82246a == ((Tutorial) obj2).f82246a;
        }

        public final int hashCode() {
            return this.f82246a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82246a.name());
        }
    }
}
