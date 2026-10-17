package zh7;

import c1l.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ybl.k;

/* JADX INFO: loaded from: classes22.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f322244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f322245b;

    public c(k tradingAccountsInteractor, e tradingOnboardingStartCommandProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        this.f322244a = tradingAccountsInteractor;
        this.f322245b = tradingOnboardingStartCommandProvider;
    }
}
