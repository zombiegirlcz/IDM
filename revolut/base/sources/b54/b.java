package b54;

import c54.h;
import c54.i;
import c54.j;
import fy4.u;
import fy4.v;
import fy4.w;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.akahu.b f12427b;

    public /* synthetic */ b(com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar, int i) {
        this.f12426a = i;
        this.f12427b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f12426a;
        com.revolut.feature.credit.application.plugins.impl.ui.akahu.b bVar = this.f12427b;
        switch (i) {
            case 0:
                j outputData = (j) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (!Intrinsics.f(outputData, i.f21418a) && !Intrinsics.f(outputData, h.f21417a)) {
                    throw new NoWhenBranchMatchedException();
                }
                bVar.f67029s.e(false);
                return Unit.f186387a;
            case 1:
                w outputData2 = (w) obj2;
                Intrinsics.checkNotNullParameter(outputData2, "outputData");
                if (outputData2 instanceof u) {
                    bVar.l2(new e(bVar, null, 1), new b(bVar, 3));
                } else {
                    if (!(outputData2 instanceof v)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 2:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                bVar.P2(error);
                return Boolean.TRUE;
            default:
                Throwable error2 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error2, "error");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error2, h0Var2);
                bVar.P2(error2);
                return Boolean.TRUE;
        }
    }
}
