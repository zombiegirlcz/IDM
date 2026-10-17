package rxe;

import com.revolut.feature.topup_screen.impl.flows.revert_transfer.RevertTransferFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ru5.m;
import yki.g;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends h implements g {
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fve.a f258144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wj0.a f258145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f258146r;

    public f(c inputData, fve.a repository, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f258144p = repository;
        this.f258145q = idempotencyKeyHolder;
        m mVar = new m(19);
        this.f258146r = cp5.d.a(this, RevertTransferFlowContract$Step.f90776a, f0.f322471a, mVar);
    }

    @Override // yji.l
    public final void I1() {
        l2(new e(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f258146r;
    }
}
