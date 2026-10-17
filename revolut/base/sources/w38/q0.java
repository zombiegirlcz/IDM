package w38;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.domain.interactors.transactions.TransactionContext;
import com.revolut.feature.marketplace.api.R$string;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.subscriptions.models.RecurringPaymentAccount;
import com.revolut.feature.subscriptions.models.RecurringPaymentFilter;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature.transactions.api.navigation.TransactionDestination;
import com.revolut.feature.transactions.api.navigation.TransactionListDestination;
import com.revolut.feature.transactions.api.navigation.TransactionsListFilterType;
import et6.u1;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import tof.hc;
import tof.q6;

/* JADX INFO: loaded from: classes4.dex */
public final class q0 implements pfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u38.m f294204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f294205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f294206c;
    public final g48.r0 d;
    public final r38.b e;
    public final x79.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p56.a f294207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f294208h;
    public final wda.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wa7.m f294209j;
    public final r10.f k;

    public q0(u38.m mapper, ang.f userInteractor, wsg.n walletInteractor, g48.r0 jointAccountsInteractor, r38.b jointProductInteractor, x79.a onHoldAccountInteractor, p56.a removePocketInteractor, s jointDiscoverDataSource, wda.r pocketDetailsPreviewSource, wa7.m hiddenAccountsInteractor, r10.f alternativeFeaturesProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(jointProductInteractor, "jointProductInteractor");
        Intrinsics.checkNotNullParameter(onHoldAccountInteractor, "onHoldAccountInteractor");
        Intrinsics.checkNotNullParameter(removePocketInteractor, "removePocketInteractor");
        Intrinsics.checkNotNullParameter(jointDiscoverDataSource, "jointDiscoverDataSource");
        Intrinsics.checkNotNullParameter(pocketDetailsPreviewSource, "pocketDetailsPreviewSource");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(alternativeFeaturesProvider, "alternativeFeaturesProvider");
        this.f294204a = mapper;
        this.f294205b = userInteractor;
        this.f294206c = walletInteractor;
        this.d = jointAccountsInteractor;
        this.e = jointProductInteractor;
        this.f = onHoldAccountInteractor;
        this.f294207g = removePocketInteractor;
        this.f294208h = jointDiscoverDataSource;
        this.i = pocketDetailsPreviewSource;
        this.f294209j = hiddenAccountsInteractor;
        this.k = alternativeFeaturesProvider;
    }

    public static final vkm.d o(q0 q0Var, ProductAccountId productAccountId, n38.a aVar) {
        r38.b bVar = q0Var.e;
        efm.r rVarA = r38.b.a(bVar, l38.a.c(aVar));
        efm.r rVarB = r38.b.b(bVar, l38.a.c(aVar));
        cxe.u uVarE = ((d89.g) q0Var.f).e(z79.b.JOINT);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        efm.r rVarC = rd0.e.c(uVarE, gVar);
        efm.r rVarK = q0Var.f294205b.k(false);
        efm.r rVarC2 = rd0.e.c(new ahe.l(q0Var.f294209j.k(), 27), gVar);
        r10.f fVar = q0Var.k;
        efm.r map = rd0.e.c(new u1(nim.a.v(((kge.d) fVar.b).q(new qz9.u(9)), new r0e.i(10)), fVar, 21), gVar).map(new w(0, a0.f294153a));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(pd.b.r(nim.a.w(mif.a.h(rVarA, rVarB, rVarC, rVarK, rVarC2, map), new cia.b(productAccountId, 9)), new x(q0Var, aVar, 0)));
    }

    public static final TransactionListDestination p(q0 q0Var, ProductAccountId productAccountId, n38.a aVar) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.dashboard_widgets_transactions_title, null, null, 14);
        TransactionsListFilterType.ByAccounts byAccounts = new TransactionsListFilterType.ByAccounts(new ProductAccountDescriptor$Value.Main(productAccountId, ProductId.JOINT), (TransactionContext) null);
        rhf.g gVar = rhf.g.JOINT_HOME;
        AccountId.Joint jointC = l38.a.c(aVar);
        String str = aVar.f211924b;
        return new TransactionListDestination(new TransactionListDestination.InputData((Clause) textLocalisedClause, (TextLocalisedClause) null, (UrlImage) null, false, (TransactionsListFilterType) byAccounts, (String) null, (AccountId) jointC, (rhf.h) null, gVar, (TransactionDestination) null, (q6) new hc(str, null), (Set) null, (RecurringPaymentAccount) new RecurringPaymentAccount.Joint(aVar.f211923a, str), (RecurringPaymentFilter) null, false, 60078));
    }

    @Override // pfe.b
    public final Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        RowDelegate.Model model = new RowDelegate.Model("LIST_ID_DISCOVER_JOINT_EVERY_DUO_SECTION", s.b(R$drawable.uikit_icn_24_joint), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_duo_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_duo_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_DISCOVER_JOINT_SPEND_SECTION", s.b(R$drawable.uikit_icn_24_coins), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_spend_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_spend_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_DISCOVER_JOINT_SAVINGS_SECTION", s.b(R$drawable.uikit_icn_24_vault), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_savings_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_savings_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824);
        if (!((jte.d) this.f294208h.f294211a).c(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
            model3 = null;
        }
        RowDelegate.Model[] elements = {model, model2, model3, new RowDelegate.Model("LIST_ID_DISCOVER_JOINT_CARD_SECTION", s.b(R$drawable.uikit_icn_24_card), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_card_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_card_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("LIST_ID_DISCOVER_JOINT_OPEN_SECTION", s.b(R$drawable.uikit_icn_24_time), new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_open_title, null, null, 14), null, 0, new TextLocalisedClause(com.revolut.feature.joint.impl.R$string.joint_account_discovery_section_open_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return new d78.c(new go.g(listL, 2), 4);
    }

    @Override // pfe.b
    public final Flow b(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return new t38.e(xam.a.h(new l0(this, accountId, null), ((r38.l) this.e).f(w4l.h.f294642c)), 27, this, accountId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.tab.accounts.models.ProductAccountId r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w38.h0
            if (r0 == 0) goto L13
            r0 = r7
            w38.h0 r0 = (w38.h0) r0
            int r1 = r0.f294179x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294179x = r1
            goto L1a
        L13:
            w38.h0 r0 = new w38.h0
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294179x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r7)
            goto L6e
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.tab.accounts.models.ProductAccountId r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            r0.u = r6
            r0.f294179x = r4
            g48.r0 r7 = r5.d
            java.lang.Object r7 = t38.s.c(r7, r0)
            if (r7 != r1) goto L4a
            goto L6d
        L4a:
            com.revolut.core.model.account.AccountId$Joint r7 = (com.revolut.core.model.account.AccountId.Joint) r7
            r38.b r2 = r5.e
            efm.r r7 = r38.b.a(r2, r7)
            cia.b r2 = new cia.b
            r4 = 8
            r2.<init>(r6, r4)
            efm.r r6 = nim.a.w(r7, r2)
            r7 = 3
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r2, r7)
            r0.u = r2
            r0.f294179x = r3
            java.lang.Object r7 = nim.a.c(r6, r0)
            if (r7 != r1) goto L6e
        L6d:
            return r1
        L6e:
            io3.d r7 = (io3.d) r7
            long r0 = r7.i
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L90
            xfe.c r6 = new xfe.c
            dj0.d r0 = new dj0.d
            long r1 = r7.i
            xi0.a r3 = xi0.b.Companion
            java.lang.String r7 = r7.f163147c
            r3.getClass()
            xi0.b r7 = xi0.a.a(r7)
            r0.<init>(r1, r7)
            r6.<init>(r0)
            return r6
        L90:
            xfe.a$b r6 = xfe.a.b.f305242a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.q0.g(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d9, code lost:
    
        if (nim.a.a(r13, r0) != r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.revolut.feature.tab.accounts.models.ProductAccountId r13, kotlin.coroutines.Continuation r14) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.q0.h(com.revolut.feature.tab.accounts.models.ProductAccountId, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.tab.accounts.models.ProductAccountId r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w38.p0
            if (r0 == 0) goto L13
            r0 = r7
            w38.p0 r0 = (w38.p0) r0
            int r1 = r0.f294202w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294202w = r1
            goto L18
        L13:
            w38.p0 r0 = new w38.p0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294202w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L60
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f89729a
            java.lang.String r7 = "JOINT_PENDING_INVITATION_PRODUCT_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L3e
            goto L6c
        L3e:
            n38.q r6 = n38.q.PENDING
            java.util.Set r6 = zhm.y0.b(r6)
            g48.r0 r7 = r5.d
            w4l.h r2 = w4l.h.f294642c
            cxe.u r6 = r7.e(r6, r2)
            w2.d r7 = new w2.d
            r2 = 9
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)
            r0.f294202w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L69
            java.lang.Object r6 = r7.f224257a
            n38.a r6 = (n38.a) r6
            goto L6a
        L69:
            r6 = r4
        L6a:
            if (r6 == 0) goto L6f
        L6c:
            sfe.a0 r6 = sfe.a0.f262402a
            return r6
        L6f:
            sfe.z r6 = new sfe.z
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointCurrency$a r7 = com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext.JointCurrency.INSTANCE
            r7.getClass()
            com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointCurrency r7 = new com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext$JointCurrency
            r7.<init>(r4, r3, r4)
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.q0.i(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }

    @Override // pfe.b
    public final Flow m(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (Intrinsics.f(accountId.f89729a, "JOINT_DISCOVER_ITEM_ID")) {
            return new go.g(zi0.c.P(s.a(), false, null, 3), 2);
        }
        return xam.a.h(new k0(this, accountId, null), ((r38.l) this.e).f(w4l.h.f294642c));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // pfe.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(com.revolut.feature.tab.accounts.models.ProductAccountId r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof w38.m0
            if (r0 == 0) goto L13
            r0 = r7
            w38.m0 r0 = (w38.m0) r0
            int r1 = r0.f294194x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f294194x = r1
            goto L18
        L13:
            w38.m0 r0 = new w38.m0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f294194x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            akd.s r6 = r0.u
            yhm.o.b(r7)
            goto L4f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f89729a
            java.lang.String r7 = "JOINT_DISCOVER_ITEM_ID"
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r6, r7)
            if (r6 == 0) goto L40
            return r4
        L40:
            akd.s r6 = akd.s.JOINT
            r0.u = r6
            r0.f294194x = r3
            g48.r0 r7 = r5.d
            java.lang.Object r7 = t38.s.a(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            com.revolut.core.model.account.AccountId$Joint r7 = (com.revolut.core.model.account.AccountId.Joint) r7
            if (r7 == 0) goto L55
            java.lang.String r4 = r7.f51412a
        L55:
            java.util.Set r7 = zhm.z0.h(r4)
            com.revolut.feature.slot_manager.api.model.SlotContext r0 = new com.revolut.feature.slot_manager.api.model.SlotContext
            r0.<init>(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w38.q0.n(com.revolut.feature.tab.accounts.models.ProductAccountId, gim.c):java.lang.Object");
    }
}
