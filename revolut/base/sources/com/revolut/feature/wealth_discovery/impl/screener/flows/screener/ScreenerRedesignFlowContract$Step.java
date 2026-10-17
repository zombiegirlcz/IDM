package com.revolut.feature.wealth_discovery.impl.screener.flows.screener;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Filters", "Result", "Collections", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Collections;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Filters;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Result;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreenerRedesignFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Collections;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step;", "<init>", "()V", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Collections extends ScreenerRedesignFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Collections f96184a = new Collections();

        @NotNull
        public static final Parcelable.Creator<Collections> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Collections.f96184a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Collections[i];
            }
        }

        private Collections() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Filters;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step;", "<init>", "()V", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Filters extends ScreenerRedesignFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Filters f96185a = new Filters();

        @NotNull
        public static final Parcelable.Creator<Filters> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Filters.f96185a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Filters[i];
            }
        }

        private Filters() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step$Result;", "Lcom/revolut/feature/wealth_discovery/impl/screener/flows/screener/ScreenerRedesignFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result extends ScreenerRedesignFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f96186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96187b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                f fVarValueOf = f.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Result.class, parcel, arrayList, iE, 1);
                }
                return new Result(fVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(f instrumentGroup, List filters) {
            Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
            Intrinsics.checkNotNullParameter(filters, "filters");
            this.f96186a = instrumentGroup;
            this.f96187b = filters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Result)) {
                return false;
            }
            Result result = (Result) obj2;
            return this.f96186a == result.f96186a && Intrinsics.f(this.f96187b, result.f96187b);
        }

        public final int hashCode() {
            return this.f96187b.hashCode() + (this.f96186a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96186a.name());
            Iterator itV = p.a.v(this.f96187b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    private ScreenerRedesignFlowContract$Step() {
    }
}
