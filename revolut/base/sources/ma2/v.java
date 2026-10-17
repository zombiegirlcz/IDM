package ma2;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class v extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ Alias v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a f203940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Alias alias, com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = alias;
        this.f203940w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.v, this.f203940w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        com.revolut.feature.apm.payid.impl.screen.createpayid.addpayid.a aVar2 = this.f203940w;
        Alias alias = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AliasType aliasType = alias.f61878a;
            AliasType aliasType2 = AliasType.EMAIL.f61894b;
            if (!Intrinsics.f(aliasType, aliasType2)) {
                aliasType2 = AliasType.PHONE.f61895b;
                if (!Intrinsics.f(aliasType, aliasType2)) {
                    return Unit.f186387a;
                }
            }
            zz1.k kVar = new zz1.k(aliasType2, alias.f61879b, zz1.j.CREATE);
            vw1.b bVar = aVar2.o;
            this.u = 1;
            if (((uy1.j) bVar).k(kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        aVar2.s1();
        aVar2.C2(new g(alias));
        return Unit.f186387a;
    }
}
