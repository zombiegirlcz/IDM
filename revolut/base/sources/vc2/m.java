package vc2;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.qvik.impl.ui.settings.QvikSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ QvikSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(QvikSettingsScreen qvikSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = qvikSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.v, continuation);
        mVar.u = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        d dVarD = this.v.d();
        Intrinsics.h(model);
        u uVar = (u) dVarD;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof o02.e) {
            o02.e eVar = (o02.e) obj3;
            o02.c cVar = eVar.f221101b;
            Continuation continuation = null;
            o02.a kind = new o02.a(!((cVar instanceof o02.a ? (o02.a) cVar : null) != null ? r8.f221098a : false));
            o02.d name = eVar.f221100a;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(kind, "kind");
            uVar.l2(new uvf.b(uVar, new o02.e(name, kind), eVar, continuation, 16), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
