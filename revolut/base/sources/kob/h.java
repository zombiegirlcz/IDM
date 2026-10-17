package kob;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import djb.n;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import o97.d0;
import o97.g0;
import o97.l;
import o97.r;
import o97.y;
import org.jetbrains.annotations.NotNull;
import wa7.m;
import yhm.j;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements z87.d {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f186285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f186286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iob.c f186287c;
    public final f01.c d;
    public final gte.a e;
    public final xoj.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f186288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f186289h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r f186290j;

    public h(d sourceType, n savingsAccountsDetailsInteractor, iob.c savingsAccountMapper, f01.c uiKitResources, gte.a featureToggleInteractor, xoj.a featuresInteractor, m hiddenAccountsInteractor) {
        r rVar;
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(savingsAccountMapper, "savingsAccountMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f186285a = sourceType;
        this.f186286b = savingsAccountsDetailsInteractor;
        this.f186287c = savingsAccountMapper;
        this.d = uiKitResources;
        this.e = featureToggleInteractor;
        this.f = featuresInteractor;
        this.f186288g = hiddenAccountsInteractor;
        ihm.b bVarE = ihm.b.e(new Data(Boolean.FALSE, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f186289h = bVarE;
        this.i = j.b(new a(this, 0));
        int i = f.f186283a[sourceType.ordinal()];
        if (i == 1) {
            rVar = r.VAULTS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = r.JOINT_SAVINGS;
        }
        this.f186290j = rVar;
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f186285a == d.Joint && this.e.a(SavingsApi$Toggles.JointAccountsSavings.f83075c)) {
            return zi0.c.j(f0.f322471a);
        }
        efm.r rVarFlatMap = ((cpj.b) this.f).l(yoj.c.VAULTS_SAVINGS).flatMap(new km2.b(6, new b(this, searchQuery, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    @Override // z87.f
    public final r h() {
        return this.f186290j;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "SAVINGS_SECTION_LIST_ID");
        o97.e eVar = o97.e.f223096a;
        if (zF) {
            ihm.b bVar = this.f186289h;
            bVar.onNext(new Data(Boolean.valueOf(!pd.b.j(((Data) bVar.f()) != null ? (Boolean) r10.getContent() : null)), null, false, 6, null));
            return eVar;
        }
        if (a0.H(str, "SAVINGS_ITEM_ID", false)) {
            Object obj2 = yVar.f223136b;
            if (obj2 instanceof SavingsAccountDetails) {
                SavingsAccountDetails savingsAccountDetails = (SavingsAccountDetails) obj2;
                if (Intrinsics.f(yVar.f223137c, "details")) {
                    return new l(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(savingsAccountDetails.f86460a.f234881a, null), ProductId.SAVINGS), null), null, null, 12));
                }
            }
        }
        return eVar;
    }

    public final d0 m(int i, int i2, boolean z) {
        TextLocalisedClause textLocalisedClause;
        int i3 = f.f186283a[this.f186285a.ordinal()];
        if (i3 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.vaults_search_product_savings_title, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.vaults_search_product_joint_savings_title, null, null, 14);
        }
        if (i <= i2) {
            return new o97.f0(textLocalisedClause, "SAVINGS_SECTION_LIST_ID");
        }
        return new g0(textLocalisedClause, new TextLocalisedClause(z ? com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less : com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "SAVINGS_SECTION_LIST_ID", new y(this.f186290j, null, null, 62));
    }
}
