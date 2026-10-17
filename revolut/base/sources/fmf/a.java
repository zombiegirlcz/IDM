package fmf;

import com.revolut.core.ui_kit.delegates.ActionWidgetLoadingDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsActionableIconDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsLoadingDelegate;
import com.revolut.core.ui_kit.delegates.HeroBannerLoadingDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderLoadingDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingDelegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalLoadingV2Delegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.TripDetailsLoadingDelegate;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailsScreen f136385b;

    public /* synthetic */ a(TransactionDetailsScreen transactionDetailsScreen, int i) {
        this.f136384a = i;
        this.f136385b = transactionDetailsScreen;
    }

    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f136384a;
        TransactionDetailsScreen transactionDetailsScreen = this.f136385b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = TransactionDetailsScreen.B0;
                TransactionDetailsScreen transactionDetailsScreen2 = this.f136385b;
                return dli.f.a(transactionDetailsScreen2, transactionDetailsScreen2.d(), zhm.v.k(transactionDetailsScreen2.f0, transactionDetailsScreen2.Q, transactionDetailsScreen2.R, transactionDetailsScreen2.S, transactionDetailsScreen2.T, transactionDetailsScreen2.P, new CellDetailsLoadingDelegate(), transactionDetailsScreen2.f92047h0, transactionDetailsScreen2.i0, transactionDetailsScreen2.Z, transactionDetailsScreen2.j0, transactionDetailsScreen2.f92053t0, new ProgressStepVerticalLoadingDelegate(), new ProgressStepVerticalLoadingV2Delegate(), new SwipeToActionDelegate(transactionDetailsScreen2.Y, false), transactionDetailsScreen2.U, transactionDetailsScreen2.V, transactionDetailsScreen2.W, new IconDelegate(), transactionDetailsScreen2.X, transactionDetailsScreen2.Y, new RowLoadingDelegate(), transactionDetailsScreen2.f92043a0, transactionDetailsScreen2.f92044b0, transactionDetailsScreen2.f92046e0, transactionDetailsScreen2.c0, transactionDetailsScreen2.g0, transactionDetailsScreen2.f92045d0, new ListSubheaderLoadingDelegate(), transactionDetailsScreen2.m0, transactionDetailsScreen2.f92048k0, new TripDetailsLoadingDelegate(), transactionDetailsScreen2.l0, new HeroBannerLoadingDelegate(), new ActionWidgetLoadingDelegate(), transactionDetailsScreen2.f92049n0, transactionDetailsScreen2.f92050o0, new PlainTextDelegate(), transactionDetailsScreen2.p0, transactionDetailsScreen2.q0, transactionDetailsScreen2.f92051r0, transactionDetailsScreen2.f92052s0, new CellDetailsActionableIconDelegate()), 0, null, transactionDetailsScreen2.f92054v0, null, 44);
            case 1:
                return transactionDetailsScreen.f92054v0.f;
            case 2:
                KProperty[] kPropertyArr2 = TransactionDetailsScreen.B0;
                phm.a aVar = (phm.a) ue0.e.j(transactionDetailsScreen.m2()).a().get(mlf.d.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 == null) {
                    throw new IllegalStateException(a0.d.q("Api ", mlf.d.class, " is not found"));
                }
                mlf.d dVar = ((mlf.d) aVar2.b()).C1;
                TransactionDetailsScreenContract$InputData transactionDetailsScreenContract$InputData = transactionDetailsScreen.K;
                transactionDetailsScreenContract$InputData.getClass();
                o0 o0Var = transactionDetailsScreen.f92055w0;
                o0Var.getClass();
                return new mlf.e(dVar, transactionDetailsScreen, transactionDetailsScreenContract$InputData, o0Var);
            case 3:
                KProperty[] kPropertyArr3 = TransactionDetailsScreen.B0;
                return (f0) ((mlf.e) ((gmf.d) transactionDetailsScreen.f92056x0.getValue())).Q6.get();
            case 4:
                KProperty[] kPropertyArr4 = TransactionDetailsScreen.B0;
                return new jkf.b((klf.h0) ((mlf.e) ((gmf.d) transactionDetailsScreen.f92056x0.getValue())).E.get(), new jkf.a());
            default:
                KProperty[] kPropertyArr5 = TransactionDetailsScreen.B0;
                return (rp0.l0) ((mlf.e) ((gmf.d) transactionDetailsScreen.f92056x0.getValue())).O6.get();
        }
    }
}
