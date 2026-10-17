package pkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends yji.n {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f237079l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u80.t f237080m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qd0.b f237081n;

    public j1(klf.h0 commonDataSource, u80.t ratesMoneyUtils, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f237079l = commonDataSource;
        this.f237080m = ratesMoneyUtils;
        this.f237081n = languageProvider;
    }
}
