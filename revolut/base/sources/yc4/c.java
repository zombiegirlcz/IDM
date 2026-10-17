package yc4;

import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.KontomatikSignInController;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KontomatikSignInController f312512b;

    public /* synthetic */ c(KontomatikSignInController kontomatikSignInController, int i) {
        this.f312511a = i;
        this.f312512b = kontomatikSignInController;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.f312511a;
        KontomatikSignInController kontomatikSignInController = this.f312512b;
        String exception = (String) obj2;
        String str = (String) obj3;
        switch (i) {
            case 0:
                ((Boolean) obj4).getClass();
                KProperty[] kPropertyArr = KontomatikSignInController.U;
                Intrinsics.checkNotNullParameter(exception, "exception");
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) kontomatikSignInController.e3()).I2(new g(exception));
                break;
            default:
                KProperty[] kPropertyArr2 = KontomatikSignInController.U;
                Intrinsics.checkNotNullParameter(exception, "<unused var>");
                Intrinsics.checkNotNullParameter(str, "<unused var>");
                Intrinsics.checkNotNullParameter((String) obj4, "<unused var>");
                ((com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.sign_in.a) kontomatikSignInController.e3()).I2(l.f312523a);
                break;
        }
        return Unit.f186387a;
    }
}
