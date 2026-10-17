package cge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements qfe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23950a;

    public d(rge.b registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f23950a = registry;
    }

    @Override // qfe.c
    public final Flow a() {
        return this.f23950a.b(TabAccountsMode.Home.f89466a).f().a();
    }
}
