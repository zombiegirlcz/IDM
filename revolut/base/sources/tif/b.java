package tif;

import kotlin.jvm.internal.Intrinsics;
import nif.d1;
import tof.q6;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mif.f f271493a;

    public b(mif.f loadingStateDao, a loadingStateWrapperIdProvider) {
        Intrinsics.checkNotNullParameter(loadingStateDao, "loadingStateDao");
        Intrinsics.checkNotNullParameter(loadingStateWrapperIdProvider, "loadingStateWrapperIdProvider");
        this.f271493a = loadingStateDao;
    }

    public final String a(q6 q6Var) {
        return j6.a.q("LOADING_COMPLETED_KEY", a.a(q6Var));
    }

    public final Boolean b(q6 transactionScope) {
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        Long lA = ((mif.g) this.f271493a).a(a(transactionScope));
        if (lA != null) {
            return Boolean.valueOf(lA.longValue() > 0);
        }
        return null;
    }

    public final String c(q6 q6Var) {
        return j6.a.q("EARLIEST_CREATED_TIME", a.a(q6Var));
    }

    public final String d(q6 q6Var) {
        return j6.a.q("LATEST_UPDATED_TIME", a.a(q6Var));
    }

    public final void e(q6 transactionScope, boolean z) {
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        ((mif.g) this.f271493a).b(new d1(a(transactionScope), z ? 1L : 0L));
    }

    public final void f(q6 transactionScope, long j2) {
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        ((mif.g) this.f271493a).b(new d1(c(transactionScope), j2));
    }

    public final void g(q6 transactionScope, long j2) {
        Intrinsics.checkNotNullParameter(transactionScope, "transactionScope");
        ((mif.g) this.f271493a).b(new d1(d(transactionScope), j2));
    }
}
