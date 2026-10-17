package i58;

import com.revolut.feature.joint.impl.ui.relationship.JointAccountRelationshipScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ JointAccountRelationshipScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(JointAccountRelationshipScreen jointAccountRelationshipScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = jointAccountRelationshipScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.v, continuation, 0);
            default:
                return new f(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        JointAccountRelationshipScreen jointAccountRelationshipScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jointAccountRelationshipScreen.m2().onBackPressed();
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h hVar = (h) jointAccountRelationshipScreen.Z.getValue();
                j38.a aVar3 = ((a) hVar.t2()).f158782a;
                if (aVar3 == null) {
                    throw new IllegalStateException("relationship should be selected");
                }
                hVar.v2(new b(aVar3));
                return Unit.f186387a;
        }
    }
}
