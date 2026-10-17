package ef5;

import cli.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements n {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cf5.j f125281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cf5.g f125282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf5.n f125283c;

    public k(cf5.j stakeableAssetListMapper, cf5.c gaugeChartMapper, cf5.g moreStakingProductsListMapper, cf5.n stakingRewardsSummaryMapper) {
        Intrinsics.checkNotNullParameter(stakeableAssetListMapper, "stakeableAssetListMapper");
        Intrinsics.checkNotNullParameter(gaugeChartMapper, "gaugeChartMapper");
        Intrinsics.checkNotNullParameter(moreStakingProductsListMapper, "moreStakingProductsListMapper");
        Intrinsics.checkNotNullParameter(stakingRewardsSummaryMapper, "stakingRewardsSummaryMapper");
        this.f125281a = stakeableAssetListMapper;
        this.f125282b = moreStakingProductsListMapper;
        this.f125283c = stakingRewardsSummaryMapper;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v1 ef5.c, still in use, count: 3, list:
          (r2v1 ef5.c) from 0x010b: PHI (r2v2 ef5.c) = (r2v1 ef5.c), (r2v13 ef5.c) binds: [B:30:0x00fa, B:42:0x0160] A[DONT_GENERATE, DONT_INLINE]
          (r2v1 ef5.c) from 0x003c: MOVE (r23v4 ef5.c) = (r2v1 ef5.c)
          (r2v1 ef5.c) from 0x0024: MOVE (r23v6 ef5.c) = (r2v1 ef5.c)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // cli.n
    public final cli.o c(cli.j r32) {
        /*
            Method dump skipped, instruction units count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ef5.k.c(cli.j):cli.o");
    }
}
