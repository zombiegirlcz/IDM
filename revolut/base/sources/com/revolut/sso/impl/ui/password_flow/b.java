package com.revolut.sso.impl.ui.password_flow;

import com.revolut.data.model.Data;
import com.revolut.sso.impl.ui.password_flow.PasswordFlowContract$Step;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me9.d;
import me9.e;
import tll.g;
import tll.h;
import tll.j;
import tll.k;
import tll.l;
import tll.m;
import yhm.o;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f106628w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f106628w = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f106628w, continuation);
        bVar.v = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Data data;
        m mVar = (m) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            c cVar = this.f106628w;
            PasswordFlowContract$Step passwordFlowContract$Step = (PasswordFlowContract$Step) cVar.A2().f98430b;
            if (Intrinsics.f(passwordFlowContract$Step, PasswordFlowContract$Step.Passcode.f106624a)) {
                wl0.i iVarA = cVar.v.f298341b.a();
                wl0.i iVar = wl0.i.CUSTOM;
                l lVar = l.f272116a;
                j jVar = j.f272114a;
                tll.i iVar2 = tll.i.f272113a;
                h hVar = h.f272112a;
                k kVar = k.f272115a;
                Object result = null;
                if (iVarA != iVar) {
                    if (!(mVar instanceof g)) {
                        if (Intrinsics.f(mVar, kVar)) {
                            result = d.f204636a;
                        } else {
                            boolean zF = Intrinsics.f(mVar, hVar);
                            result = me9.b.f204634a;
                            if (!zF) {
                                if (Intrinsics.f(mVar, iVar2)) {
                                    c.O2(cVar);
                                } else if (Intrinsics.f(mVar, jVar)) {
                                    result = me9.c.f204635a;
                                } else {
                                    if (!Intrinsics.f(mVar, lVar)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    result = e.f204637a;
                                }
                            }
                        }
                    }
                    if (result != null) {
                        me9.a aVar2 = cVar.f106630w;
                        aVar2.getClass();
                        Intrinsics.checkNotNullParameter(result, "result");
                        aVar2.f204633a.k(result);
                    }
                } else {
                    if (Intrinsics.f(mVar, iVar2)) {
                        c.O2(cVar);
                        data = new Data(oe9.b.f224565a, null, false, 6, null);
                    } else if (mVar instanceof g) {
                        data = null;
                    } else {
                        boolean zF2 = Intrinsics.f(mVar, kVar);
                        oe9.c cVar2 = oe9.c.f224566a;
                        if (zF2 || Intrinsics.f(mVar, hVar)) {
                            data = new Data(cVar2, null, false, 6, null);
                        } else if (Intrinsics.f(mVar, jVar)) {
                            data = new Data(null, null, true, 3, null);
                        } else {
                            if (!Intrinsics.f(mVar, lVar)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            data = new Data(oe9.d.f224567a, null, false, 6, null);
                        }
                    }
                    if (data != null) {
                        oe9.a aVar3 = cVar.f106631x;
                        this.v = null;
                        this.u = 1;
                        if (aVar3.a(data, this) == aVar) {
                            return aVar;
                        }
                    }
                }
            } else if (!Intrinsics.f(passwordFlowContract$Step, PasswordFlowContract$Step.Password.f106625a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
