package pjl;

import android.accounts.Account;
import android.os.Bundle;
import com.revolut.sso.api.accounts.RevolutAccount;
import com.revolut.sso.impl.domain.models.RevolutAccountImpl;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z0 f236818w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RevolutAccount f236819x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(RevolutAccount revolutAccount, Continuation continuation, z0 z0Var) {
        super(2, continuation);
        this.u = 0;
        this.f236819x = revolutAccount;
        this.f236818w = z0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j0(this.f236819x, continuation, this.f236818w);
            case 1:
                return new j0(this.f236818w, this.f236819x, continuation, 1);
            default:
                return new j0(this.f236818w, this.f236819x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RevolutAccount revolutAccount = this.f236819x;
        z0 z0Var = this.f236818w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    Account accountO = ksj.b.O(revolutAccount);
                    a aVarG = z0Var.g();
                    Bundle bundle = new Bundle();
                    bundle.putString("USER_DATA_AUTH_OWNER", z0Var.f236872a.getPackageName());
                    cjl.b bVar = ((RevolutAccountImpl) revolutAccount).f106158b;
                    if (bVar != null) {
                        bundle.putString("USER_DATA_ACCOUNT_DIVISION", bVar.a());
                    }
                    z0Var.e.getClass();
                    bundle.putString("USER_DATA_ACCOUNT_VERSION", String.valueOf(2));
                    Unit unit = Unit.f186387a;
                    this.v = 1;
                    if (aVarG.d(accountO, bundle) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                a aVarG2 = z0Var.g();
                Account accountO2 = ksj.b.O(revolutAccount);
                this.v = 1;
                String strB = aVarG2.b(accountO2, "USER_DATA_USER_INFO_USER_ID");
                return strB == aVar2 ? aVar2 : strB;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                Account accountO3 = ksj.b.O(revolutAccount);
                this.v = 1;
                Object objC = z0.c(z0Var, accountO3, this);
                return objC == aVar3 ? aVar3 : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(z0 z0Var, RevolutAccount revolutAccount, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f236818w = z0Var;
        this.f236819x = revolutAccount;
    }
}
