package com.revolut.feature.retail.cfd.impl.flows.position;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import bfl.g;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Positions", "OrderReview", "Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step$Positions;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdPositionFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step$OrderReview;", "Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OrderReview implements CfdPositionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<OrderReview> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82190a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f82191b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82192c;
        public final BigDecimal d;
        public final g e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OrderReview(parcel.readString(), (n) parcel.readSerializable(), parcel.readString(), (BigDecimal) parcel.readSerializable(), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OrderReview[i];
            }
        }

        public OrderReview(String portfolioId, n instrument, String positionId, BigDecimal assetQuantity, g tradeSide) {
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
            Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
            this.f82190a = portfolioId;
            this.f82191b = instrument;
            this.f82192c = positionId;
            this.d = assetQuantity;
            this.e = tradeSide;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof OrderReview)) {
                return false;
            }
            OrderReview orderReview = (OrderReview) obj2;
            return Intrinsics.f(this.f82190a, orderReview.f82190a) && Intrinsics.f(this.f82191b, orderReview.f82191b) && Intrinsics.f(this.f82192c, orderReview.f82192c) && Intrinsics.f(this.d, orderReview.d) && this.e == orderReview.e;
        }

        public final int hashCode() {
            return this.e.hashCode() + t61.a.d(this.d, p.a.c(b.d(this.f82191b, this.f82190a.hashCode() * 31, 31), 31, this.f82192c), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82190a);
            dest.writeSerializable(this.f82191b);
            dest.writeString(this.f82192c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step$Positions;", "Lcom/revolut/feature/retail/cfd/impl/flows/position/CfdPositionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Positions implements CfdPositionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Positions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f82193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f82194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f82195c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Positions(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Positions[i];
            }
        }

        public Positions(String instrumentRef, String portfolioId, String str, boolean z) {
            Intrinsics.checkNotNullParameter(instrumentRef, "instrumentRef");
            Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
            this.f82193a = instrumentRef;
            this.f82194b = portfolioId;
            this.f82195c = str;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Positions)) {
                return false;
            }
            Positions positions = (Positions) obj2;
            return Intrinsics.f(this.f82193a, positions.f82193a) && Intrinsics.f(this.f82194b, positions.f82194b) && Intrinsics.f(this.f82195c, positions.f82195c) && this.d == positions.d;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f82193a.hashCode() * 31, 31, this.f82194b);
            String str = this.f82195c;
            return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f82193a);
            dest.writeString(this.f82194b);
            dest.writeString(this.f82195c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }
}
