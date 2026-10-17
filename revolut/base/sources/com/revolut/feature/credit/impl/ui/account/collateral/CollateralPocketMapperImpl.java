package com.revolut.feature.credit.impl.ui.account.collateral;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.api.models.creditcard.CreditCardSecurityDeposit;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitleAction;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.revolut.feature_fourthline_impl.R;
import i25.c;
import io3.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sx4.g;
import xi0.b;
import z92.f;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes22.dex */
public final class CollateralPocketMapperImpl implements c {

    @NotNull
    public static final a Companion = new a();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/impl/ui/account/collateral/CollateralPocketMapperImpl$CollateralSubtitlePayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CollateralSubtitlePayload implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<CollateralSubtitlePayload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f70018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardSecurityDeposit f70019b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CollateralSubtitlePayload(parcel.readString(), (CreditCardSecurityDeposit) parcel.readParcelable(CollateralSubtitlePayload.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CollateralSubtitlePayload[i];
            }
        }

        public CollateralSubtitlePayload(String facilityId, CreditCardSecurityDeposit securityDeposit) {
            Intrinsics.checkNotNullParameter(facilityId, "facilityId");
            Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
            this.f70018a = facilityId;
            this.f70019b = securityDeposit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CollateralSubtitlePayload)) {
                return false;
            }
            CollateralSubtitlePayload collateralSubtitlePayload = (CollateralSubtitlePayload) obj2;
            return Intrinsics.f(this.f70018a, collateralSubtitlePayload.f70018a) && Intrinsics.f(this.f70019b, collateralSubtitlePayload.f70019b);
        }

        public final int hashCode() {
            return this.f70019b.hashCode() + (this.f70018a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f70018a);
            dest.writeParcelable(this.f70019b, i);
        }
    }

    public static final class a {
        private a() {
        }
    }

    public final ProductAccount.ValueItem.Main a(d pocket, String facilityId, CreditCardSecurityDeposit securityDeposit) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(securityDeposit, "securityDeposit");
        ProductAccountId productAccountId = new ProductAccountId(pocket.f163145a, ExtendedSubaccountType.Collateral.INSTANCE);
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(f.j(pocket), (TextLocalisedClause) null, 6);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(f.j(pocket)), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorIndigo), (Clause) new TextLocalisedClause(R$string.credit_collateral_account_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_collateral_account_subtitle, null, null, 14), (List) f0.f322471a, (CircleBadgeModel) null, false, false, false, 240);
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.credit_collateral_account_title, null, null, 14);
        ProductAccountSubtitle.Clickable clickable = new ProductAccountSubtitle.Clickable(new CompositeClause(v.k(new TextLocalisedClause(R$string.credit_card_product_title, null, null, 14), g.e(1), new ImageClause(R$drawable.uikit_icn_16_link, new ImageClauseTint.Color(R$attr.uikit_colorWhite), (Float) null, (Float) null, 28)), null, null, null, 14), null, new ProductAccountSubtitleAction.General(new CollateralSubtitlePayload(facilityId, securityDeposit)));
        ResourceImage resourceImage = new ResourceImage(R$drawable.uikit_icn_24_plus, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_top_up, null, null, 14);
        xi0.a aVar = b.Companion;
        String str = pocket.f163147c;
        aVar.getClass();
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(v.k(new ProductAccountWidgetAction(364, null, textLocalisedClause2, resourceImage, new i25.d(facilityId, xi0.a.a(str)), "COLLATERAL_ADD_MONEY", null, null, false, false), new ProductAccountWidgetAction(300, null, new TextLocalisedClause(com.revolut.feature.tab.accounts.api.R$string.revolut_accounts_action_move_money, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_shuffle, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), new i25.d(facilityId, xi0.a.a(str)), "COLLATERAL_WITHDRAW", null, null, false, f.j(pocket).f(dj0.d.e)), new ProductAccountWidgetAction(364, null, new TextLocalisedClause(R.string.common_info, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_info, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), Unit.f186387a, "COLLATERAL_INFO", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a, (Clause) textLocalisedClause, false, (ProductAccountSubtitle) clickable, 50), productAccountMetadata, (AccountListItemModel) null, false, false, 352);
    }
}
