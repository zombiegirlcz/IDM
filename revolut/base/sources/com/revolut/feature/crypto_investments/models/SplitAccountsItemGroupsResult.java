package com.revolut.feature.crypto_investments.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult;", "Landroid/os/Parcelable;", "Classic", "GroupedByProduct", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult$Classic;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult$GroupedByProduct;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SplitAccountsItemGroupsResult extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult$Classic;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Classic implements SplitAccountsItemGroupsResult {

        @NotNull
        public static final Parcelable.Creator<Classic> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitAccountsItemGroup f71488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplitAccountsItemGroup f71489b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SplitAccountsItemGroup f71490c;
        public final SplitAccountsItemGroup d;
        public final SplitAccountsItemGroup e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Classic((SplitAccountsItemGroup) parcel.readParcelable(Classic.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(Classic.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(Classic.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(Classic.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(Classic.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Classic[i];
            }
        }

        public Classic(SplitAccountsItemGroup autoEarn, SplitAccountsItemGroup fiat, SplitAccountsItemGroup crypto, SplitAccountsItemGroup splitAccountsItemGroup, SplitAccountsItemGroup splitAccountsItemGroup2) {
            Intrinsics.checkNotNullParameter(autoEarn, "autoEarn");
            Intrinsics.checkNotNullParameter(fiat, "fiat");
            Intrinsics.checkNotNullParameter(crypto, "crypto");
            this.f71488a = autoEarn;
            this.f71489b = fiat;
            this.f71490c = crypto;
            this.d = splitAccountsItemGroup;
            this.e = splitAccountsItemGroup2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Classic)) {
                return false;
            }
            Classic classic = (Classic) obj2;
            return Intrinsics.f(this.f71488a, classic.f71488a) && Intrinsics.f(this.f71489b, classic.f71489b) && Intrinsics.f(this.f71490c, classic.f71490c) && Intrinsics.f(this.d, classic.d) && Intrinsics.f(this.e, classic.e);
        }

        @Override // com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult
        public final List getItems() {
            SplitAccountsItemGroup[] elements = {this.f71488a, this.f71489b, this.f71490c, this.d, this.e};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return d.L(elements);
        }

        public final int hashCode() {
            int iHashCode = (this.f71490c.hashCode() + ((this.f71489b.hashCode() + (this.f71488a.hashCode() * 31)) * 31)) * 31;
            SplitAccountsItemGroup splitAccountsItemGroup = this.d;
            int iHashCode2 = (iHashCode + (splitAccountsItemGroup == null ? 0 : splitAccountsItemGroup.hashCode())) * 31;
            SplitAccountsItemGroup splitAccountsItemGroup2 = this.e;
            return iHashCode2 + (splitAccountsItemGroup2 != null ? splitAccountsItemGroup2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71488a, i);
            dest.writeParcelable(this.f71489b, i);
            dest.writeParcelable(this.f71490c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult$GroupedByProduct;", "Lcom/revolut/feature/crypto_investments/models/SplitAccountsItemGroupsResult;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupedByProduct implements SplitAccountsItemGroupsResult {

        @NotNull
        public static final Parcelable.Creator<GroupedByProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SplitAccountsItemGroup f71491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SplitAccountsItemGroup f71492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final SplitAccountsItemGroup f71493c;
        public final SplitAccountsItemGroup d;
        public final SplitAccountsItemGroup e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GroupedByProduct((SplitAccountsItemGroup) parcel.readParcelable(GroupedByProduct.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(GroupedByProduct.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(GroupedByProduct.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(GroupedByProduct.class.getClassLoader()), (SplitAccountsItemGroup) parcel.readParcelable(GroupedByProduct.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupedByProduct[i];
            }
        }

        public GroupedByProduct(SplitAccountsItemGroup autoEarn, SplitAccountsItemGroup mainAccounts, SplitAccountsItemGroup splitAccountsItemGroup, SplitAccountsItemGroup splitAccountsItemGroup2, SplitAccountsItemGroup splitAccountsItemGroup3) {
            Intrinsics.checkNotNullParameter(autoEarn, "autoEarn");
            Intrinsics.checkNotNullParameter(mainAccounts, "mainAccounts");
            this.f71491a = autoEarn;
            this.f71492b = mainAccounts;
            this.f71493c = splitAccountsItemGroup;
            this.d = splitAccountsItemGroup2;
            this.e = splitAccountsItemGroup3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupedByProduct)) {
                return false;
            }
            GroupedByProduct groupedByProduct = (GroupedByProduct) obj2;
            return Intrinsics.f(this.f71491a, groupedByProduct.f71491a) && Intrinsics.f(this.f71492b, groupedByProduct.f71492b) && Intrinsics.f(this.f71493c, groupedByProduct.f71493c) && Intrinsics.f(this.d, groupedByProduct.d) && Intrinsics.f(this.e, groupedByProduct.e);
        }

        @Override // com.revolut.feature.crypto_investments.models.SplitAccountsItemGroupsResult
        public final List getItems() {
            SplitAccountsItemGroup[] elements = {this.f71491a, this.f71492b, this.f71493c, this.d, this.e};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return d.L(elements);
        }

        public final int hashCode() {
            int iHashCode = (this.f71492b.hashCode() + (this.f71491a.hashCode() * 31)) * 31;
            SplitAccountsItemGroup splitAccountsItemGroup = this.f71493c;
            int iHashCode2 = (iHashCode + (splitAccountsItemGroup == null ? 0 : splitAccountsItemGroup.hashCode())) * 31;
            SplitAccountsItemGroup splitAccountsItemGroup2 = this.d;
            int iHashCode3 = (iHashCode2 + (splitAccountsItemGroup2 == null ? 0 : splitAccountsItemGroup2.hashCode())) * 31;
            SplitAccountsItemGroup splitAccountsItemGroup3 = this.e;
            return iHashCode3 + (splitAccountsItemGroup3 != null ? splitAccountsItemGroup3.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f71491a, i);
            dest.writeParcelable(this.f71492b, i);
            dest.writeParcelable(this.f71493c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    List getItems();
}
