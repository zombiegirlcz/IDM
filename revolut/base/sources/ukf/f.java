package ukf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f280739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f280740b;

    public f(h0 commonDataSource, c futuresCommonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(futuresCommonUiMapper, "futuresCommonUiMapper");
        this.f280739a = commonDataSource;
        this.f280740b = futuresCommonUiMapper;
    }
}
