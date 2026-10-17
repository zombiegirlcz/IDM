package com.revolut.retail.feature.pricing_plans.ui.impl.widget;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/widget/PricingPlanHomeBanner;", "Landroid/os/Parcelable;", "<init>", "()V", "CancelScheduledDowngrade", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/widget/PricingPlanHomeBanner$CancelScheduledDowngrade;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanHomeBanner implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/widget/PricingPlanHomeBanner$CancelScheduledDowngrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/widget/PricingPlanHomeBanner;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelScheduledDowngrade extends PricingPlanHomeBanner {

        @NotNull
        public static final Parcelable.Creator<CancelScheduledDowngrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103645a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103646b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f103647c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelScheduledDowngrade(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelScheduledDowngrade[i];
            }
        }

        public CancelScheduledDowngrade(String planId, Long l2, String nextPlanId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(nextPlanId, "nextPlanId");
            this.f103645a = planId;
            this.f103646b = nextPlanId;
            this.f103647c = l2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelScheduledDowngrade)) {
                return false;
            }
            CancelScheduledDowngrade cancelScheduledDowngrade = (CancelScheduledDowngrade) obj2;
            return Intrinsics.f(this.f103645a, cancelScheduledDowngrade.f103645a) && Intrinsics.f(this.f103646b, cancelScheduledDowngrade.f103646b) && Intrinsics.f(this.f103647c, cancelScheduledDowngrade.f103647c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f103645a.hashCode() * 31, 31, this.f103646b);
            Long l2 = this.f103647c;
            return iC + (l2 == null ? 0 : l2.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103645a);
            dest.writeString(this.f103646b);
            Long l2 = this.f103647c;
            if (l2 == null) {
                dest.writeInt(0);
            } else {
                m72.b.A(dest, 1, l2);
            }
        }
    }

    private PricingPlanHomeBanner() {
    }
}
