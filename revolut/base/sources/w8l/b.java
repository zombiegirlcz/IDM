package w8l;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.shared.feature.offboarding.api.domain.model.OffboardingScreenAction;
import com.revolut.shared.feature.offboarding.impl.ui.home.OffboardingScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ OffboardingScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(OffboardingScreen offboardingScreen, Continuation continuation) {
        super(2, continuation);
        this.v = offboardingScreen;
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVarE3 = this.v.R2();
        Intrinsics.h(model);
        j jVar = (j) fVarE3;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        OffboardingScreenAction offboardingScreenAction = obj3 instanceof OffboardingScreenAction ? (OffboardingScreenAction) obj3 : null;
        String str = offboardingScreenAction != null ? offboardingScreenAction.e : null;
        if (str == null) {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(obj3, "Model doesn't contain of expected parcel. Was: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "OffboardingScreenModel", null, illegalStateException, h0Var);
        } else {
            jVar.n2(new i(jVar, str, null), new whi.b(6));
        }
        return Unit.f186387a;
    }
}
