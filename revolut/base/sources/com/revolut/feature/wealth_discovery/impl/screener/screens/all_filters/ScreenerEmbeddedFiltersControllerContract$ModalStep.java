package com.revolut.feature.wealth_discovery.impl.screener.screens.all_filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilterInfo;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerStatsGroup;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "StatsGroup", "InfoDialog", "ControllerDialog", "SeeAllOptions", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$ControllerDialog;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$InfoDialog;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$SeeAllOptions;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$StatsGroup;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface ScreenerEmbeddedFiltersControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$ControllerDialog;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ControllerDialog implements ScreenerEmbeddedFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<ControllerDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.feature.wealth_discovery.impl.screener.domain.model.a f96210a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ControllerDialog(com.revolut.feature.wealth_discovery.impl.screener.domain.model.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ControllerDialog[i];
            }
        }

        public ControllerDialog(com.revolut.feature.wealth_discovery.impl.screener.domain.model.a type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f96210a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ControllerDialog) && this.f96210a == ((ControllerDialog) obj2).f96210a;
        }

        public final int hashCode() {
            return this.f96210a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96210a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$InfoDialog;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InfoDialog implements ScreenerEmbeddedFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<InfoDialog> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScreenerFilterInfo.Dialog f96211a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InfoDialog(ScreenerFilterInfo.Dialog.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InfoDialog[i];
            }
        }

        public InfoDialog(ScreenerFilterInfo.Dialog dialog) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            this.f96211a = dialog;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InfoDialog) && Intrinsics.f(this.f96211a, ((InfoDialog) obj2).f96211a);
        }

        public final int hashCode() {
            return this.f96211a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96211a.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$SeeAllOptions;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllOptions implements ScreenerEmbeddedFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SeeAllOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScreenerFilter$Options f96212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScreenerSelectedFilter.Options f96213b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAllOptions(ScreenerFilter$Options.CREATOR.createFromParcel(parcel), (ScreenerSelectedFilter.Options) parcel.readParcelable(SeeAllOptions.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllOptions[i];
            }
        }

        public SeeAllOptions(ScreenerFilter$Options filter, ScreenerSelectedFilter.Options options) {
            Intrinsics.checkNotNullParameter(filter, "filter");
            this.f96212a = filter;
            this.f96213b = options;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SeeAllOptions)) {
                return false;
            }
            SeeAllOptions seeAllOptions = (SeeAllOptions) obj2;
            return Intrinsics.f(this.f96212a, seeAllOptions.f96212a) && Intrinsics.f(this.f96213b, seeAllOptions.f96213b);
        }

        public final int hashCode() {
            int iHashCode = this.f96212a.hashCode() * 31;
            ScreenerSelectedFilter.Options options = this.f96213b;
            return iHashCode + (options == null ? 0 : options.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f96212a.writeToParcel(dest, i);
            dest.writeParcelable(this.f96213b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep$StatsGroup;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_filters/ScreenerEmbeddedFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class StatsGroup implements ScreenerEmbeddedFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<StatsGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScreenerStatsGroup f96214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f96215b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ScreenerStatsGroup screenerStatsGroup = (ScreenerStatsGroup) j6.a.f(parcel, "parcel", StatsGroup.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(StatsGroup.class, parcel, arrayList, iE, 1);
                }
                return new StatsGroup(screenerStatsGroup, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new StatsGroup[i];
            }
        }

        public StatsGroup(ScreenerStatsGroup group, List currentFilters) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(currentFilters, "currentFilters");
            this.f96214a = group;
            this.f96215b = currentFilters;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof StatsGroup)) {
                return false;
            }
            StatsGroup statsGroup = (StatsGroup) obj2;
            return Intrinsics.f(this.f96214a, statsGroup.f96214a) && Intrinsics.f(this.f96215b, statsGroup.f96215b);
        }

        public final int hashCode() {
            return this.f96215b.hashCode() + (this.f96214a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96214a, i);
            Iterator itV = p.a.v(this.f96215b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
