package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.v0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$BillingOptions", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$BillingOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$BillingOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f102755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102757c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            v0 v0VarValueOf = v0.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(PlansDashboardLayout$PlanPageLayout$BillingOptionItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PlansDashboardLayout$PlanPageLayout$BillingOptions(v0VarValueOf, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$BillingOptions[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$BillingOptions(v0 upgradeType, String str, String str2, ArrayList options) {
        Intrinsics.checkNotNullParameter(upgradeType, "upgradeType");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f102755a = upgradeType;
        this.f102756b = str;
        this.f102757c = str2;
        this.d = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$BillingOptions)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$BillingOptions plansDashboardLayout$PlanPageLayout$BillingOptions = (PlansDashboardLayout$PlanPageLayout$BillingOptions) obj2;
        return this.f102755a == plansDashboardLayout$PlanPageLayout$BillingOptions.f102755a && Intrinsics.f(this.f102756b, plansDashboardLayout$PlanPageLayout$BillingOptions.f102756b) && Intrinsics.f(this.f102757c, plansDashboardLayout$PlanPageLayout$BillingOptions.f102757c) && this.d.equals(plansDashboardLayout$PlanPageLayout$BillingOptions.d);
    }

    public final int hashCode() {
        int iHashCode = this.f102755a.hashCode() * 31;
        String str = this.f102756b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f102757c;
        return this.d.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102755a.name());
        dest.writeString(this.f102756b);
        dest.writeString(this.f102757c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((PlansDashboardLayout$PlanPageLayout$BillingOptionItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
