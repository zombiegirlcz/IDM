package xq3;

import ft3.d1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xr3.w f308099a;

    public u(xr3.w repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f308099a = repository;
    }

    public final Flow a(d1 productClassification) {
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        xr3.w wVar = this.f308099a;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        return vkm.q.q(new vkm.y(mo3.a.g(rd0.e.n(wVar.e.b(productClassification, wVar.d.c(xr3.w.a(productClassification), w4l.i.f294643c)), h0.f322473a), null, new xlb.l(18), 1), new x18.c(3, 18, null)));
    }
}
