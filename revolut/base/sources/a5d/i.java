package a5d;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends oki.h implements e {
    public final qhe.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f1358p;

    public i(n stateMapper, qhe.b transactionsCountPreviewInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(transactionsCountPreviewInteractor, "transactionsCountPreviewInteractor");
        this.o = transactionsCountPreviewInteractor;
        this.f1358p = mra.d.b(this, new d(new j(new TextLocalisedClause(R$string.tab_accounts_settings_preview_transactions_count_title, null, null, 14)), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        qhe.b bVar = this.o;
        yji.l.a1(this, nim.a.u(new qhe.a(bVar, null), rd0.e.b(bVar.f246604b.b())), null, null, new a0l.k(this, null, 9), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f1358p;
    }
}
