package o22;

import com.revolut.feature.apm.core.models.alias.AliasType;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import neg.q;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, Continuation continuation) {
        super(1, continuation);
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new l(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((l) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AliasType aliasType;
        String strP;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVar = this.v;
            a aVar2 = (a) ((j2) nVar.u.f22677a).getValue();
            AliasType aliasType2 = aVar2.f221416a;
            AliasType.EMAIL email = AliasType.EMAIL.f61894b;
            boolean zF = Intrinsics.f(aliasType2, email);
            AliasType.PHONE phone = AliasType.PHONE.f61895b;
            if (zF) {
                aliasType = email;
            } else {
                if (!Intrinsics.f(aliasType2, phone)) {
                    throw new IllegalStateException(aliasType2 + " is not supported");
                }
                aliasType = phone;
            }
            if (Intrinsics.f(aliasType2, phone)) {
                b bVar = (b) aVar2.f221417b.getContent();
                strP = p.a.p("+", bVar != null ? bVar.f221420b : null, aVar2.f221418c);
            } else {
                if (!Intrinsics.f(aliasType2, email)) {
                    throw new IllegalStateException(aliasType2 + " is not supported");
                }
                strP = aVar2.d;
            }
            RegisterAlias$Alias registerAlias$Alias = new RegisterAlias$Alias(aliasType, strP);
            com.revolut.feature.apm.core.ui.api.navigation.a aVar3 = nVar.f221428p;
            ApmAliasRegistrationMode apmAliasRegistrationMode = nVar.o.f62245c;
            q qVar = new q(nVar, aVar2, strP, 14);
            this.u = 1;
            if (aVar3.s0(registerAlias$Alias, apmAliasRegistrationMode, qVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
