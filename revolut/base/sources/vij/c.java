package vij;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gej.a f289604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final unj.e f289605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f289606c;

    public c(gej.a bytesFormatter, unj.e coverageItemMapper, e footerItemBuilder) {
        Intrinsics.checkNotNullParameter(bytesFormatter, "bytesFormatter");
        Intrinsics.checkNotNullParameter(coverageItemMapper, "coverageItemMapper");
        Intrinsics.checkNotNullParameter(footerItemBuilder, "footerItemBuilder");
        this.f289604a = bytesFormatter;
        this.f289605b = coverageItemMapper;
        this.f289606c = footerItemBuilder;
    }
}
