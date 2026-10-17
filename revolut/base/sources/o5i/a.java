package o5i;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.product_details.CardReaderProductDetailsScreen;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.f;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.g;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import neg.q;
import nzj.n;
import o9k.k0;
import od0.i;
import xzg.n0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements o, g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f222440b;

    public /* synthetic */ a(int i, Function1 function1) {
        this.f222439a = i;
        this.f222440b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((o3k.a) this.f222440b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f222439a) {
            case 0:
                o5.b bVar = (o5.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) bVar.invoke(p0);
            case 1:
                o3k.a aVar = (o3k.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) aVar.invoke(p0);
            case 2:
                o3k.a aVar2 = (o3k.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 3:
                o54.a aVar3 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar3.invoke(p0);
            case 4:
                o69.b bVar2 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) bVar2.invoke(p0);
            case 5:
                l3d.f fVar = (l3d.f) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) fVar.invoke(p0);
            case 6:
                o3k.a aVar4 = (o3k.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) aVar4.invoke(p0);
            case 7:
                o69.b bVar3 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar3.invoke(p0);
                return Boolean.TRUE;
            case 8:
                o69.b bVar4 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar4.invoke(p0);
                return Boolean.TRUE;
            case 9:
                o54.a aVar5 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar5.invoke(p0);
            case 10:
                o69.b bVar5 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) bVar5.invoke(p0);
            case 11:
            case 16:
            case 17:
            case 18:
            case 19:
            default:
                q qVar = (q) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (hce.a) qVar.invoke(p0);
            case 12:
                o69.b bVar6 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                bVar6.invoke(p0);
                return Boolean.TRUE;
            case 13:
                o69.b bVar7 = (o69.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n0) bVar7.invoke(p0);
            case 14:
                o3k.a aVar6 = (o3k.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar6.invoke(p0);
            case 15:
                n nVar = (n) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) nVar.invoke(p0);
            case 20:
                o95.b bVar8 = (o95.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n0h.b) bVar8.invoke(p0);
            case 21:
                o54.a aVar7 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) aVar7.invoke(p0);
            case 22:
                o9h.b bVar9 = (o9h.b) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) bVar9.invoke(p0);
            case 23:
                o54.a aVar8 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar8.invoke(p0);
            case 24:
                k0 k0Var = (k0) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) k0Var.invoke(p0);
            case 25:
                o54.a aVar9 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar9.invoke(p0);
            case 26:
                o54.a aVar10 = (o54.a) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) aVar10.invoke(p0);
            case 27:
                k0 k0Var2 = (k0) this.f222440b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) k0Var2.invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f222439a;
        o95.b bVar = (o95.b) this.f222440b;
        switch (i) {
            case 16:
                KProperty[] kPropertyArr = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                KProperty[] kPropertyArr2 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                KProperty[] kPropertyArr3 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                KProperty[] kPropertyArr4 = RevolutPaySummaryScreen.f84518b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr5 = CardReaderProductDetailsScreen.f60604e0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) bVar.invoke(p0)).booleanValue();
    }
}
