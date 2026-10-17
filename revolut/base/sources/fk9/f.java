package fk9;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ti9.g;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends h implements d {
    public final String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f135736p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f135737q;

    public f(n mapper, String planId, xh9.a payLaterInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        this.o = planId;
        this.f135736p = payLaterInteractor;
        this.f135737q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), mapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(((g) this.f135736p).l(this.o)), null, null, new f9d.c(this, (Continuation) null, 24), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135737q;
    }
}
