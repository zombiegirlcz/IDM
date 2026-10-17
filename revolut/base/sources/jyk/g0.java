package jyk;

import com.revolut.data.model.Data;
import com.revolut.feature.travel.experiences.impl.ui.screen.search.TravelExperiencesSearchScreen;
import com.revolut.feature.wealth.asset.selection.impl.ui.screens.instrument.InstrumentSelectionController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.amount.RemittanceAmountScreen;
import ip0.yc0;
import java.util.HashSet;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g0 implements kfm.o, kfm.g, kfm.p, kfm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f179479b;

    public /* synthetic */ g0(Function function, int i) {
        this.f179478a = i;
        this.f179479b = function;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        ((yc0) this.f179479b).invoke(obj2);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f179478a;
        Function function = this.f179479b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((d0) function).invoke(p0);
                return Boolean.TRUE;
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FeatureCommand) ((d0) function).invoke(p0);
            case 2:
            case 15:
            case 18:
            case 19:
            case 23:
            case 26:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k37.s) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((d0) function).invoke(p0);
                return Boolean.TRUE;
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) ((jck.y) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) ((jud.d) function).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((d0) function).invoke(p0);
                return Boolean.TRUE;
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((d0) function).invoke(p0);
                return Boolean.TRUE;
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((d0) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((d0) function).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.h0) ((d0) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u2f.d) ((d0) function).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((d0) function).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (mha.s) ((k1g.n) function).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((k1.a) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((k1g.n) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ju3.c) ((a3i.w) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((k1g.n) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((k1.a) function).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Data) ((k1g.n) function).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((k1.a) function).invoke(p0);
            case 25:
                KProperty[] kPropertyArr = TravelExperiencesSearchScreen.f93130h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((k37.s) function).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (HashSet) ((k37.s) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f179478a;
        Function function = this.f179479b;
        switch (i) {
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 18:
                InstrumentSelectionController.Companion aVar = InstrumentSelectionController.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 26:
                KProperty[] kPropertyArr = TravelExperiencesSearchScreen.f93130h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr2 = RemittanceAmountScreen.p0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((k37.s) function).invoke(p0)).booleanValue();
    }

    @Override // kfm.d
    public boolean test(Object p0, Object p17) {
        k1f.n nVar = (k1f.n) this.f179479b;
        InstrumentSelectionController.Companion aVar = InstrumentSelectionController.INSTANCE;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return ((Boolean) nVar.invoke(p0, p17)).booleanValue();
    }
}
