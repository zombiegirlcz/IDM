package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class s0 extends yji.n {

    @NotNull
    public static final q0 Companion = new q0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184924l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u80.t f184925m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qd0.b f184926n;

    public s0(klf.h0 commonDataSource, u80.t ratesMoneyUtils, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(ratesMoneyUtils, "ratesMoneyUtils");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f184924l = commonDataSource;
        this.f184925m = ratesMoneyUtils;
        this.f184926n = languageProvider;
    }
}
