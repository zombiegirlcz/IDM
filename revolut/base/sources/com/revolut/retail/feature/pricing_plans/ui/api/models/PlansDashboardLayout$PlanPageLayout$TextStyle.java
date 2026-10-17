package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$TextStyle", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$TextStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$TextStyle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102789b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$PlanPageLayout$TextStyle(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$TextStyle[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$TextStyle(String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f102788a = text;
        this.f102789b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$TextStyle)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$TextStyle plansDashboardLayout$PlanPageLayout$TextStyle = (PlansDashboardLayout$PlanPageLayout$TextStyle) obj2;
        return Intrinsics.f(this.f102788a, plansDashboardLayout$PlanPageLayout$TextStyle.f102788a) && Intrinsics.f(this.f102789b, plansDashboardLayout$PlanPageLayout$TextStyle.f102789b);
    }

    public final int hashCode() {
        int iHashCode = this.f102788a.hashCode() * 31;
        String str = this.f102789b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102788a);
        dest.writeString(this.f102789b);
    }
}
