package a27;

import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f701w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(AtomicReference atomicReference, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f701w = atomicReference;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f701w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            default:
                e eVar2 = new e(this.f701w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        hr6.d dVar = (hr6.d) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(dVar, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AtomicReference atomicReference = this.f701w;
        switch (i) {
            case 0:
                hr6.d dVar = (hr6.d) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (dVar instanceof FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) {
                    od0.i.Companion.getClass();
                    atomicReference.set(od0.h.a(dVar));
                }
                break;
            default:
                hr6.d dVar2 = (hr6.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (dVar2 instanceof hr6.a) {
                    od0.i.Companion.getClass();
                    atomicReference.set(od0.h.a(dVar2));
                }
                break;
        }
        return Unit.f186387a;
    }
}
