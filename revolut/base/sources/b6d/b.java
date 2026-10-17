package b6d;

import efm.d0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f12709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xvh.a f12710c;

    public /* synthetic */ b(r rVar, xvh.a aVar, int i) {
        this.f12708a = i;
        this.f12709b = rVar;
        this.f12710c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String ownerId = (String) obj2;
        switch (this.f12708a) {
            case 0:
                Intrinsics.checkNotNullParameter(ownerId, "it");
                e6d.r rVar = this.f12709b.f12732a;
                yvh.d scope = this.f12710c.a();
                rVar.getClass();
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                Intrinsics.checkNotNullParameter(scope, "scope");
                efm.r map = m70.a.g(rVar.b(ownerId, scope, w4l.h.f294642c), null, new e07.k(28), 1).map(new e31.e(23, new e6d.b(ownerId, scope, 0)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return map;
            default:
                Intrinsics.checkNotNullParameter(ownerId, "it");
                e6d.r rVar2 = this.f12709b.f12732a;
                yvh.d scope2 = this.f12710c.a();
                rVar2.getClass();
                Intrinsics.checkNotNullParameter(ownerId, "ownerId");
                Intrinsics.checkNotNullParameter(scope2, "scope");
                d0 d0VarFirst = m70.a.g(rVar2.b(ownerId, scope2, w4l.h.f294642c), null, new e07.k(29), 1).first(f0.f322471a);
                e31.e eVar = new e31.e(24, new e6d.b(ownerId, scope2, 1));
                d0VarFirst.getClass();
                ufm.i iVar = new ufm.i(d0VarFirst, eVar, 1);
                Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                return iVar;
        }
    }
}
