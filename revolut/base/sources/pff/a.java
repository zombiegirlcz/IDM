package pff;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tff.d;
import w4l.k;
import x4l.c;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f235577a;

    public a(d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f235577a = repository;
    }

    public final vkm.d a(String entityId, List list, boolean z, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        d dVar = this.f235577a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(entityId, "entityId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        c cVar = dVar.e;
        od0.a aVar = od0.a.f224253a;
        return cVar.b(new rff.a(entityId, "TRANSACTION", list, (od0.a.e() && z) ? Boolean.TRUE : null), loadingStrategy);
    }
}
