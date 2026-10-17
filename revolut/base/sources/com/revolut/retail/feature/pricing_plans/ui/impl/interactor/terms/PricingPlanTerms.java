package com.revolut.retail.feature.pricing_plans.ui.impl.interactor.terms;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/interactor/terms/PricingPlanTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f103310c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanTerms(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanTerms[i];
        }
    }

    public PricingPlanTerms(String url2, String str, String str2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f103308a = url2;
        this.f103309b = str;
        this.f103310c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanTerms)) {
            return false;
        }
        PricingPlanTerms pricingPlanTerms = (PricingPlanTerms) obj2;
        return Intrinsics.f(this.f103308a, pricingPlanTerms.f103308a) && Intrinsics.f(this.f103309b, pricingPlanTerms.f103309b) && Intrinsics.f(this.f103310c, pricingPlanTerms.f103310c);
    }

    public final int hashCode() {
        int iHashCode = this.f103308a.hashCode() * 31;
        String str = this.f103309b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f103310c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103308a);
        dest.writeString(this.f103309b);
        dest.writeString(this.f103310c);
    }
}
