package com.revolut.feature.separate_favourites.impl.watchlist.ui.quick_actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel", "Landroid/os/Parcelable;", "<init>", "()V", "ItemDeletionAddition", "AllAssetPairsDeletion", "Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel$AllAssetPairsDeletion;", "Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel$ItemDeletionAddition;", "feature_separate_favourites_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class WatchlistQuickActionsPresenterDelegate$QuickActionParcel implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel$AllAssetPairsDeletion;", "Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AllAssetPairsDeletion extends WatchlistQuickActionsPresenterDelegate$QuickActionParcel {

        @NotNull
        public static final Parcelable.Creator<AllAssetPairsDeletion> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavouritesAssetTypeKey f86018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86019b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AllAssetPairsDeletion((FavouritesAssetTypeKey) parcel.readParcelable(AllAssetPairsDeletion.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AllAssetPairsDeletion[i];
            }
        }

        public AllAssetPairsDeletion(FavouritesAssetTypeKey typeKey, String assetCode) {
            Intrinsics.checkNotNullParameter(typeKey, "typeKey");
            Intrinsics.checkNotNullParameter(assetCode, "assetCode");
            this.f86018a = typeKey;
            this.f86019b = assetCode;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AllAssetPairsDeletion)) {
                return false;
            }
            AllAssetPairsDeletion allAssetPairsDeletion = (AllAssetPairsDeletion) obj2;
            return Intrinsics.f(this.f86018a, allAssetPairsDeletion.f86018a) && Intrinsics.f(this.f86019b, allAssetPairsDeletion.f86019b);
        }

        public final int hashCode() {
            return this.f86019b.hashCode() + (this.f86018a.f86866a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86018a, i);
            dest.writeString(this.f86019b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel$ItemDeletionAddition;", "Lcom/revolut/feature/separate_favourites/impl/watchlist/ui/quick_actions/WatchlistQuickActionsPresenterDelegate$QuickActionParcel;", "", "toString", "()Ljava/lang/String;", "feature_separate_favourites_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemDeletionAddition extends WatchlistQuickActionsPresenterDelegate$QuickActionParcel {

        @NotNull
        public static final Parcelable.Creator<ItemDeletionAddition> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final FavouritesAssetTypeKey f86020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Pair f86021b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ItemDeletionAddition((FavouritesAssetTypeKey) parcel.readParcelable(ItemDeletionAddition.class.getClassLoader()), (Pair) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemDeletionAddition[i];
            }
        }

        public ItemDeletionAddition(FavouritesAssetTypeKey typeKey, Pair item) {
            Intrinsics.checkNotNullParameter(typeKey, "typeKey");
            Intrinsics.checkNotNullParameter(item, "item");
            this.f86020a = typeKey;
            this.f86021b = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ItemDeletionAddition)) {
                return false;
            }
            ItemDeletionAddition itemDeletionAddition = (ItemDeletionAddition) obj2;
            return Intrinsics.f(this.f86020a, itemDeletionAddition.f86020a) && Intrinsics.f(this.f86021b, itemDeletionAddition.f86021b);
        }

        public final int hashCode() {
            return this.f86021b.hashCode() + (this.f86020a.f86866a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f86020a, i);
            dest.writeSerializable(this.f86021b);
        }
    }

    private WatchlistQuickActionsPresenterDelegate$QuickActionParcel() {
    }
}
