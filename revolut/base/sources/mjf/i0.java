package mjf;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nif.m2;

/* JADX INFO: loaded from: classes8.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ k0 f206003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(k0 k0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f206003w = k0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f206003w, continuation, 0);
            case 1:
                return new i0(this.f206003w, continuation, 1);
            default:
                return new i0(this.f206003w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((i0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Long l2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xif.u uVar = this.f206003w.f206013c;
                this.v = 1;
                m2 m2VarB = uVar.f306383a.b("APP_VERSION_NAME_ID");
                String str = m2VarB != null ? m2VarB.f215940c : null;
                return str == aVar ? aVar : str;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                xif.u uVar2 = this.f206003w.f206013c;
                this.v = 1;
                m2 m2VarB2 = uVar2.f306383a.b("LOCALE_ID");
                String str2 = m2VarB2 != null ? m2VarB2.f215940c : null;
                return str2 == aVar2 ? aVar2 : str2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    xif.u uVar3 = this.f206003w.f206013c;
                    this.v = 1;
                    m2 m2VarB3 = uVar3.f306383a.b("UPDATE_COMPLETE_STATE_ID");
                    if (m2VarB3 == null || (l2 = m2VarB3.f215939b) == null) {
                        obj2 = null;
                    } else {
                        obj2 = Boolean.valueOf(l2.longValue() > 0);
                    }
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Boolean.valueOf(pd.b.j((Boolean) obj2));
        }
    }
}
