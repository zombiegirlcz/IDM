package b0a;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import yhm.o;
import zz9.n;
import zz9.s;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.i implements Function3 {
    public /* synthetic */ vz9.e u;
    public /* synthetic */ boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f11633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f11634x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, boolean z, Continuation continuation) {
        super(3, continuation);
        this.f11633w = sVar;
        this.f11634x = z;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        g gVar = new g(this.f11633w, this.f11634x, (Continuation) obj4);
        gVar.u = (vz9.e) obj2;
        gVar.v = zBooleanValue;
        return gVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        vz9.e eVar = this.u;
        boolean z = this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        s sVar = s.ENABLED;
        boolean z3 = false;
        s sVar2 = this.f11633w;
        boolean z4 = sVar2 == sVar;
        if (sVar2 == s.USER_IS_COMPLETELY_BLOCKED) {
            n.Companion.getClass();
            return n.e;
        }
        if (this.f11634x && z4 && z) {
            z3 = true;
        }
        return new n(eVar, z, z4, z3);
    }
}
