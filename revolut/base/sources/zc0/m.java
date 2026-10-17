package zc0;

import android.os.HandlerThread;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RateNPSDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.cashback.impl.ui.yourcashback.split_by_source.SplitBySourceScreen;
import com.revolut.feature.pay_later.impl.ui.paymentoptions.options.PaymentOptionsController;
import com.revolut.feature.retail.salary_account.impl.switch_assistant.payroll_platform.work_email_input.PayrollPlatformEmailInputController;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zc1.c;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class m implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f321083a;

    public /* synthetic */ m(int i) {
        this.f321083a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f321083a) {
            case 0:
                return new RateNPSDelegate();
            case 1:
                return new RowDelegate(null, null, 7);
            case 2:
                return Unit.f186387a;
            case 3:
                c.b bVar = zc1.c.Companion;
                return new qlm.e(c.d.a.f321199a);
            case 4:
                c.b bVar2 = zc1.c.Companion;
                qlm.v1 v1Var = qlm.v1.f247718a;
                return new qlm.h0(v1Var, v1Var, 1);
            case 5:
                KProperty[] kPropertyArr = SplitBySourceScreen.c0;
                return new ListSubheaderDelegate();
            case 6:
                KProperty[] kPropertyArr2 = SplitBySourceScreen.c0;
                return new RowDelegate(null, null, 7);
            case 7:
                return new qlm.e(zda.t0.f321416a);
            case 8:
                return new qlm.e(zda.z0.f321431a);
            case 9:
                return new qlm.e(zda.s.f321412a);
            case 10:
                return new qlm.e(zda.p.f321405a);
            case 11:
                return new qlm.e(zda.g.f321377a);
            case 12:
                return new qlm.e(zda.b0.f321360a);
            case 13:
                return new qlm.e(qlm.v1.f247718a);
            case 14:
                return new qlm.e(qlm.v1.f247718a);
            case 15:
                qlm.v1 v1Var2 = qlm.v1.f247718a;
                return new qlm.h0(v1Var2, v1Var2, 1);
            case 16:
                return new qlm.e(zda.k0.f321394a);
            case 17:
                return new qlm.e(zda.n0.f321401a);
            case 18:
                return new qlm.e(zda.t0.f321416a);
            case 19:
                return new qlm.e(zda.t0.f321416a);
            case 20:
                return new qlm.e(zda.z0.f321431a);
            case 21:
                return new qlm.e(zg3.e.f322055a);
            case 22:
                return new qlm.e(zg3.o.f322067a);
            case 23:
                zg3.s sVar = zg3.s.INSTANCE;
                Intrinsics.checkNotNullParameter("type", "discriminator");
                return new qlm.d1("com.revolut.feature.checklist_challenges_ui.impl.model.checklist_step_details.blocks.ChecklistStepDetailsBlockUnknown", sVar, new Annotation[]{new zg3.l(1)});
            case 24:
                HandlerThread handlerThread = new HandlerThread("GmsLocationProvider-thread");
                handlerThread.start();
                return handlerThread;
            case 25:
                KProperty[] kPropertyArr3 = PayrollPlatformEmailInputController.R;
                return new InputTextDelegate(null);
            case 26:
                return Unit.f186387a;
            case 27:
                return Unit.f186387a;
            case 28:
                return Unit.f186387a;
            default:
                KProperty[] kPropertyArr4 = PaymentOptionsController.T;
                return new FullScreenStateDelegate();
        }
    }
}
