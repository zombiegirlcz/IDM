package ra5;

import kotlin.jvm.internal.Intrinsics;
import ua5.c;
import ua5.e;
import vkm.d;
import w4l.h;
import wsg.n;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f252783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sa5.c f252784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f252785c;
    public final wj0.a d;

    public b(c repository, sa5.c postTerminationPlanUiMapper, n walletInteractor, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(postTerminationPlanUiMapper, "postTerminationPlanUiMapper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f252783a = repository;
        this.f252784b = postTerminationPlanUiMapper;
        this.f252785c = walletInteractor;
        this.d = idempotencyKeyHolder;
    }

    public static qna.n a(b bVar, String planId) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return new qna.n(((e) bVar.f252783a).b(planId, loadingStrategy), bVar.f252784b, 10);
    }

    public static d b(b bVar, String planId) {
        bVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        h loadingStrategy = h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((e) bVar.f252783a).b(planId, loadingStrategy);
    }
}
