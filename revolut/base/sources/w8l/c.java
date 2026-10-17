package w8l;

import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vb2.r;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OffboardingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(OffboardingScreen offboardingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = offboardingScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((PlainTextDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        PlainTextDelegate.Model model = (PlainTextDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(model);
        j jVar = (j) fVarE3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.k;
        String str = obj3 instanceof String ? (String) obj3 : null;
        if (str != null) {
            jVar.H2(jVar.f295659q, new r(str, 27));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(v0.a.h(obj3, "list id is not valid - ", " "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
