package bb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.apm.payid.impl.screen.settings.a f14159w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f14160x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Alias alias, com.revolut.feature.apm.payid.impl.screen.settings.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = 2;
        this.f14160x = alias;
        this.f14159w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f14159w, this.f14160x, continuation, 0);
            case 1:
                return new z(this.f14159w, this.f14160x, continuation, 1);
            default:
                return new z(this.f14160x, this.f14159w, continuation);
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

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar2 = this.f14159w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.payid.impl.screen.settings.a.J2(aVar2);
                    r10.w wVar = aVar2.f62735q;
                    this.v = 1;
                    obj2 = wVar.c(this.f14160x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (!nz8.d.l((zz1.e) obj2)) {
                    com.revolut.feature.apm.payid.impl.screen.settings.a.I2(aVar2);
                    return Unit.f186387a;
                }
                aVar2.M2();
                aVar2.K2();
                aVar2.s1();
                return aVar2.X1(new mii.k("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.alias_operation_delete_success_title, null, null, 14), null, null, null, 28));
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar4 = this.f14159w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.apm.payid.impl.screen.settings.a.J2(aVar4);
                    r10.w wVar2 = aVar4.f62735q;
                    this.v = 1;
                    obj2 = wVar2.v(this.f14160x, null, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (!nz8.d.l((zz1.e) obj2)) {
                    com.revolut.feature.apm.payid.impl.screen.settings.a.I2(aVar4);
                    return Unit.f186387a;
                }
                aVar4.M2();
                aVar4.K2();
                aVar4.s1();
                return aVar4.X1(new mii.k("SHOT_DIALOG_ID", new TextLocalisedClause(R$string.alias_creation_success_title, null, null, 14), null, null, null, 28));
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                com.revolut.feature.apm.payid.impl.screen.settings.a aVar6 = this.f14159w;
                Alias alias = this.f14160x;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    zz1.k kVar = new zz1.k(alias.f61878a, alias.f61879b, zz1.j.CREATE);
                    vw1.b bVar = aVar6.o;
                    this.v = 1;
                    if (((uy1.j) bVar).k(kVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                aVar6.C2(new k(alias));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.apm.payid.impl.screen.settings.a aVar, Alias alias, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14159w = aVar;
        this.f14160x = alias;
    }
}
