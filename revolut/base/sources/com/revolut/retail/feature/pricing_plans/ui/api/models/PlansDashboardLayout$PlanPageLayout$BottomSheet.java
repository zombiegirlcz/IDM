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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$BottomSheet", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$BottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$BottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102760c;
    public final List d;
    public final PlansDashboardLayout$PlanPageLayout$BottomSheetFooter e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PlansDashboardLayout$PlanPageLayout$BottomSheet.class, parcel, arrayList, iE, 1);
                }
            }
            return new PlansDashboardLayout$PlanPageLayout$BottomSheet(string, string2, string3, arrayList, parcel.readInt() != 0 ? PlansDashboardLayout$PlanPageLayout$BottomSheetFooter.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$BottomSheet[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$BottomSheet(String str, String title, String str2, ArrayList arrayList, PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f102758a = str;
        this.f102759b = title;
        this.f102760c = str2;
        this.d = arrayList;
        this.e = plansDashboardLayout$PlanPageLayout$BottomSheetFooter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$BottomSheet)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$BottomSheet plansDashboardLayout$PlanPageLayout$BottomSheet = (PlansDashboardLayout$PlanPageLayout$BottomSheet) obj2;
        return Intrinsics.f(this.f102758a, plansDashboardLayout$PlanPageLayout$BottomSheet.f102758a) && Intrinsics.f(this.f102759b, plansDashboardLayout$PlanPageLayout$BottomSheet.f102759b) && Intrinsics.f(this.f102760c, plansDashboardLayout$PlanPageLayout$BottomSheet.f102760c) && Intrinsics.f(this.d, plansDashboardLayout$PlanPageLayout$BottomSheet.d) && Intrinsics.f(this.e, plansDashboardLayout$PlanPageLayout$BottomSheet.e);
    }

    public final int hashCode() {
        String str = this.f102758a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f102759b);
        String str2 = this.f102760c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter = this.e;
        return iHashCode2 + (plansDashboardLayout$PlanPageLayout$BottomSheetFooter != null ? plansDashboardLayout$PlanPageLayout$BottomSheetFooter.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102758a);
        dest.writeString(this.f102759b);
        dest.writeString(this.f102760c);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeParcelable((Parcelable) itQ.next(), i);
            }
        }
        PlansDashboardLayout$PlanPageLayout$BottomSheetFooter plansDashboardLayout$PlanPageLayout$BottomSheetFooter = this.e;
        if (plansDashboardLayout$PlanPageLayout$BottomSheetFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            plansDashboardLayout$PlanPageLayout$BottomSheetFooter.writeToParcel(dest, i);
        }
    }
}
