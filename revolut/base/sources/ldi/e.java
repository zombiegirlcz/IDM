package ldi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ boolean u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w4l.k f194133w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, w4l.k kVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f194133w = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f194133w, continuation);
        eVar.u = ((Boolean) obj2).booleanValue();
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        return ((e) create(bool, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!z) {
            return new go.g(zi0.c.P(RevPointsPocketState.Inactive.INSTANCE, false, null, 3), 2);
        }
        pdi.k kVar = (pdi.k) this.v.f194134a;
        kVar.getClass();
        w4l.k loadingStrategy = this.f194133w;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return kVar.e.b(Unit.f186387a, loadingStrategy);
    }
}
