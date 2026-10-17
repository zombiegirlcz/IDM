package com.revolut.feature.wealth_discovery.impl.screener.screens.collection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig", "Landroid/os/Parcelable;", "<init>", "()V", "FromId", "FromCollection", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig$FromCollection;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig$FromId;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ScreenerCollectionScreenContract$CollectionConfig implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig$FromCollection;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromCollection extends ScreenerCollectionScreenContract$CollectionConfig {

        @NotNull
        public static final Parcelable.Creator<FromCollection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ScreenerCollection f96225a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromCollection((ScreenerCollection) parcel.readParcelable(FromCollection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromCollection[i];
            }
        }

        public FromCollection(ScreenerCollection collection) {
            Intrinsics.checkNotNullParameter(collection, "collection");
            this.f96225a = collection;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FromCollection) && Intrinsics.f(this.f96225a, ((FromCollection) obj2).f96225a);
        }

        public final int hashCode() {
            return this.f96225a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96225a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig$FromId;", "Lcom/revolut/feature/wealth_discovery/impl/screener/screens/collection/ScreenerCollectionScreenContract$CollectionConfig;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromId extends ScreenerCollectionScreenContract$CollectionConfig {

        @NotNull
        public static final Parcelable.Creator<FromId> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f96226a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromId(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromId[i];
            }
        }

        public FromId(String collectionId) {
            Intrinsics.checkNotNullParameter(collectionId, "collectionId");
            this.f96226a = collectionId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FromId) && Intrinsics.f(this.f96226a, ((FromId) obj2).f96226a);
        }

        public final int hashCode() {
            return this.f96226a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f96226a);
        }
    }

    private ScreenerCollectionScreenContract$CollectionConfig() {
    }
}
