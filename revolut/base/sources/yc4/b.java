package yc4;

import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import dw3.u3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KontomatikSignInController f312510b;

    public /* synthetic */ b(KontomatikSignInController kontomatikSignInController, int i) {
        this.f312509a = i;
        this.f312510b = kontomatikSignInController;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f312509a;
        KontomatikSignInController kontomatikSignInController = this.f312510b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = KontomatikSignInController.U;
                return (mc4.i) ((u3) kontomatikSignInController.Q.getValue()).f119902b.v.get();
            case 1:
                KProperty[] kPropertyArr2 = KontomatikSignInController.U;
                return (v) ((u3) kontomatikSignInController.Q.getValue()).f.get();
            case 2:
                KProperty[] kPropertyArr3 = KontomatikSignInController.U;
                return n14.e.a(kontomatikSignInController, kontomatikSignInController.e3());
            default:
                KProperty[] kPropertyArr4 = KontomatikSignInController.U;
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) kontomatikSignInController.e3()).I2(m.f312524a);
                return Unit.f186387a;
        }
    }
}
