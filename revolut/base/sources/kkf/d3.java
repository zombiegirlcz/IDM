package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class d3 {

    @NotNull
    public static final b3 Companion = new b3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y45.i f184639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m35.r f184640c;

    public d3(klf.h0 commonDataSource, y45.i loanProductInteractor, m35.r loanUiContentMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(loanProductInteractor, "loanProductInteractor");
        Intrinsics.checkNotNullParameter(loanUiContentMapper, "loanUiContentMapper");
        this.f184638a = commonDataSource;
        this.f184639b = loanProductInteractor;
        this.f184640c = loanUiContentMapper;
    }
}
