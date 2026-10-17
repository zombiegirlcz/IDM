package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PlanScreenElementView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanScreenConfig;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanScreenConfig implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f102854c;
    public final PlanScreenElementView.Footer d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PricingPlanScreenConfig.class, parcel, arrayList, iE, 1);
            }
            return new PricingPlanScreenConfig(string, string2, arrayList, (PlanScreenElementView.Footer) parcel.readParcelable(PricingPlanScreenConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanScreenConfig[i];
        }
    }

    public PricingPlanScreenConfig(String id10, String str, ArrayList content, PlanScreenElementView.Footer footer) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f102852a = id10;
        this.f102853b = str;
        this.f102854c = content;
        this.d = footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanScreenConfig)) {
            return false;
        }
        PricingPlanScreenConfig pricingPlanScreenConfig = (PricingPlanScreenConfig) obj2;
        return Intrinsics.f(this.f102852a, pricingPlanScreenConfig.f102852a) && Intrinsics.f(this.f102853b, pricingPlanScreenConfig.f102853b) && this.f102854c.equals(pricingPlanScreenConfig.f102854c) && Intrinsics.f(this.d, pricingPlanScreenConfig.d);
    }

    public final int hashCode() {
        int iHashCode = this.f102852a.hashCode() * 31;
        String str = this.f102853b;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f102854c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        PlanScreenElementView.Footer footer = this.d;
        return iB + (footer != null ? footer.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102852a);
        dest.writeString(this.f102853b);
        Iterator itY = j6.a.y(this.f102854c, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.d, i);
    }
}
