package fta;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.raffle.impl.screen.share_raffle.ShareRaffleScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f137998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ShareRaffleScreenContract$InputData f137999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f138000c;
    public final e4m.e d;

    public f(b bVar, c cVar, ViewController viewController, ShareRaffleScreenContract$InputData shareRaffleScreenContract$InputData) {
        this.f137998a = viewController;
        this.f137999b = shareRaffleScreenContract$InputData;
        int i = 0;
        this.f138000c = e4m.b.b(new e(bVar, this, 1, i));
        this.d = e4m.b.b(new e(bVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
