package kd3;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.cashback.impl.R$string;
import java.util.List;
import jki.p;
import k8d.s;
import k8d.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements p {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rd3.b f182801a;

    public o(rd3.b cashbackFooterUiMapper) {
        Intrinsics.checkNotNullParameter(cashbackFooterUiMapper, "cashbackFooterUiMapper");
        this.f182801a = cashbackFooterUiMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(t1.u(domainState.f182781a, domainState.f182782b, domainState.e), new kcd.a(17), new s(26), new t(6));
        CellDetailsChevronDelegate.Model model = new CellDetailsChevronDelegate.Model("ID_SEE_ALL_CASHBACK_ITEM", new TextLocalisedClause(R$string.cashback_product_action_show_all_sources, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listO = i2b.a.o(list, u.c(model));
        CellDetailsChevronDelegate.Model model2 = new CellDetailsChevronDelegate.Model("ID_GET_HELP", new TextLocalisedClause(R$string.cashback_product_plan_something_wrong, null, null, 14), 0, false, null, null, null, 2044);
        yp0.b.l(model2, 0, 0, 0, 0, null, false, 63);
        return new i(i2b.a.o(i2b.a.o(listO, u.c(model2)), this.f182801a.a(domainState.f182783c)), (Image) iii.c.f(domainState.d, new kcd.a(18), new s(27), new t(7)), new MoneyClause(domainState.f, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), domainState.f182784g);
    }
}
