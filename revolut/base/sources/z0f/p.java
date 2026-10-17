package z0f;

import com.revolut.domain.models.topup.methods.TopupMethod;
import com.revolut.feature.topup_screen.impl.screens.topup_methods.TopupMethodsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class p extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        TopupMethod.StoredMethod method = (TopupMethod.StoredMethod) obj2;
        y yVar = (y) this.receiver;
        KProperty[] kPropertyArr = TopupMethodsScreen.U;
        f0 f0Var = (f0) yVar;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(method, "method");
        f0Var.C2(new u(method, ((q) ((j2) f0Var.A.f22677a).getValue()).f318275c));
        return Unit.f186387a;
    }
}
