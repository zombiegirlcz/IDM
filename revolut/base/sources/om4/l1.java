package om4;

import com.revolut.data.model.Data;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r1 f226630w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226631x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w4l.k f226632y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Continuation continuation, r1 r1Var, String str, w4l.k kVar, int i) {
        super(2, continuation);
        this.u = i;
        this.f226630w = r1Var;
        this.f226631x = str;
        this.f226632y = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                l1 l1Var = new l1(continuation, this.f226630w, this.f226631x, this.f226632y, 0);
                l1Var.v = ((Boolean) obj2).booleanValue();
                return l1Var;
            default:
                l1 l1Var2 = new l1(continuation, this.f226630w, this.f226631x, this.f226632y, 1);
                l1Var2.v = ((Boolean) obj2).booleanValue();
                return l1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        int i = this.u;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
        }
        return ((l1) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        w4l.k loadingStrategy = this.f226632y;
        String facilityId = this.f226631x;
        r1 r1Var = this.f226630w;
        switch (i) {
            case 0:
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z) {
                    dp4.c0 c0Var = r1Var.d;
                    c0Var.getClass();
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                }
                break;
            default:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3) {
                    dp4.c0 c0Var2 = r1Var.d;
                    c0Var2.getClass();
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                }
                break;
        }
        return new go.g(new Data(od0.i.f224256b, null, false, 6, null), 2);
    }
}
