package com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.vc.pager.PagerItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zel.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem", "Lcom/revolut/kompot/navigable/vc/pager/PagerItem;", "<init>", "()V", "Custom", "RevolutGroup", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem$Custom;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem$RevolutGroup;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreenerAllCollectionsRedesignContract$CollectionsPagerItem implements PagerItem {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem$Custom;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;", "<init>", "()V", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Custom extends ScreenerAllCollectionsRedesignContract$CollectionsPagerItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Custom f96203a = new Custom();

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Custom.f96203a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        private Custom() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return "Custom";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem$RevolutGroup;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/all_collections_redesign/ScreenerAllCollectionsRedesignContract$CollectionsPagerItem;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevolutGroup extends ScreenerAllCollectionsRedesignContract$CollectionsPagerItem {

        @NotNull
        public static final Parcelable.Creator<RevolutGroup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f96204a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevolutGroup(f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevolutGroup[i];
            }
        }

        public RevolutGroup(f group) {
            Intrinsics.checkNotNullParameter(group, "group");
            this.f96204a = group;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevolutGroup) && this.f96204a == ((RevolutGroup) obj2).f96204a;
        }

        @Override // com.revolut.kompot.navigable.vc.pager.PagerItem
        /* JADX INFO: renamed from: getId */
        public final String getF64253b() {
            return j6.a.q("RevolutGroup_", this.f96204a.name());
        }

        public final int hashCode() {
            return this.f96204a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96204a.name());
        }
    }

    private ScreenerAllCollectionsRedesignContract$CollectionsPagerItem() {
    }
}
