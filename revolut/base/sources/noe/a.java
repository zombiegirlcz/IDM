package noe;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njj.n0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a extends kotlin.jvm.internal.a implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) obj2;
        k kVar = (k) ((d) this.receiver);
        kVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        kVar.l2(new n0(14, (Continuation) null, kVar), new yi5.b(26));
        return Unit.f186387a;
    }
}
