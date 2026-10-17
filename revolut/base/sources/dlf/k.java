package dlf;

import elf.x;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f115747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f115748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f115749c;

    public k(h0 commonDataSource, vlf.b commonUiMapper, x chargesClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(chargesClickHandler, "chargesClickHandler");
        this.f115747a = commonDataSource;
        this.f115748b = commonUiMapper;
        this.f115749c = chargesClickHandler;
    }
}
