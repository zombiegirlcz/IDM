package m1a;

import com.revolut.domain.models.moneyrequest.SplitPayerType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function2 {
    public v61.f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f201308w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ v61.f f201309x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ i f201310y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(v61.f fVar, i iVar, Continuation continuation) {
        super(2, continuation);
        this.f201309x = fVar;
        this.f201310y = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.f201309x, this.f201310y, continuation);
        gVar.f201308w = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        v61.f fVar;
        Throwable th10;
        Object objB;
        Object objA;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            v61.f fVar2 = this.f201309x;
            i iVar = this.f201310y;
            try {
                m.Companion companion = yhm.m.INSTANCE;
                o oVar = iVar.f201313a;
                this.f201308w = null;
                this.u = fVar2;
                this.v = 1;
                SplitPayerType splitPayerType = fVar2.f286283a;
                String str = fVar2.f286284b;
                int i2 = j.f201316a[splitPayerType.ordinal()];
                if (i2 == 1) {
                    objB = oVar.b(str, this);
                } else if (i2 == 2 || i2 == 3) {
                    objB = oVar.c(str, this);
                } else if (i2 == 4) {
                    objB = oVar.d(str, this);
                } else {
                    if (i2 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objB = null;
                }
                if (objB == aVar) {
                    return aVar;
                }
                fVar = fVar2;
                obj2 = objB;
            } catch (Throwable th11) {
                fVar = fVar2;
                th10 = th11;
                m.Companion companion2 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.u;
            try {
                yhm.o.b(obj2);
            } catch (Throwable th12) {
                th10 = th12;
                m.Companion companion22 = yhm.m.INSTANCE;
                objA = yhm.o.a(th10);
            }
        }
        objA = (SplitMemberType.SplitMember) obj2;
        m.Companion companion3 = yhm.m.INSTANCE;
        Throwable thA = yhm.m.a(objA);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Failed to resolve payer", thA);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return new Pair(fVar, objA instanceof yhm.n ? null : objA);
    }
}
