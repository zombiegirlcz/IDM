package com.revolut.retail.feature.pricing_plans.ui.impl.flows.inner.plan_pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.impl.navigation.PlanSelection;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.filter.PlanFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/flows/inner/plan_pager/PlanPagerFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPagerFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanPagerFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanFilter f103045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanSelection f103046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xfa.b f103047c;
    public final PlanPagerFlowContract$UiConfig d;
    public final boolean e;
    public final AnalyticsContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f103048g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f103049h;
    public final xfa.a i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            PlanFilter planFilter = (PlanFilter) parcel.readParcelable(PlanPagerFlowContract$InputData.class.getClassLoader());
            PlanSelection planSelection = (PlanSelection) parcel.readParcelable(PlanPagerFlowContract$InputData.class.getClassLoader());
            xfa.b bVarValueOf = xfa.b.valueOf(parcel.readString());
            PlanPagerFlowContract$UiConfig planPagerFlowContract$UiConfigCreateFromParcel = PlanPagerFlowContract$UiConfig.CREATOR.createFromParcel(parcel);
            boolean z3 = true;
            boolean z4 = parcel.readInt() != 0;
            AnalyticsContext analyticsContext = (AnalyticsContext) parcel.readParcelable(PlanPagerFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new PlanPagerFlowContract$InputData(planFilter, planSelection, bVarValueOf, planPagerFlowContract$UiConfigCreateFromParcel, z4, analyticsContext, z3, z, (xfa.a) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPagerFlowContract$InputData[i];
        }
    }

    public PlanPagerFlowContract$InputData(PlanFilter planFilter, PlanSelection planSelection, xfa.b source, PlanPagerFlowContract$UiConfig uiConfig, boolean z, AnalyticsContext analyticsContext, boolean z3, boolean z4, xfa.a aVar) {
        Intrinsics.checkNotNullParameter(planFilter, "planFilter");
        Intrinsics.checkNotNullParameter(planSelection, "planSelection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        this.f103045a = planFilter;
        this.f103046b = planSelection;
        this.f103047c = source;
        this.d = uiConfig;
        this.e = z;
        this.f = analyticsContext;
        this.f103048g = z3;
        this.f103049h = z4;
        this.i = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanPagerFlowContract$InputData)) {
            return false;
        }
        PlanPagerFlowContract$InputData planPagerFlowContract$InputData = (PlanPagerFlowContract$InputData) obj2;
        return Intrinsics.f(this.f103045a, planPagerFlowContract$InputData.f103045a) && Intrinsics.f(this.f103046b, planPagerFlowContract$InputData.f103046b) && this.f103047c == planPagerFlowContract$InputData.f103047c && Intrinsics.f(this.d, planPagerFlowContract$InputData.d) && this.e == planPagerFlowContract$InputData.e && Intrinsics.f(this.f, planPagerFlowContract$InputData.f) && this.f103048g == planPagerFlowContract$InputData.f103048g && this.f103049h == planPagerFlowContract$InputData.f103049h && Intrinsics.f(this.i, planPagerFlowContract$InputData.i);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.d.hashCode() + v1.c.c(this.f103047c, (this.f103046b.hashCode() + (this.f103045a.hashCode() * 31)) * 31, 31)) * 31, 31, this.e);
        AnalyticsContext analyticsContext = this.f;
        int iC2 = j6.a.c(j6.a.c((iC + (analyticsContext == null ? 0 : AnalyticsContext.a(analyticsContext.f50296a))) * 31, 31, this.f103048g), 31, this.f103049h);
        xfa.a aVar = this.i;
        return iC2 + (aVar != null ? aVar.f305202a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f103045a, i);
        dest.writeParcelable(this.f103046b, i);
        dest.writeString(this.f103047c.name());
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
        dest.writeInt(this.f103048g ? 1 : 0);
        dest.writeInt(this.f103049h ? 1 : 0);
        dest.writeSerializable(this.i);
    }

    public /* synthetic */ PlanPagerFlowContract$InputData(xfa.b bVar, PlanPagerFlowContract$UiConfig planPagerFlowContract$UiConfig, boolean z) {
        this(PlanFilter.NoFilter.f103390a, PlanSelection.Default.f103355a, bVar, planPagerFlowContract$UiConfig, false, null, z, false, null);
    }
}
