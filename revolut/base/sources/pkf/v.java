package pkf;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class v extends yji.n implements elf.s0 {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237137l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final mga.g0 f237138m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final prl.e f237139n;

    public v(klf.h0 commonDataSource, mga.g0 upgradeEntryPointItemProvider, prl.e upgradeEntryPointItemClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemClickHandler, "upgradeEntryPointItemClickHandler");
        this.f237137l = commonDataSource;
        this.f237138m = upgradeEntryPointItemProvider;
        this.f237139n = upgradeEntryPointItemClickHandler;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        return this.f237139n.o(obj2, (gim.c) continuation);
    }
}
