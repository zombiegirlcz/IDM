package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanTextDescriptor;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PricingPlanTextDescriptor implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PricingPlanTextDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Action f81149b;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanTextDescriptor$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "UrlNavigation", "Lcom/revolut/feature/pricingplans/models/PricingPlanTextDescriptor$Action$UrlNavigation;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/PricingPlanTextDescriptor$Action$UrlNavigation;", "Lcom/revolut/feature/pricingplans/models/PricingPlanTextDescriptor$Action;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UrlNavigation extends Action {

            @NotNull
            public static final Parcelable.Creator<UrlNavigation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f81150a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new UrlNavigation(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new UrlNavigation[i];
                }
            }

            public UrlNavigation(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f81150a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof UrlNavigation) && Intrinsics.f(this.f81150a, ((UrlNavigation) obj2).f81150a);
            }

            public final int hashCode() {
                return this.f81150a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f81150a);
            }
        }

        private Action() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PricingPlanTextDescriptor(parcel.readString(), (Action) parcel.readParcelable(PricingPlanTextDescriptor.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PricingPlanTextDescriptor[i];
        }
    }

    public PricingPlanTextDescriptor(String text, Action action) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f81148a = text;
        this.f81149b = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PricingPlanTextDescriptor)) {
            return false;
        }
        PricingPlanTextDescriptor pricingPlanTextDescriptor = (PricingPlanTextDescriptor) obj2;
        return Intrinsics.f(this.f81148a, pricingPlanTextDescriptor.f81148a) && Intrinsics.f(this.f81149b, pricingPlanTextDescriptor.f81149b);
    }

    public final int hashCode() {
        int iHashCode = this.f81148a.hashCode() * 31;
        Action action = this.f81149b;
        return iHashCode + (action == null ? 0 : action.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81148a);
        dest.writeParcelable(this.f81149b, i);
    }

    public /* synthetic */ PricingPlanTextDescriptor(String str) {
        this(str, null);
    }
}
