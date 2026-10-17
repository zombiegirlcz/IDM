package vz1;

import efm.r;
import kotlin.jvm.internal.Intrinsics;
import pfm.n;
import vx9.w;

/* JADX INFO: loaded from: classes20.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f293367a;

    public j(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f293367a = storage;
    }

    public final r a(n02.c apm) {
        Intrinsics.checkNotNullParameter(apm, "apm");
        r map = rd0.e.c(this.f293367a.C0("KEY_CONTACT_PERMISSION_DISCLAIMER_" + apm, Boolean.TYPE), kotlin.coroutines.g.f186406a).map(new w(new h(0), 28));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return te0.w.f0(map);
    }

    public final pfm.r b(n02.c apm) {
        Intrinsics.checkNotNullParameter(apm, "apm");
        n nVar = new n(new to7.f(this, apm, 22), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return te0.w.g0(nVar);
    }
}
