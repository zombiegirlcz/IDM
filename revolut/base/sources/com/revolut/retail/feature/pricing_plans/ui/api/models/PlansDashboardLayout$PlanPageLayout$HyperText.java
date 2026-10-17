package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$HyperText", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$HyperText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$HyperText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102777b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$HyperText(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$HyperText[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$HyperText(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f102776a = text;
        this.f102777b = url2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$HyperText)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$HyperText plansDashboardLayout$PlanPageLayout$HyperText = (PlansDashboardLayout$PlanPageLayout$HyperText) obj2;
        return Intrinsics.f(this.f102776a, plansDashboardLayout$PlanPageLayout$HyperText.f102776a) && Intrinsics.f(this.f102777b, plansDashboardLayout$PlanPageLayout$HyperText.f102777b);
    }

    public final int hashCode() {
        return this.f102777b.hashCode() + (this.f102776a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102776a);
        dest.writeString(this.f102777b);
    }
}
