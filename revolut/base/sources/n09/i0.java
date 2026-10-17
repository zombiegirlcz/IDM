package n09;

import aqd.n1;
import com.revolut.retail.feature.crypto.disclaimer.api.CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m0 f210944w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(m0 m0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f210944w = m0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i0(this.f210944w, continuation, 0);
            case 1:
                return new i0(this.f210944w, continuation, 1);
            default:
                return new i0(this.f210944w, continuation, 2);
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
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m0 m0Var = this.f210944w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ufm.i iVarF = ((cpj.b) ((myj.g) m0Var.f210960s).f210550a.f210547a).f(yoj.c.LEARN_GLOSSARY, yoj.d.DISABLED);
                    this.v = 1;
                    obj2 = nim.a.b(iVarF, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                m0Var.x2(new n1(11, (Boolean) obj2));
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m0 m0Var2 = this.f210944w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    dz8.f fVar = m0Var2.f210960s;
                    this.v = 1;
                    obj2 = ((myj.g) fVar).a(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                m0Var2.x2(new mll.h((String) obj2, 8));
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                m0 m0Var3 = this.f210944w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    dz8.f fVar2 = m0Var3.f210960s;
                    this.v = 1;
                    obj2 = Boolean.valueOf(((jte.d) ((myj.g) fVar2).f210552c).c(CryptoDisclaimerApi$Toggles$CryptoBrazilExpansion.f100018c));
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                m0Var3.x2(new lph.c(((Boolean) obj2).booleanValue(), 11));
                return Unit.f186387a;
        }
    }
}
