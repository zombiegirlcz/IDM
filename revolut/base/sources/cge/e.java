package cge;

import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import kotlin.jvm.internal.Intrinsics;
import rfe.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements zfe.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rge.b f23951a;

    public e(rge.b registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f23951a = registry;
    }

    public final Object a(ProductAccountDescriptor$Value.Main main, TabAccountsInitialPayload.Action action, gim.c cVar) {
        rge.b bVar = this.f23951a;
        hhe.d dVarD = bVar.d();
        return dVarD != null ? dVarD.h().a(main.f89727a, main.f89728b.f89730b) : false ? dVarD.c().a(main, ibb.c.f, action, cVar) : bVar.c(o.HOME).c().a(main, ibb.c.f160140a, action, cVar);
    }

    public final Object b(ProductAccountDescriptor$Value productAccountDescriptor$Value, MainScreenTab mainScreenTab, TabAccountsInitialPayload.Action action, gim.c cVar) {
        boolean zF = Intrinsics.f(mainScreenTab, ibb.c.f);
        rge.b bVar = this.f23951a;
        return (zF ? bVar.c(o.CREDIT) : bVar.c(o.HOME)).c().a(productAccountDescriptor$Value, mainScreenTab, action, cVar);
    }
}
