package com.revolut.feature.tab.accounts.impl.ui.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"com/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel", "Landroid/os/Parcelable;", "SubspaceValueItem", "PendingItem", "SubspaceDiscoverItem", "SubspaceHeader", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$PendingItem;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceDiscoverItem;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceHeader;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceValueItem;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SpaceContentListMapper$ItemParcel extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$PendingItem;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingItem implements SpaceContentListMapper$ItemParcel {

        @NotNull
        public static final Parcelable.Creator<PendingItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSpaceIdentifier f89611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final nie.b f89613c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingItem((ProductSpaceIdentifier) parcel.readParcelable(PendingItem.class.getClassLoader()), v.valueOf(parcel.readString()), (nie.b) parcel.readValue(PendingItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingItem[i];
            }
        }

        public PendingItem(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, nie.b descriptor) {
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f89611a = spaceIdentifier;
            this.f89612b = subSpaceIdentifier;
            this.f89613c = descriptor;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PendingItem)) {
                return false;
            }
            PendingItem pendingItem = (PendingItem) obj2;
            return Intrinsics.f(this.f89611a, pendingItem.f89611a) && this.f89612b == pendingItem.f89612b && Intrinsics.f(this.f89613c, pendingItem.f89613c);
        }

        public final int hashCode() {
            return this.f89613c.hashCode() + ((this.f89612b.hashCode() + (this.f89611a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89611a, i);
            dest.writeString(this.f89612b.name());
            dest.writeValue(this.f89613c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceDiscoverItem;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubspaceDiscoverItem implements SpaceContentListMapper$ItemParcel {

        @NotNull
        public static final Parcelable.Creator<SubspaceDiscoverItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSpaceIdentifier f89614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89615b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProductAccountDescriptor$Value f89616c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubspaceDiscoverItem((ProductSpaceIdentifier) parcel.readParcelable(SubspaceDiscoverItem.class.getClassLoader()), v.valueOf(parcel.readString()), (ProductAccountDescriptor$Value) parcel.readParcelable(SubspaceDiscoverItem.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubspaceDiscoverItem[i];
            }
        }

        public SubspaceDiscoverItem(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, ProductAccountDescriptor$Value descriptor, boolean z) {
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f89614a = spaceIdentifier;
            this.f89615b = subSpaceIdentifier;
            this.f89616c = descriptor;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubspaceDiscoverItem)) {
                return false;
            }
            SubspaceDiscoverItem subspaceDiscoverItem = (SubspaceDiscoverItem) obj2;
            return Intrinsics.f(this.f89614a, subspaceDiscoverItem.f89614a) && this.f89615b == subspaceDiscoverItem.f89615b && Intrinsics.f(this.f89616c, subspaceDiscoverItem.f89616c) && this.d == subspaceDiscoverItem.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f89616c.hashCode() + ((this.f89615b.hashCode() + (this.f89614a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89614a, i);
            dest.writeString(this.f89615b.name());
            dest.writeParcelable(this.f89616c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceHeader;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubspaceHeader implements SpaceContentListMapper$ItemParcel {

        @NotNull
        public static final Parcelable.Creator<SubspaceHeader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSpaceIdentifier f89617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89618b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubspaceHeader((ProductSpaceIdentifier) parcel.readParcelable(SubspaceHeader.class.getClassLoader()), v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubspaceHeader[i];
            }
        }

        public SubspaceHeader(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier) {
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            this.f89617a = spaceIdentifier;
            this.f89618b = subSpaceIdentifier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubspaceHeader)) {
                return false;
            }
            SubspaceHeader subspaceHeader = (SubspaceHeader) obj2;
            return Intrinsics.f(this.f89617a, subspaceHeader.f89617a) && this.f89618b == subspaceHeader.f89618b;
        }

        public final int hashCode() {
            return this.f89618b.hashCode() + (this.f89617a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89617a, i);
            dest.writeString(this.f89618b.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel$SubspaceValueItem;", "Lcom/revolut/feature/tab/accounts/impl/ui/spaces/SpaceContentListMapper$ItemParcel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubspaceValueItem implements SpaceContentListMapper$ItemParcel {

        @NotNull
        public static final Parcelable.Creator<SubspaceValueItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductSpaceIdentifier f89619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ProductAccountDescriptor$Value f89621c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                boolean z;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ProductSpaceIdentifier productSpaceIdentifier = (ProductSpaceIdentifier) parcel.readParcelable(SubspaceValueItem.class.getClassLoader());
                v vVarValueOf = v.valueOf(parcel.readString());
                ProductAccountDescriptor$Value productAccountDescriptor$Value = (ProductAccountDescriptor$Value) parcel.readParcelable(SubspaceValueItem.class.getClassLoader());
                boolean z4 = false;
                boolean z6 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = true;
                    z6 = z;
                }
                if (parcel.readInt() == 0) {
                    z3 = z;
                }
                return new SubspaceValueItem(productSpaceIdentifier, vVarValueOf, productAccountDescriptor$Value, z4, z6, z3);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubspaceValueItem[i];
            }
        }

        public SubspaceValueItem(ProductSpaceIdentifier spaceIdentifier, v subSpaceIdentifier, ProductAccountDescriptor$Value descriptor, boolean z, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(spaceIdentifier, "spaceIdentifier");
            Intrinsics.checkNotNullParameter(subSpaceIdentifier, "subSpaceIdentifier");
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            this.f89619a = spaceIdentifier;
            this.f89620b = subSpaceIdentifier;
            this.f89621c = descriptor;
            this.d = z;
            this.e = z3;
            this.f = z4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubspaceValueItem)) {
                return false;
            }
            SubspaceValueItem subspaceValueItem = (SubspaceValueItem) obj2;
            return Intrinsics.f(this.f89619a, subspaceValueItem.f89619a) && this.f89620b == subspaceValueItem.f89620b && Intrinsics.f(this.f89621c, subspaceValueItem.f89621c) && this.d == subspaceValueItem.d && this.e == subspaceValueItem.e && this.f == subspaceValueItem.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + j6.a.c(j6.a.c((this.f89621c.hashCode() + ((this.f89620b.hashCode() + (this.f89619a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89619a, i);
            dest.writeString(this.f89620b.name());
            dest.writeParcelable(this.f89621c, i);
            dest.writeInt(this.d ? 1 : 0);
            dest.writeInt(this.e ? 1 : 0);
            dest.writeInt(this.f ? 1 : 0);
        }
    }
}
