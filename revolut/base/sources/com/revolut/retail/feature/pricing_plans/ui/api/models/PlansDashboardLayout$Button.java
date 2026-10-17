package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.h0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$Button", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ggk/h0", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$Button implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$Button> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f102732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlansDashboardLayout$ClickAction f102733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102734c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlansDashboardLayout$Button(parcel.readInt() == 0 ? null : h0.valueOf(parcel.readString()), (PlansDashboardLayout$ClickAction) parcel.readParcelable(PlansDashboardLayout$Button.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$Button[i];
        }
    }

    public PlansDashboardLayout$Button(h0 h0Var, PlansDashboardLayout$ClickAction action, String label, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f102732a = h0Var;
        this.f102733b = action;
        this.f102734c = label;
        this.d = str;
    }

    public static PlansDashboardLayout$Button a(PlansDashboardLayout$Button plansDashboardLayout$Button, h0 h0Var) {
        PlansDashboardLayout$ClickAction action = plansDashboardLayout$Button.f102733b;
        String label = plansDashboardLayout$Button.f102734c;
        String str = plansDashboardLayout$Button.d;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(label, "label");
        return new PlansDashboardLayout$Button(h0Var, action, label, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$Button)) {
            return false;
        }
        PlansDashboardLayout$Button plansDashboardLayout$Button = (PlansDashboardLayout$Button) obj2;
        return this.f102732a == plansDashboardLayout$Button.f102732a && Intrinsics.f(this.f102733b, plansDashboardLayout$Button.f102733b) && Intrinsics.f(this.f102734c, plansDashboardLayout$Button.f102734c) && Intrinsics.f(this.d, plansDashboardLayout$Button.d);
    }

    public final int hashCode() {
        h0 h0Var = this.f102732a;
        int iC = p.a.c((this.f102733b.hashCode() + ((h0Var == null ? 0 : h0Var.hashCode()) * 31)) * 31, 31, this.f102734c);
        String str = this.d;
        return iC + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        h0 h0Var = this.f102732a;
        if (h0Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(h0Var.name());
        }
        dest.writeParcelable(this.f102733b, i);
        dest.writeString(this.f102734c);
        dest.writeString(this.d);
    }
}
