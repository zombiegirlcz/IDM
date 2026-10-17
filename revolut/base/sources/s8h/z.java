package s8h;

import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f261048w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f261049x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261048w = b0Var;
        this.f261049x = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f261048w, this.f261049x, continuation, 0);
            default:
                return new z(this.f261048w, this.f261049x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Object obj3 = null;
                Object[] objArr = 0;
                if (i == 0) {
                    yhm.o.b(obj2);
                    vkm.y yVarE = rd0.e.e(nz8.d.h(((yhl.f) this.f261048w.f260995a).c(w4l.h.f294642c), new g3e.s(26), new s6d.r(25)), zhm.h0.f322473a, new nfj.i(3, 18, objArr == true ? 1 : 0));
                    this.v = 1;
                    obj2 = vkm.q.z(yVarE, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list = (List) obj2;
                if (list == null) {
                    return null;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((ScreenerCollection) next).f105154a, this.f261049x)) {
                            obj3 = next;
                        }
                    }
                }
                return (ScreenerCollection) obj3;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Object obj4 = null;
                Object[] objArr2 = 0;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    vkm.y yVarE2 = rd0.e.e(nz8.d.h(((yhl.f) this.f261048w.f260995a).c(w4l.h.f294642c), new g3e.s(26), new s6d.r(26)), zhm.h0.f322473a, new nfj.i(3, 19, objArr2 == true ? 1 : 0));
                    this.v = 1;
                    obj2 = vkm.q.z(yVarE2, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                List list2 = (List) obj2;
                if (list2 == null) {
                    return null;
                }
                Iterator it9 = list2.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        Object next2 = it9.next();
                        if (Intrinsics.f(((ScreenerCollection) next2).f105154a, this.f261049x)) {
                            obj4 = next2;
                        }
                    }
                }
                return (ScreenerCollection) obj4;
        }
    }
}
