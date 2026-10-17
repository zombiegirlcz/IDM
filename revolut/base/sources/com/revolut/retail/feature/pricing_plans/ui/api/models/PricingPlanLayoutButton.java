package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutButton;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ggk/p1", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanLayoutButton implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanLayoutButton> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1 f102831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanAction f102833c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanLayoutButton(p1.valueOf(parcel.readString()), parcel.readString(), (PricingPlanAction) parcel.readParcelable(PricingPlanLayoutButton.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanLayoutButton[i];
        }
    }

    public PricingPlanLayoutButton(p1 style, String label, PricingPlanAction action) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f102831a = style;
        this.f102832b = label;
        this.f102833c = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanLayoutButton)) {
            return false;
        }
        PricingPlanLayoutButton pricingPlanLayoutButton = (PricingPlanLayoutButton) obj2;
        return this.f102831a == pricingPlanLayoutButton.f102831a && Intrinsics.f(this.f102832b, pricingPlanLayoutButton.f102832b) && Intrinsics.f(this.f102833c, pricingPlanLayoutButton.f102833c);
    }

    public final int hashCode() {
        return this.f102833c.hashCode() + p.a.c(this.f102831a.hashCode() * 31, 31, this.f102832b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102831a.name());
        dest.writeString(this.f102832b);
        dest.writeParcelable(this.f102833c, i);
    }
}
