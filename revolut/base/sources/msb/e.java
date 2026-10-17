package msb;

import ard.t;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomBarExpandedView;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto_investments.api.model.PocketBalancesWithSum;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mt0.n;
import mul.k;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements kfm.g, p, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f208648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f208649b;

    public /* synthetic */ e(int i, Function1 function1) {
        this.f208648a = i;
        this.f208649b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f208648a;
        Function1 function1 = this.f208649b;
        switch (i) {
            case 0:
                ((d) function1).invoke(obj2);
                break;
            case 4:
                FloatingBottomBarExpandedView.Companion companion = FloatingBottomBarExpandedView.INSTANCE;
                ((n) function1).invoke(obj2);
                break;
            case 12:
                ((mv9.d) function1).invoke(obj2);
                break;
            default:
                ((mv9.e) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f208648a) {
            case 2:
                c cVar = (c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (zm0.d) cVar.invoke(p0);
            case 3:
                i5f.g gVar = (i5f.g) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) gVar.invoke(p0);
            case 4:
            case 12:
            case 22:
            default:
                k kVar = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (dv9.j) kVar.invoke(p0);
            case 5:
                i5f.g gVar2 = (i5f.g) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) gVar2.invoke(p0);
            case 6:
                c cVar2 = (c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar2.invoke(p0);
            case 7:
                mu5.c cVar3 = (mu5.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PocketBalancesWithSum) cVar3.invoke(p0);
            case 8:
                t tVar = (t) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) tVar.invoke(p0);
            case 9:
                mu5.d dVar = (mu5.d) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) dVar.invoke(p0);
            case 10:
                mv9.c cVar4 = (mv9.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar4.invoke(p0);
            case 11:
                mv9.c cVar5 = (mv9.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) cVar5.invoke(p0);
            case 13:
                mv9.e eVar = (mv9.e) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) eVar.invoke(p0);
            case 14:
                mv9.c cVar6 = (mv9.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) cVar6.invoke(p0);
            case 15:
                mv9.f fVar = (mv9.f) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 16:
                mv9.f fVar2 = (mv9.f) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar2.invoke(p0);
            case 17:
                mt9.c cVar7 = (mt9.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) cVar7.invoke(p0);
            case 18:
                k kVar2 = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar2.invoke(p0);
            case 19:
                k kVar3 = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar3.invoke(p0);
            case 20:
                k kVar4 = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) kVar4.invoke(p0);
            case 21:
                mqi.a aVar = (mqi.a) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar.invoke(p0);
            case 23:
                k kVar5 = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) kVar5.invoke(p0);
            case 24:
                mv9.e eVar2 = (mv9.e) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar2.invoke(p0);
            case 25:
                mm7.h hVar = (mm7.h) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) hVar.invoke(p0);
            case 26:
                moe.c cVar8 = (moe.c) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) cVar8.invoke(p0);
            case 27:
                k kVar6 = (k) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) kVar6.invoke(p0);
            case 28:
                mv9.e eVar3 = (mv9.e) this.f208649b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) eVar3.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        c cVar = (c) this.f208649b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) cVar.invoke(p0)).booleanValue();
    }
}
