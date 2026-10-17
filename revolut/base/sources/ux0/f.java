package ux0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f283744a = new f();

    private f() {
    }

    @Override // ux0.i
    public final i a(d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model instanceof b) {
            b bVar = (b) model;
            o oVar = (o) zhm.d0.d0(bVar.f283737c);
            return oVar == null ? new e(bVar, new IllegalStateException("At least one story is expected for the product intro")) : new h(bVar, oVar);
        }
        if (model instanceof c) {
            return new g(((c) model).f283739a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
