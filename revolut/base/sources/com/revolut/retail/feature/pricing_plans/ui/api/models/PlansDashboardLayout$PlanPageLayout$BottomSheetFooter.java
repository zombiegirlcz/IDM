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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$BottomSheetFooter", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$BottomSheetFooter implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$BottomSheetFooter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f102762b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(PlansDashboardLayout$PlanPageLayout$HyperText.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new PlansDashboardLayout$PlanPageLayout$BottomSheetFooter(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$BottomSheetFooter[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$BottomSheetFooter(String text, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f102761a = text;
        this.f102762b = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$BottomSheetFooter)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter = (PlansDashboardLayout$PlanPageLayout$BottomSheetFooter) obj2;
        return Intrinsics.f(this.f102761a, plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102761a) && Intrinsics.f(this.f102762b, plansDashboardLayout$PlanPageLayout$BottomSheetFooter.f102762b);
    }

    public final int hashCode() {
        int iHashCode = this.f102761a.hashCode() * 31;
        List list = this.f102762b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102761a);
        List list = this.f102762b;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((PlansDashboardLayout$PlanPageLayout$HyperText) itQ.next()).writeToParcel(dest, i);
        }
    }
}
