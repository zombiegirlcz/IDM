package uwl;

import ang.f;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.internal.views.ProgressStyle;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.globalsearch.api.R$string;
import com.revolut.feature.vaults.R$plurals;
import com.revolut.feature.vaults.api.navigation.VaultsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kp0.w0;
import o97.d0;
import o97.e;
import o97.f0;
import o97.g0;
import o97.l;
import o97.r;
import o97.v;
import o97.y;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import pcd.e0;
import pcd.s;
import wa7.m;
import yhm.j;
import zhm.w;
import zsc.q;

/* JADX INFO: loaded from: classes12.dex */
public final class d extends k5l.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f283699c;
    public final f d;
    public final dcd.b e;
    public final f01.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final kpg.a f283700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f283701h;
    public final ihm.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f283702j;
    public final v k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f283703l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ppg.b vaultsInteractor, f userInteractor, dcd.b savingsInterestRateFormatter, f01.c uiKitResources, kpg.a productAccountsNavigationProvider, m hiddenAccountsInteractor, xoj.a featuresInteractor) {
        super(featuresInteractor, yoj.c.VAULTS);
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(savingsInterestRateFormatter, "savingsInterestRateFormatter");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(productAccountsNavigationProvider, "productAccountsNavigationProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f283699c = vaultsInteractor;
        this.d = userInteractor;
        this.e = savingsInterestRateFormatter;
        this.f = uiKitResources;
        this.f283700g = productAccountsNavigationProvider;
        this.f283701h = hiddenAccountsInteractor;
        ihm.b bVarE = ihm.b.e(new Data(Boolean.FALSE, null, false, 6, null));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.i = bVarE;
        this.f283702j = j.b(new ur2.a(this, 6));
        this.k = new v(new TextLocalisedClause(R$string.search_block_vault_action_withdraw, null, null, 14), new ResourceImage(R$drawable.uikit_icn_24_arrow_down, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), "withdraw");
        this.f283703l = r.VAULTS;
    }

    public static d0 n(int i, int i2, boolean z) {
        if (i <= i2) {
            return new f0(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_grid_title, null, null, 14), "VAULTS_SECTION_LIST_ID");
        }
        return new g0(new TextLocalisedClause(com.revolut.feature.vaults.R$string.vaults_grid_title, null, null, 14), new TextLocalisedClause(z ? R$string.search_block_header_show_less : R$string.search_block_header_show_more, null, null, 14), "VAULTS_SECTION_LIST_ID", new y(r.VAULTS, null, null, 62));
    }

    @Override // z87.f
    public final r h() {
        return this.f283703l;
    }

    @Override // z87.f
    public final Object l(String str, y yVar, Continuation continuation) {
        boolean zF = Intrinsics.f(str, "VAULTS_SECTION_LIST_ID");
        e eVar = e.f223096a;
        if (zF) {
            ihm.b bVar = this.i;
            bVar.onNext(new Data(Boolean.valueOf(!pd.b.j(((Data) bVar.f()) != null ? (Boolean) r9.getContent() : null)), null, false, 6, null));
            return eVar;
        }
        if (!Intrinsics.f(str, "VAULTS_EMPTY_STATE_LIST_ID") && a0.H(str, "VAULTS_ITEM_ID", false)) {
            Object obj2 = yVar.f223136b;
            if (obj2 instanceof s) {
                s sVar = (s) obj2;
                String str2 = yVar.f223137c;
                if (Intrinsics.f(str2, "details")) {
                    return new l(((aqg.b) this.f283700g).a(sVar));
                }
                if (Intrinsics.f(str2, "withdraw")) {
                    return new l(new FeatureCommand(new VaultsFeatureConfig.Withdraw(sVar)));
                }
            }
        }
        return eVar;
    }

    public final ArrayList m(List list) {
        long j2;
        ProgressStyle progressStyleA;
        Clause textClause;
        int iG;
        List<q> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (q qVar : list2) {
            s sVar = (s) qVar.f324880a;
            String str = sVar.f234881a;
            pcd.g0 g0Var = sVar.f234885h;
            String strQ = j6.a.q("VAULTS_ITEM_ID", str);
            LayeredImage layeredImageJ = w0.j(sVar);
            long j3 = sVar.f234884g;
            Clause clauseD = null;
            if (j3 > 0) {
                ProgressStyle.Companion companion = ProgressStyle.INSTANCE;
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                if (j3 <= 0) {
                    j2 = 0;
                    iG = 0;
                } else {
                    j2 = 0;
                    iG = kotlin.ranges.f.g(rim.d.b((g0Var.f234861c / j3) * ((double) 100)), 0, 100);
                    if (1 <= iG && iG < 4) {
                        iG = 3;
                    } else if (97 <= iG && iG < 100) {
                        iG = 97;
                    }
                }
                progressStyleA = companion.a(iG);
            } else {
                j2 = 0;
                progressStyleA = null;
            }
            TextClause textClause2 = new TextClause(g0Var.f234859a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            y yVar = new y(r.VAULTS, sVar, "details", 56);
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            RowDelegate.Model.c.b bVar = new RowDelegate.Model.c.b(new MoneyClause(new dj0.d(g0Var.f234861c, kii.e.u(sVar, xi0.b.Companion)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), null, null, false, 126);
            Intrinsics.checkNotNullParameter(sVar, "<this>");
            if (g0Var instanceof e0) {
                clauseD = pbd.a.d(this.e, sVar.i().e, null, 6);
            } else {
                if (opg.c.d(sVar)) {
                    List list3 = sVar.k;
                    textClause = new TextLocalisedQuantityClause(R$plurals.vaults_grid_invite_subtitle, Integer.valueOf(list3 != null ? list3.size() : 0), (List) null, (Style) null, 28);
                } else {
                    Long l2 = sVar.f234887l;
                    if (l2 != null) {
                        long jLongValue = l2.longValue();
                        if (jLongValue != j2) {
                            String string = new DateTime(jLongValue).toString("d MMM yyyy");
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            textClause = new TextClause(string, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        }
                    }
                }
                clauseD = textClause;
            }
            arrayList.add(o97.w.a(new RowDelegate.Model(strQ, layeredImageJ, null, progressStyleA, textClause2, clauseD, null, null, 0, bVar, false, false, null, null, null, null, null, yVar, null, 0, 0, 0, 0, 1056962404), qVar.f324881b, qVar.f324882c));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return arrayList;
    }
}
