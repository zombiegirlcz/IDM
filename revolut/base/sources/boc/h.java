package boc;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.robo.api.navigation.RoboFeatureConfig;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsDetailsDestination;
import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rp0.y;
import zhm.w;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends yji.n implements m {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f17383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f17384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zjh.f f17385n;
    public final m4f.b o;

    public h(n mapper, j60.a bottomExpandableDialogControllerExtension, zjh.f portfolioInteractor, m4f.b wealthAddMoneyCommandProvider) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        this.f17383l = mapper;
        this.f17384m = bottomExpandableDialogControllerExtension;
        this.f17385n = portfolioInteractor;
        this.o = wealthAddMoneyCommandProvider;
    }

    public final void Z2(l parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        if (!(parcel instanceof k)) {
            if (!(parcel instanceof j)) {
                throw new NoWhenBranchMatchedException();
            }
            b3((j) parcel);
            return;
        }
        List actions = ((k) parcel).f17389a;
        n nVar = this.f17383l;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(actions, "actions");
        List<alc.d> list = actions;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (alc.d dVar : list) {
            elc.a aVarA = b.a(dVar);
            arrayList.add(new RowDelegate.Model(j6.a.q("MORE_DIALOG.", dVar.name()), new RowDelegate.Model.MainImage.Image40(LayeredImage.INSTANCE.j(aVarA.f127285a, new Color.Solid(R$attr.uikit_colorAccent), new Color.Solid(R$attr.uikit_colorAccent_10)), null, null, false, null, false, 62), new TextLocalisedClause(aVarA.f127286b, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, new j(dVar, nVar.f17390a.f17386a), null, 0, 0, 0, 0, 532676600));
        }
        yp0.b.k(arrayList, R$attr.uikit_dp16, R$attr.uikit_dp24, 0, 0, 28);
        this.f17384m.x(new y(arrayList, null, rp0.l.WINDOW, null, null, null, 1018));
    }

    public final void b3(j jVar) {
        alc.d dVar = jVar.f17387a;
        String str = jVar.f17388b;
        int i = d.f17377a[dVar.ordinal()];
        Continuation continuation = null;
        if (i == 1) {
            V2(new f(this, str, continuation, 0), new yi5.b(29));
            return;
        }
        if (i == 2) {
            V2(new f(this, str, continuation, 1), new yi5.b(29));
        } else if (i == 3) {
            A2(new InvestDocumentsDetailsDestination(InvestDocumentsType.ROBO.f95912a));
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            A2(new RoboFeatureConfig.EditPortfolioDestination(str));
        }
    }
}
