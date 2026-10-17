package qkf;

import elf.d0;
import klf.h0;
import klf.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s {

    @NotNull
    private static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f247008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f247009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f247010c;
    public final j d;
    public final d0 e;

    public s(h0 commonDataSource, f itemsMapper, z0 feeBreakdownDataSource, j feeBreakdownItemProvider, d0 feeBreakdownClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownDataSource, "feeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(feeBreakdownItemProvider, "feeBreakdownItemProvider");
        Intrinsics.checkNotNullParameter(feeBreakdownClickHandler, "feeBreakdownClickHandler");
        this.f247008a = commonDataSource;
        this.f247009b = itemsMapper;
        this.f247010c = feeBreakdownDataSource;
        this.d = feeBreakdownItemProvider;
        this.e = feeBreakdownClickHandler;
    }
}
