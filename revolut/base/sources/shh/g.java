package shh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f263480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hj8.a f263481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z80.b f263482c;

    public g(kpj.f wealthAccountHeaderUiMapper, hj8.a juniorProfileInteractor, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(wealthAccountHeaderUiMapper, "wealthAccountHeaderUiMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f263480a = wealthAccountHeaderUiMapper;
        this.f263481b = juniorProfileInteractor;
        this.f263482c = phoneToolsProvider;
    }
}
