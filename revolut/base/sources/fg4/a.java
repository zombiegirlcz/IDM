package fg4;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.CustomerIdentificationScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.CustomerIdentificationScreenContract$InputData;
import com.revolut.kompot.common.R$id;
import dw3.h1;
import dw3.t1;
import dw3.z4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f134894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CustomerIdentificationScreen f134895b;

    public /* synthetic */ a(CustomerIdentificationScreen customerIdentificationScreen, int i) {
        this.f134894a = i;
        this.f134895b = customerIdentificationScreen;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f134894a;
        CustomerIdentificationScreen customerIdentificationScreen = this.f134895b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = CustomerIdentificationScreen.Q;
                qji.b bVarU2 = customerIdentificationScreen.U2();
                Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.credit.application.plugins.impl.ui.personal_details.customer_identification.di.CustomerIdentificationScreenComponentInjector");
                z4 z4Var = ((z4) bVarU2).d;
                t1 t1Var = new t1();
                t1Var.f119821a = e4m.b.b(e4m.c.a(customerIdentificationScreen));
                h1 h1Var = new h1(z4Var, t1Var, 1, 7);
                t1Var.f119822b = h1Var;
                t1Var.f119823c = e4m.b.b(h1Var);
                t1Var.d = e4m.b.b(new h1(z4Var, t1Var, 0, 7));
                t1Var.e = e4m.b.b(t1Var.f119822b);
                t1Var.f = e4m.b.b(new h1(z4Var, t1Var, 3, 7));
                t1Var.f119824g = e4m.b.b(new h1(z4Var, t1Var, 2, 7));
                return t1Var;
            case 1:
                KProperty[] kPropertyArr2 = CustomerIdentificationScreen.Q;
                return (e) ((t1) customerIdentificationScreen.N.getValue()).f119824g.get();
            default:
                KProperty[] kPropertyArr3 = CustomerIdentificationScreen.Q;
                CustomerIdentificationScreen customerIdentificationScreen2 = this.f134895b;
                return dli.f.a(customerIdentificationScreen2, (e) customerIdentificationScreen2.O.getValue(), u.c(new PlainTextDelegate()), R$id.recyclerView, null, null, null, 56);
        }
    }

    public /* synthetic */ a(CustomerIdentificationScreen customerIdentificationScreen, CustomerIdentificationScreenContract$InputData customerIdentificationScreenContract$InputData) {
        this.f134894a = 0;
        this.f134895b = customerIdentificationScreen;
    }
}
