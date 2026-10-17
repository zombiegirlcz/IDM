package bs9;

import com.revolut.core.ui_kit.internal.views.navbar.preview.WallpaperPreviewView;
import com.revolut.data.model.Data;
import com.revolut.feature.card_management.impl.ui.expectations.ExpectationManagementActivity;
import com.revolut.feature.payments.groups.impl.ui_new.details_bill.GroupDetailsBillScreen;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.amount.ManualTransferScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class i0 implements kfm.g, kfm.o, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f18110b;

    public /* synthetic */ i0(int i, Function1 function1) {
        this.f18109a = i;
        this.f18110b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f18109a;
        Function1 function1 = this.f18110b;
        switch (i) {
            case 0:
                ((bnj.n) function1).invoke(obj2);
                break;
            case 7:
                WallpaperPreviewView.Companion aVar = WallpaperPreviewView.INSTANCE;
                ((bq7.j) function1).invoke(obj2);
                break;
            case 14:
                ((bq7.j) function1).invoke(obj2);
                break;
            case 21:
                ((bzc.w) function1).invoke(obj2);
                break;
            case 24:
                ((byc.a) function1).invoke(obj2);
                break;
            default:
                ((c03.e) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f18109a;
        Function1 function1 = this.f18110b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((a09.z) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((bsk.a) function1).invoke(p0);
                return Boolean.TRUE;
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((a09.z) function1).invoke(p0);
            case 4:
            case 5:
            case 7:
            case 9:
            case 14:
            case 21:
            default:
                int i2 = ExpectationManagementActivity.f64848w0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((bxg.t) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((bq7.j) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((bt9.t) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((bnj.n) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((bt9.t) function1).invoke(p0);
                return Boolean.TRUE;
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((a6j.a) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((bq7.j) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((bxg.t) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((bxg.t) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((bxg.t) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((bq7.j) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((bzc.w) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((bzc.w) function1).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((bzc.w) function1).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f18109a;
        Function1 function1 = this.f18110b;
        switch (i) {
            case 4:
                KProperty[] kPropertyArr = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 5:
                KProperty[] kPropertyArr2 = GroupDetailsBillScreen.f79404k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                KProperty[] kPropertyArr3 = ManualTransferScreen.f92464k0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((bxg.t) function1).invoke(p0)).booleanValue();
    }
}
