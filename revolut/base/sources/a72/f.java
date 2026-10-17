package a72;

import com.revolut.feature.apm.multibanco.impl.data.network.MultibancoPendingPaymentService;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultibancoPendingPaymentService f1756a;

    public f(MultibancoPendingPaymentService service) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.f1756a = service;
    }

    public final Object a(gim.c cVar) {
        a01.e eVar = new a01.e(this, null, 10);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, eVar, cVar);
    }
}
