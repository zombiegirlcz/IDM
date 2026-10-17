package pkg;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import pj9.n;
import vkm.q;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements jkg.d {

    @NotNull
    private static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mhf.f f237174a;

    public f(mhf.f transactionsPaginationInteractor) {
        Intrinsics.checkNotNullParameter(transactionsPaginationInteractor, "transactionsPaginationInteractor");
        this.f237174a = transactionsPaginationInteractor;
    }

    @Override // jkg.d
    public final Flow a(Flow paginationEvents) {
        Intrinsics.checkNotNullParameter(paginationEvents, "paginationEvents");
        e paginationEvents2 = new e(paginationEvents, this, 0);
        ojf.e eVar = (ojf.e) this.f237174a;
        Intrinsics.checkNotNullParameter(paginationEvents2, "paginationEvents");
        return nim.a.v(q.Q(paginationEvents2, new ns9.h(null, eVar, 26)), new n(12));
    }
}
