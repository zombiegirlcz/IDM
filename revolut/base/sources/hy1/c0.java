package hy1;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 implements ky1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ay1.a f156638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lx1.h f156639b;

    public c0(ay1.a pixContactDao, lx1.h apmRecipientFilterInteractor) {
        Intrinsics.checkNotNullParameter(pixContactDao, "pixContactDao");
        Intrinsics.checkNotNullParameter(apmRecipientFilterInteractor, "apmRecipientFilterInteractor");
        this.f156638a = pixContactDao;
        this.f156639b = apmRecipientFilterInteractor;
    }

    @Override // ky1.a
    public final Flow a(String str) {
        return new b0(e(), this, str, 0);
    }

    @Override // ky1.a
    public final Object b(List list, Continuation continuation) throws Throwable {
        hul.f0 f0Var = new hul.f0(this, list, null, 16);
        p0 p0Var = p0.f264001a;
        Object objJ = skm.e0.J(elm.f.f127540b, f0Var, continuation);
        return objJ == fim.a.COROUTINE_SUSPENDED ? objJ : Unit.f186387a;
    }

    @Override // ky1.a
    public final Object c(String str, gim.c cVar) {
        z zVar = new z(this, str, null, 0);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, zVar, cVar);
    }

    @Override // ky1.a
    public final vkm.d e() {
        efm.r map = this.f156638a.g().map(new m(7, new i(9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final vkm.d f(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        efm.r map = this.f156638a.f(id10).map(new m(8, new i(10)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return rd0.e.b(map);
    }

    @Override // ky1.a
    public final Object g(String str, fy1.c cVar) {
        z zVar = new z(this, str, null, 1);
        p0 p0Var = p0.f264001a;
        return skm.e0.J(elm.f.f127540b, zVar, cVar);
    }
}
