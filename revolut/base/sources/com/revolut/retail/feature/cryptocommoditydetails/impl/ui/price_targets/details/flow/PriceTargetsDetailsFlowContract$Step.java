package com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kdj.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Details", "FaqRoot", "FaqLeaf", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$Details;", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$FaqLeaf;", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$FaqRoot;", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PriceTargetsDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$Details;", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step;", "<init>", "()V", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details extends PriceTargetsDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Details f100151a = new Details();

        @NotNull
        public static final Parcelable.Creator<Details> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Details.f100151a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Details[i];
            }
        }

        private Details() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$FaqLeaf;", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FaqLeaf extends PriceTargetsDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<FaqLeaf> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f100152a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FaqLeaf(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaqLeaf[i];
            }
        }

        public FaqLeaf(b faqItem) {
            Intrinsics.checkNotNullParameter(faqItem, "faqItem");
            this.f100152a = faqItem;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FaqLeaf) && this.f100152a == ((FaqLeaf) obj2).f100152a;
        }

        public final int hashCode() {
            return this.f100152a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f100152a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step$FaqRoot;", "Lcom/revolut/retail/feature/cryptocommoditydetails/impl/ui/price_targets/details/flow/PriceTargetsDetailsFlowContract$Step;", "<init>", "()V", "feature_cryptocommodity_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FaqRoot extends PriceTargetsDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FaqRoot f100153a = new FaqRoot();

        @NotNull
        public static final Parcelable.Creator<FaqRoot> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return FaqRoot.f100153a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FaqRoot[i];
            }
        }

        private FaqRoot() {
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

    private PriceTargetsDetailsFlowContract$Step() {
    }
}
