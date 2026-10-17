package kkf;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class a3 {

    @NotNull
    public static final y2 Companion = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f184591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l61.a f184592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l35.b f184593c;

    public a3(klf.h0 commonDataSource, l61.a companyInteractor, l35.b loanInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(companyInteractor, "companyInteractor");
        Intrinsics.checkNotNullParameter(loanInteractor, "loanInteractor");
        this.f184591a = commonDataSource;
        this.f184592b = companyInteractor;
        this.f184593c = loanInteractor;
    }
}
