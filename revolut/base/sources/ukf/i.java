package ukf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f280742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f280743b;

    public i(h0 commonDataSource, c futuresCommonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(futuresCommonUiMapper, "futuresCommonUiMapper");
        this.f280742a = commonDataSource;
        this.f280743b = futuresCommonUiMapper;
    }
}
