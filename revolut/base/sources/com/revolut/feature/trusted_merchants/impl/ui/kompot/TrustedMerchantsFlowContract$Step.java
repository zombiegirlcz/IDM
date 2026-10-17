package com.revolut.feature.trusted_merchants.impl.ui.kompot;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.trusted_merchants.api.model.TrustedMerchant;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "MerchantList", "MerchantDetails", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step$MerchantDetails;", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step$MerchantList;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TrustedMerchantsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step$MerchantDetails;", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MerchantDetails implements TrustedMerchantsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<MerchantDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrustedMerchant.Approved f94421a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MerchantDetails((TrustedMerchant.Approved) parcel.readParcelable(MerchantDetails.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantDetails[i];
            }
        }

        public MerchantDetails(TrustedMerchant.Approved merchant) {
            Intrinsics.checkNotNullParameter(merchant, "merchant");
            this.f94421a = merchant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MerchantDetails) && Intrinsics.f(this.f94421a, ((MerchantDetails) obj2).f94421a);
        }

        public final int hashCode() {
            return this.f94421a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f94421a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step$MerchantList;", "Lcom/revolut/feature/trusted_merchants/impl/ui/kompot/TrustedMerchantsFlowContract$Step;", "<init>", "()V", "feature_trusted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MerchantList implements TrustedMerchantsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MerchantList f94422a = new MerchantList();

        @NotNull
        public static final Parcelable.Creator<MerchantList> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MerchantList.f94422a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MerchantList[i];
            }
        }

        private MerchantList() {
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
}
