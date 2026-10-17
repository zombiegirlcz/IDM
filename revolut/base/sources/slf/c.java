package slf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import t38.e;
import vkm.q;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt0.b f264201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f264202b;

    public c(jt0.b commonHeaderProvider, h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonHeaderProvider, "commonHeaderProvider");
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f264201a = commonHeaderProvider;
        this.f264202b = commonDataSource;
    }

    public final Flow a() {
        return q.q(new e(this.f264201a.A0(false), 24, this.f264202b.d(), new b(this, null)));
    }
}
