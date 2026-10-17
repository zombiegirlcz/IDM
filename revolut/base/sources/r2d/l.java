package r2d;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f251113b;

    public /* synthetic */ l(p pVar, int i) {
        this.f251112a = i;
        this.f251113b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        mgd.g queryParams = (mgd.g) obj2;
        switch (this.f251112a) {
            case 0:
                Intrinsics.checkNotNullParameter(queryParams, "query");
                l2d.n nVar = (l2d.n) this.f251113b.f251116a;
                Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                efm.r rVarSwitchMap = pu7.a.x(nVar.c(queryParams, false)).switchMap(new l2d.b(new kzc.a(queryParams, nVar, 8), 1));
                Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
                return rVarSwitchMap;
            default:
                Intrinsics.checkNotNullParameter(queryParams, "query");
                l2d.n nVar2 = (l2d.n) this.f251113b.f251116a;
                Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                b4d.i iVar = nVar2.f191787a;
                Intrinsics.checkNotNullParameter(queryParams, "queryParams");
                return iVar.f.g(queryParams, false);
        }
    }
}
