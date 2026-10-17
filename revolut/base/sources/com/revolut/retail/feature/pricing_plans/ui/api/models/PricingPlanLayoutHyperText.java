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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Descriptor", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanLayoutHyperText implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanLayoutHyperText> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f102837b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor;", "Landroid/os/Parcelable;", "Clickable", "Strikethrough", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor$Clickable;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor$Strikethrough;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Descriptor extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor$Clickable;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Clickable implements Descriptor {

            @NotNull
            public static final Parcelable.Creator<Clickable> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102838a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final PricingPlanAction f102839b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Clickable((PricingPlanAction) parcel.readParcelable(Clickable.class.getClassLoader()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Clickable[i];
                }
            }

            public Clickable(PricingPlanAction action, String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(action, "action");
                this.f102838a = text;
                this.f102839b = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Clickable)) {
                    return false;
                }
                Clickable clickable = (Clickable) obj2;
                return Intrinsics.f(this.f102838a, clickable.f102838a) && Intrinsics.f(this.f102839b, clickable.f102839b);
            }

            @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText.Descriptor
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final String getF102840a() {
                return this.f102838a;
            }

            public final int hashCode() {
                return this.f102839b.hashCode() + (this.f102838a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102838a);
                dest.writeParcelable(this.f102839b, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor$Strikethrough;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanLayoutHyperText$Descriptor;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Strikethrough implements Descriptor {

            @NotNull
            public static final Parcelable.Creator<Strikethrough> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102840a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Strikethrough(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Strikethrough[i];
                }
            }

            public Strikethrough(String text) {
                Intrinsics.checkNotNullParameter(text, "text");
                this.f102840a = text;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Strikethrough) && Intrinsics.f(this.f102840a, ((Strikethrough) obj2).f102840a);
            }

            @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanLayoutHyperText.Descriptor
            /* JADX INFO: renamed from: getText, reason: from getter */
            public final String getF102840a() {
                return this.f102840a;
            }

            public final int hashCode() {
                return this.f102840a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102840a);
            }
        }

        /* JADX INFO: renamed from: getText */
        String getF102840a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PricingPlanLayoutHyperText.class, parcel, arrayList, iE, 1);
            }
            return new PricingPlanLayoutHyperText(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanLayoutHyperText[i];
        }
    }

    public PricingPlanLayoutHyperText(String text, List descriptors) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(descriptors, "descriptors");
        this.f102836a = text;
        this.f102837b = descriptors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanLayoutHyperText)) {
            return false;
        }
        PricingPlanLayoutHyperText pricingPlanLayoutHyperText = (PricingPlanLayoutHyperText) obj2;
        return Intrinsics.f(this.f102836a, pricingPlanLayoutHyperText.f102836a) && Intrinsics.f(this.f102837b, pricingPlanLayoutHyperText.f102837b);
    }

    public final int hashCode() {
        return this.f102837b.hashCode() + (this.f102836a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102836a);
        Iterator itV = p.a.v(this.f102837b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
