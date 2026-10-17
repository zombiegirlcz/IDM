package aob;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.impl.home.accounts.SavingsAccountsContract$JuniorDiscoverAccountPayload;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.youTransactor.uCube.rpc.Constants;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import tnb.d0;
import tnb.g0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iob.c f7958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dcd.b f7959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f7960c;
    public final y79.a d;
    public final g0 e;
    public final unb.c f;

    public d(iob.c savingsAccountMapper, mbd.b savingsVaultMapper, dcd.b savingsInterestRateFormatter, gte.a featureToggleInteractor, y79.a onHoldAccountMapper, a savingsEmptyStateProvider, gjb.b teenSavingsAccountIdResolver, g0 savingsEntryPointsContentProvider, wjb.a challengeBackgroundIdProvider, unb.c savingsHomeActionsProvider) {
        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
        Intrinsics.checkNotNullParameter(savingsVaultMapper, "savingsVaultMapper");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(savingsEmptyStateProvider, "savingsEmptyStateProvider");
        Intrinsics.checkNotNullParameter(teenSavingsAccountIdResolver, "teenSavingsAccountIdResolver");
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        Intrinsics.checkNotNullParameter(challengeBackgroundIdProvider, "challengeBackgroundIdProvider");
        Intrinsics.checkNotNullParameter(savingsHomeActionsProvider, "savingsHomeActionsProvider");
        this.f7958a = savingsAccountMapper;
        this.f7959b = savingsInterestRateFormatter;
        this.f7960c = featureToggleInteractor;
        this.d = onHoldAccountMapper;
        this.e = savingsEntryPointsContentProvider;
        this.f = savingsHomeActionsProvider;
    }

    public static oie.a a(ncd.g gVar) {
        int i = c.e[gVar.ordinal()];
        if (i == 1) {
            return oie.a.SAVINGS_DEPOSITS;
        }
        if (i == 2) {
            return oie.a.SAVINGS_FIXED_TERM;
        }
        if (i == 3) {
            return oie.a.SAVINGS_MMF;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem.Main b(ejb.b r44, ncd.h r45, cfl.b r46, uib.a r47, java.util.List r48, boolean r49, od0.i r50) {
        /*
            Method dump skipped, instruction units count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aob.d.b(ejb.b, ncd.h, cfl.b, uib.a, java.util.List, boolean, od0.i):com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main");
    }

    public final ProductAccount.ValueItem.Discover c(List products, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : products) {
            if (((SavingsProductData) obj2).f86683a.f86628r == ncd.h.PERSONAL_JOINT) {
                arrayList.add(obj2);
            }
        }
        SavingsProductData savingsProductDataA = opg.a.a(arrayList);
        if (savingsProductDataA == null) {
            return null;
        }
        return new ProductAccount.ValueItem.Discover(new ProductAccountId("DISCOVER_JOINT_SAVINGS_ACCOUNT_ID", null), new ProductAccountValue.Text(6, new TextLocalisedClause(R$string.joint_savings_account_discovery_title, null, null, 14), (TextLocalisedClause) null), new AccountListItemModel((Image) nib.a.a(), (Clause) new TextLocalisedClause(R$string.joint_savings_account_discovery_title, null, null, 14), (Clause) this.e.a(u.c(savingsProductDataA), countryCode), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION), new AccountWidgetItemModel(u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.savings_home_discover_action, null, null, 14), null, null, "ACTION_JOINT_SAVINGS_DISCOVER_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.savings_home_discover_subtitle_ias, null, null, 14), null), 58), (ProductAccountMetadata) null, ufe.b.JOINT_SAVINGS, 48);
    }

    public final ProductAccount.ValueItem.Discover d(List products, od0.i juniorProfilesData, wi0.b countryCode) {
        Object next;
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(juniorProfilesData, "juniorProfilesData");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        snb.b bVar = (snb.b) juniorProfilesData.f224257a;
        if (bVar != null) {
            JuniorBankingProfile juniorBankingProfile = bVar.f264494a;
            if (c8g.a.l(bVar.f264495b) && ta6.a.A(bVar.e)) {
                Iterator it8 = products.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    if (Intrinsics.f(((SavingsProductData) next).f86683a.i, bVar.f264496c.f133274a)) {
                        break;
                    }
                }
                SavingsProductData savingsProductData = (SavingsProductData) next;
                if (savingsProductData != null) {
                    return new ProductAccount.ValueItem.Discover(new ProductAccountId(j6.a.q("DISCOVER_JUNIOR_SAVINGS_ACCOUNT_ID_", juniorBankingProfile.f77103j), new SavingsAccountsContract$JuniorDiscoverAccountPayload(juniorBankingProfile.f77103j, savingsProductData.f86683a.f86617a)), new ProductAccountValue.Text(6, new TextLocalisedClause(R$string.junior_spaces_add_new_product_saving_title, null, null, 14), (TextLocalisedClause) null), new AccountListItemModel((Image) nib.a.a(), (Clause) new TextLocalisedClause(R$string.junior_spaces_add_new_product_saving_title, null, null, 14), (Clause) this.e.a(u.c(savingsProductData), countryCode), (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION), new AccountWidgetItemModel(u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.savings_home_discover_junior_action, null, null, 14), null, null, "ACTION_JUNIOR_SAVINGS_DISCOVER_ID", null, null, false, false)), (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.savings_home_discover_subtitle_junior_ias, null, null, 14), null), 58), (ProductAccountMetadata) null, ufe.b.YOUTH_SAVINGS, 48);
                }
            }
        }
        return null;
    }

    public final ProductAccount.ValueItem.Discover e(uib.a config, List products, wi0.b countryCode) {
        TextLocalisedClause textLocalisedClauseA;
        int i;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        ProductAccountId productAccountId = new ProductAccountId("SAVINGS_DISCOVER_ITEM_ID", null);
        ProductAccountValue.Text text = new ProductAccountValue.Text(6, new TextLocalisedClause(oc.c.r(config.f280366a), null, null, 14), (TextLocalisedClause) null);
        LayeredImage layeredImageA = nib.a.a();
        TextLocalisedClause textLocalisedClauseD = g0.d(config.f280366a);
        LocalDate localDate = ocd.c.f224221a;
        Intrinsics.checkNotNullParameter(products, "<this>");
        Intrinsics.checkNotNullParameter(products, "<this>");
        if (products.size() == 1 && ((SavingsProductData) zhm.d0.b0(products)).f86683a.f86628r == ncd.h.PERSONAL_UNDER_18 && !ocd.c.j((SavingsProductData) zhm.d0.b0(products))) {
            SavingsProductData savingsProductDataA = opg.a.a(products);
            textLocalisedClauseA = savingsProductDataA != null ? new TextLocalisedClause(R$string.savings_common_exact_rate_separated, v.k(this.f7959b.k(savingsProductDataA, null), new TextClause(savingsProductDataA.f86683a.f86621h.f86645b.f86648b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12) : null;
        } else {
            textLocalisedClauseA = this.e.a(products, countryCode);
        }
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) layeredImageA, (Clause) textLocalisedClauseD, (Clause) textLocalisedClauseA, (List) null, (CircleBadgeModel) null, false, false, false, Constants.TAG_FULL_SVPP_IDENTIFICATION);
        List listC = u.c(new ProductAccountWidgetAction(508, null, new TextLocalisedClause(R$string.savings_home_discover_action, null, null, 14), null, null, "SAVINGS_DISCOVER_BUTTON_ID", null, null, false, false));
        if (products.isEmpty()) {
            i = R$string.savings_home_discover_subtitle_multiple_products;
            break;
        }
        List list = products;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                if (!ocd.a.b((SavingsProductData) it8.next())) {
                    i = R$string.savings_home_discover_subtitle_multiple_products;
                    break;
                }
            }
        }
        i = R$string.savings_home_discover_subtitle_ias;
        return new ProductAccount.ValueItem.Discover(productAccountId, text, accountListItemModel, new AccountWidgetItemModel(listC, (NavBarWithContainerBackground) null, (AccountWidgetItemModel.EmptyStateStories) AccountWidgetItemModel.EmptyStateStories.DelayedStories.f89488a, (Clause) null, false, (ProductAccountSubtitle) new ProductAccountSubtitle.Text(new TextLocalisedClause(i, null, null, 14), null), 58), (ProductAccountMetadata) null, ufe.b.PERSONAL_SAVINGS, 48);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0224 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0269 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0833  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x08d3  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0a7a A[LOOP:0: B:435:0x0a74->B:437:0x0a7a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:441:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0b3a A[PHI: r12
      0x0b3a: PHI (r12v25 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2) = 
      (r12v20 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2)
      (r12v21 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2)
      (r12v22 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2)
      (r12v23 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2)
      (r12v26 com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2)
     binds: [B:462:0x0b38, B:458:0x0b16, B:454:0x0af4, B:450:0x0ad2, B:443:0x0aa3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0b61  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0b69  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r13v7, types: [jla.h] */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r16v5, types: [com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction] */
    /* JADX WARN: Type inference failed for: r17v4, types: [com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction] */
    /* JADX WARN: Type inference failed for: r20v4, types: [com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction] */
    /* JADX WARN: Type inference failed for: r21v4, types: [com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5, types: [com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction] */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.TextLocalisedClause, java.lang.String, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v88 */
    /* JADX WARN: Type inference failed for: r50v0 */
    /* JADX WARN: Type inference failed for: r50v1 */
    /* JADX WARN: Type inference failed for: r50v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.feature.tab.accounts.api.model.ProductAccount.ValueItem.Main f(com.revolut.feature.shared.savings.models.SavingsAccountDetails r60, cfl.b r61, java.util.List r62, uib.a r63, od0.i r64, boolean r65, od0.i r66, qib.i r67) {
        /*
            Method dump skipped, instruction units count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aob.d.f(com.revolut.feature.shared.savings.models.SavingsAccountDetails, cfl.b, java.util.List, uib.a, od0.i, boolean, od0.i, qib.i):com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main");
    }
}
