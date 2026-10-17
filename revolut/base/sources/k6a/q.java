package k6a;

import com.youTransactor.uCube.rpc.Constants;
import h93.g0;
import kotlin.jvm.functions.Function1;
import t73.q0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f181667b;

    public /* synthetic */ q(g0 g0Var, int i) {
        this.f181666a = i;
        this.f181667b = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181666a) {
            case 0:
                g0 g0Var = this.f181667b;
                return j.a((j) obj2, null, null, null, g0Var.f150128a, g0Var, false, Constants.TAG_E7_NFC_CARD_DETECT_CONFIGURATION);
            case 1:
                od0.i.Companion.getClass();
                g0 g0Var2 = this.f181667b;
                return q0.a((q0) obj2, null, null, od0.h.a(g0Var2), g0Var2.f150128a, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554383);
            default:
                od0.i.Companion.getClass();
                g0 g0Var3 = this.f181667b;
                return q0.a((q0) obj2, null, null, od0.h.a(g0Var3), g0Var3.f150128a, null, null, null, null, null, null, null, null, null, null, null, null, false, 33554383);
        }
    }
}
