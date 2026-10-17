package lic;

import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends yji.n implements kic.b {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PerkDetailsFlowContract$InputData f195465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bgc.e f195466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final twg.c f195467n;
    public final gic.h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oic.i f195468p;

    public o(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor, twg.c rewardActionProvider, gic.h rewardActionNavigator, oic.i rewardActionButtonConfigMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        Intrinsics.checkNotNullParameter(rewardActionProvider, "rewardActionProvider");
        Intrinsics.checkNotNullParameter(rewardActionNavigator, "rewardActionNavigator");
        Intrinsics.checkNotNullParameter(rewardActionButtonConfigMapper, "rewardActionButtonConfigMapper");
        this.f195465l = inputData;
        this.f195466m = rewardsInteractor;
        this.f195467n = rewardActionProvider;
        this.o = rewardActionNavigator;
        this.f195468p = rewardActionButtonConfigMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x014a, code lost:
    
        if (r1 == r6) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004a, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:27:0x007b, B:34:0x00eb], limit reached: 58 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37, types: [int] */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0151 -> B:19:0x004a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(lic.o r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.o.Z2(lic.o, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(lic.o r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lic.o.b3(lic.o, gim.c):java.lang.Object");
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        kic.c action = (kic.c) aVar;
        Intrinsics.checkNotNullParameter(action, "action");
        return pd.b.n(p0.f264003c, new kze.h(this, null, 18));
    }
}
