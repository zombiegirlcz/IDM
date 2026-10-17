package nkf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import thf.m;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f216806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vlf.b f216807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final m f216808n;

    public f(h0 commonDataSource, vlf.b commonUiMapper, m transactionTextResourcesMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        this.f216806l = commonDataSource;
        this.f216807m = commonUiMapper;
        this.f216808n = transactionTextResourcesMapper;
    }
}
