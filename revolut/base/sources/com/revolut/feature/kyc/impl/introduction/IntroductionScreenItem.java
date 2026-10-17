package com.revolut.feature.kyc.impl.introduction;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem;", "Landroid/os/Parcelable;", "ImageItem", "ListCellItem", "ProductSelectionItem", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ImageItem;", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ListCellItem;", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ProductSelectionItem;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface IntroductionScreenItem extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ImageItem;", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ImageItem implements IntroductionScreenItem {

        @NotNull
        public static final Parcelable.Creator<ImageItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f77830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77831b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ImageItem(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ImageItem[i];
            }
        }

        public ImageItem(String cdnImageId, String listId) {
            Intrinsics.checkNotNullParameter(cdnImageId, "cdnImageId");
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f77830a = cdnImageId;
            this.f77831b = listId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ImageItem)) {
                return false;
            }
            ImageItem imageItem = (ImageItem) obj2;
            return Intrinsics.f(this.f77830a, imageItem.f77830a) && Intrinsics.f(this.f77831b, imageItem.f77831b);
        }

        public final int hashCode() {
            return this.f77831b.hashCode() + (this.f77830a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f77830a);
            dest.writeString(this.f77831b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ListCellItem;", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ListCellItem implements IntroductionScreenItem {

        @NotNull
        public static final Parcelable.Creator<ListCellItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f77832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f77833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f77834c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ListCellItem(parcel.readInt(), (Clause) parcel.readParcelable(ListCellItem.class.getClassLoader()), (Clause) parcel.readParcelable(ListCellItem.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ListCellItem[i];
            }
        }

        public ListCellItem(int i, Clause titleClause, Clause clause, String listId) {
            Intrinsics.checkNotNullParameter(titleClause, "titleClause");
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f77832a = i;
            this.f77833b = titleClause;
            this.f77834c = clause;
            this.d = listId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ListCellItem)) {
                return false;
            }
            ListCellItem listCellItem = (ListCellItem) obj2;
            return this.f77832a == listCellItem.f77832a && Intrinsics.f(this.f77833b, listCellItem.f77833b) && Intrinsics.f(this.f77834c, listCellItem.f77834c) && Intrinsics.f(this.d, listCellItem.d);
        }

        public final int hashCode() {
            int iA = p.a.a(Integer.hashCode(this.f77832a) * 31, 31, this.f77833b);
            Clause clause = this.f77834c;
            return this.d.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f77832a);
            dest.writeParcelable(this.f77833b, i);
            dest.writeParcelable(this.f77834c, i);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem$ProductSelectionItem;", "Lcom/revolut/feature/kyc/impl/introduction/IntroductionScreenItem;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductSelectionItem implements IntroductionScreenItem {

        @NotNull
        public static final Parcelable.Creator<ProductSelectionItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f77835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f77836b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77837c;
        public final Integer d;
        public final Integer e;
        public final String f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductSelectionItem((Clause) parcel.readParcelable(ProductSelectionItem.class.getClassLoader()), (Clause) parcel.readParcelable(ProductSelectionItem.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductSelectionItem[i];
            }
        }

        public ProductSelectionItem(Clause title, Clause subtitle, String cdnImageId, Integer num, Integer num2, String listId) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(cdnImageId, "cdnImageId");
            Intrinsics.checkNotNullParameter(listId, "listId");
            this.f77835a = title;
            this.f77836b = subtitle;
            this.f77837c = cdnImageId;
            this.d = num;
            this.e = num2;
            this.f = listId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductSelectionItem)) {
                return false;
            }
            ProductSelectionItem productSelectionItem = (ProductSelectionItem) obj2;
            return Intrinsics.f(this.f77835a, productSelectionItem.f77835a) && Intrinsics.f(this.f77836b, productSelectionItem.f77836b) && Intrinsics.f(this.f77837c, productSelectionItem.f77837c) && Intrinsics.f(this.d, productSelectionItem.d) && Intrinsics.f(this.e, productSelectionItem.e) && Intrinsics.f(this.f, productSelectionItem.f);
        }

        public final int hashCode() {
            int iC = p.a.c(p.a.a(this.f77835a.hashCode() * 31, 31, this.f77836b), 31, this.f77837c);
            Integer num = this.d;
            int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.e;
            return this.f.hashCode() + ((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77835a, i);
            dest.writeParcelable(this.f77836b, i);
            dest.writeString(this.f77837c);
            Integer num = this.d;
            if (num == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num);
            }
            Integer num2 = this.e;
            if (num2 == null) {
                dest.writeInt(0);
            } else {
                p.a.B(dest, 1, num2);
            }
            dest.writeString(this.f);
        }
    }
}
