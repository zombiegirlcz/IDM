package com.revolut.feature.pro.accounts.impl.add_new_product;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.pro.accounts.impl.R$string;
import com.revolut.feature.product_article.api.models.ProductArticleKey;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.api.CreateSubaccountProductArticleConfig;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountWithTypeScreenDestination;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf1.a;
import qf1.d;
import qf1.f;
import qf1.h;
import qf1.j;
import qf1.k;
import uha.a0;
import uha.b0;
import uha.p;
import uha.t;
import uha.w;
import uha.x;
import zhm.v;
import zhm.z0;

/* JADX INFO: loaded from: classes5.dex */
public final class ProSubaccountAddNewProductCategoryItemMapper implements a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pro/accounts/impl/add_new_product/ProSubaccountAddNewProductCategoryItemMapper$ProSubaccountProductArticleKey;", "Lcom/revolut/feature/product_article/api/models/ProductArticleKey;", "", "toString", "()Ljava/lang/String;", "feature_pro_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProSubaccountProductArticleKey implements ProductArticleKey {

        @NotNull
        public static final Parcelable.Creator<ProSubaccountProductArticleKey> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81193a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81194b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f81195c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProSubaccountProductArticleKey(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProSubaccountProductArticleKey[i];
            }
        }

        public ProSubaccountProductArticleKey(String productName, String str, String str2) {
            Intrinsics.checkNotNullParameter(productName, "productName");
            this.f81193a = productName;
            this.f81194b = str;
            this.f81195c = str2;
        }

        @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
        /* JADX INFO: renamed from: U5, reason: from getter */
        public final String getF81194b() {
            return this.f81194b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ProSubaccountProductArticleKey)) {
                return false;
            }
            ProSubaccountProductArticleKey proSubaccountProductArticleKey = (ProSubaccountProductArticleKey) obj2;
            return Intrinsics.f(this.f81193a, proSubaccountProductArticleKey.f81193a) && Intrinsics.f(this.f81194b, proSubaccountProductArticleKey.f81194b) && Intrinsics.f(this.f81195c, proSubaccountProductArticleKey.f81195c);
        }

        @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
        /* JADX INFO: renamed from: getProductName, reason: from getter */
        public final String getF81193a() {
            return this.f81193a;
        }

        @Override // com.revolut.feature.product_article.api.models.ProductArticleKey
        /* JADX INFO: renamed from: h1, reason: from getter */
        public final String getF81195c() {
            return this.f81195c;
        }

        public final int hashCode() {
            int iHashCode = this.f81193a.hashCode() * 31;
            String str = this.f81194b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f81195c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81193a);
            dest.writeString(this.f81194b);
            dest.writeString(this.f81195c);
        }
    }

    @Override // pf1.a
    public final k a(d dVar) {
        b0 item = (b0) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f280163a;
        if (Intrinsics.f(str, f.PRO_POCKET.getId())) {
            return new k(R$drawable.uikit_icn_24_services, new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_description, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_grouped_title, null, null, 14), null, null, 48);
        }
        if (!Intrinsics.f(str, f.PRO_TAX_POCKET.getId())) {
            throw new IllegalArgumentException(a0.d.r(item.f280163a, " is not a Pro item type."));
        }
        return new k(R$drawable.uikit_icn_24_coins_earning, new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_tax_title, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_tax_description, null, null, 14), new TextLocalisedClause(R$string.freelancer_account_switcher_product_selection_tile_pockets_pro_tax_grouped_title, null, null, 14), null, null, 48);
    }

    @Override // pf1.a
    public final List b(d dVar) {
        b0 item = (b0) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        return v.k(new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_savings, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_pro, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_business, null, null, 14), new TextLocalisedClause(com.revolut.feature.add.new_product.api.R$string.add_new_product_search_keyword_company, null, null, 14));
    }

    @Override // pf1.a
    public final j c(d dVar) {
        ProductArticleParams.ArticleReference key;
        b0 item = (b0) dVar;
        Intrinsics.checkNotNullParameter(item, "item");
        Set setH = z0.h(com.revolut.feature.subaccount.api.models.a.c(item.f280164b.f280161a));
        a0 a0Var = item.f280164b;
        p pVar = a0Var.f280162b;
        x xVar = pVar.f280176a;
        if (xVar instanceof t) {
            key = new ProductArticleParams.ArticleReference.Id(((t) xVar).f280181a);
        } else {
            if (!(xVar instanceof w)) {
                throw new NoWhenBranchMatchedException();
            }
            w wVar = (w) xVar;
            key = new ProductArticleParams.ArticleReference.Key(new ProSubaccountProductArticleKey(wVar.f280183a, wVar.f280184b, wVar.f280185c));
        }
        return new h(new CreateSubaccountWithTypeScreenDestination(setH, new CreateSubaccountProductArticleConfig.StartWithArticle(new CreateSubaccountProductArticleConfig.Config(new ProductArticleParams(key, pVar.f280177b), a0Var.f280162b.f280178c)), null, null, false, 28));
    }
}
