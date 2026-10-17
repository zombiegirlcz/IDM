package xjj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f306542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f306543b;

    public k(h mobilePlanDetailsDataItemMapper, r mobilePlanDetailsSmsItemMapper, g mobilePlanDetailsCallsItemMapper) {
        Intrinsics.checkNotNullParameter(mobilePlanDetailsDataItemMapper, "mobilePlanDetailsDataItemMapper");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsSmsItemMapper, "mobilePlanDetailsSmsItemMapper");
        Intrinsics.checkNotNullParameter(mobilePlanDetailsCallsItemMapper, "mobilePlanDetailsCallsItemMapper");
        this.f306542a = mobilePlanDetailsDataItemMapper;
        this.f306543b = mobilePlanDetailsCallsItemMapper;
    }
}
