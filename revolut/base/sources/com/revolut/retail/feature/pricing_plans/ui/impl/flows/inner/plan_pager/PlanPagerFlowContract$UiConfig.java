package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "TitleConfig", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPagerFlowContract$UiConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanPagerFlowContract$UiConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TitleConfig f103059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanLayoutType f103060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f103061c;
    public final boolean d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig;", "Landroid/os/Parcelable;", "Default", "Custom", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig$Default;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface TitleConfig extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom implements TitleConfig {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Clause f103062a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom((Clause) parcel.readParcelable(Custom.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(Clause title) {
                Intrinsics.checkNotNullParameter(title, "title");
                this.f103062a = title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Custom) && Intrinsics.f(this.f103062a, ((Custom) obj2).f103062a);
            }

            public final int hashCode() {
                return this.f103062a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f103062a, i);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig$Default;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$UiConfig$TitleConfig;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Default implements TitleConfig {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f103063a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f103063a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
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

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanPagerFlowContract$UiConfig((TitleConfig) parcel.readParcelable(PlanPagerFlowContract$UiConfig.class.getClassLoader()), (PlanLayoutType) parcel.readParcelable(PlanPagerFlowContract$UiConfig.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPagerFlowContract$UiConfig[i];
        }
    }

    public PlanPagerFlowContract$UiConfig(TitleConfig titleConfig, PlanLayoutType layoutType, Integer num, boolean z) {
        Intrinsics.checkNotNullParameter(titleConfig, "titleConfig");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f103059a = titleConfig;
        this.f103060b = layoutType;
        this.f103061c = num;
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
        if (!(obj2 instanceof PlanPagerFlowContract$UiConfig)) {
            return false;
        }
        PlanPagerFlowContract$UiConfig planPagerFlowContract$UiConfig = (PlanPagerFlowContract$UiConfig) obj2;
        return Intrinsics.f(this.f103059a, planPagerFlowContract$UiConfig.f103059a) && Intrinsics.f(this.f103060b, planPagerFlowContract$UiConfig.f103060b) && Intrinsics.f(this.f103061c, planPagerFlowContract$UiConfig.f103061c) && this.d == planPagerFlowContract$UiConfig.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f103060b.hashCode() + (this.f103059a.hashCode() * 31)) * 31;
        Integer num = this.f103061c;
        return Boolean.hashCode(this.d) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103059a, i);
        dest.writeParcelable(this.f103060b, i);
        Integer num = this.f103061c;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.d ? 1 : 0);
    }
}
