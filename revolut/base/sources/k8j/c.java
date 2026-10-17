package k8j;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.ModalDestination;
import i0e.p;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import yji.n;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends c8j.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c8j.a f182166l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f182167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c8j.b f182168n;

    public c(c8j.a statsDataSource, f mapper, c8j.b extraItemsExtension) {
        Intrinsics.checkNotNullParameter(statsDataSource, "statsDataSource");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(extraItemsExtension, "extraItemsExtension");
        this.f182166l = statsDataSource;
        this.f182167m = mapper;
        this.f182168n = extraItemsExtension;
    }

    @Override // c8j.c
    public final t38.e Z2(xi0.b currency, Clause tickerClause) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(tickerClause, "tickerClause");
        return new t38.e(this.f182166l.a(currency), 24, q.q(this.f182168n.Z2(currency)), new p(this, currency, tickerClause, null, 1));
    }

    @Override // c8j.c
    public final void b3(CellDetailsActionDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.f182168n.b3(model);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // c8j.c
    public final void c3(ListSubheaderDelegate.Model model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj2 = model.f52715m;
        d dVar = obj2 instanceof d ? (d) obj2 : null;
        if (dVar == null) {
            return;
        }
        n.P2(this, o2(new b8j.a(dVar.f182170b, dVar.f182169a)), ModalDestination.Style.POPUP.f98311a, null, 2);
    }
}
