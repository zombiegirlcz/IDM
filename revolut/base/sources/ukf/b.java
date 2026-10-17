package ukf;

import klf.h0;
import klf.m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f280733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f280734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vlf.b f280735c;
    public final c d;

    public b(h0 commonDataSource, m chargeBreakdownDataSource, vlf.b commonUiMapper, c futuresCommonUiMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(chargeBreakdownDataSource, "chargeBreakdownDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(futuresCommonUiMapper, "futuresCommonUiMapper");
        this.f280733a = commonDataSource;
        this.f280734b = chargeBreakdownDataSource;
        this.f280735c = commonUiMapper;
        this.d = futuresCommonUiMapper;
    }
}
