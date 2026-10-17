package zsd;

import djb.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tnb.g0;
import wa7.m;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f324887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f324888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final an8.b f324889c;
    public final m d;
    public final g0 e;

    public d(n savingsAccountsInteractor, f savingsNetWorthProductsMapper, an8.b juniorSavingProductInteractor, m hiddenAccountsInteractor, g0 savingsEntryPointsContentProvider) {
        Intrinsics.checkNotNullParameter(savingsAccountsInteractor, "savingsAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsNetWorthProductsMapper, "savingsNetWorthProductsMapper");
        Intrinsics.checkNotNullParameter(juniorSavingProductInteractor, "juniorSavingProductInteractor");
        Intrinsics.checkNotNullParameter(hiddenAccountsInteractor, "hiddenAccountsInteractor");
        Intrinsics.checkNotNullParameter(savingsEntryPointsContentProvider, "savingsEntryPointsContentProvider");
        this.f324887a = savingsAccountsInteractor;
        this.f324888b = savingsNetWorthProductsMapper;
        this.f324889c = juniorSavingProductInteractor;
        this.d = hiddenAccountsInteractor;
        this.e = savingsEntryPointsContentProvider;
    }
}
