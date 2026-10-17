package d6e;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.models.GlobalSearchContext;
import com.revolut.feature.vaults.R$string;
import g48.r0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.d0;
import o97.g0;
import o97.y;
import org.jetbrains.annotations.NotNull;
import skm.p0;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class r implements z87.d {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pfe.g f111525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z5e.c f111526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f111527c;
    public final g6e.g d;
    public final f01.c e;
    public final l f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wa7.m f111528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f111529h;
    public final o97.r i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f111530j;

    public r(pfe.g aggregator, z5e.c jointDataSource, r0 jointAccountsInteractor, g6e.g navigationProvider, f01.c uiKitResources, l accountType, wa7.m hiddenAccountsInteractor) {
        o97.r rVar;
        Intrinsics.checkNotNullParameter(aggregator, "aggregator");
        Intrinsics.checkNotNullParameter(jointDataSource, "jointDataSource");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        this.f111525a = aggregator;
        this.f111526b = jointDataSource;
        this.f111527c = jointAccountsInteractor;
        this.d = navigationProvider;
        this.e = uiKitResources;
        this.f = accountType;
        this.f111528g = hiddenAccountsInteractor;
        ihm.b bVarE = ihm.b.e(new Data(Boolean.FALSE, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f111529h = bVarE;
        int i = p.f111523a[accountType.ordinal()];
        if (i == 1) {
            rVar = o97.r.POCKETS;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = o97.r.JOINT_POCKETS;
        }
        this.i = rVar;
        this.f111530j = yhm.j.b(new co7.a(this, 23));
    }

    @Override // z87.d
    public final efm.r f(String searchQuery, GlobalSearchContext context) {
        efm.r rVarC;
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(context, "context");
        if (d0.W(searchQuery)) {
            efm.r rVarJust = efm.r.just(new Data(f0.f322471a, null, false, 6, null));
            Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
            return rVarJust;
        }
        int i = p.f111523a[this.f.ordinal()];
        if (i == 1) {
            rVarC = rd0.e.c(this.f111525a.d(sfe.a.FULL), p0.f264003c);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING, n38.q.PENDING};
            Intrinsics.checkNotNullParameter(elements, "elements");
            rVarC = rd0.e.c(vkm.q.Q(k38.c.a(this.f111527c, null, kotlin.collections.d.y0(elements), 1), new cvi.i((Continuation) null, this, 9)), p0.f264003c);
        }
        efm.r map = nim.a.w(kli.a.i(rVarC, this.f111529h, rd0.e.c(new ahe.l(this.f111528g.k(), 2), kotlin.coroutines.g.f186406a)), new d3i.k(searchQuery, this, 9)).map(new d2i.a(new d34.b(this, 10), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // z87.f
    public final o97.r h() {
        return this.i;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        boolean zH = a0.H(str, "SUBACCOUNT_SECTION_LIST_ID_", false);
        o97.e eVar = o97.e.f223096a;
        if (zH) {
            ihm.b bVar = this.f111529h;
            bVar.onNext(new Data(Boolean.valueOf(!pd.b.j(((Data) bVar.f()) != null ? (Boolean) r11.getContent() : null)), null, false, 6, null));
            return eVar;
        }
        if (a0.H(str, "SUBACCOUNT_ITEM_ID_", false)) {
            Object obj2 = yVar.f223136b;
            if (obj2 instanceof n) {
                n nVar = (n) obj2;
                String str2 = yVar.f223137c;
                if (Intrinsics.f(str2, "details")) {
                    return new o97.l(((v6e.r) this.d).c(nVar.f111520a, nVar.f111522c));
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, p.a.p("Action with ", str2, " is not supported"), illegalArgumentException, h0Var);
            }
        }
        return eVar;
    }

    public final o97.d0 m(int i, int i2, boolean z) {
        TextLocalisedClause textLocalisedClause;
        int[] iArr = p.f111523a;
        l lVar = this.f;
        int i3 = iArr[lVar.ordinal()];
        if (i3 == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_search_block_title, null, null, 14);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.subaccounts_search_block_joint_title, null, null, 14);
        }
        if (i <= i2) {
            return new o97.f0(textLocalisedClause, "SUBACCOUNT_SECTION_LIST_ID_" + lVar);
        }
        return new g0(textLocalisedClause, new TextLocalisedClause(z ? com.revolut.feature.globalsearch.api.R$string.search_block_header_show_less : com.revolut.feature.globalsearch.api.R$string.search_block_header_show_more, null, null, 14), "SUBACCOUNT_SECTION_LIST_ID_" + lVar, new y(this.i, null, null, 62));
    }
}
