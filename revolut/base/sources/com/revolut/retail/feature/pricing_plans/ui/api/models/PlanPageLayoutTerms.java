package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.pricingplans.models.PricingPlanDescriptorAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Descriptor", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPageLayoutTerms implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanPageLayoutTerms> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f102711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f102712c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor;", "Landroid/os/Parcelable;", "UrlDescriptor", "ActionDescriptor", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor$ActionDescriptor;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor$UrlDescriptor;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Descriptor extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor$ActionDescriptor;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActionDescriptor implements Descriptor {

            @NotNull
            public static final Parcelable.Creator<ActionDescriptor> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PricingPlanDescriptorAction f102714b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActionDescriptor(parcel.readString(), (PricingPlanDescriptorAction) parcel.readParcelable(ActionDescriptor.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActionDescriptor[i];
                }
            }

            public ActionDescriptor(String text, PricingPlanDescriptorAction action) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(action, "action");
                this.f102713a = text;
                this.f102714b = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ActionDescriptor)) {
                    return false;
                }
                ActionDescriptor actionDescriptor = (ActionDescriptor) obj2;
                return Intrinsics.f(this.f102713a, actionDescriptor.f102713a) && Intrinsics.f(this.f102714b, actionDescriptor.f102714b);
            }

            @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms.Descriptor
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final String getF102715a() {
                return this.f102713a;
            }

            public final int hashCode() {
                return this.f102714b.f81117a.hashCode() + (this.f102713a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102713a);
                dest.writeParcelable(this.f102714b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor$UrlDescriptor;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanPageLayoutTerms$Descriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UrlDescriptor implements Descriptor {

            @NotNull
            public static final Parcelable.Creator<UrlDescriptor> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102715a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102716b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UrlDescriptor(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UrlDescriptor[i];
                }
            }

            public UrlDescriptor(String text, String url2) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f102715a = text;
                this.f102716b = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof UrlDescriptor)) {
                    return false;
                }
                UrlDescriptor urlDescriptor = (UrlDescriptor) obj2;
                return Intrinsics.f(this.f102715a, urlDescriptor.f102715a) && Intrinsics.f(this.f102716b, urlDescriptor.f102716b);
            }

            @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutTerms.Descriptor
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final String getF102715a() {
                return this.f102715a;
            }

            public final int hashCode() {
                return this.f102716b.hashCode() + (this.f102715a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102715a);
                dest.writeString(this.f102716b);
            }
        }

        /* JADX INFO: renamed from: getText */
        String getF102715a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iE = 0;
            int iE2 = 0;
            while (iE2 != i) {
                iE2 = j6.a.e(PlanPageLayoutTerms.class, parcel, arrayList2, iE2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(PlanPageLayoutTerms.class, parcel, arrayList3, iE, 1);
                }
                arrayList = arrayList3;
            }
            return new PlanPageLayoutTerms(string, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPageLayoutTerms[i];
        }
    }

    public PlanPageLayoutTerms(String text, ArrayList arrayList, List descriptors) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f102710a = text;
        this.f102711b = descriptors;
        this.f102712c = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanPageLayoutTerms)) {
            return false;
        }
        PlanPageLayoutTerms planPageLayoutTerms = (PlanPageLayoutTerms) obj2;
        return Intrinsics.f(this.f102710a, planPageLayoutTerms.f102710a) && Intrinsics.f(this.f102711b, planPageLayoutTerms.f102711b) && Intrinsics.f(this.f102712c, planPageLayoutTerms.f102712c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f102710a.hashCode() * 31, 31, this.f102711b);
        List list = this.f102712c;
        return iD + (list == null ? 0 : list.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102710a);
        Iterator itV = p.a.v(this.f102711b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        List list = this.f102712c;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }
}
