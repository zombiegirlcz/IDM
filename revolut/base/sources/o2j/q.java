package o2j;

import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.AssetClause;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.junior.accounts.api.JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.retail.feature.balance.picker.api.R$string;
import com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper;
import com.revolut.retail.feature.balance.picker.api.models.JuniorInfo;
import com.revolut.retail.feature.balance.picker.api.models.TeenInfo;
import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreenContract$DisabledBalanceParcel;
import com.revolut.shared.feature.wealth.models.holding.AllowedCashOperationsReason;
import com.revolut.shared.feature.wealth.models.holding.CashHoldingAvailability;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import pcd.g0;
import pcd.s;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f221647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c91.a f221648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f221649c;
    public final AccentCircleBadge d;

    public q(o subtitleBalanceMapper, c91.a juniorAccountNameProvider, gte.a featureToggleInteractor, b collateralRowModelMapper, c deFiRowModelMapper) {
        Intrinsics.checkNotNullParameter(subtitleBalanceMapper, "subtitleBalanceMapper");
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(collateralRowModelMapper, "collateralRowModelMapper");
        Intrinsics.checkNotNullParameter(deFiRowModelMapper, "deFiRowModelMapper");
        this.f221647a = subtitleBalanceMapper;
        this.f221648b = juniorAccountNameProvider;
        this.f221649c = featureToggleInteractor;
        this.d = d8l.d.b(true);
    }

    public static MoneyClause b(BalanceWrapper balanceWrapper) {
        dj0.d f = balanceWrapper.getF();
        if (f != null) {
            return new MoneyClause(f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        }
        return null;
    }

    public final RowDelegate.Model.MainImage.Image40 a(Image image, boolean z) {
        return new RowDelegate.Model.MainImage.Image40(image, z ? this.d : null, null, false, null, false, 60);
    }

    public final RowDelegate.Model c(BalanceWrapper wrapper, String str, boolean z) {
        Pair pair;
        Image imageI;
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        TextLocalisedClause textLocalisedClause3;
        Clause clauseA;
        Image contactImage;
        TextLocalisedClause textLocalisedClause4;
        Clause clauseD;
        TextLocalisedClause textLocalisedClause5;
        int i;
        dcd.b bVar = this.f221647a.f221645a;
        Intrinsics.checkNotNullParameter(wrapper, "wrapper");
        boolean zF = Intrinsics.f(str, wrapper.f99404a);
        boolean z3 = wrapper instanceof BalanceWrapper.PocketBalanceWrapper;
        RowDelegate.Model.b.a aVar = RowDelegate.Model.b.a.f53266a;
        RowDelegate.Model.b bVar2 = RowDelegate.Model.b.c.f53268a;
        CurrencyClause.Format.DisplayName displayName = CurrencyClause.Format.DisplayName.f57755a;
        if (z3) {
            BalanceWrapper.PocketBalanceWrapper pocketWrapper = (BalanceWrapper.PocketBalanceWrapper) wrapper;
            k1j.a aVar2 = pocketWrapper.f99433l;
            switch (p.f221646a[aVar2.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    io3.d dVar = pocketWrapper.i;
                    xi0.a aVar3 = xi0.b.Companion;
                    String str2 = dVar.f163147c;
                    aVar3.getClass();
                    xi0.b bVarA = xi0.a.a(str2);
                    String str3 = dVar.f163145a;
                    RowDelegate.Model.MainImage.Image40 image40A = a(new CurrencyImage(dVar.f163147c, (ImageTransformations) null, (TextLocalisedClause) null, 14), zF);
                    CurrencyClause currencyClause = new CurrencyClause(pocketWrapper.f99406c, displayName, null, 4);
                    RowDelegate.Model.c.b bVar3 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(dVar.i, bVarA), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), b(pocketWrapper), null, false, 124);
                    if (z) {
                        Intrinsics.checkNotNullParameter(pocketWrapper, "pocketWrapper");
                        int i2 = n.f221644a[aVar2.ordinal()];
                        if (i2 == 1) {
                            i = R$string.payments_balance_picker_section_personal_title;
                        } else if (i2 == 2) {
                            i = R$string.payments_balance_picker_section_joint_title;
                        } else {
                            if (i2 != 3) {
                                throw new IllegalStateException(aVar2 + " is not supported in favorites");
                            }
                            i = R$string.payments_balance_picker_section_pro_title;
                        }
                        textLocalisedClause5 = new TextLocalisedClause(i, null, null, 14);
                    } else {
                        textLocalisedClause5 = null;
                    }
                    if (dVar.f != io3.k.ACTIVE) {
                        bVar2 = aVar;
                    }
                    return new RowDelegate.Model(str3, image40A, currencyClause, null, 0, textLocalisedClause5, null, null, 0, bVar3, true, null, zF, bVar2, null, null, null, null, null, new j1j.d(dVar.f163145a, bVarA, pocketWrapper.f99432j, aVar2), null, 0, 0, 0, 0, 532648920);
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                    throw new IllegalStateException(aVar2 + " is not supported");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        if (wrapper instanceof BalanceWrapper.SavingsBalanceWrapper) {
            BalanceWrapper.SavingsBalanceWrapper balanceWrapper = (BalanceWrapper.SavingsBalanceWrapper) wrapper;
            SavingsAccountDetails savingsAccountDetails = balanceWrapper.f99439h;
            String str4 = balanceWrapper.f99404a;
            Image image = savingsAccountDetails.f86461b;
            s sVar = savingsAccountDetails.f86460a;
            RowDelegate.Model.MainImage.Image40 image40A2 = a(image, zF);
            TextClause textClause = new TextClause(sVar.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar4 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(sVar.f234885h.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), b(balanceWrapper), null, false, 124);
            if (z) {
                Intrinsics.checkNotNullParameter(balanceWrapper, "balanceWrapper");
                SavingsProductData savingsProductData = savingsAccountDetails.f86462c;
                boolean z4 = (savingsProductData != null ? savingsProductData.f86683a.f86628r : null) == ncd.h.PERSONAL_JOINT;
                Clause clauseD2 = pbd.a.d(bVar, savingsAccountDetails.f86460a.i().e, null, 6);
                clauseD = z4 ? new TextLocalisedClause(R$string.payments_balance_picker_section_joint_subtitle, u.c(clauseD2), null, 12) : new TextLocalisedClause(R$string.payments_balance_picker_section_personal_subtitle, u.c(clauseD2), null, 12);
            } else {
                Intrinsics.checkNotNullParameter(balanceWrapper, "balanceWrapper");
                clauseD = pbd.a.d(bVar, savingsAccountDetails.f86460a.i().e, null, 6);
            }
            return new RowDelegate.Model(str4, image40A2, textClause, null, 0, clauseD, null, null, 0, bVar4, false, null, zF, null, null, null, null, null, null, new j1j.d(balanceWrapper.f99404a, xi0.a.a(sVar.getCurrency()), balanceWrapper.f99440j, balanceWrapper.f99407g), null, 0, 0, 0, 0, 532667352);
        }
        if (wrapper instanceof BalanceWrapper.VaultBalanceWrapper) {
            BalanceWrapper.VaultBalanceWrapper vaultBalanceWrapper = (BalanceWrapper.VaultBalanceWrapper) wrapper;
            s sVar2 = vaultBalanceWrapper.f99452h;
            return new RowDelegate.Model(vaultBalanceWrapper.f99404a, a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), zF), new TextClause(sVar2.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, o.b(sVar2, z), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(sVar2.f234885h.f234861c, kii.e.u(sVar2, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), b(vaultBalanceWrapper), null, false, 124), false, null, zF, null, null, null, null, null, null, new j1j.d(vaultBalanceWrapper.f99404a, xi0.a.a(sVar2.getCurrency()), vaultBalanceWrapper.i, vaultBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532667352);
        }
        boolean z6 = wrapper instanceof BalanceWrapper.ProVaultBalanceWrapper;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        if (z6) {
            BalanceWrapper.ProVaultBalanceWrapper proVaultBalanceWrapper = (BalanceWrapper.ProVaultBalanceWrapper) wrapper;
            s sVar3 = proVaultBalanceWrapper.f99434h;
            return new RowDelegate.Model(proVaultBalanceWrapper.f99404a, a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), zF), new TextClause(sVar3.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, o.b(sVar3, z), null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(sVar3.f234885h.f234861c, kii.e.u(sVar3, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), b(proVaultBalanceWrapper), null, false, 124), false, null, zF, null, null, null, null, null, null, new j1j.d(proVaultBalanceWrapper.f99404a, xi0.a.a(sVar3.getCurrency()), personal, proVaultBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532667352);
        }
        if (wrapper instanceof BalanceWrapper.CreditCardBalanceWrapper) {
            BalanceWrapper.CreditCardBalanceWrapper creditCardBalanceWrapper = (BalanceWrapper.CreditCardBalanceWrapper) wrapper;
            String str5 = creditCardBalanceWrapper.f99404a;
            CreditCard creditCard = creditCardBalanceWrapper.i;
            return new RowDelegate.Model(str5, a(creditCard.f69797j, zF), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_common_product_name, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(creditCard.d, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new TextLocalisedClause(com.revolut.feature.credit.core.R$string.credit_card_account_switcher_balance_available, null, null, 14), null, false, 124), false, null, zF, null, null, null, null, null, null, new j1j.d(creditCardBalanceWrapper.f99404a, creditCardBalanceWrapper.f99406c, personal, creditCardBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532667384);
        }
        if (wrapper instanceof BalanceWrapper.RevPointsPocketBalanceWrapper) {
            BalanceWrapper.RevPointsPocketBalanceWrapper revPointsPocketBalanceWrapper = (BalanceWrapper.RevPointsPocketBalanceWrapper) wrapper;
            return new RowDelegate.Model(revPointsPocketBalanceWrapper.f99404a, a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_rev_points_mono, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), zF), new TextLocalisedClause(com.revolut.feature_rev_points_pocket_api.R$string.rev_points_pocket_move_money_title, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(b(revPointsPocketBalanceWrapper), null, null, false, 126), false, null, zF, null, null, null, null, null, null, new j1j.d(revPointsPocketBalanceWrapper.f99404a, revPointsPocketBalanceWrapper.f99406c, personal, revPointsPocketBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532667384);
        }
        if (wrapper instanceof BalanceWrapper.RevPointsAccountBalanceWrapper) {
            BalanceWrapper.RevPointsAccountBalanceWrapper revPointsAccountBalanceWrapper = (BalanceWrapper.RevPointsAccountBalanceWrapper) wrapper;
            return new RowDelegate.Model(revPointsAccountBalanceWrapper.f99404a, a(nub.a.s(), zF), new TextLocalisedClause(R$string.balance_picker_rev_points_item_title, null, null, 14), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(nub.a.l(new RevPoints(revPointsAccountBalanceWrapper.i), o9.SENSITIVE, new nub.b(0), null, BitmapDescriptorFactory.HUE_RED, 58), null, null, false, 126), false, null, zF, null, null, null, null, null, null, new j1j.d(revPointsAccountBalanceWrapper.f99435h, revPointsAccountBalanceWrapper.f99406c, personal, k1j.a.REV_POINTS), null, 0, 0, 0, 0, 532667384);
        }
        if (wrapper instanceof BalanceWrapper.JuniorPocketBalanceWrapper) {
            BalanceWrapper.JuniorPocketBalanceWrapper juniorPocketBalanceWrapper = (BalanceWrapper.JuniorPocketBalanceWrapper) wrapper;
            io3.d dVar2 = juniorPocketBalanceWrapper.f99420j;
            xi0.a aVar4 = xi0.b.Companion;
            String str6 = dVar2.f163147c;
            aVar4.getClass();
            xi0.b bVarA2 = xi0.a.a(str6);
            JuniorInfo ownerInfo = juniorPocketBalanceWrapper.k;
            if (((jte.d) this.f221649c).c(JuniorAccountsApi$Toggles$RetailMultiCurrencyForKids.f76697c)) {
                clauseA = new CurrencyClause(bVarA2, null, null, 6);
                contactImage = new CurrencyImage(bVarA2.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            } else {
                clauseA = ((d91.b) this.f221648b).a(ProductId.CURRENCY);
                contactImage = new ContactImage(ownerInfo.f99454a, (String) null, (String) null, (String) null, (String) null, ownerInfo.f99457g, (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550);
            }
            String str7 = dVar2.f163145a;
            RowDelegate.Model.MainImage.Image40 image40A3 = a(contactImage, zF);
            RowDelegate.Model.c.b bVar5 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(dVar2.i, bVarA2), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            if (z) {
                Intrinsics.checkNotNullParameter(ownerInfo, "ownerInfo");
                textLocalisedClause4 = new TextLocalisedClause(R$string.move_money_picker_section_junior_title, u.c(ownerInfo.f99455b), null, 12);
            } else {
                textLocalisedClause4 = null;
            }
            return new RowDelegate.Model(str7, image40A3, clauseA, null, 0, textLocalisedClause4, null, null, 0, bVar5, true, null, zF, null, null, null, null, null, null, new j1j.d(dVar2.f163145a, bVarA2, juniorPocketBalanceWrapper.d, juniorPocketBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532665304);
        }
        if (wrapper instanceof BalanceWrapper.JuniorVaultBalanceWrapper) {
            BalanceWrapper.JuniorVaultBalanceWrapper juniorVaultBalanceWrapper = (BalanceWrapper.JuniorVaultBalanceWrapper) wrapper;
            s sVar4 = juniorVaultBalanceWrapper.f99426j;
            String str8 = sVar4.f234881a;
            RowDelegate.Model.MainImage.Image40 image40A4 = a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), zF);
            g0 g0Var = sVar4.f234885h;
            TextClause textClause2 = new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar6 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar4, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            if (z) {
                JuniorInfo ownerInfo2 = juniorVaultBalanceWrapper.k;
                Intrinsics.checkNotNullParameter(ownerInfo2, "ownerInfo");
                textLocalisedClause3 = new TextLocalisedClause(R$string.move_money_picker_section_junior_title, u.c(ownerInfo2.f99455b), null, 12);
            } else {
                textLocalisedClause3 = null;
            }
            return new RowDelegate.Model(str8, image40A4, textClause2, null, 0, textLocalisedClause3, null, null, 0, bVar6, true, null, zF, null, null, null, null, null, null, new j1j.d(juniorVaultBalanceWrapper.f99404a, xi0.a.a(sVar4.getCurrency()), juniorVaultBalanceWrapper.d, juniorVaultBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532665304);
        }
        if (wrapper instanceof BalanceWrapper.JuniorSavingsBalanceWrapper) {
            BalanceWrapper.JuniorSavingsBalanceWrapper juniorSavingsBalanceWrapper = (BalanceWrapper.JuniorSavingsBalanceWrapper) wrapper;
            String str9 = juniorSavingsBalanceWrapper.f99404a;
            SavingsAccountDetails savingsAccountDetails2 = juniorSavingsBalanceWrapper.f99423h;
            Image image2 = savingsAccountDetails2.f86461b;
            s sVar5 = savingsAccountDetails2.f86460a;
            return new RowDelegate.Model(str9, a(image2, zF), new TextClause(sVar5.f234885h.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(sVar5.f234885h.f234861c, kii.e.u(sVar5, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126), false, null, zF, null, null, null, null, null, null, new j1j.d(juniorSavingsBalanceWrapper.f99404a, xi0.a.a(sVar5.getCurrency()), personal, juniorSavingsBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532667384);
        }
        if (wrapper instanceof BalanceWrapper.TeenPocketBalanceWrapper) {
            BalanceWrapper.TeenPocketBalanceWrapper teenPocketBalanceWrapper = (BalanceWrapper.TeenPocketBalanceWrapper) wrapper;
            io3.d dVar3 = teenPocketBalanceWrapper.f99443j;
            xi0.a aVar5 = xi0.b.Companion;
            String str10 = dVar3.f163147c;
            aVar5.getClass();
            xi0.b bVarA3 = xi0.a.a(str10);
            String str11 = dVar3.f163145a;
            RowDelegate.Model.MainImage.Image40 image40A5 = a(new CurrencyImage(bVarA3.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), zF);
            CurrencyClause currencyClause2 = new CurrencyClause(bVarA3, null, null, 6);
            RowDelegate.Model.c.b bVar7 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(dVar3.i, bVarA3), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            if (z) {
                TeenInfo ownerInfo3 = teenPocketBalanceWrapper.k;
                Intrinsics.checkNotNullParameter(ownerInfo3, "ownerInfo");
                textLocalisedClause2 = new TextLocalisedClause(R$string.payments_balance_picker_section_teen_title, u.c(ownerInfo3.f99461b), null, 12);
            } else {
                textLocalisedClause2 = null;
            }
            return new RowDelegate.Model(str11, image40A5, currencyClause2, null, 0, textLocalisedClause2, null, null, 0, bVar7, true, null, zF, null, null, null, null, null, null, new j1j.d(dVar3.f163145a, bVarA3, teenPocketBalanceWrapper.d, teenPocketBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532665304);
        }
        if (wrapper instanceof BalanceWrapper.TeenVaultBalanceWrapper) {
            BalanceWrapper.TeenVaultBalanceWrapper teenVaultBalanceWrapper = (BalanceWrapper.TeenVaultBalanceWrapper) wrapper;
            s sVar6 = teenVaultBalanceWrapper.f99445h;
            String str12 = sVar6.f234881a;
            RowDelegate.Model.MainImage.Image40 image40A6 = a(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_wallet, R$attr.uikit_colorWhite, R$attr.uikit_colorBlue), zF);
            g0 g0Var2 = sVar6.f234885h;
            TextClause textClause3 = new TextClause(g0Var2.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            RowDelegate.Model.c.b bVar8 = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var2.f234861c, kii.e.u(sVar6, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            if (z) {
                TeenInfo ownerInfo4 = teenVaultBalanceWrapper.i;
                Intrinsics.checkNotNullParameter(ownerInfo4, "ownerInfo");
                textLocalisedClause = new TextLocalisedClause(R$string.payments_balance_picker_section_teen_title, u.c(ownerInfo4.f99461b), null, 12);
            } else {
                textLocalisedClause = null;
            }
            return new RowDelegate.Model(str12, image40A6, textClause3, null, 0, textLocalisedClause, null, null, 0, bVar8, true, null, zF, null, null, null, null, null, null, new j1j.d(teenVaultBalanceWrapper.f99404a, xi0.a.a(sVar6.getCurrency()), teenVaultBalanceWrapper.d, teenVaultBalanceWrapper.f99407g), null, 0, 0, 0, 0, 532665304);
        }
        if (wrapper instanceof BalanceWrapper.TradingAccountBalanceWrapper) {
            BalanceWrapper.TradingAccountBalanceWrapper tradingAccountBalanceWrapper = (BalanceWrapper.TradingAccountBalanceWrapper) wrapper;
            xi0.b bVar9 = tradingAccountBalanceWrapper.f99406c;
            TradingAccount tradingAccount = tradingAccountBalanceWrapper.f99447h;
            CashHoldingAvailability cashHoldingAvailability = tradingAccountBalanceWrapper.i;
            if (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Custodian) {
                imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_children, R$attr.uikit_colorWhite, R$attr.uikit_colorLightBlue);
            } else if ((tradingAccount instanceof TradingAccount.TaxAdvantage.Isa) || (tradingAccount instanceof TradingAccount.TaxAdvantage.JIsa.Personal)) {
                imageI = LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_bar_chart_percent, R$attr.uikit_colorWhite, R$attr.uikit_colorLightBlue);
            } else {
                if (!(tradingAccount instanceof TradingAccount.Margin) && !(tradingAccount instanceof TradingAccount.GIA)) {
                    throw new IllegalStateException(("Unsupported Cash Holding's image for trading account " + tradingAccount.W()).toString());
                }
                imageI = new CurrencyImage(bVar9.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14);
            }
            AllowedCashOperationsReason allowedCashOperationsReason = cashHoldingAvailability.f105110c;
            AllowedCashOperationsReason.HasMarginLoan hasMarginLoan = allowedCashOperationsReason instanceof AllowedCashOperationsReason.HasMarginLoan ? (AllowedCashOperationsReason.HasMarginLoan) allowedCashOperationsReason : null;
            String str13 = tradingAccountBalanceWrapper.f99404a;
            RowDelegate.Model.MainImage.Image40 image40A7 = a(imageI, zF);
            AllowedCashOperationsReason.HasMarginLoan hasMarginLoan2 = hasMarginLoan;
            CurrencyClause currencyClause3 = new CurrencyClause(bVar9, displayName, null, 4);
            RowDelegate.Model.c.b bVar10 = new RowDelegate.Model.c.b(new MoneyClause(tradingAccountBalanceWrapper.f99448j, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), b(tradingAccountBalanceWrapper), null, false, 124);
            if (hasMarginLoan2 != null) {
                bVar2 = aVar;
            }
            return new RowDelegate.Model(str13, image40A7, currencyClause3, null, 0, null, null, null, 0, bVar10, true, null, zF, bVar2, null, null, null, null, null, hasMarginLoan2 != null ? new BalancePickerScreenContract$DisabledBalanceParcel(tradingAccountBalanceWrapper) : new j1j.d(tradingAccountBalanceWrapper.f99404a, cashHoldingAvailability.f105108a.e.f115083b, personal, tradingAccountBalanceWrapper.f99450m), null, 0, 0, 0, 0, 532648952);
        }
        if (!(wrapper instanceof BalanceWrapper.CollateralBalanceWrapper)) {
            if (!(wrapper instanceof BalanceWrapper.DeFiBalanceWrapper)) {
                if (!(wrapper instanceof BalanceWrapper.NonExistingCurrencyBalanceWrapper)) {
                    throw new NoWhenBranchMatchedException();
                }
                BalanceWrapper.NonExistingCurrencyBalanceWrapper nonExistingCurrencyBalanceWrapper = (BalanceWrapper.NonExistingCurrencyBalanceWrapper) wrapper;
                xi0.b bVar11 = nonExistingCurrencyBalanceWrapper.f99428h;
                return new RowDelegate.Model(nonExistingCurrencyBalanceWrapper.f99404a, a(new CurrencyImage(bVar11.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), zF), new CurrencyClause(bVar11, displayName, null, 4), null, 0, null, null, null, 0, null, true, null, zF, bVar2, null, null, null, null, null, new j1j.d(bVar11.f306286a, bVar11, nonExistingCurrencyBalanceWrapper.i, nonExistingCurrencyBalanceWrapper.f99429j), null, 0, 0, 0, 0, 532648920);
            }
            BalanceWrapper.DeFiBalanceWrapper wrapper2 = (BalanceWrapper.DeFiBalanceWrapper) wrapper;
            Intrinsics.checkNotNullParameter(wrapper2, "wrapper");
            String str14 = wrapper2.f99404a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(e36.a.a(wrapper2.k, wrapper2.i), d8l.d.b(zF), null, false, null, false, 60);
            TextClause textClause4 = new TextClause(wrapper2.f99415j, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            TextClause textClause5 = new TextClause(wrapper2.i, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            AssetClause assetClauseE = u5l.a.e(wrapper2.f99416l, null);
            dj0.d dVar4 = wrapper2.f99418n;
            return new RowDelegate.Model(str14, image40, textClause4, null, 0, textClause5, null, null, 0, new RowDelegate.Model.c.b(assetClauseE, dVar4 != null ? new MoneyClause(dVar4, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), true, null, zF, null, null, null, null, null, null, new j1j.d(wrapper2.f99404a, wrapper2.f99406c, AccountId.Personal.f51414a, k1j.a.DEFI), null, 0, 0, 0, 0, 532665304);
        }
        BalanceWrapper.CollateralBalanceWrapper wrapper3 = (BalanceWrapper.CollateralBalanceWrapper) wrapper;
        xi0.b bVar12 = wrapper3.i;
        Intrinsics.checkNotNullParameter(wrapper3, "wrapper");
        k1j.a aVar6 = wrapper3.f99410l;
        int i3 = a.f221626a[aVar6.ordinal()];
        CurrencyClause.Format.Ticker ticker = CurrencyClause.Format.Ticker.f57756a;
        if (i3 == 1) {
            pair = new Pair(displayName, ticker);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException(("Unsupported collateral balance type: " + aVar6).toString());
            }
            pair = new Pair(ticker, displayName);
        }
        CurrencyClause.Format format = (CurrencyClause.Format) pair.f186385a;
        CurrencyClause.Format format2 = (CurrencyClause.Format) pair.f186386b;
        String str15 = wrapper3.f99404a;
        RowDelegate.Model.MainImage.Image40 image402 = new RowDelegate.Model.MainImage.Image40(new CurrencyImage(bVar12.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14), d8l.d.b(zF), null, false, null, false, 60);
        CurrencyClause currencyClause4 = new CurrencyClause(bVar12, format, null, 4);
        CurrencyClause currencyClause5 = new CurrencyClause(bVar12, format2, null, 4);
        MoneyClause moneyClause = new MoneyClause(wrapper3.k, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12);
        dj0.d dVar5 = wrapper3.f99411m;
        return new RowDelegate.Model(str15, image402, currencyClause4, null, 0, currencyClause5, null, null, 0, new RowDelegate.Model.c.b(moneyClause, dVar5 != null ? new MoneyClause(dVar5, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12) : null, null, false, 124), true, null, zF, null, null, null, null, null, null, new j1j.d(wrapper3.f99404a, bVar12, personal, aVar6), null, 0, 0, 0, 0, 532665304);
    }
}
