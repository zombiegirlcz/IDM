package w57;

import ct6.w;
import ft6.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kgc.d f294724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f294725b;

    public d(w freelancerClauseFactory, kgc.d rewardImageMapper, l freelancerPerksMapper) {
        Intrinsics.checkNotNullParameter(freelancerClauseFactory, "freelancerClauseFactory");
        Intrinsics.checkNotNullParameter(rewardImageMapper, "rewardImageMapper");
        Intrinsics.checkNotNullParameter(freelancerPerksMapper, "freelancerPerksMapper");
        this.f294724a = rewardImageMapper;
        this.f294725b = freelancerPerksMapper;
    }
}
