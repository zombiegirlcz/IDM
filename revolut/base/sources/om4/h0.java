package om4;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f226588w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f226589x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ w4l.k f226590y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(Object obj2, Continuation continuation, Object obj3, String str, w4l.k kVar, int i) {
        super(2, continuation);
        this.u = i;
        this.f226588w = obj2;
        this.z = obj3;
        this.f226589x = str;
        this.f226590y = kVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h0 h0Var = new h0(this.f226588w, continuation, (k0) this.z, this.f226589x, this.f226590y, 0);
                h0Var.v = ((Boolean) obj2).booleanValue();
                return h0Var;
            case 1:
                h0 h0Var2 = new h0(this.f226588w, continuation, (r1) this.z, this.f226589x, this.f226590y, 1);
                h0Var2.v = ((Boolean) obj2).booleanValue();
                return h0Var2;
            default:
                h0 h0Var3 = new h0(this.f226588w, continuation, (x2) this.z, this.f226589x, this.f226590y, 2);
                h0Var3.v = ((Boolean) obj2).booleanValue();
                return h0Var3;
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
        return ((h0) create(bool, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        w4l.k loadingStrategy = this.f226590y;
        String facilityId = this.f226589x;
        Object obj3 = this.z;
        switch (i) {
            case 0:
                k0 k0Var = (k0) obj3;
                boolean z = this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!z) {
                }
                break;
            case 1:
                boolean z3 = this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z3) {
                    dp4.c0 c0Var = ((r1) obj3).d;
                    c0Var.getClass();
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                }
                break;
            default:
                boolean z4 = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (z4) {
                    dp4.c1 c1Var = ((x2) obj3).f226745a;
                    Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                    Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                    ArrayList arrayListA0 = zhm.d0.A0(ll4.s.a(), ll4.s.UNKNOWN);
                    ArrayList arrayList = new ArrayList(zhm.w.t(arrayListA0, 10));
                    Iterator it8 = arrayListA0.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((ll4.s) it8.next()).name());
                    }
                }
                break;
        }
        return new go.g(new Data(this.f226588w, null, false, 6, null), 2);
    }
}
