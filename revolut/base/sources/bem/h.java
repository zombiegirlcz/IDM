package bem;

import aem.c0;
import aem.j0;
import aem.y0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import oim.n;
import oim.o;

/* JADX INFO: loaded from: classes23.dex */
public final class h implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f14886b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f14887c = new h(1);
    public static final h d = new h(2);
    public static final h e = new h(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14888a;

    public /* synthetic */ h(int i) {
        this.f14888a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // bem.a
    public final void c(vdm.b client, gim.i iVar) {
        int i = 3;
        Continuation continuation = null;
        switch (this.f14888a) {
            case 0:
                n handler = (n) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler, "handler");
                client.d.f(fem.g.f134665g, new g(handler, null, 0));
                return;
            case 1:
                Function3 handler2 = (Function3) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler2, "handler");
                aem.b plugin = y0.f3798b;
                oem.a aVar = j0.f3736a;
                Intrinsics.checkNotNullParameter(client, "<this>");
                Intrinsics.checkNotNullParameter(plugin, "plugin");
                Intrinsics.checkNotNullParameter(client, "<this>");
                Intrinsics.checkNotNullParameter(plugin, "plugin");
                oem.e eVar = (oem.e) client.f288082h.d(j0.f3736a);
                Object objD = eVar != null ? eVar.d(y0.f3799c) : null;
                if (objD != null) {
                    c0 block = new c0(handler2, client, continuation, i);
                    Intrinsics.checkNotNullParameter(block, "block");
                    ((y0) objD).f3800a.add(block);
                    return;
                } else {
                    throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + y0.f3799c + ")` in client config first.");
                }
            case 2:
                Function2 handler3 = (Function2) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler3, "handler");
                client.d.f(fem.g.f, new g(handler3, null, 1));
                return;
            default:
                o handler4 = (o) iVar;
                Intrinsics.checkNotNullParameter(client, "client");
                Intrinsics.checkNotNullParameter(handler4, "handler");
                client.e.f(hem.f.f151731h, new aem.a(handler4, continuation, i));
                return;
        }
    }
}
