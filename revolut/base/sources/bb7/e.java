package bb7;

import b94.s;
import com.revolut.data.model.Data;
import gim.i;
import ke9.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b f14179w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ke9.i f14180x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b bVar, ke9.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f14179w = bVar;
        this.f14180x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f14179w, this.f14180x, continuation, 0);
            default:
                return new e(this.f14179w, this.f14180x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objA;
        Object objA2;
        int i = this.u;
        ke9.i iVar = this.f14180x;
        com.revolut.feature.hidden_accounts.impl.ui.biometric_authentication.b bVar = this.f14179w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    s sVar = new s(iVar, bVar, null, 3);
                    this.v = 1;
                    if (bVar.p2(this, sVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    String str = ((g) iVar).f183056a;
                    this.v = 1;
                    try {
                        m.Companion companion = m.INSTANCE;
                        objA = Boolean.valueOf(Intrinsics.f(bVar.f74658r.h(), str));
                    } catch (Throwable th10) {
                        m.Companion companion2 = m.INSTANCE;
                        objA = o.a(th10);
                    }
                    Object obj3 = Boolean.FALSE;
                    if (objA instanceof n) {
                        objA = obj3;
                    }
                    if (((Boolean) objA).booleanValue()) {
                        objA2 = bVar.I2(this);
                        if (objA2 != fim.a.COROUTINE_SUSPENDED) {
                            objA2 = Unit.f186387a;
                        }
                    } else {
                        objA2 = bVar.f74659s.a(new Data(oe9.b.f224565a, null, false, 6, null), this);
                        if (objA2 != fim.a.COROUTINE_SUSPENDED) {
                            objA2 = Unit.f186387a;
                        }
                    }
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                    break;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
