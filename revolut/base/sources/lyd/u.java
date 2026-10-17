package lyd;

import g48.r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.b f200801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f200802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ppg.b f200803c;

    public u(wsg.b walletsInteractor, r0 jointAccountsInteractor, ppg.b vaultsInteractor) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        this.f200801a = walletsInteractor;
        this.f200802b = jointAccountsInteractor;
        this.f200803c = vaultsInteractor;
    }

    @Override // lyd.l
    public final Flow a() {
        return vkm.q.Q(k38.c.a(this.f200802b, null, null, 3), new li2.f(null, this, 17));
    }

    @Override // lyd.l
    public final t getType() {
        return t.CURRENCIES;
    }
}
