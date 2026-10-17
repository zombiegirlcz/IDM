package rd3;

import a83.w0;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends d {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.h f253331c;
    public final b d;
    public final od3.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yik.h pricingPlanStringMapper, b cashbackFooterUiMapper, od3.b cashbackLimitItemMapper, thf.g transactionItemMapper) {
        super(transactionItemMapper);
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(cashbackFooterUiMapper, "cashbackFooterUiMapper");
        Intrinsics.checkNotNullParameter(cashbackLimitItemMapper, "cashbackLimitItemMapper");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f253331c = pricingPlanStringMapper;
        this.d = cashbackFooterUiMapper;
        this.e = cashbackLimitItemMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List i(boolean z, od3.l lVar) {
        ActionsView.Item[] elements = {iii.c.f(hx7.i.n(lVar).f224322g, new m(3), new k(8), new w0(z, 13)), iii.c.f(hx7.i.n(lVar).f, new m(4), new k(9), new qk2.h(28))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    public static od3.n j(od3.l lVar, Clause clause) {
        return new od3.n(clause, (Clause) iii.c.f(hx7.i.n(lVar).f224321c, new rbj.g(29), new k(2), new qk2.h(23)), i(false, lVar), com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D114", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }

    @Override // rd3.d
    public final List d(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(hx7.i.n(domainState).f224320b, new rbj.g(27), new k(4), new qk2.h(27));
    }

    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(hx7.i.n(domainState).f224320b, new m(5), new k(10), new rbe.c(this, domainState, 3));
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.cashback_source_plan_title, null, null, 14);
        return (od3.o) iii.c.f(hx7.i.n(domainState).f224320b, new r4k.x(this, domainState, textLocalisedClause, 23), new qce.b(this, domainState, textLocalisedClause), new rbe.c(this, domainState, textLocalisedClause));
    }
}
