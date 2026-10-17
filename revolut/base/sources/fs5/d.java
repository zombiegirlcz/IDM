package fs5;

import com.revolut.core.ui_kit.delegates.CellDetailsListDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.kyc.impl.choosedocument.ChooseDocumentKycFragment;
import com.revolut.feature.transport.impl.ui.hub.tickets.TransportHubTicketsScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.activities.statements.statement.StockFinancialsStatementFragment;
import efm.f;
import efm.w;
import fs2.k;
import fsk.e;
import fu8.g;
import fu8.h;
import fv6.n;
import java.util.List;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import od0.i;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements o, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f137598b;

    public /* synthetic */ d(int i, Function1 function1) {
        this.f137597a = i;
        this.f137598b = function1;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f137597a;
        Function1 function1 = this.f137598b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((c) function1).invoke(p0);
            case 1:
                int i2 = StockFinancialsStatementFragment.f103802k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((fo9.a) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((fo9.a) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((e) function1).invoke(p0);
            case 4:
                int i3 = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((ft4.w) function1).invoke(p0);
            case 5:
                int i5 = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CellDetailsListDelegate.Model) ((ft4.w) function1).invoke(p0);
            case 6:
                int i6 = ChooseDocumentKycFragment.f77588n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RowDelegate.Model) ((ft4.w) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((g) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((g) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((h) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (fu8.a) ((g) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((ft4.w) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((h) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((h) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((g) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((h) function1).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((k) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((fv5.a) function1).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((fv5.a) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i) ((n) function1).invoke(p0);
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((fwf.n) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((fwj.g) function1).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((fwj.g) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f) ((fwj.g) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        n nVar = (n) this.f137598b;
        KProperty[] kPropertyArr = TransportHubTicketsScreen.f0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) nVar.invoke(p0)).booleanValue();
    }
}
