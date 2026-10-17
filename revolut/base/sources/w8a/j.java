package w8a;

import cli.y;
import com.revolut.feature.pix.impl.flow.alias_deletion.screens.review_delete.ReviewDeleteAliasScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends oki.h implements dli.b {
    public final ReviewDeleteAliasScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f295632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s8a.c f295633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f295634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f295635s;

    public j(l stateMapper, ReviewDeleteAliasScreenContract$InputData inputData, i dialogProvider, s8a.c aliasManagementInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(aliasManagementInteractor, "aliasManagementInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.o = inputData;
        this.f295632p = dialogProvider;
        this.f295633q = aliasManagementInteractor;
        this.f295634r = idempotencyKeyHolder;
        this.f295635s = mra.d.b(this, new d(inputData.f80573b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        this.f295634r.a("delete_alias");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f295635s;
    }
}
