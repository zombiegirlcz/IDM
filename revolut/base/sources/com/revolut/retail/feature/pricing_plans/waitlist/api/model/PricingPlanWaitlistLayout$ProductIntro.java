package com.revolut.retail.feature.pricing_plans.waitlist.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$ProductIntro", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Step", "Badge", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanWaitlistLayout$ProductIntro implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanWaitlistLayout$ProductIntro> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f103671b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$ProductIntro$Badge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Badge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103673b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Badge(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Badge[i];
            }
        }

        public Badge(String label, String icon) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f103672a = label;
            this.f103673b = icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj2;
            return Intrinsics.f(this.f103672a, badge.f103672a) && Intrinsics.f(this.f103673b, badge.f103673b);
        }

        public final int hashCode() {
            return this.f103673b.hashCode() + (this.f103672a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103672a);
            dest.writeString(this.f103673b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/api/model/PricingPlanWaitlistLayout$ProductIntro$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_waitlist_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Step implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Step> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f103676c;
        public final String d;
        public final String e;
        public final Badge f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Step(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(String id10, String type, String title, String subtitle, String videoUrl, Badge badge) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            this.f103674a = id10;
            this.f103675b = type;
            this.f103676c = title;
            this.d = subtitle;
            this.e = videoUrl;
            this.f = badge;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Step)) {
                return false;
            }
            Step step = (Step) obj2;
            return Intrinsics.f(this.f103674a, step.f103674a) && Intrinsics.f(this.f103675b, step.f103675b) && Intrinsics.f(this.f103676c, step.f103676c) && Intrinsics.f(this.d, step.d) && Intrinsics.f(this.e, step.e) && Intrinsics.f(this.f, step.f);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.f103674a.hashCode() * 31, 31, this.f103675b), 31, this.f103676c), 31, this.d), 31, this.e);
            Badge badge = this.f;
            return iC + (badge == null ? 0 : badge.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103674a);
            dest.writeString(this.f103675b);
            dest.writeString(this.f103676c);
            dest.writeString(this.d);
            dest.writeString(this.e);
            Badge badge = this.f;
            if (badge == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                badge.writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Step.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PricingPlanWaitlistLayout$ProductIntro(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanWaitlistLayout$ProductIntro[i];
        }
    }

    public PricingPlanWaitlistLayout$ProductIntro(String style, ArrayList steps) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f103670a = style;
        this.f103671b = steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanWaitlistLayout$ProductIntro)) {
            return false;
        }
        PricingPlanWaitlistLayout$ProductIntro pricingPlanWaitlistLayout$ProductIntro = (PricingPlanWaitlistLayout$ProductIntro) obj2;
        return Intrinsics.f(this.f103670a, pricingPlanWaitlistLayout$ProductIntro.f103670a) && this.f103671b.equals(pricingPlanWaitlistLayout$ProductIntro.f103671b);
    }

    public final int hashCode() {
        return this.f103671b.hashCode() + (this.f103670a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103670a);
        Iterator itY = j6.a.y(this.f103671b, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
    }
}
