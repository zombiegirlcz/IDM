package vrl;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements p {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f291668c = zhm.y0.b(nel.r.f214614b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final prl.l f291669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f291670b;

    public r(prl.l nbboRepository, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(nbboRepository, "nbboRepository");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f291669a = nbboRepository;
        this.f291670b = instrumentTickerInteractor;
    }
}
