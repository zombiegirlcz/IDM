package d19;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.licenses.impl.ui.licenses.LicensesController;
import com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LicensesController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LicensesController licensesController, Continuation continuation) {
        super(2, continuation);
        this.v = licensesController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        Object obj3 = model.u;
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.licenses.impl.ui.licenses.model.LicenseItem");
        ((f) ((d) this.v.Q.getValue())).I2((LicenseItem) obj3);
        return Unit.f186387a;
    }
}
