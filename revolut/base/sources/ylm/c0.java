package ylm;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ulm.m0;
import ulm.x0;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ulm.a f314743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f314744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f314745c;
    public final boolean d;
    public final List e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f314746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f314747h;

    public c0(ulm.a address, x routeDatabase, q call, boolean z) {
        List<Proxy> listI;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        this.f314743a = address;
        this.f314744b = routeDatabase;
        this.f314745c = call;
        this.d = z;
        f0 f0Var = f0.f322471a;
        this.e = f0Var;
        this.f314746g = f0Var;
        this.f314747h = new ArrayList();
        x0 x0Var = address.f281058h;
        m0 m0Var = call.e;
        m0Var.proxySelectStart(call, x0Var);
        URI uriJ = x0Var.j();
        if (uriJ.getHost() == null) {
            listI = vlm.j.i(Proxy.NO_PROXY);
        } else {
            List<Proxy> listSelect = address.f281057g.select(uriJ);
            List<Proxy> list = listSelect;
            listI = (list == null || list.isEmpty()) ? vlm.j.i(Proxy.NO_PROXY) : vlm.j.q(listSelect);
        }
        this.e = listI;
        this.f = 0;
        m0Var.proxySelectEnd(call, x0Var, listI);
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.f314747h.isEmpty();
    }
}
