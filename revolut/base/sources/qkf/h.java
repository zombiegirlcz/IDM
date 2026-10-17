package qkf;

import elf.d0;
import klf.h0;
import klf.z0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    @NotNull
    private static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f246996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f246997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final thf.m f246998c;
    public final z0 d;
    public final j e;
    public final d0 f;

    public h(h0 commonDataSource, f itemsMapper, vlf.b commonUiMapper, thf.m transactionTextResourcesMapper, z0 feeBreakdownDataSource, j feeBreakdownItemProvider, d0 feeBreakdownClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(feeBreakdownDataSource, "feeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(feeBreakdownItemProvider, "feeBreakdownItemProvider");
        Intrinsics.checkNotNullParameter(feeBreakdownClickHandler, "feeBreakdownClickHandler");
        this.f246996a = commonDataSource;
        this.f246997b = commonUiMapper;
        this.f246998c = transactionTextResourcesMapper;
        this.d = feeBreakdownDataSource;
        this.e = feeBreakdownItemProvider;
        this.f = feeBreakdownClickHandler;
    }
}
