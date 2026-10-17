package g88;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.models.ContactImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.junior.accounts.impl.R$string;
import com.revolut.feature.junior.accounts.models.JuniorProductAccountIdPayload;
import com.revolut.feature.tab.accounts.api.model.AccountListItemModel;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.api.model.ProductAccountBalance;
import com.revolut.feature.tab.accounts.api.model.ProductAccountMetadata;
import com.revolut.feature.tab.accounts.api.model.ProductAccountSubtitle;
import com.revolut.feature.tab.accounts.api.model.ProductAccountValue;
import com.revolut.feature.tab.accounts.api.model.ProductAccountWidgetAction;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import eb8.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;
import sf8.m;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fkg.a f141293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y79.a f141294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c91.a f141295c;
    public final e d;

    public g(s78.a juniorDashboardActionsProvider, fkg.a swipeActionsMapper, y79.a onHoldAccountMapper, c91.a juniorAccountNameProvider, e juniorAccountEmptyStateProvider, c juniorAccountConfigMapper) {
        Intrinsics.checkNotNullParameter(juniorDashboardActionsProvider, "juniorDashboardActionsProvider");
        Intrinsics.checkNotNullParameter(swipeActionsMapper, "swipeActionsMapper");
        Intrinsics.checkNotNullParameter(onHoldAccountMapper, "onHoldAccountMapper");
        Intrinsics.checkNotNullParameter(juniorAccountNameProvider, "juniorAccountNameProvider");
        Intrinsics.checkNotNullParameter(juniorAccountEmptyStateProvider, "juniorAccountEmptyStateProvider");
        Intrinsics.checkNotNullParameter(juniorAccountConfigMapper, "juniorAccountConfigMapper");
        this.f141293a = swipeActionsMapper;
        this.f141294b = onHoldAccountMapper;
        this.f141295c = juniorAccountNameProvider;
        this.d = juniorAccountEmptyStateProvider;
    }

    public final ProductAccount a(m accountInfo, List transactions, List list, boolean z, List onHoldAccounts, n pendingGraduation, do3.n parentProfile, boolean z3) {
        dj0.d dVar;
        ProductAccountId productAccountId;
        TextLocalisedClause textLocalisedClause;
        Intrinsics.checkNotNullParameter(accountInfo, "accountInfo");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(onHoldAccounts, "onHoldAccounts");
        Intrinsics.checkNotNullParameter(pendingGraduation, "pendingGraduation");
        Intrinsics.checkNotNullParameter(parentProfile, "parentProfile");
        sf8.h hVar = accountInfo.e;
        String str = accountInfo.f262361b;
        io3.d dVar2 = accountInfo.f262363g;
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        sf8.b bVar = sf8.b.f262351a;
        boolean zF = Intrinsics.f(hVar, bVar);
        c91.a aVar = this.f141295c;
        if (zF) {
            a aVarA = c.a(accountInfo, list, z, pendingGraduation);
            if (dVar2 == null) {
                throw new IllegalStateException("Base pocket is required");
            }
            String str2 = dVar2.f163145a;
            return new ProductAccount.PendingItem(new ProductAccountId(str2, new JuniorProductAccountIdPayload(str, str2)), new ContactImage(accountInfo.f262361b, (String) null, (String) null, (String) null, (String) null, accountInfo.b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), ((d91.b) aVar).a(ProductId.CURRENCY), aVarA.f141290b, aVarA.f141289a, accountInfo, true);
        }
        a aVarA2 = c.a(accountInfo, list, z, pendingGraduation);
        dj0.d dVar3 = accountInfo.f;
        boolean z4 = aVarA2.f141291c;
        if (dVar2 == null) {
            throw new IllegalStateException("Base pocket is required");
        }
        p78.b bVar2 = new p78.b(dVar2, accountInfo);
        List listA = s78.a.a(accountInfo, transactions.isEmpty(), parentProfile, z3, bVar2);
        dj0.d dVarA = accountInfo.a();
        dj0.d dVar4 = dVarA == null ? dVar3 : dVarA;
        String str3 = dVar2.f163145a;
        ProductAccountId productAccountId2 = new ProductAccountId(str3, new JuniorProductAccountIdPayload(str, str3));
        if (z4) {
            dVar = dVar3;
            productAccountId = productAccountId2;
            textLocalisedClause = null;
        } else {
            productAccountId = productAccountId2;
            dVar = dVar3;
            textLocalisedClause = new TextLocalisedClause(R$string.junior_account_switcher_account_cell_balance_description_inactive, null, null, 14);
        }
        ProductAccountValue.Balance balance = new ProductAccountValue.Balance(dVar4, textLocalisedClause, 4);
        ProductAccountMetadata productAccountMetadata = new ProductAccountMetadata(new ProductAccountBalance.WithAmount(dVar4), true);
        AccountListItemModel accountListItemModel = new AccountListItemModel((Image) new ContactImage(accountInfo.f262361b, (String) null, (String) null, (String) null, (String) null, accountInfo.b(), (String) null, false, (StylableContactImage$ContactStyle) rf8.a.f253707a, (ImageTransformations) null, (TextLocalisedClause) null, 3550), ((d91.b) aVar).a(ProductId.CURRENCY), aVarA2.f141290b, this.f141293a.q(bVar2, dVar2), aVarA2.f141289a, false, false, true, BERTags.FLAGS);
        TextClause textClause = new TextClause(accountInfo.f262362c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        List listA2 = s78.a.a(accountInfo, transactions.isEmpty(), parentProfile, z3, new p78.b(dVar2, accountInfo));
        ProductAccountSubtitle productAccountSubtitleA = ((e89.a) this.f141294b).a(dVar2, onHoldAccounts);
        if (productAccountSubtitleA == null) {
            productAccountSubtitleA = new ProductAccountSubtitle.Text(new TextLocalisedClause(R$string.junior_home_header_title, null, null, 14), null);
        }
        ProductAccountSubtitle productAccountSubtitle = productAccountSubtitleA;
        boolean zF2 = Intrinsics.f(hVar, bVar);
        AccountWidgetItemModel.EmptyStateStories emptyStateStoriesA = AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
        if (!zF2 && !Intrinsics.f(hVar, sf8.c.f262352a) && !Intrinsics.f(hVar, sf8.d.f262353a) && !Intrinsics.f(hVar, sf8.e.f262354a) && !Intrinsics.f(hVar, sf8.f.f262355a) && !(hVar instanceof sf8.g)) {
            if (!Intrinsics.f(hVar, sf8.a.f262350a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (!dVar.f(dj0.d.e)) {
                ArrayList arrayList = new ArrayList(w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    arrayList.add(((ProductAccountWidgetAction) it8.next()).f89538a);
                }
                emptyStateStoriesA = this.d.a(arrayList, accountInfo);
            }
        }
        return new ProductAccount.ValueItem.Main(productAccountId, (ProductAccountValue) balance, accountListItemModel, new AccountWidgetItemModel(listA2, (NavBarWithContainerBackground) null, emptyStateStoriesA, (Clause) textClause, false, productAccountSubtitle, 50), productAccountMetadata, (AccountListItemModel) null, !z4, true, 288);
    }
}
