package ina;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.core.model.domain.wallet.WalletId;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.ui.documents_redesigned.document_selector.DocumentSelectorScreenContract$InputData;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.navigation.StatementOfFeesDestination;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final xqe.b f162709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final DocumentSelectorScreenContract$InputData f162710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fna.h f162711n;
    public final wsg.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zxd.a f162712p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zxd.c f162713q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ij0.a f162714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vyd.a f162715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final fna.i f162716t;

    public e0(xqe.b teenProfileInteractor, DocumentSelectorScreenContract$InputData inputData, fna.h documentsConfigurationInteractor, wsg.b newWalletsInteractor, zxd.a currencySelectionInteractor, zxd.c statementsInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory, fna.i itemsFactory) {
        Intrinsics.checkNotNullParameter(teenProfileInteractor, "teenProfileInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(documentsConfigurationInteractor, "documentsConfigurationInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(currencySelectionInteractor, "currencySelectionInteractor");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        this.f162709l = teenProfileInteractor;
        this.f162710m = inputData;
        this.f162711n = documentsConfigurationInteractor;
        this.o = newWalletsInteractor;
        this.f162712p = currencySelectionInteractor;
        this.f162713q = statementsInteractor;
        this.f162714r = coreNetworkConfiguration;
        this.f162715s = dialogModelConfigurationFactory;
        this.f162716t = itemsFactory;
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj2 = item.u;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.core.model.domain.wallet.WalletId");
        String str = ((WalletId) obj2).f66106a;
        String str2 = item.f53228a;
        int iHashCode = str2.hashCode();
        if (iHashCode == -1337489636) {
            if (str2.equals("ID_TEEN_ACCOUNT_STATEMENT")) {
                io3.l pocketType = io3.l.CURRENT;
                ryd.b bVar = (ryd.b) this.f162712p;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(str, "$v$c$com-revolut-feature-core-model-domain-wallet-WalletId$-walletId$0");
                Intrinsics.checkNotNullParameter(pocketType, "pocketType");
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                yji.n.l2(this, vkm.q.P(mo3.a.g(boh.f.e(bVar.f258328b.d(str, loadingStrategy), new qz9.o(bVar, 28, pocketType, loadingStrategy)), null, new ijj.r(24), 1), 1), null, new c0(this, str, null), 3);
                return;
            }
            return;
        }
        if (iHashCode != 57533860) {
            if (iHashCode == 1898133320 && str2.equals("ID_TEEN_ACCOUNT_CONFIRMATION")) {
                b3(zxd.c.b(this.f162713q, null, str, null, 13), this.f162714r, this.f162715s);
                return;
            }
            return;
        }
        if (str2.equals("ID_TEEN_STATEMENT_OF_FEES")) {
            DocumentsPage documentsPage = this.f162710m.f81412a;
            Intrinsics.i(documentsPage, "null cannot be cast to non-null type com.revolut.feature.profile.api.DocumentsPage.Teen");
            A2(new StatementOfFeesDestination(StatementProductType.PERSONAL_CURRENT, str, ((DocumentsPage.Teen) documentsPage).f81308a));
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.Teen documentsPage2 = (DocumentsPage.Teen) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        return nim.a.v(u0.m(this.f162711n.a(AccountId.Personal.f51414a), this.o.c(documentsPage2.f81308a, w4l.h.f294642c)), new ii4.b(this, 19));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ina.k
    /* JADX INFO: renamed from: i3, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.feature.profile.api.DocumentsPage.Teen r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ina.d0
            if (r0 == 0) goto L13
            r0 = r7
            ina.d0 r0 = (ina.d0) r0
            int r1 = r0.f162707w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f162707w = r1
            goto L18
        L13:
            ina.d0 r0 = new ina.d0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f162707w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L51
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            java.lang.String r6 = r6.f81308a
            w4l.h r7 = w4l.h.f294642c
            xqe.b r2 = r5.f162709l
            dfj.m0 r6 = r2.a(r6, r7)
            ijj.r r7 = new ijj.r
            r2 = 23
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r3, r7, r4)
            r0.f162707w = r4
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L51
            return r1
        L51:
            com.revolut.feature.teen_profile.api.models.TeenProfile r7 = (com.revolut.feature.teen_profile.api.models.TeenProfile) r7
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r0 = com.revolut.feature.profile.api.R$string.documents_group_teen
            java.lang.String r7 = r7.f90335b
            java.util.List r7 = zhm.u.c(r7)
            r1 = 12
            r6.<init>(r0, r7, r3, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ina.e0.h3(com.revolut.feature.profile.api.DocumentsPage$Teen, gim.c):java.lang.Object");
    }
}
