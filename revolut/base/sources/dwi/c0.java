package dwi;

import kotlin.jvm.internal.Intrinsics;
import svi.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hwi.h0 f120413a;

    public c0(hwi.h0 passActivityRepository) {
        Intrinsics.checkNotNullParameter(passActivityRepository, "passActivityRepository");
        this.f120413a = passActivityRepository;
    }

    public final vkm.d a(y0 query, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        hwi.h0 h0Var = this.f120413a;
        h0Var.getClass();
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return h0Var.d.b(query, loadingStrategy);
    }
}
