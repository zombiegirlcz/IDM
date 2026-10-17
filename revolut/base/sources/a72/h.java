package a72;

import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoService;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoService f1758a;

    public h(MultibancoService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f1758a = service;
    }

    public final Object a(gim.c cVar) {
        g gVar = new g(this, null, 1);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, gVar, cVar);
    }
}
