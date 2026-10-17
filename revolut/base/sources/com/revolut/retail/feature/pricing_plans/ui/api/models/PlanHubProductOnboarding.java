package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.b0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubProductOnboarding;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Step", "ggk/b0", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanHubProductOnboarding implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanHubProductOnboarding> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f102653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f102654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f102655c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubProductOnboarding$Step;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Badge", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Step implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Step> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102656a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102657b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102658c;
        public final String d;
        public final Badge e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanHubProductOnboarding$Step$Badge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Badge implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Badge> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f102659a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f102660b;

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

            public Badge(String title, String iconCode) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(iconCode, "iconCode");
                this.f102659a = title;
                this.f102660b = iconCode;
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
                return Intrinsics.f(this.f102659a, badge.f102659a) && Intrinsics.f(this.f102660b, badge.f102660b);
            }

            public final int hashCode() {
                return this.f102660b.hashCode() + (this.f102659a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f102659a);
                dest.writeString(this.f102660b);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Step(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Step[i];
            }
        }

        public Step(String id10, String title, String subtitle, String videoUrl, Badge badge) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
            this.f102656a = id10;
            this.f102657b = title;
            this.f102658c = subtitle;
            this.d = videoUrl;
            this.e = badge;
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
            return Intrinsics.f(this.f102656a, step.f102656a) && Intrinsics.f(this.f102657b, step.f102657b) && Intrinsics.f(this.f102658c, step.f102658c) && Intrinsics.f(this.d, step.d) && Intrinsics.f(this.e, step.e);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.c(p.a.c(this.f102656a.hashCode() * 31, 31, this.f102657b), 31, this.f102658c), 31, this.d);
            Badge badge = this.e;
            return iC + (badge == null ? 0 : badge.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102656a);
            dest.writeString(this.f102657b);
            dest.writeString(this.f102658c);
            dest.writeString(this.d);
            Badge badge = this.e;
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
            return new PlanHubProductOnboarding(string, arrayList, b0.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanHubProductOnboarding[i];
        }
    }

    public PlanHubProductOnboarding(String id10, ArrayList steps, b0 style) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f102653a = id10;
        this.f102654b = steps;
        this.f102655c = style;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanHubProductOnboarding)) {
            return false;
        }
        PlanHubProductOnboarding planHubProductOnboarding = (PlanHubProductOnboarding) obj2;
        return Intrinsics.f(this.f102653a, planHubProductOnboarding.f102653a) && this.f102654b.equals(planHubProductOnboarding.f102654b) && this.f102655c == planHubProductOnboarding.f102655c;
    }

    public final int hashCode() {
        return this.f102655c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f102654b, this.f102653a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f102653a);
        Iterator itY = j6.a.y(this.f102654b, dest);
        while (itY.hasNext()) {
            ((Step) itY.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f102655c.name());
    }
}
