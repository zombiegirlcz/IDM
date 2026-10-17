package okf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f226015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vlf.b f226016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final elf.x f226017c;

    public h(h0 commonDataSource, vlf.b commonUiMapper, elf.x chargesClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(chargesClickHandler, "chargesClickHandler");
        this.f226015a = commonDataSource;
        this.f226016b = commonUiMapper;
        this.f226017c = chargesClickHandler;
    }
}
