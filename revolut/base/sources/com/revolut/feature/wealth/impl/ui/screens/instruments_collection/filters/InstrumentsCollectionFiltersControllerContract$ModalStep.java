package com.revolut.feature.wealth.impl.ui.screens.instruments_collection.filters;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilter;
import com.revolut.feature.wealth.api.domain.model.instruments_collection.filters.InstrumentsCollectionFilterId;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SeeAll", "Info", "Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep$Info;", "Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep$SeeAll;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface InstrumentsCollectionFiltersControllerContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep$Info;", "Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Info implements InstrumentsCollectionFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Info> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstrumentsCollectionFilterId f95617a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Info((InstrumentsCollectionFilterId) parcel.readParcelable(Info.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Info[i];
            }
        }

        public Info(InstrumentsCollectionFilterId filterId) {
            Intrinsics.checkNotNullParameter(filterId, "filterId");
            this.f95617a = filterId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Info) && Intrinsics.f(this.f95617a, ((Info) obj2).f95617a);
        }

        public final int hashCode() {
            return this.f95617a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95617a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep$SeeAll;", "Lcom/revolut/feature/wealth/impl/ui/screens/instruments_collection/filters/InstrumentsCollectionFiltersControllerContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAll implements InstrumentsCollectionFiltersControllerContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SeeAll> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InstrumentsCollectionFilter.ListFilter f95618a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAll((InstrumentsCollectionFilter.ListFilter) parcel.readParcelable(SeeAll.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAll[i];
            }
        }

        public SeeAll(InstrumentsCollectionFilter.ListFilter listFilter) {
            Intrinsics.checkNotNullParameter(listFilter, "listFilter");
            this.f95618a = listFilter;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAll) && Intrinsics.f(this.f95618a, ((SeeAll) obj2).f95618a);
        }

        public final int hashCode() {
            return this.f95618a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f95618a, i);
        }
    }
}
