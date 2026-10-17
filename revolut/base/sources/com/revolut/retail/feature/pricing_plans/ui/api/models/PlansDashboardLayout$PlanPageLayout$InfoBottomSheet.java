package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.c1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$InfoBottomSheet", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "ggk/c1", "Background", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlansDashboardLayout$PlanPageLayout$InfoBottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlansDashboardLayout$PlanPageLayout$InfoBottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f102780c;
    public final ArrayList d;
    public final PlanPageLayoutTerms e;
    public final Background f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$InfoBottomSheet$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f102781a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102782b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action(c1.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(c1 action, String label) {
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f102781a = action;
            this.f102782b = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Action)) {
                return false;
            }
            Action action = (Action) obj2;
            return this.f102781a == action.f102781a && Intrinsics.f(this.f102782b, action.f102782b);
        }

        public final int hashCode() {
            return this.f102782b.hashCode() + (this.f102781a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102781a.name());
            dest.writeString(this.f102782b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlansDashboardLayout$PlanPageLayout$InfoBottomSheet$Background;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/i", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Background implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Background> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f102783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102784b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Background(i.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Background[i];
            }
        }

        public Background(i type, String code) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(code, "code");
            this.f102783a = type;
            this.f102784b = code;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Background)) {
                return false;
            }
            Background background = (Background) obj2;
            return this.f102783a == background.f102783a && Intrinsics.f(this.f102784b, background.f102784b);
        }

        public final int hashCode() {
            return this.f102784b.hashCode() + (this.f102783a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102783a.name());
            dest.writeString(this.f102784b);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Action.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet(string, string2, string3, arrayList, parcel.readInt() == 0 ? null : PlanPageLayoutTerms.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Background.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlansDashboardLayout$PlanPageLayout$InfoBottomSheet[i];
        }
    }

    public PlansDashboardLayout$PlanPageLayout$InfoBottomSheet(String icon, String title, String description, ArrayList actions, PlanPageLayoutTerms planPageLayoutTerms, Background background) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f102778a = icon;
        this.f102779b = title;
        this.f102780c = description;
        this.d = actions;
        this.e = planPageLayoutTerms;
        this.f = background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlansDashboardLayout$PlanPageLayout$InfoBottomSheet)) {
            return false;
        }
        PlansDashboardLayout$PlanPageLayout$InfoBottomSheet plansDashboardLayout$PlanPageLayout$InfoBottomSheet = (PlansDashboardLayout$PlanPageLayout$InfoBottomSheet) obj2;
        return Intrinsics.f(this.f102778a, plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102778a) && Intrinsics.f(this.f102779b, plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102779b) && Intrinsics.f(this.f102780c, plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f102780c) && this.d.equals(plansDashboardLayout$PlanPageLayout$InfoBottomSheet.d) && Intrinsics.f(this.e, plansDashboardLayout$PlanPageLayout$InfoBottomSheet.e) && Intrinsics.f(this.f, plansDashboardLayout$PlanPageLayout$InfoBottomSheet.f);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f102778a.hashCode() * 31, 31, this.f102779b), 31, this.f102780c), 31);
        PlanPageLayoutTerms planPageLayoutTerms = this.e;
        int iHashCode = (iB + (planPageLayoutTerms == null ? 0 : planPageLayoutTerms.hashCode())) * 31;
        Background background = this.f;
        return iHashCode + (background != null ? background.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102778a);
        dest.writeString(this.f102779b);
        dest.writeString(this.f102780c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((Action) itY.next()).writeToParcel(dest, i);
        }
        PlanPageLayoutTerms planPageLayoutTerms = this.e;
        if (planPageLayoutTerms == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            planPageLayoutTerms.writeToParcel(dest, i);
        }
        Background background = this.f;
        if (background == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            background.writeToParcel(dest, i);
        }
    }
}
