package ina;

import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.profile.api.DocumentsPage;
import com.revolut.feature.profile.impl.R$string;
import com.revolut.feature.statements.api.StatementsApi$FeatureToggles;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import com.revolut.feature.statements.api.navigation.AccountsStatementFeatureConfig;
import com.revolut.feature.statements.api.navigation.DocumentsHubProduct;
import com.revolut.feature.statements.api.navigation.DocumentsHubType;
import et6.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends k {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final zxd.a f162764l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f162765m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final gr6.m f162766n;
    public final fna.i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jna.b f162767p;

    public x(zxd.a currencySelectionInteractor, gte.a featureToggleInteractor, gr6.m freelancerPocketsInteractor, fna.i itemsFactory, jna.b accountConfirmationDelegate) {
        Intrinsics.checkNotNullParameter(currencySelectionInteractor, "currencySelectionInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(itemsFactory, "itemsFactory");
        Intrinsics.checkNotNullParameter(accountConfirmationDelegate, "accountConfirmationDelegate");
        this.f162764l = currencySelectionInteractor;
        this.f162765m = featureToggleInteractor;
        this.f162766n = freelancerPocketsInteractor;
        this.o = itemsFactory;
        this.f162767p = accountConfirmationDelegate;
    }

    public static final void i3(x xVar, Collection collection) {
        xVar.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(zhm.w.t(collection2, 10));
        Iterator it8 = collection2.iterator();
        while (it8.hasNext()) {
            arrayList.add(z92.f.l((io3.d) it8.next()));
        }
        xVar.A2(new AccountsStatementFeatureConfig.AccountsStatementDestination(zhm.d0.i1(arrayList), AccountStatementProduct.Pro.f88238a));
    }

    @Override // ina.k
    public final void Z2(RowDelegate.Model item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f53228a;
        boolean zF = Intrinsics.f(str, "ID_PRO_ACCOUNT_CONFIRMATION");
        AccountId.Personal accountId = AccountId.Personal.f51414a;
        if (zF) {
            io3.l pocketType = io3.l.MERCHANT;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            this.f162767p.a(this, accountId, pocketType);
            return;
        }
        if (Intrinsics.f(str, "ID_PRO_STATEMENTS")) {
            StatementsApi$FeatureToggles.DocumentsHub documentsHub = StatementsApi$FeatureToggles.DocumentsHub.f88209c;
            jte.d dVar = (jte.d) this.f162765m;
            if (dVar.c(documentsHub) || dVar.c(StatementsApi$FeatureToggles.DocumentsHubMvp.f88210c)) {
                DocumentsHubType.INSTANCE.getClass();
                DocumentsHubProduct.INSTANCE.getClass();
                e3("PRO_CURRENT");
            } else {
                yji.n.l2(this, vkm.q.P(mo3.a.g(((ryd.b) this.f162764l).b(accountId, io3.l.MERCHANT), null, new ijj.r(21), 1), 1), null, new ibg.g(this, null, 20), 3);
            }
        }
    }

    @Override // ina.k
    public final Flow c3(DocumentsPage documentsPage) {
        DocumentsPage.Pro documentsPage2 = (DocumentsPage.Pro) documentsPage;
        Intrinsics.checkNotNullParameter(documentsPage2, "documentsPage");
        return nim.a.v(((i2) this.f162766n).c(w4l.h.f294642c), new ii4.b(this, 18));
    }

    @Override // ina.k
    public final Object h3(DocumentsPage documentsPage, ge7.f fVar) {
        return new TextLocalisedClause(R$string.documents_group_freelancer, null, null, 14);
    }
}
