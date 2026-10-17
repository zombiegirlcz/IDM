package ho8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_settings.impl.ui_kompot.coparents.CoparentsSettingsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CoparentsSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CoparentsSettingsScreen coparentsSettingsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = coparentsSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        FullScreenStateDelegate.Model item = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.Y.getValue();
        Intrinsics.h(item);
        j jVar = (j) fVar;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        if (Intrinsics.f(item.f52373a, "ERROR_STATE_ID")) {
            jVar.f154255y.onNext(Unit.f186387a);
        }
        return Unit.f186387a;
    }
}
