package nnf;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.transactions.impl.R$string;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import nmb.v;
import org.jetbrains.annotations.NotNull;
import te0.w;
import tof.a3;
import zhm.d0;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements p {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f217628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.g f217629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f217630c;

    public n(gte.a featureToggleInteractor, thf.g transactionItemMapper) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        this.f217628a = featureToggleInteractor;
        this.f217629b = transactionItemMapper;
        this.f217630c = w.y0(new nmm.h(this, 2));
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(domainState.f217615a, new nc1.j(this, domainState, 25), new kp0.m(this, domainState, 16), new c1(this, domainState, 7)));
    }

    public final ArrayList b(Data data) {
        pb0 pb0Var = new pb0("LIST_ID_TRANSACTION_ITEM");
        yp0.b.l(pb0Var, 0, 0, 0, 0, null, false, 63);
        return d0.E0(c(null, data), u.c(pb0Var));
    }

    public final List c(a3 a3Var, Data data) {
        RowDelegate.Model model = null;
        RowDelegate.Model model2 = new RowDelegate.Model("LIST_ID_WHAT_PENDING_MEANS", null, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_pending_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_pending_description_new, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
        RowDelegate.Model model3 = new RowDelegate.Model("LIST_ID_CANCEL_NOW", null, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_cancel_pending_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_cancel_pending_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
        Object objF = iii.c.f(data, new h(1), new v(7), new mgh.i(this, 25));
        if ((a3Var != null ? a3Var.B : null) != null) {
            model = new RowDelegate.Model("LIST_ID_CASHBACK", null, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_cashback_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.transactionUI_transaction_pending_info_cashback_description, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868826);
        }
        Object[] elements = {model2, model3, objF, model};
        Intrinsics.checkNotNullParameter(elements, "elements");
        List listL = kotlin.collections.d.L(elements);
        yp0.b.k(listL, 0, 0, 0, 0, 31);
        return listL;
    }
}
