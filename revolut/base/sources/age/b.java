package age;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.tab.accounts.models.product_payload.SavingsProductAccountPayload;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import md6.d;
import md6.e;
import md6.f;

/* JADX INFO: loaded from: classes8.dex */
public abstract class b {
    public static final RetailBackgroundKey a(BackgroundKey.Companion companion, ProductId productId, ProductAccountId accountId, ProductAccountMetadata metadata, d accountState) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(accountState, "accountState");
        xi0.b currency = metadata.getCurrency();
        e eVarB = b(accountId, productId);
        f fVarF = f(accountId, productId);
        ProductAccountId.Payload payload = accountId.f89730b;
        String str = accountId.f89729a;
        EntityInfo entityInfo = new EntityInfo(eVarB, fVarF, accountState);
        switch (a.f4817b[productId.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Favorites is not expected here");
            case 2:
                return RetailBackgroundKey.TotalWealthHome.f63874a;
            case 3:
                return new RetailBackgroundKey.PersonalCurrency(str, currency, entityInfo);
            case 4:
                return new RetailBackgroundKey.OnHold(str, currency, entityInfo);
            case 5:
                return new RetailBackgroundKey.Credit(str, currency, entityInfo);
            case 6:
                return new RetailBackgroundKey.Credit(str, currency, entityInfo);
            case 7:
                return new RetailBackgroundKey.Joint(str, currency, entityInfo);
            case 8:
                return new RetailBackgroundKey.Joint(str, currency, entityInfo);
            case 9:
                return new RetailBackgroundKey.Pro(str, currency, entityInfo);
            case 10:
                return new RetailBackgroundKey.Youth(str, currency, entityInfo);
            case 11:
                return new RetailBackgroundKey.Youth(str, currency, entityInfo);
            case 12:
                return new RetailBackgroundKey.Linked(str, currency, entityInfo);
            case 13:
                if (payload instanceof ExtendedSubaccountType.Group) {
                    return new RetailBackgroundKey.SubAccountGroup(str, currency, entityInfo);
                }
                if (!(payload instanceof ExtendedSubaccountType.Personal) && !(payload instanceof ExtendedSubaccountType.Joint)) {
                    if (payload instanceof ExtendedSubaccountType.PlanCashback) {
                        return new RetailBackgroundKey.SubAccountPlanCashback(str, currency, entityInfo);
                    }
                    if (payload instanceof ExtendedSubaccountType.RevPoints) {
                        return new RetailBackgroundKey.SubAccountRevPointsPocket(str, currency, entityInfo);
                    }
                    if ((payload instanceof ExtendedSubaccountType.Pro) || (payload instanceof ExtendedSubaccountType.ProTax)) {
                        return new RetailBackgroundKey.SubAccountPersonal(str, currency, entityInfo);
                    }
                    if (!(payload instanceof ExtendedSubaccountType.Junior) && !(payload instanceof ExtendedSubaccountType.Teen)) {
                        return payload instanceof ExtendedSubaccountType.Collateral ? new RetailBackgroundKey.Collateral(str, currency, entityInfo) : new RetailBackgroundKey.SubAccount(str, currency, entityInfo);
                    }
                    return new RetailBackgroundKey.SubAccountPersonal(str, currency, entityInfo);
                }
                return new RetailBackgroundKey.SubAccountPersonal(str, currency, entityInfo);
            case 14:
                SavingsProductAccountPayload.Challenge challenge = payload instanceof SavingsProductAccountPayload.Challenge ? (SavingsProductAccountPayload.Challenge) payload : null;
                return challenge != null ? new RetailBackgroundKey.SavingsChallenge(str, currency, entityInfo, challenge.d) : eVarB == e.YOUTH_SAVINGS ? new RetailBackgroundKey.YouthSavings(str, currency, entityInfo) : new RetailBackgroundKey.SavingsAccount(str, currency, entityInfo);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final e b(ProductAccountId productAccountId, ProductId productId) {
        switch (a.f4817b[productId.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Favorites is not expected here");
            case 2:
                return e.CURRENCY;
            case 3:
                return e.CURRENCY;
            case 4:
                return e.ON_HOLD;
            case 5:
                return e.CREDIT;
            case 6:
                return e.CREDIT;
            case 7:
                return e.JOINT;
            case 8:
                return e.JOINT;
            case 9:
                return e.PRO;
            case 10:
                return e.TEEN;
            case 11:
                return e.YOUTH;
            case 12:
                return e.LINKED;
            case 13:
                ProductAccountId.Payload payload = productAccountId.f89730b;
                return payload instanceof ExtendedSubaccountType.Group ? e.GROUP_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Personal ? e.PERSONAL_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Joint ? e.JOINT_SUBACCOUNT : payload instanceof ExtendedSubaccountType.PlanCashback ? e.PLAN_CASHBACK_SUBACCOUNT : payload instanceof ExtendedSubaccountType.RevPoints ? e.REV_POINTS_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Pro ? e.PRO_SUBACCOUNT : payload instanceof ExtendedSubaccountType.ProTax ? e.PRO_TAX_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Junior ? e.YOUTH_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Teen ? e.TEEN_SUBACCOUNT : payload instanceof ExtendedSubaccountType.Collateral ? e.COLLATERAL_SUBACCOUNT : e.PERSONAL_SUBACCOUNT;
            case 14:
                String str = productAccountId.f89729a;
                int iHashCode = str.hashCode();
                if (iHashCode != -1125588393) {
                    if (iHashCode != 1275150963) {
                        if (iHashCode == 2067341694 && str.equals("DISCOVER_JOINT_SAVINGS_ACCOUNT_ID")) {
                            return e.JOINT_SAVINGS;
                        }
                    } else if (str.equals("DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID")) {
                        return e.YOUTH_SAVINGS;
                    }
                } else if (str.equals("SAVINGS_DISCOVER_ITEM_ID")) {
                    return e.SAVINGS;
                }
                ProductAccountId.Payload payload2 = productAccountId.f89730b;
                return payload2 instanceof SavingsProductAccountPayload.Challenge ? c(((SavingsProductAccountPayload.Challenge) payload2).f89734c) : payload2 instanceof SavingsProductAccountPayload.Personal ? c(((SavingsProductAccountPayload.Personal) payload2).f89737c) : payload2 instanceof SavingsProductAccountPayload.Joint ? e.JOINT_SAVINGS : payload2 instanceof SavingsProductAccountPayload.Youth ? e.YOUTH_SAVINGS : payload2 instanceof SavingsProductAccountPayload.Teen ? e.TEEN_SAVINGS : e.SAVINGS;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final e c(oie.a aVar) {
        int i = a.f4816a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            return e.SAVINGS_DEPOSITS;
        }
        if (i == 3) {
            return e.SAVINGS_MMF;
        }
        if (i == 4) {
            return e.SAVINGS;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final d d(ProductAccountDescriptor$Value productAccountDescriptor$Value) {
        Intrinsics.checkNotNullParameter(productAccountDescriptor$Value, "<this>");
        if (productAccountDescriptor$Value instanceof ProductAccountDescriptor$Value.Discover) {
            return d.DISCOVERY;
        }
        if (productAccountDescriptor$Value instanceof ProductAccountDescriptor$Value.Main) {
            return d.OPENED;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final RetailBackgroundKey e(ProductAccountDescriptor$Value productAccountDescriptor$Value, ProductAccountMetadata metadata) {
        Intrinsics.checkNotNullParameter(productAccountDescriptor$Value, "<this>");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        return a(BackgroundKey.INSTANCE, productAccountDescriptor$Value.getF89727a(), productAccountDescriptor$Value.getF89728b(), metadata, d(productAccountDescriptor$Value));
    }

    public static final f f(ProductAccountId productAccountId, ProductId productId) {
        Intrinsics.checkNotNullParameter(productAccountId, "<this>");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return (a0.H(productAccountId.f89729a, "Total-", false) || productId == ProductId.TOTAL_WEALTH) ? f.AGGREGATED : f.SIMPLE;
    }
}
