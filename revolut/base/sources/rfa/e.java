package rfa;

import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.post_activation.impl.ui.flow.a f253741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(com.revolut.feature.post_activation.impl.ui.flow.a aVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f253741w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.f253741w, continuation, 0);
            case 1:
                return new e(this.f253741w, continuation, 1);
            case 2:
                return new e(this.f253741w, continuation, 2);
            default:
                return new e(this.f253741w, continuation, 3);
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
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Continuation continuation = null;
        com.revolut.feature.post_activation.impl.ui.flow.a aVar = this.f253741w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    mfa.b bVar = aVar.f80941p;
                    this.v = 1;
                    if (bVar.f204967a.e(this) == aVar2) {
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
                this.v = 2;
                if (com.revolut.feature.post_activation.impl.ui.flow.a.J2(aVar, this) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    mfa.b bVar2 = aVar.f80941p;
                    this.v = 1;
                    if (bVar2.f204967a.c(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                this.v = 2;
                if (com.revolut.feature.post_activation.impl.ui.flow.a.J2(aVar, this) == aVar3) {
                    return aVar3;
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                int i6 = 0;
                if (i5 == 0) {
                    o.b(obj2);
                    f fVar = new f(aVar, continuation, i6);
                    this.v = 1;
                    if (aVar.p2(this, fVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        NaviCommand naviCommand = (NaviCommand) obj2;
                        Intrinsics.h(naviCommand);
                        aVar.C1(new BridgeDestination(naviCommand));
                        oki.h.D2(aVar.f80948y);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                ufm.i iVarA = com.revolut.retail.feature.api.userauth.navigation.a.a(aVar.u, false, null, 7);
                this.v = 2;
                obj2 = nim.a.b(iVarA, this);
                if (obj2 == aVar4) {
                    return aVar4;
                }
                NaviCommand naviCommand2 = (NaviCommand) obj2;
                Intrinsics.h(naviCommand2);
                aVar.C1(new BridgeDestination(naviCommand2));
                oki.h.D2(aVar.f80948y);
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                try {
                    if (i21 == 0) {
                        o.b(obj2);
                        this.v = 1;
                        obj2 = com.revolut.feature.post_activation.impl.ui.flow.a.I2(aVar, this);
                        if (obj2 == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                    }
                    return (hfa.c) obj2;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                    return null;
                }
        }
    }
}
