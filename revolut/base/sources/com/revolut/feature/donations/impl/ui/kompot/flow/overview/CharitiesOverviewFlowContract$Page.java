package com.revolut.feature.donations.impl.ui.kompot.flow.overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.FixedIdPagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page", "Lcom/revolut/kompot/navigable/vc/pager/FixedIdPagerItem;", "Charities", "Contributions", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page$Charities;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page$Contributions;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CharitiesOverviewFlowContract$Page extends FixedIdPagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page$Charities;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Charities implements CharitiesOverviewFlowContract$Page {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Charities f72018a = new Charities();

        @NotNull
        public static final Parcelable.Creator<Charities> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Charities.f72018a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Charities[i];
            }
        }

        private Charities() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page$Contributions;", "Lcom/revolut/feature/donations/impl/ui/kompot/flow/overview/CharitiesOverviewFlowContract$Page;", "<init>", "()V", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Contributions implements CharitiesOverviewFlowContract$Page {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Contributions f72019a = new Contributions();

        @NotNull
        public static final Parcelable.Creator<Contributions> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Contributions.f72019a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Contributions[i];
            }
        }

        private Contributions() {
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
