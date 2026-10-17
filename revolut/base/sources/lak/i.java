package lak;

import a26.s;
import com.revolut.core.backend_flow.impl.ui.form_screen.FormController;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.cryptocommoditydetails.impl.ui.price_targets.details.screens.details.PriceTargetsDetailsScreen;
import d7j.k1;
import efm.h0;
import efm.w;
import java.util.List;
import kfm.o;
import kfm.p;
import knd.t;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import le3.a0;
import yhm.r;
import zp0.x;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class i implements o, p, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f193417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193418b;

    public /* synthetic */ i(Object obj2, int i) {
        this.f193417a = i;
        this.f193418b = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f193417a;
        Object obj2 = this.f193418b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((l3l.m) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((h) obj2).invoke(p0);
            case 2:
            case 10:
            case 18:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((a0) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.n) ((h) obj2).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Clause) ((l9j.k) obj2).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((l9j.k) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((h) obj2).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((l9j.k) obj2).invoke(p0);
            case 8:
                int i2 = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((l9j.k) obj2).invoke(p0);
            case 9:
                int i3 = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((l9j.k) obj2).invoke(p0);
            case 11:
                int i5 = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Pair) ((l9j.k) obj2).invoke(p0);
            case 12:
                int i6 = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sa) ((l9j.k) obj2).invoke(p0);
            case 13:
                int i21 = FormController.D0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (RowDelegate.Model) ((l9j.k) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lbe.a) ((bbe.b) obj2).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ed5.c) ((laj.b) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((laj.b) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((ldi.j) obj2).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((laj.b) obj2).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((lbh.a) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((le3.b) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((le3.b) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((laj.b) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((k1) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((le3.b) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((t) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((s) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((laj.b) obj2).invoke(p0);
        }
    }

    @Override // zp0.x
    public void e(String listId, String extractedValue, String str, boolean z) {
        FormController formController = (FormController) this.f193418b;
        int i = FormController.D0;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        formController.c0.onNext(new r(listId, extractedValue, Boolean.valueOf(z)));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f193417a;
        Object obj2 = this.f193418b;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((l9j.k) obj2).invoke(p0)).booleanValue();
            default:
                KProperty[] kPropertyArr = PriceTargetsDetailsScreen.f100155b0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((lbh.a) obj2).invoke(p0)).booleanValue();
        }
    }
}
