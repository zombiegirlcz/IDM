package obh;

import akg.n;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import njf.e;
import q1h.f;
import w4l.h;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f223956a;

    public d(ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f223956a = userInteractor;
    }

    @Override // q1h.f
    public final n a(List trades) {
        Intrinsics.checkNotNullParameter(trades, "trades");
        return nim.a.v(this.f223956a.j(h.f294642c), new e(trades, 7));
    }
}
