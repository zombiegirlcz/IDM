package i1d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tqi.e;
import yji.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends n {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c70.a f157611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r70.c f157612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f157613n;

    public d(c70.a clipboard, r70.c hapticEngine, e shareExternalDestinationFactory) {
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(shareExternalDestinationFactory, "shareExternalDestinationFactory");
        this.f157611l = clipboard;
        this.f157612m = hapticEngine;
        this.f157613n = shareExternalDestinationFactory;
    }
}
