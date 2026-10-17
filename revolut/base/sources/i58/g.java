package i58;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.feature.joint.impl.ui.relationship.JointAccountRelationshipScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JointAccountRelationshipScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(JointAccountRelationshipScreen jointAccountRelationshipScreen, Continuation continuation) {
        super(2, continuation);
        this.v = jointAccountRelationshipScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputChecklistDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputChecklistDelegate.Model model = (InputChecklistDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Z.getValue();
        Object obj3 = model.i;
        hVar.getClass();
        j38.a aVar2 = obj3 instanceof j38.a ? (j38.a) obj3 : null;
        if (aVar2 != null) {
            hVar.x2(new i30.a(aVar2, 15));
        }
        return Unit.f186387a;
    }
}
