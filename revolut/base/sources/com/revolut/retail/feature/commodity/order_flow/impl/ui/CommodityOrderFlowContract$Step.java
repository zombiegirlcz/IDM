package com.revolut.retail.feature.commodity.order_flow.impl.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Edit", "ScaPrompt", "Review", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$Edit;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$Review;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$ScaPrompt;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CommodityOrderFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$Edit;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step;", "<init>", "()V", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Edit extends CommodityOrderFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Edit f99812a = new Edit();

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Edit.f99812a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        private Edit() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$Review;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Review extends CommodityOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Review> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ExchangeOrderDraft f99813a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Review(ExchangeOrderDraft.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Review[i];
            }
        }

        public Review(ExchangeOrderDraft exchangeOrderDraft) {
            Intrinsics.checkNotNullParameter(exchangeOrderDraft, "exchangeOrderDraft");
            this.f99813a = exchangeOrderDraft;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Review) && Intrinsics.f(this.f99813a, ((Review) obj2).f99813a);
        }

        public final int hashCode() {
            return this.f99813a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f99813a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step$ScaPrompt;", "Lcom/revolut/retail/feature/commodity/order_flow/impl/ui/CommodityOrderFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_commodity_order_flow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ScaPrompt extends CommodityOrderFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ScaPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f99814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExchangeOrderDraft f99815b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ScaPrompt(ExchangeOrderDraft.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ScaPrompt[i];
            }
        }

        public ScaPrompt(ExchangeOrderDraft exchangeOrderDraft, String legalEntityId) {
            Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
            Intrinsics.checkNotNullParameter(exchangeOrderDraft, "exchangeOrderDraft");
            this.f99814a = legalEntityId;
            this.f99815b = exchangeOrderDraft;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ScaPrompt)) {
                return false;
            }
            ScaPrompt scaPrompt = (ScaPrompt) obj2;
            return Intrinsics.f(this.f99814a, scaPrompt.f99814a) && Intrinsics.f(this.f99815b, scaPrompt.f99815b);
        }

        public final int hashCode() {
            return this.f99815b.hashCode() + (this.f99814a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f99814a);
            this.f99815b.writeToParcel(dest, i);
        }
    }

    private CommodityOrderFlowContract$Step() {
    }
}
