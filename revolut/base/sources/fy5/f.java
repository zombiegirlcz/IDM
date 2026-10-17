package fy5;

import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import fv6.r;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f138916w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m mVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f138916w = mVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f138916w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            case 1:
                f fVar2 = new f(this.f138916w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
            default:
                f fVar3 = new f(this.f138916w, continuation, 2);
                fVar3.v = obj2;
                return fVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        int i = this.u;
        m mVar = this.f138916w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mVar.d3(new fpk.b((qta.f) pair.f186386b, (Data) pair.f186385a, 17));
                break;
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                mVar.d3(new r(data, 11));
                break;
            default:
                g6 g6Var = (g6) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.h(g6Var);
                Iterator<E> it8 = qta.f.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((qta.f) next).name(), g6Var.f54199a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                qta.f selectedPeriod = (qta.f) next;
                if (selectedPeriod == null) {
                    selectedPeriod = qta.f.DAY;
                }
                jy5.b bVar = (jy5.b) mVar.o;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(selectedPeriod, "duration");
                gy5.a aVar4 = bVar.f179327a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
                aVar4.f147831a.setValue(selectedPeriod);
                break;
        }
        return Unit.f186387a;
    }
}
