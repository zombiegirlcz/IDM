package uwf;

import com.revolut.camerakit.revolut.ui.barcode.screen.BarcodeReaderScreen;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature.transport.impl.ui.transit_checkout.passenger_details.PassengerDetailsScreen;
import kfm.o;
import kfm.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tx0.g4;
import uwi.v;
import ux0.w0;
import uyc.z;
import uyd.x;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements o, kfm.g, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f283656b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f283655a = i;
        this.f283656b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f283655a;
        Function1 function1 = this.f283656b;
        switch (i) {
            case 6:
                w0.a aVar = w0.Companion;
                ((g4) function1).invoke(obj2);
                break;
            case 14:
                ((z) function1).invoke(obj2);
                break;
            default:
                ((z) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f283655a;
        Function1 function1 = this.f283656b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = PassengerDetailsScreen.U;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 4:
                KProperty[] kPropertyArr2 = BarcodeReaderScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((v) function1).invoke(p0);
                break;
            case 5:
                KProperty[] kPropertyArr3 = BarcodeReaderScreen.S;
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((v) function1).invoke(p0);
                break;
            case 6:
            case 8:
            case 9:
            case 13:
            case 14:
            case 15:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 7:
                break;
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return (StatementUrlState) ((x) function1).invoke(p0);
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f283655a) {
            case 8:
                v vVar = (v) this.f283656b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar.invoke(p0)).booleanValue();
            case 9:
                v vVar2 = (v) this.f283656b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar2.invoke(p0)).booleanValue();
            default:
                v vVar3 = (v) this.f283656b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) vVar3.invoke(p0)).booleanValue();
        }
    }
}
