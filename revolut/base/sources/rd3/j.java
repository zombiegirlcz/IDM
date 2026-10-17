package rd3;

import a83.w0;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends d {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yik.h f253326c;
    public final b d;
    public final od3.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yik.h pricingPlanStringMapper, b cashbackFooterUiMapper, od3.b cashbackLimitItemMapper, thf.g transactionItemMapper) {
        super(transactionItemMapper);
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(cashbackFooterUiMapper, "cashbackFooterUiMapper");
        Intrinsics.checkNotNullParameter(cashbackLimitItemMapper, "cashbackLimitItemMapper");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f253326c = pricingPlanStringMapper;
        this.d = cashbackFooterUiMapper;
        this.e = cashbackLimitItemMapper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List i(boolean z, od3.l lVar) {
        ActionsView.Item[] elements = {iii.c.f(hx7.i.m(lVar).f, new rbj.g(23), new rbh.j(26), new w0(z, 12)), iii.c.f(hx7.i.m(lVar).e, new rbj.g(24), new rbh.j(27), new qk2.h(21))};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.L(elements);
    }

    @Override // rd3.d
    public final List d(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(t1.t(hx7.i.m(domainState).f224314a, hx7.i.m(domainState).f224315b), new rbj.g(25), new rbh.j(28), new h(this, 3));
    }

    @Override // rd3.d
    public final List g(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (List) iii.c.f(hx7.i.m(domainState).f224315b, new rbj.g(17), new rbh.j(22), new rbe.c(this, domainState, 2));
    }

    @Override // rd3.d
    public final od3.o h(od3.l domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Clause clause = (Clause) iii.c.f(hx7.i.m(domainState).f224314a, new rbj.g(26), new rbh.j(29), new h(this, 4));
        return (od3.o) iii.c.f(hx7.i.m(domainState).f224315b, new qz9.o(this, 16, domainState, clause), new a83.z(this, 15, domainState, clause), new lk7.p(this, 24, domainState, clause));
    }

    public final od3.n j(od3.l lVar, Clause clause) {
        Clause clause2 = (Clause) iii.c.f(hx7.i.m(lVar).f224314a, new rbj.g(19), new rbh.j(21), new h(this, 2));
        List listI = i(false, lVar);
        dd3.j.Companion.getClass();
        return new od3.n(clause, clause2, listI, com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D114", new ImageTransformations(null, null, null, null, 11, null, null, LDSFile.EF_DG15_TAG), null, null, 28));
    }
}
