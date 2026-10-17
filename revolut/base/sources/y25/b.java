package y25;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import efm.r;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vf0.x;
import wx6.k;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f310590b;

    public /* synthetic */ b(h hVar, int i) {
        this.f310589a = i;
        this.f310590b = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f310589a) {
            case 0:
                Boolean isTotalOwedEnabled = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isTotalOwedEnabled, "isTotalOwedEnabled");
                if (!isTotalOwedEnabled.booleanValue()) {
                    r rVarJust = r.just(new Data(f0.f322471a, null, false, 6, null));
                    Intrinsics.h(rVarJust);
                    return rVarJust;
                }
                ti9.j jVar = (ti9.j) this.f310590b.i;
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return rd0.e.c(boh.f.e(((ti9.g) jVar.f271465a).k(loadingStrategy), new td1.f(jVar, 24)), kotlin.coroutines.g.f186406a);
            default:
                x xVar = (x) obj2;
                Intrinsics.checkNotNullParameter(xVar, "<destruct>");
                Data data = (Data) xVar.f288487a;
                Data data2 = (Data) xVar.f288488b;
                Data data3 = (Data) xVar.f288489c;
                Data data4 = (Data) xVar.d;
                Data data5 = (Data) xVar.e;
                Data data6 = (Data) xVar.f;
                od0.i iVar = (od0.i) xVar.f288490g;
                Intrinsics.h(data);
                Intrinsics.h(data5);
                return (List) iii.c.f(t1.x(data, data2, data3, data4, data5, data6), new d(0), new y13.a(9), new k(this.f310590b, iVar, 25));
        }
    }
}
