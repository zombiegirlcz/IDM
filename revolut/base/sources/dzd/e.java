package dzd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.impl.ui.consolidated.bank_id.BankIDAnnualStatementsScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import ryd.w;
import uyd.h0;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankIDAnnualStatementsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankIDAnnualStatementsScreen bankIDAnnualStatementsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankIDAnnualStatementsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.Q.getValue();
        Intrinsics.h(model);
        g gVar = (g) bVar;
        zxd.c cVar = gVar.o;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        Integer num = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            boolean zH = a0.H(str, "SUMMARISED_ANNUAL_REPORT_PREFIX_", false);
            w4l.h hVar = w4l.h.f294642c;
            if (zH) {
                w wVar = (w) cVar;
                gVar.I2(w.m(wVar, ((h0) wVar.f258357a).B.b(new uyd.e(iIntValue, StatementsFormat.PDF), hVar)));
            }
            if (a0.H(str, "DETAILED_ANNUAL_REPORT_PREFIX_", false)) {
                w wVar2 = (w) cVar;
                gVar.I2(w.m(wVar2, ((h0) wVar2.f258357a).C.b(new uyd.e(iIntValue, StatementsFormat.PDF), hVar)));
            }
        }
        return Unit.f186387a;
    }
}
