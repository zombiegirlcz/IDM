package tjf;

import ael.u0;
import com.revolut.core.ui_kit.internal.views.chart.LineChartView;
import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m0 implements kfm.o, kfm.g, wmm.a, kfm.c, zp0.x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f271682b;

    public /* synthetic */ m0(Object obj2, int i) {
        this.f271681a = i;
        this.f271682b = obj2;
    }

    @Override // wmm.a
    public Object a(xmm.c cVar) {
        return (xmm.e) this.f271682b;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f271681a;
        Object obj3 = this.f271682b;
        switch (i) {
            case 3:
                ((e) obj3).invoke(obj2);
                break;
            case 4:
                ((tm.c) obj3).invoke(obj2);
                break;
            case 5:
                ((tm.c) obj3).invoke(obj2);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 13:
            case 15:
            default:
                LineChartView.Companion aVar = LineChartView.INSTANCE;
                ((ts0.i0) obj3).invoke(obj2);
                break;
            case 11:
                ((tpi.c) obj3).invoke(obj2);
                break;
            case 12:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 14:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 16:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 17:
                ((t9f.n) obj3).invoke(obj2);
                break;
            case 18:
                ((tpi.c) obj3).invoke(obj2);
                break;
            case 19:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 20:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 21:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 22:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 23:
                ((tpi.e) obj3).invoke(obj2);
                break;
            case 24:
                ((tpi.c) obj3).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f271681a) {
            case 0:
                s06.e eVar = (s06.e) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) eVar.invoke(p0);
            case 1:
                d62.a aVar = (d62.a) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) aVar.invoke(p0);
            case 2:
                e eVar2 = (e) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) eVar2.invoke(p0);
            case 7:
                tlf.n nVar = (tlf.n) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) nVar.invoke(p0);
            case 8:
                te8.a aVar2 = (te8.a) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) aVar2.invoke(p0);
            case 9:
                u0 u0Var = (u0) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) u0Var.invoke(p0);
            case 10:
                ryd.f fVar = (ryd.f) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) fVar.invoke(p0);
            case 15:
                tpi.g gVar = (tpi.g) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return gVar.invoke(p0);
            case 26:
                tkm.d dVar = (tkm.d) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 27:
                tpl.o oVar = (tpl.o) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) oVar.invoke(p0);
            default:
                tpi.g gVar2 = (tpi.g) this.f271682b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) gVar2.invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String formattedValue, boolean z) {
        tqa.b bVar = (tqa.b) this.f271682b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        bVar.f273542b.onNext(new uqa.a(listId, extractedValue, formattedValue, z));
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        tj9.d dVar = (tj9.d) this.f271682b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Pair) dVar.invoke(p0, p17);
    }
}
