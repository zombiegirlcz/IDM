package com.revolut.feature.tab.accounts.api.model;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccount;", "Landroid/os/Parcelable;", "PendingItem", "ValueItem", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$PendingItem;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ProductAccount implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$PendingItem;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingItem extends ProductAccount {

        @NotNull
        public static final Parcelable.Creator<PendingItem> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ProductAccountId f89495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Image f89496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89497c;
        public final Clause d;
        public final CircleBadgeModel e;
        public final Object f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f89498g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingItem((ProductAccountId) parcel.readParcelable(PendingItem.class.getClassLoader()), (Image) parcel.readParcelable(PendingItem.class.getClassLoader()), (Clause) parcel.readParcelable(PendingItem.class.getClassLoader()), (Clause) parcel.readParcelable(PendingItem.class.getClassLoader()), (CircleBadgeModel) parcel.readParcelable(PendingItem.class.getClassLoader()), null, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingItem[i];
            }
        }

        public PendingItem(ProductAccountId id10, Image icon, Clause title, Clause clause, CircleBadgeModel circleBadgeModel, Object obj2, boolean z) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f89495a = id10;
            this.f89496b = icon;
            this.f89497c = title;
            this.d = clause;
            this.e = circleBadgeModel;
            this.f = obj2;
            this.f89498g = z;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount
        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF89499a() {
            return this.f89498g;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ProductAccountId getF89504c() {
            return this.f89495a;
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
            return Intrinsics.f(this.f89495a, pendingItem.f89495a) && Intrinsics.f(this.f89496b, pendingItem.f89496b) && Intrinsics.f(this.f89497c, pendingItem.f89497c) && Intrinsics.f(this.d, pendingItem.d) && Intrinsics.f(this.e, pendingItem.e) && Intrinsics.f(this.f, pendingItem.f) && this.f89498g == pendingItem.f89498g;
        }

        public final int hashCode() {
            int iA = p.a.a(b.c(this.f89496b, this.f89495a.hashCode() * 31, 31), 31, this.f89497c);
            Clause clause = this.d;
            int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
            CircleBadgeModel circleBadgeModel = this.e;
            int iHashCode2 = (iHashCode + (circleBadgeModel == null ? 0 : circleBadgeModel.hashCode())) * 31;
            Object obj2 = this.f;
            return Boolean.hashCode(this.f89498g) + ((iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89495a, i);
            dest.writeParcelable(this.f89496b, i);
            dest.writeParcelable(this.f89497c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
            dest.writeInt(this.f89498g ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean getF89499a();

    /* JADX INFO: renamed from: b */
    public abstract ProductAccountId getF89504c();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount;", "Main", "Discover", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem$Discover;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem$Main;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ValueItem extends ProductAccount {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f89499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89500b;

        public ValueItem(boolean z, boolean z3, int i) {
            z3 = (i & 64) != 0 ? false : z3;
            this.f89499a = z;
            this.f89500b = z3;
        }

        /* JADX INFO: renamed from: J */
        public abstract AccountWidgetItemModel getF();

        @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getF89499a() {
            return this.f89499a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public boolean getF89500b() {
            return this.f89500b;
        }

        /* JADX INFO: renamed from: d */
        public abstract AccountListItemModel getE();

        /* JADX INFO: renamed from: e */
        public abstract ProductAccountMetadata getF89505g();

        /* JADX INFO: renamed from: j */
        public abstract boolean getK();

        /* JADX INFO: renamed from: z */
        public abstract ProductAccountValue getD();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem$Discover;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Discover extends ValueItem {

            @NotNull
            public static final Parcelable.Creator<Discover> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ProductAccountId f89501c;
            public final ProductAccountValue.Text d;
            public final AccountListItemModel e;
            public final AccountWidgetItemModel f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ProductAccountMetadata f89502g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final boolean f89503h;
            public final ufe.b i;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Discover((ProductAccountId) parcel.readParcelable(Discover.class.getClassLoader()), ProductAccountValue.Text.CREATOR.createFromParcel(parcel), AccountListItemModel.CREATOR.createFromParcel(parcel), AccountWidgetItemModel.CREATOR.createFromParcel(parcel), ProductAccountMetadata.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, ufe.b.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Discover[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Discover(ProductAccountId id10, ProductAccountValue.Text value, AccountListItemModel listItemModel, AccountWidgetItemModel widgetItemModel, ProductAccountMetadata metadata, boolean z, ufe.b advisedDiscoverType) {
                super(false, false, 192);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(listItemModel, "listItemModel");
                Intrinsics.checkNotNullParameter(widgetItemModel, "widgetItemModel");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                Intrinsics.checkNotNullParameter(advisedDiscoverType, "advisedDiscoverType");
                this.f89501c = id10;
                this.d = value;
                this.e = listItemModel;
                this.f = widgetItemModel;
                this.f89502g = metadata;
                this.f89503h = z;
                this.i = advisedDiscoverType;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: J, reason: from getter */
            public final AccountWidgetItemModel getF() {
                return this.f;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount
            /* JADX INFO: renamed from: b, reason: from getter */
            public final ProductAccountId getF89504c() {
                return this.f89501c;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: d, reason: from getter */
            public final AccountListItemModel getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: e, reason: from getter */
            public final ProductAccountMetadata getF89505g() {
                return this.f89502g;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Discover)) {
                    return false;
                }
                Discover discover = (Discover) obj2;
                return Intrinsics.f(this.f89501c, discover.f89501c) && Intrinsics.f(this.d, discover.d) && Intrinsics.f(this.e, discover.e) && Intrinsics.f(this.f, discover.f) && Intrinsics.f(this.f89502g, discover.f89502g) && this.f89503h == discover.f89503h && this.i == discover.i;
            }

            public final int hashCode() {
                return this.i.hashCode() + j6.a.c((this.f89502g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.f89501c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f89503h);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getK() {
                return this.f89503h;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89501c, i);
                this.d.writeToParcel(dest, i);
                this.e.writeToParcel(dest, i);
                this.f.writeToParcel(dest, i);
                this.f89502g.writeToParcel(dest, i);
                dest.writeInt(this.f89503h ? 1 : 0);
                dest.writeString(this.i.name());
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: z */
            public final ProductAccountValue getD() {
                return this.d;
            }

            public /* synthetic */ Discover(ProductAccountId productAccountId, ProductAccountValue.Text text, AccountListItemModel accountListItemModel, AccountWidgetItemModel accountWidgetItemModel, ProductAccountMetadata productAccountMetadata, ufe.b bVar, int i) {
                this(productAccountId, text, accountListItemModel, accountWidgetItemModel, (i & 16) != 0 ? new ProductAccountMetadata(null, true) : productAccountMetadata, false, bVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem$Main;", "Lcom/revolut/feature/tab/accounts/api/model/ProductAccount$ValueItem;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Main extends ValueItem {

            @NotNull
            public static final Parcelable.Creator<Main> CREATOR = new a();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final ProductAccountId f89504c;
            public final ProductAccountValue d;
            public final AccountListItemModel e;
            public final AccountWidgetItemModel f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final ProductAccountMetadata f89505g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public final AccountListItemModel f89506h;
            public final boolean i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final boolean f89507j;
            public final boolean k;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z3;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ProductAccountId productAccountId = (ProductAccountId) parcel.readParcelable(Main.class.getClassLoader());
                    ProductAccountValue productAccountValue = (ProductAccountValue) parcel.readParcelable(Main.class.getClassLoader());
                    Parcelable.Creator<AccountListItemModel> creator = AccountListItemModel.CREATOR;
                    AccountListItemModel accountListItemModelCreateFromParcel = creator.createFromParcel(parcel);
                    AccountWidgetItemModel accountWidgetItemModelCreateFromParcel = AccountWidgetItemModel.CREATOR.createFromParcel(parcel);
                    ProductAccountMetadata productAccountMetadataCreateFromParcel = ProductAccountMetadata.CREATOR.createFromParcel(parcel);
                    AccountListItemModel accountListItemModelCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
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
                    return new Main(productAccountId, productAccountValue, accountListItemModelCreateFromParcel, accountWidgetItemModelCreateFromParcel, productAccountMetadataCreateFromParcel, accountListItemModelCreateFromParcel2, z4, z6, z3);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Main[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Main(ProductAccountId id10, ProductAccountValue value, AccountListItemModel listItemModel, AccountWidgetItemModel widgetItemModel, ProductAccountMetadata metadata, AccountListItemModel accountListItemModel, boolean z, boolean z3, boolean z4) {
                super(z3, z, 128);
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(listItemModel, "listItemModel");
                Intrinsics.checkNotNullParameter(widgetItemModel, "widgetItemModel");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                this.f89504c = id10;
                this.d = value;
                this.e = listItemModel;
                this.f = widgetItemModel;
                this.f89505g = metadata;
                this.f89506h = accountListItemModel;
                this.i = z;
                this.f89507j = z3;
                this.k = z4;
            }

            public static Main T(Main main, ProductAccountValue.Balance balance, AccountListItemModel accountListItemModel, AccountWidgetItemModel accountWidgetItemModel, AccountListItemModel accountListItemModel2, int i) {
                ProductAccountId id10 = main.f89504c;
                ProductAccountValue productAccountValue = balance;
                if ((i & 2) != 0) {
                    productAccountValue = main.d;
                }
                ProductAccountValue value = productAccountValue;
                if ((i & 4) != 0) {
                    accountListItemModel = main.e;
                }
                AccountListItemModel listItemModel = accountListItemModel;
                if ((i & 8) != 0) {
                    accountWidgetItemModel = main.f;
                }
                AccountWidgetItemModel widgetItemModel = accountWidgetItemModel;
                ProductAccountMetadata metadata = main.f89505g;
                if ((i & 32) != 0) {
                    accountListItemModel2 = main.f89506h;
                }
                AccountListItemModel accountListItemModel3 = accountListItemModel2;
                boolean z = main.i;
                boolean z3 = (i & 128) != 0 ? main.f89507j : true;
                boolean z4 = main.k;
                main.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(listItemModel, "listItemModel");
                Intrinsics.checkNotNullParameter(widgetItemModel, "widgetItemModel");
                Intrinsics.checkNotNullParameter(metadata, "metadata");
                return new Main(id10, value, listItemModel, widgetItemModel, metadata, accountListItemModel3, z, z3, z4);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: J, reason: from getter */
            public final AccountWidgetItemModel getF() {
                return this.f;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem, com.revolut.feature.tab.accounts.api.model.ProductAccount
            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getF89499a() {
                return this.f89507j;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount
            /* JADX INFO: renamed from: b, reason: from getter */
            public final ProductAccountId getF89504c() {
                return this.f89504c;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: c, reason: from getter */
            public final boolean getF89500b() {
                return this.i;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: d, reason: from getter */
            public final AccountListItemModel getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: e, reason: from getter */
            public final ProductAccountMetadata getF89505g() {
                return this.f89505g;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Main)) {
                    return false;
                }
                Main main = (Main) obj2;
                return Intrinsics.f(this.f89504c, main.f89504c) && Intrinsics.f(this.d, main.d) && Intrinsics.f(this.e, main.e) && Intrinsics.f(this.f, main.f) && Intrinsics.f(this.f89505g, main.f89505g) && Intrinsics.f(this.f89506h, main.f89506h) && this.i == main.i && this.f89507j == main.f89507j && this.k == main.k;
            }

            public final int hashCode() {
                int iHashCode = (this.f89505g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.f89504c.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
                AccountListItemModel accountListItemModel = this.f89506h;
                return Boolean.hashCode(this.k) + j6.a.c(j6.a.c((iHashCode + (accountListItemModel == null ? 0 : accountListItemModel.hashCode())) * 31, 31, this.i), 31, this.f89507j);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: j, reason: from getter */
            public final boolean getK() {
                return this.k;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f89504c, i);
                dest.writeParcelable(this.d, i);
                this.e.writeToParcel(dest, i);
                this.f.writeToParcel(dest, i);
                this.f89505g.writeToParcel(dest, i);
                AccountListItemModel accountListItemModel = this.f89506h;
                if (accountListItemModel == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    accountListItemModel.writeToParcel(dest, i);
                }
                dest.writeInt(this.i ? 1 : 0);
                dest.writeInt(this.f89507j ? 1 : 0);
                dest.writeInt(this.k ? 1 : 0);
            }

            @Override // com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem
            /* JADX INFO: renamed from: z, reason: from getter */
            public final ProductAccountValue getD() {
                return this.d;
            }

            public /* synthetic */ Main(ProductAccountId productAccountId, ProductAccountValue productAccountValue, AccountListItemModel accountListItemModel, AccountWidgetItemModel accountWidgetItemModel, ProductAccountMetadata productAccountMetadata, AccountListItemModel accountListItemModel2, boolean z, boolean z3, int i) {
                this(productAccountId, productAccountValue, accountListItemModel, accountWidgetItemModel, productAccountMetadata, (i & 32) != 0 ? null : accountListItemModel2, (i & 64) != 0 ? false : z, z3, (i & 256) == 0);
            }
        }
    }
}
