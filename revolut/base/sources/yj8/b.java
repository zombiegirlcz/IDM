package yj8;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.junior_profile.impl.ui.screen.gender.JuniorProfileGenderScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorProfileGenderScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JuniorProfileGenderScreen juniorProfileGenderScreen, Continuation continuation) {
        super(2, continuation);
        this.v = juniorProfileGenderScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((SingleChoiceDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SingleChoiceDelegate.Model model = (SingleChoiceDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.S.getValue();
        Intrinsics.h(model);
        h hVar = (h) eVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        hVar.l2(new g(model, null, hVar), new yi5.b(26));
        return Unit.f186387a;
    }
}
