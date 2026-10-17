package hu1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.blik.api.R$string;
import com.revolut.feature.apm.core.models.blik.BlikCode;
import et6.m0;
import et6.r1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e0 f155544w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(e0 e0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f155544w = e0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f155544w, continuation, 0);
            case 1:
                return new z(this.f155544w, continuation, 1);
            case 2:
                return new z(this.f155544w, continuation, 2);
            case 3:
                return new z(this.f155544w, continuation, 3);
            default:
                return new z(this.f155544w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var = this.f155544w;
                    BlikCode blikCode = (BlikCode) ((o) e0Var.t2()).f155532a.getContent();
                    if (blikCode == null) {
                        return null;
                    }
                    c70.a.b(e0Var.f155515s, null, blikCode.f61926b, false, 5);
                    e0Var.X1(new mii.i("BLIK_COPIED_SHOT_DIALOG_ID", new TextLocalisedClause(R$string.blik_home_copy_code_title, null, null, 14), null, null, 28));
                    eu1.h hVar = (eu1.h) e0Var.f155513q;
                    hVar.getClass();
                    Intrinsics.checkNotNullParameter(blikCode, "blikCode");
                    xt1.d dVar = hVar.f129469a;
                    Intrinsics.checkNotNullParameter(blikCode, "blikCode");
                    pfm.a aVarV = ue0.e.v(te0.w.g0(dVar.f308742a.blikCodeCopied(blikCode.f61925a, blikCode.f61928g)));
                    this.v = 1;
                    if (nim.a.a(aVarV, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                e0 e0Var2 = this.f155544w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    eu1.a aVar3 = e0Var2.f155513q;
                    xi0.b currency = e0Var2.f155512p.f61665a;
                    eu1.h hVar2 = (eu1.h) aVar3;
                    hVar2.getClass();
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    xt1.d dVar2 = hVar2.f129469a;
                    Intrinsics.checkNotNullParameter(currency, "currency");
                    efm.d0<zt1.a> d0VarRefreshBlikCode = dVar2.f308742a.refreshBlikCode("BLIK", currency.f306286a);
                    xt1.a aVar4 = new xt1.a(5, new xrl.a(16));
                    d0VarRefreshBlikCode.getClass();
                    ufm.i iVar = new ufm.i(d0VarRefreshBlikCode, aVar4, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.i iVar2 = new ufm.i(te0.w.i0(iVar), new m0(5, new r1(18)), 1);
                    Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
                    pfm.z zVarI = ue0.e.I(iVar2, zhm.h0.f322473a, new r1(19));
                    this.v = 1;
                    obj2 = nim.a.b(zVarI, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                Data data = (Data) obj2;
                Intrinsics.h(data);
                e0Var2.x2(new hm3.b(data, e0Var2, 27));
                return Unit.f186387a;
            case 2:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    e0 e0Var3 = this.f155544w;
                    z zVar = new z(e0Var3, null, 1);
                    this.v = 1;
                    if (u0.b0(e0Var3.X(), "REFRESH_BLIK_CODE_LIST_ID", zVar, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var4 = this.f155544w;
                eu1.a aVar7 = e0Var4.f155513q;
                String str = ((o) e0Var4.t2()).i;
                this.v = 1;
                Object objE = ((eu1.h) aVar7).e(str, this);
                return objE == aVar6 ? aVar6 : objE;
            default:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                e0 e0Var5 = this.f155544w;
                z zVar2 = new z(e0Var5, null, 3);
                this.v = 1;
                Object objT = do3.q.t(e0Var5, zVar2, this);
                return objT == aVar8 ? aVar8 : objT;
        }
    }
}
