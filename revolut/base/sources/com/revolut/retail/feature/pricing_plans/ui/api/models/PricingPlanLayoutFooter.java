package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutFooter;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanLayoutFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanLayoutFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f102834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanLayoutHyperText f102835b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PricingPlanLayoutButton.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PricingPlanLayoutFooter(arrayList, parcel.readInt() == 0 ? null : PricingPlanLayoutHyperText.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanLayoutFooter[i];
        }
    }

    public PricingPlanLayoutFooter(List buttons, PricingPlanLayoutHyperText pricingPlanLayoutHyperText) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f102834a = buttons;
        this.f102835b = pricingPlanLayoutHyperText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanLayoutFooter)) {
            return false;
        }
        PricingPlanLayoutFooter pricingPlanLayoutFooter = (PricingPlanLayoutFooter) obj2;
        return Intrinsics.f(this.f102834a, pricingPlanLayoutFooter.f102834a) && Intrinsics.f(this.f102835b, pricingPlanLayoutFooter.f102835b);
    }

    public final int hashCode() {
        int iHashCode = this.f102834a.hashCode() * 31;
        PricingPlanLayoutHyperText pricingPlanLayoutHyperText = this.f102835b;
        return iHashCode + (pricingPlanLayoutHyperText == null ? 0 : pricingPlanLayoutHyperText.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f102834a, dest);
        while (itV.hasNext()) {
            ((PricingPlanLayoutButton) itV.next()).writeToParcel(dest, i);
        }
        PricingPlanLayoutHyperText pricingPlanLayoutHyperText = this.f102835b;
        if (pricingPlanLayoutHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            pricingPlanLayoutHyperText.writeToParcel(dest, i);
        }
    }
}
