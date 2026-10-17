package sc7;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.new_sale.SaleScreen;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_transactions.CashbackTransactionsScreen;
import com.revolut.retail.core.navigation.FeatureCommand;
import efm.h0;
import efm.n;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import qua.q;
import rnb.u;
import sa6.y;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements o, p, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f261651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f261652b;

    public /* synthetic */ g(Function function, int i) {
        this.f261651a = i;
        this.f261652b = function;
    }

    @Override // kfm.c
    public Object apply(Object obj2, Object obj3) {
        return (Boolean) ((sa5.a) this.f261652b).invoke(obj2, obj3);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f261651a;
        Function function = this.f261652b;
        switch (i) {
            case 15:
                KProperty[] kPropertyArr = CashbackTransactionsScreen.f65722e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                KProperty[] kPropertyArr2 = SaleScreen.P;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                KProperty[] kPropertyArr3 = SaleScreen.P;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                KProperty[] kPropertyArr4 = SaleScreen.P;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((se0.a) function).invoke(p0)).booleanValue();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f261651a) {
            case 0:
                cia.d dVar = (cia.d) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar.invoke(p0);
            case 1:
                h hVar = (h) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar.invoke(p0);
            case 2:
                h hVar2 = (h) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) hVar2.invoke(p0);
            case 3:
                y yVar = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) yVar.invoke(p0);
            case 4:
                cia.d dVar2 = (cia.d) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar2.invoke(p0);
            case 5:
                cia.d dVar3 = (cia.d) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) dVar3.invoke(p0);
            case 6:
                s31.a aVar = (s31.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar.invoke(p0);
            case 7:
                sce.a aVar2 = (sce.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) aVar2.invoke(p0);
            case 8:
                y yVar2 = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (UpiFeatureConfig.Destination.Transfer.InputData) yVar2.invoke(p0);
            case 9:
                y yVar3 = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (UpiFeatureConfig.Destination.Transfer.InputData) yVar3.invoke(p0);
            case 10:
                y yVar4 = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mm.g) yVar4.invoke(p0);
            case 11:
                u uVar = (u) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) uVar.invoke(p0);
            case 12:
                y yVar5 = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) yVar5.invoke(p0);
            case 13:
                s78.d dVar4 = (s78.d) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n) dVar4.invoke(p0);
            case 14:
                s31.a aVar3 = (s31.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar3.invoke(p0);
            case 15:
            case 22:
            case 23:
            case 24:
            case 25:
            case 27:
            default:
                return (h0) ((scl.e) this.f261652b).invoke(p0);
            case 16:
                scl.e eVar = (scl.e) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar.invoke(p0);
            case 17:
                s06.e eVar2 = (s06.e) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) eVar2.invoke(p0);
            case 18:
                sda.a aVar4 = (sda.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q06.h) aVar4.invoke(p0);
            case 19:
                l3d.f fVar = (l3d.f) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) fVar.invoke(p0);
            case 20:
                sda.a aVar5 = (sda.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q06.h) aVar5.invoke(p0);
            case 21:
                y yVar6 = (y) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) yVar6.invoke(p0);
            case 26:
                se0.a aVar6 = (se0.a) this.f261652b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fha.a) aVar6.invoke(p0);
            case 28:
                return (od0.i) ((sk2.f) this.f261652b).invoke(p0);
        }
    }
}
