package com.revolut.feature.retail.cfd.impl.flows.onboarding;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ProductArticle", "RiskWarning", "Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step$RiskWarning;", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CfdOnboardingFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step$ProductArticle;", "Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProductArticle implements CfdOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProductArticle f82161a = new ProductArticle();

        @NotNull
        public static final Parcelable.Creator<ProductArticle> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProductArticle.f82161a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductArticle[i];
            }
        }

        private ProductArticle() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step$RiskWarning;", "Lcom/revolut/feature/retail/cfd/impl/flows/onboarding/CfdOnboardingFlowContract$Step;", "<init>", "()V", "feature_retail_cfd_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RiskWarning implements CfdOnboardingFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RiskWarning f82162a = new RiskWarning();

        @NotNull
        public static final Parcelable.Creator<RiskWarning> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RiskWarning.f82162a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RiskWarning[i];
            }
        }

        private RiskWarning() {
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
