package i0e;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.z1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class k extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        q qVar = (q) ((g) this.receiver);
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        z1 z1Var = qVar.f157386s;
        Unit unit = Unit.f186387a;
        z1Var.k(unit);
        return unit;
    }
}
