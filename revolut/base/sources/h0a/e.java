package h0a;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends n implements c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f148339l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kge.d f148340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final iz9.e f148341n;

    public e(b dialogMapper, kge.d planReferralsInteractor, iz9.e socialPaymentsInteractor) {
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(planReferralsInteractor, "planReferralsInteractor");
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        this.f148339l = dialogMapper;
        this.f148340m = planReferralsInteractor;
        this.f148341n = socialPaymentsInteractor;
    }
}
