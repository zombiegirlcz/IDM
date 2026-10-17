package com.revolut.retail.feature.pricing_plans.ui.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy;", "Landroid/os/Parcelable;", "PostResult", "CardOrderIfNeeded", "NavigateNext", "Quit", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$CardOrderIfNeeded;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$NavigateNext;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$PostResult;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$Quit;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanChangeSuccessActionStrategy extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$CardOrderIfNeeded;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardOrderIfNeeded implements PlanChangeSuccessActionStrategy {

        @NotNull
        public static final Parcelable.Creator<CardOrderIfNeeded> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f102914a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardOrderIfNeeded((NaviCommand) parcel.readParcelable(CardOrderIfNeeded.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardOrderIfNeeded[i];
            }
        }

        public CardOrderIfNeeded() {
            this(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CardOrderIfNeeded) && Intrinsics.f(this.f102914a, ((CardOrderIfNeeded) obj2).f102914a);
        }

        public final int hashCode() {
            NaviCommand naviCommand = this.f102914a;
            if (naviCommand == null) {
                return 0;
            }
            return naviCommand.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102914a, i);
        }

        public CardOrderIfNeeded(NaviCommand naviCommand) {
            this.f102914a = naviCommand;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$NavigateNext;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NavigateNext implements PlanChangeSuccessActionStrategy {

        @NotNull
        public static final Parcelable.Creator<NavigateNext> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NaviCommand f102915a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NavigateNext((NaviCommand) parcel.readParcelable(NavigateNext.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NavigateNext[i];
            }
        }

        public NavigateNext(NaviCommand nextCommand) {
            Intrinsics.checkNotNullParameter(nextCommand, "nextCommand");
            this.f102915a = nextCommand;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof NavigateNext) && Intrinsics.f(this.f102915a, ((NavigateNext) obj2).f102915a);
        }

        public final int hashCode() {
            return this.f102915a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f102915a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$PostResult;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PostResult implements PlanChangeSuccessActionStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PostResult f102916a = new PostResult();

        @NotNull
        public static final Parcelable.Creator<PostResult> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return PostResult.f102916a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PostResult[i];
            }
        }

        private PostResult() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy$Quit;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/navigation/PlanChangeSuccessActionStrategy;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Quit implements PlanChangeSuccessActionStrategy {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Quit f102917a = new Quit();

        @NotNull
        public static final Parcelable.Creator<Quit> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Quit.f102917a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Quit[i];
            }
        }

        private Quit() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }
}
