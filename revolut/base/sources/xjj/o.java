package xjj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f306545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bnj.h f306546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f306547c;

    public o(r mobilePlanDetailsSmsItemMapper, g mobilePlanDetailsCallsItemMapper, f mobilePlanDetailsAllowanceClauseMapper, bnj.h dataUsageItemMapper, m internationalUsageItemMapper) {
        Intrinsics.checkNotNullParameter(mobilePlanDetailsSmsItemMapper, "mobilePlanDetailsSmsItemMapper");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsCallsItemMapper, "mobilePlanDetailsCallsItemMapper");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsAllowanceClauseMapper, "mobilePlanDetailsAllowanceClauseMapper");
        Intrinsics.checkNotNullParameter(dataUsageItemMapper, "dataUsageItemMapper");
        Intrinsics.checkNotNullParameter(internationalUsageItemMapper, "internationalUsageItemMapper");
        this.f306545a = mobilePlanDetailsCallsItemMapper;
        this.f306546b = dataUsageItemMapper;
        this.f306547c = internationalUsageItemMapper;
    }
}
