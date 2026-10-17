package e4b;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.revolut.feature_fourthline_impl.R;
import dfl.v;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends oki.h implements d {

    @NotNull
    private static final n Companion = new n();
    public final y2f.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f122533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i7d.o f122534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f122535r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.c f122536s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f122537t;

    public q(i inputData, m mapper, y2f.a tradingTransactionsInteractor, ang.f userInteractor, i7d.o helpWidgetControllerModelExtension, ybl.l tradingConfigInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(tradingTransactionsInteractor, "tradingTransactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(helpWidgetControllerModelExtension, "helpWidgetControllerModelExtension");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        this.o = tradingTransactionsInteractor;
        this.f122533p = userInteractor;
        this.f122534q = helpWidgetControllerModelExtension;
        this.f122535r = tradingConfigInteractor;
        this.f122536s = new vii.c();
        v vVar = inputData.f122525a;
        List list = vVar.f114502s;
        this.f122537t = mra.d.b(this, new e(vVar, list != null ? zi0.c.P(list, false, null, 3) : new Data(null, null, true, 3, null), null, null, null), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, ybl.l.d(this.f122535r), null, null, new o(this, null, 3), 3);
    }

    @Override // yji.l
    public final void T1(long j2) throws Throwable {
        Continuation continuation = null;
        yji.l.b1(this, this.f122534q.Z2(new i7d.j("cfd-overnight-fee-breakdown", new TextLocalisedClause(R.string.contact_us, null, null, 14), new i7d.c("topic.trading"))), null, new o(this, continuation, 0), 3);
        y yVar = this.f122537t;
        j2 j2Var = (j2) yVar.f22677a;
        j2 j2Var2 = (j2) yVar.f22677a;
        List list = (List) ((e) j2Var.getValue()).f122519b.getContent();
        w4l.h hVar = w4l.h.f294642c;
        if (list == null || !(!list.isEmpty())) {
            String str = ((e) j2Var2.getValue()).f122518a.f114491b;
            if (str == null) {
                H2(yVar, new e1d.h(17));
                hx7.e.n(new IllegalStateException(j6.a.q("compoundId should not be null for trade ", ((e) j2Var2.getValue()).f122518a.f114490a)));
            } else {
                yji.l.b1(this, com.revolut.data.database.models.openbanking.d.x("CfdOvernightFeeBreakdownControllerModel", "observeBreakdown", nim.a.v(vkm.q.Q(this.f122536s.a(Unit.f186387a, hVar), new a32.b(continuation, this, str, 28)), new e2j.j(this, 12))), null, new o(this, continuation, 1), 3);
            }
        }
        yji.l.b1(this, this.f122533p.j(hVar), null, new o(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f122537t;
    }
}
