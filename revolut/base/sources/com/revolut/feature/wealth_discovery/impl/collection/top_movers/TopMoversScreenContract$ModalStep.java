package com.revolut.feature.wealth_discovery.impl.collection.top_movers;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xzg.l0;
import xzg.n0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SelectFilter", "SelectTimeSpan", "Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep$SelectFilter;", "Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep$SelectTimeSpan;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TopMoversScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep$SelectFilter;", "Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectFilter implements TopMoversScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectFilter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0 f96140a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectFilter(n0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectFilter[i];
            }
        }

        public SelectFilter(n0 selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f96140a = selected;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectFilter) && this.f96140a == ((SelectFilter) obj2).f96140a;
        }

        public final int hashCode() {
            return this.f96140a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96140a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep$SelectTimeSpan;", "Lcom/revolut/feature/wealth_discovery/impl/collection/top_movers/TopMoversScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelectTimeSpan implements TopMoversScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<SelectTimeSpan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f96141a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelectTimeSpan(l0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelectTimeSpan[i];
            }
        }

        public SelectTimeSpan(l0 selected) {
            Intrinsics.checkNotNullParameter(selected, "selected");
            this.f96141a = selected;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelectTimeSpan) && this.f96141a == ((SelectTimeSpan) obj2).f96141a;
        }

        public final int hashCode() {
            return this.f96141a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96141a.name());
        }
    }
}
