package hy1;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class m0 implements ky1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dy1.a f156666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.h f156667b;

    public m0(dy1.a weroContactDao, lx1.h apmRecipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(weroContactDao, "weroContactDao");
        Intrinsics.checkNotNullParameter(apmRecipientFilterInteractor, "apmRecipientFilterInteractor");
        this.f156666a = weroContactDao;
        this.f156667b = apmRecipientFilterInteractor;
    }

    @Override // ky1.a
    public final Flow a(String str) {
        return new b0(e(), this, str, 3);
    }

    @Override // ky1.a
    public final Object b(List list, Continuation continuation) throws Throwable {
        hul.f0 f0Var = new hul.f0(this, list, null, 19);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, f0Var, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // ky1.a
    public final Object c(String str, gim.c cVar) {
        k0 k0Var = new k0(this, str, null, 0);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, k0Var, cVar);
    }

    @Override // ky1.a
    public final vkm.d e() {
        efm.r map = this.f156666a.g().map(new m(13, new i(15)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final vkm.d f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = this.f156666a.f(id10).map(new m(14, new i(16)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final Object g(String str, fy1.c cVar) {
        k0 k0Var = new k0(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, k0Var, cVar);
    }
}
