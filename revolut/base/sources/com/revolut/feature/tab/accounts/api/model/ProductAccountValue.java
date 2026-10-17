package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue;", "Landroid/os/Parcelable;", "Balance", "Text", "ProductAccountIcon", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue$Balance;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue$Text;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductAccountValue implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductAccountIcon f89531a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue$ProductAccountIcon;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProductAccountIcon implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<ProductAccountIcon> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Image f89534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89535b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProductAccountIcon((Image) parcel.readParcelable(ProductAccountIcon.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProductAccountIcon[i];
            }
        }

        public ProductAccountIcon(Image icon, boolean z) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.f89534a = icon;
            this.f89535b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProductAccountIcon)) {
                return false;
            }
            ProductAccountIcon productAccountIcon = (ProductAccountIcon) obj2;
            return Intrinsics.f(this.f89534a, productAccountIcon.f89534a) && this.f89535b == productAccountIcon.f89535b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f89535b) + (this.f89534a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89534a, i);
            dest.writeInt(this.f89535b ? 1 : 0);
        }
    }

    public ProductAccountValue(ProductAccountIcon productAccountIcon) {
        this.f89531a = productAccountIcon;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue$Balance;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Balance extends ProductAccountValue {

        @NotNull
        public static final Parcelable.Creator<Balance> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f89532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89533c;
        public final ProductAccountIcon d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Balance((d) parcel.readSerializable(), (Clause) parcel.readParcelable(Balance.class.getClassLoader()), parcel.readInt() == 0 ? null : ProductAccountIcon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Balance[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Balance(d money, Clause clause, ProductAccountIcon productAccountIcon) {
            super(productAccountIcon);
            Intrinsics.checkNotNullParameter(money, "money");
            this.f89532b = money;
            this.f89533c = clause;
            this.d = productAccountIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Balance)) {
                return false;
            }
            Balance balance = (Balance) obj2;
            return Intrinsics.f(this.f89532b, balance.f89532b) && Intrinsics.f(this.f89533c, balance.f89533c) && Intrinsics.f(this.d, balance.d);
        }

        public final int hashCode() {
            int iHashCode = this.f89532b.hashCode() * 31;
            Clause clause = this.f89533c;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            ProductAccountIcon productAccountIcon = this.d;
            return iHashCode2 + (productAccountIcon != null ? productAccountIcon.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f89532b);
            dest.writeParcelable(this.f89533c, i);
            ProductAccountIcon productAccountIcon = this.d;
            if (productAccountIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productAccountIcon.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Balance(d dVar, TextLocalisedClause textLocalisedClause, int i) {
            this(dVar, (i & 2) != 0 ? null : textLocalisedClause, (ProductAccountIcon) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue$Text;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccountValue;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Text extends ProductAccountValue {

        @NotNull
        public static final Parcelable.Creator<Text> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f89536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89537c;
        public final ProductAccountIcon d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Text((Clause) parcel.readParcelable(Text.class.getClassLoader()), (Clause) parcel.readParcelable(Text.class.getClassLoader()), parcel.readInt() == 0 ? null : ProductAccountIcon.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Text[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Text(Clause primary, Clause clause, ProductAccountIcon productAccountIcon) {
            super(productAccountIcon);
            Intrinsics.checkNotNullParameter(primary, "primary");
            this.f89536b = primary;
            this.f89537c = clause;
            this.d = productAccountIcon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Text)) {
                return false;
            }
            Text text = (Text) obj2;
            return Intrinsics.f(this.f89536b, text.f89536b) && Intrinsics.f(this.f89537c, text.f89537c) && Intrinsics.f(this.d, text.d);
        }

        public final int hashCode() {
            int iHashCode = this.f89536b.hashCode() * 31;
            Clause clause = this.f89537c;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            ProductAccountIcon productAccountIcon = this.d;
            return iHashCode2 + (productAccountIcon != null ? productAccountIcon.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89536b, i);
            dest.writeParcelable(this.f89537c, i);
            ProductAccountIcon productAccountIcon = this.d;
            if (productAccountIcon == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                productAccountIcon.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ Text(int i, Clause clause, TextLocalisedClause textLocalisedClause) {
            this(clause, (i & 2) != 0 ? null : textLocalisedClause, (ProductAccountIcon) null);
        }
    }
}
