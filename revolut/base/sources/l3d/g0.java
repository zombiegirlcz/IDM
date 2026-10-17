package l3d;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n4d.r0;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends gim.i implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public /* synthetic */ Object u;
    public final /* synthetic */ h0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ogd.a f191906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ List f191907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Integer f191908y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(h0 h0Var, ogd.a aVar, List list, Integer num, boolean z, boolean z3, boolean z4, Continuation continuation) {
        super(2, continuation);
        this.v = h0Var;
        this.f191906w = aVar;
        this.f191907x = list;
        this.f191908y = num;
        this.z = z;
        this.A = z3;
        this.B = z4;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g0 g0Var = new g0(this.v, this.f191906w, this.f191907x, this.f191908y, this.z, this.A, this.B, continuation);
        g0Var.u = obj2;
        return g0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list = (List) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String assetsOrderingKey = this.f191906w.f225102a;
        Intrinsics.checkNotNullParameter(assetsOrderingKey, "assetsOrderingKey");
        h0 h0Var = this.v;
        r0 r0Var = h0Var.f191909a;
        Intrinsics.checkNotNullParameter(assetsOrderingKey, "assetsOrderingKey");
        String strE = r0.e(assetsOrderingKey);
        return vkm.q.Q(strE != null ? new v1(new mtj.i((String) r0Var.f212399g.a(new tk0.d(strE)), r0Var, strE, (Continuation) null)) : vkm.i.f290039a, new e0(null, list, this.f191907x, h0Var, this.f191906w, this.f191908y, this.z, this.A, this.B));
    }
}
