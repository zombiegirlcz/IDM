package com.revolut.retail.feature.pricing_plans.waitlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$BottomSheet", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Button", "Section", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanWaitlistLayout$BottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanWaitlistLayout$BottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f103657c;
    public final List d;
    public final List e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$BottomSheet$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PricingPlanWaitlistLayout$ButtonStyle f103660c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), parcel.readString(), PricingPlanWaitlistLayout$ButtonStyle.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String label, String str, PricingPlanWaitlistLayout$ButtonStyle style) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(style, "style");
            this.f103658a = label;
            this.f103659b = str;
            this.f103660c = style;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f103658a, button.f103658a) && Intrinsics.f(this.f103659b, button.f103659b) && this.f103660c == button.f103660c;
        }

        public final int hashCode() {
            int iHashCode = this.f103658a.hashCode() * 31;
            String str = this.f103659b;
            return this.f103660c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103658a);
            dest.writeString(this.f103659b);
            this.f103660c.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$BottomSheet$Section;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Section implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Section> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Action f103663c;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$BottomSheet$Section$Action;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Action implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Action> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f103664a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f103665b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Action(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Action[i];
                }
            }

            public Action(String label, String str) {
                Intrinsics.checkNotNullParameter(label, "label");
                this.f103664a = label;
                this.f103665b = str;
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
                return Intrinsics.f(this.f103664a, action.f103664a) && Intrinsics.f(this.f103665b, action.f103665b);
            }

            public final int hashCode() {
                int iHashCode = this.f103664a.hashCode() * 31;
                String str = this.f103665b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f103664a);
                dest.writeString(this.f103665b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Section(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Action.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Section[i];
            }
        }

        public Section(String label, String text, Action action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(text, "text");
            this.f103661a = label;
            this.f103662b = text;
            this.f103663c = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Section)) {
                return false;
            }
            Section section = (Section) obj2;
            return Intrinsics.f(this.f103661a, section.f103661a) && Intrinsics.f(this.f103662b, section.f103662b) && Intrinsics.f(this.f103663c, section.f103663c);
        }

        public final int hashCode() {
            int iC = p.a.c(this.f103661a.hashCode() * 31, 31, this.f103662b);
            Action action = this.f103663c;
            return iC + (action == null ? 0 : action.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103661a);
            dest.writeString(this.f103662b);
            Action action = this.f103663c;
            if (action == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                action.writeToParcel(dest, i);
            }
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
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(Section.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Button.CREATOR, parcel, arrayList2, iA, 1);
            }
            return new PricingPlanWaitlistLayout$BottomSheet(string, string2, string3, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanWaitlistLayout$BottomSheet[i];
        }
    }

    public PricingPlanWaitlistLayout$BottomSheet(String title, String subtitle, String str, List sections, List buttons) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(sections, "sections");
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.f103655a = title;
        this.f103656b = subtitle;
        this.f103657c = str;
        this.d = sections;
        this.e = buttons;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanWaitlistLayout$BottomSheet)) {
            return false;
        }
        PricingPlanWaitlistLayout$BottomSheet pricingPlanWaitlistLayout$BottomSheet = (PricingPlanWaitlistLayout$BottomSheet) obj2;
        return Intrinsics.f(this.f103655a, pricingPlanWaitlistLayout$BottomSheet.f103655a) && Intrinsics.f(this.f103656b, pricingPlanWaitlistLayout$BottomSheet.f103656b) && Intrinsics.f(this.f103657c, pricingPlanWaitlistLayout$BottomSheet.f103657c) && Intrinsics.f(this.d, pricingPlanWaitlistLayout$BottomSheet.d) && Intrinsics.f(this.e, pricingPlanWaitlistLayout$BottomSheet.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f103655a.hashCode() * 31, 31, this.f103656b);
        String str = this.f103657c;
        return this.e.hashCode() + p.a.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103655a);
        dest.writeString(this.f103656b);
        dest.writeString(this.f103657c);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((Section) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.e, dest);
        while (itV2.hasNext()) {
            ((Button) itV2.next()).writeToParcel(dest, i);
        }
    }
}
