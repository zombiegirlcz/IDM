package wf0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f296916b;

    public /* synthetic */ p(x xVar, int i) {
        this.f296915a = i;
        this.f296916b = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f296915a) {
            case 0:
                zf0.d it8 = (zf0.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                x xVar = this.f296916b;
                efm.r map = xVar.f296937a.e(xVar.f296939c.a()).x().map(new r(1, new wd3.a(18)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return te0.w.f0(map);
            case 1:
                List list = (List) obj2;
                ne0.j jVar = this.f296916b.f;
                Intrinsics.h(list);
                jVar.f("top_level", list);
                return Unit.f186387a;
            default:
                zf0.c params = (zf0.c) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                x xVar2 = this.f296916b;
                efm.r rVarFilter = xVar2.f296940g.f(params, false).filter(new r(3, new wd3.a(19)));
                Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                efm.d0 d0VarFirstOrError = m70.a.g(rVarFilter, null, new b(1), 1).firstOrError();
                r rVar = new r(4, new o(params, xVar2));
                d0VarFirstOrError.getClass();
                return new ufm.i(d0VarFirstOrError, rVar, 1);
        }
    }
}
