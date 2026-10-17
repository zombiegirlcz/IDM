package pmh;

import java.util.List;
import jel.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f237585b = v.k(w.VENTURE_CAPITAL, w.PRIVATE_EQUITY, w.MULTI_ASSET, w.PRIVATE_CREDIT, w.INFRASTRUCTURE, w.REAL_ESTATE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ybl.b f237586a;

    public u(ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f237586a = instrumentTickerInteractor;
    }
}
