package qk2;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.R$string;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class g extends oki.h implements dli.b {
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f246955p;

    public g(n stateMapper, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.o = revolutCardsInteractor;
        this.f246955p = mra.d.b(this, new b(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new qc8.b(this, null, 8), new yi5.b(26));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f246955p;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.common_error_title, null, null, 14), null, new TextLocalisedClause(R$string.common_action_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32758), false, 5)), null, null, new qg4.d(this, null, 8), 3);
        return true;
    }
}
