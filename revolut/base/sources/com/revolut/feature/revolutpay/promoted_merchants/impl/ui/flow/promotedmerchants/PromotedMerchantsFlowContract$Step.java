package com.revolut.feature.revolutpay.promoted_merchants.impl.ui.flow.promotedmerchants;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "RevPointsOptIn", "IntroArticle", "PromotedMerchants", "PromotedMerchantsSearch", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$IntroArticle;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$PromotedMerchants;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$PromotedMerchantsSearch;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$RevPointsOptIn;", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PromotedMerchantsFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$IntroArticle;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step;", "<init>", "()V", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IntroArticle implements PromotedMerchantsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IntroArticle f84671a = new IntroArticle();

        @NotNull
        public static final Parcelable.Creator<IntroArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IntroArticle.f84671a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IntroArticle[i];
            }
        }

        private IntroArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$PromotedMerchants;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step;", "<init>", "()V", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PromotedMerchants implements PromotedMerchantsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PromotedMerchants f84672a = new PromotedMerchants();

        @NotNull
        public static final Parcelable.Creator<PromotedMerchants> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PromotedMerchants.f84672a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromotedMerchants[i];
            }
        }

        private PromotedMerchants() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$PromotedMerchantsSearch;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step;", "<init>", "()V", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PromotedMerchantsSearch implements PromotedMerchantsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PromotedMerchantsSearch f84673a = new PromotedMerchantsSearch();

        @NotNull
        public static final Parcelable.Creator<PromotedMerchantsSearch> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PromotedMerchantsSearch.f84673a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PromotedMerchantsSearch[i];
            }
        }

        private PromotedMerchantsSearch() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step$RevPointsOptIn;", "Lcom/revolut/feature/revolutpay/promoted_merchants/impl/ui/flow/promotedmerchants/PromotedMerchantsFlowContract$Step;", "<init>", "()V", "feature_revolut_pay_promoted_merchants_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsOptIn implements PromotedMerchantsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsOptIn f84674a = new RevPointsOptIn();

        @NotNull
        public static final Parcelable.Creator<RevPointsOptIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsOptIn.f84674a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsOptIn[i];
            }
        }

        private RevPointsOptIn() {
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
