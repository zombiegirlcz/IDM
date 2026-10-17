package mpj;

import ft6.s;
import ft6.t;
import kotlin.jvm.internal.Intrinsics;
import o07.k;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f207824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f207825b;

    public a(k freelancerProcessingFeeItemMapper, s freelancerProcessingFeesMapper, t vatInputMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeeItemMapper, "freelancerProcessingFeeItemMapper");
        Intrinsics.checkNotNullParameter(freelancerProcessingFeesMapper, "freelancerProcessingFeesMapper");
        Intrinsics.checkNotNullParameter(vatInputMapper, "vatInputMapper");
        this.f207824a = freelancerProcessingFeeItemMapper;
        this.f207825b = freelancerProcessingFeesMapper;
    }
}
