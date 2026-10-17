package cge;

import com.revolut.feature.tab.accounts.api.mode.TabAccountsMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements zfe.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23947a;

    public a(rge.b registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f23947a = registry;
    }

    @Override // zfe.b
    public final Object a(gim.i iVar) {
        Object objA = this.f23947a.b(TabAccountsMode.Home.f89466a).e().a(iVar);
        return objA == fim.a.COROUTINE_SUSPENDED ? objA : Unit.f186387a;
    }

    @Override // zfe.b
    public final Object b(Continuation continuation) {
        return this.f23947a.b(TabAccountsMode.Home.f89466a).e().b(continuation);
    }
}
