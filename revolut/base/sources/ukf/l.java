package ukf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f280745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f280746b;

    public l(h0 commonDataSource, c futuresCommonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(futuresCommonUiMapper, "futuresCommonUiMapper");
        this.f280745a = commonDataSource;
        this.f280746b = futuresCommonUiMapper;
    }
}
