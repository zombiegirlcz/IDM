package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutAsset;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ggk/f0", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPageLayoutAsset implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanPageLayoutAsset> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f102709b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlanPageLayoutAsset(parcel.readString(), f0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPageLayoutAsset[i];
        }
    }

    public PlanPageLayoutAsset(String url2, f0 type) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f102708a = url2;
        this.f102709b = type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanPageLayoutAsset)) {
            return false;
        }
        PlanPageLayoutAsset planPageLayoutAsset = (PlanPageLayoutAsset) obj2;
        return Intrinsics.f(this.f102708a, planPageLayoutAsset.f102708a) && this.f102709b == planPageLayoutAsset.f102709b;
    }

    public final int hashCode() {
        return this.f102709b.hashCode() + (this.f102708a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102708a);
        dest.writeString(this.f102709b.name());
    }
}
