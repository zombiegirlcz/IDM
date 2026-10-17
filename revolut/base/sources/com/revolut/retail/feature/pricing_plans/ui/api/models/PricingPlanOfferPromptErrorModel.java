package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPromptErrorModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanOfferPromptErrorModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanOfferPromptErrorModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f102849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f102850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f102851c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanOfferPromptErrorModel(parcel.readInt(), (Clause) parcel.readParcelable(PricingPlanOfferPromptErrorModel.class.getClassLoader()), (Clause) parcel.readParcelable(PricingPlanOfferPromptErrorModel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanOfferPromptErrorModel[i];
        }
    }

    public PricingPlanOfferPromptErrorModel(int i, Clause message, Clause clause) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f102849a = i;
        this.f102850b = message;
        this.f102851c = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanOfferPromptErrorModel)) {
            return false;
        }
        PricingPlanOfferPromptErrorModel pricingPlanOfferPromptErrorModel = (PricingPlanOfferPromptErrorModel) obj2;
        return this.f102849a == pricingPlanOfferPromptErrorModel.f102849a && Intrinsics.f(this.f102850b, pricingPlanOfferPromptErrorModel.f102850b) && Intrinsics.f(this.f102851c, pricingPlanOfferPromptErrorModel.f102851c);
    }

    public final int hashCode() {
        int iA = p.a.a(Integer.hashCode(this.f102849a) * 31, 31, this.f102850b);
        Clause clause = this.f102851c;
        return iA + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f102849a);
        dest.writeParcelable(this.f102850b, i);
        dest.writeParcelable(this.f102851c, i);
    }
}
