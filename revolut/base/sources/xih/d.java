package xih;

import kotlin.jvm.internal.Intrinsics;
import tzg.m;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f306406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ktg.a f306407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zih.a f306408c;
    public final m d;

    public d(f accountClosureWidgetItemMapper, ktg.a accountClosureInteractor, zih.a accountClosureWidgetCommandProvider, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(accountClosureWidgetItemMapper, "accountClosureWidgetItemMapper");
        Intrinsics.checkNotNullParameter(accountClosureInteractor, "accountClosureInteractor");
        Intrinsics.checkNotNullParameter(accountClosureWidgetCommandProvider, "accountClosureWidgetCommandProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.f306406a = accountClosureWidgetItemMapper;
        this.f306407b = accountClosureInteractor;
        this.f306408c = accountClosureWidgetCommandProvider;
        this.d = wealthAccountsInteractor;
    }
}
