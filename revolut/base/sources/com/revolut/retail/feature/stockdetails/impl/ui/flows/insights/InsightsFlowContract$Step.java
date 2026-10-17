package com.revolut.retail.feature.stockdetails.impl.ui.flows.insights;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Insights", "Sentiment", "AnalystRatings", "Technicals", "Fundamentals", "History", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$AnalystRatings;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Fundamentals;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$History;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Insights;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Sentiment;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Technicals;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InsightsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$AnalystRatings;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnalystRatings extends InsightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AnalystRatings f103851a = new AnalystRatings();

        @NotNull
        public static final Parcelable.Creator<AnalystRatings> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AnalystRatings.f103851a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnalystRatings[i];
            }
        }

        private AnalystRatings() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Fundamentals;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Fundamentals extends InsightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Fundamentals f103852a = new Fundamentals();

        @NotNull
        public static final Parcelable.Creator<Fundamentals> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Fundamentals.f103852a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Fundamentals[i];
            }
        }

        private Fundamentals() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$History;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class History extends InsightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final History f103853a = new History();

        @NotNull
        public static final Parcelable.Creator<History> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return History.f103853a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new History[i];
            }
        }

        private History() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Insights;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Insights extends InsightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Insights f103854a = new Insights();

        @NotNull
        public static final Parcelable.Creator<Insights> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Insights.f103854a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Insights[i];
            }
        }

        private Insights() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Sentiment;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Sentiment extends InsightsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Sentiment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103855a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Sentiment(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Sentiment[i];
            }
        }

        public Sentiment(String indexRef) {
            Intrinsics.checkNotNullParameter(indexRef, "indexRef");
            this.f103855a = indexRef;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Sentiment) && Intrinsics.f(this.f103855a, ((Sentiment) obj2).f103855a);
        }

        public final int hashCode() {
            return this.f103855a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103855a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step$Technicals;", "Lcom/revolut/retail/feature/stockdetails/impl/ui/flows/insights/InsightsFlowContract$Step;", "<init>", "()V", "feature_stock_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Technicals extends InsightsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Technicals f103856a = new Technicals();

        @NotNull
        public static final Parcelable.Creator<Technicals> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Technicals.f103856a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Technicals[i];
            }
        }

        private Technicals() {
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

    private InsightsFlowContract$Step() {
    }
}
