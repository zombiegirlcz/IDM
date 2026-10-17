package cb2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.payid.api.R$string;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import r10.w;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f22709w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Alias f22710x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, Alias alias, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f22709w = mVar;
        this.f22710x = alias;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f22709w, this.f22710x, continuation, 0);
            default:
                return new j(this.f22709w, this.f22710x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((j) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                m mVar = this.f22709w;
                if (i == 0) {
                    o.b(obj2);
                    w wVar = mVar.f22715p;
                    this.v = 1;
                    obj2 = wVar.d(this.f22710x, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (nz8.d.l((zz1.e) obj2)) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.alias_operation_freeze_success_title, null, null, 14);
                    this.v = 2;
                    if (m.I2(mVar, textLocalisedClause, this) == aVar) {
                        return aVar;
                    }
                } else {
                    m.J2(mVar);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                m mVar2 = this.f22709w;
                if (i2 == 0) {
                    o.b(obj2);
                    w wVar2 = mVar2.f22715p;
                    this.v = 1;
                    obj2 = wVar2.A(this.f22710x, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                if (nz8.d.l((zz1.e) obj2)) {
                    TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.alias_operation_unfreeze_success_title, null, null, 14);
                    this.v = 2;
                    if (m.I2(mVar2, textLocalisedClause2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    m.J2(mVar2);
                }
                return Unit.f186387a;
        }
    }
}
