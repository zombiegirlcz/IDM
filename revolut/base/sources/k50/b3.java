package k50;

import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes19.dex */
public final class b3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181034w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b3(int i, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f181034w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b3(0, this.f181034w, continuation);
            case 1:
                return new b3(1, this.f181034w, continuation);
            case 2:
                return new b3(2, this.f181034w, continuation);
            case 3:
                return new b3(3, this.f181034w, continuation);
            case 4:
                return new b3(4, this.f181034w, continuation);
            case 5:
                return new b3(5, this.f181034w, continuation);
            case 6:
                return new b3(6, this.f181034w, continuation);
            case 7:
                return new b3(7, this.f181034w, continuation);
            case 8:
                return new b3(8, this.f181034w, continuation);
            case 9:
                return new b3(9, this.f181034w, continuation);
            default:
                return new b3(10, this.f181034w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Exception {
        int i = this.u;
        Continuation continuation = null;
        j4 j4Var = this.f181034w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        if (((h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue()).f181079a == null) {
                            this.v = 1;
                            if (j4Var.Y2(null, this) == aVar) {
                                return aVar;
                            }
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    break;
                } catch (Exception e) {
                    if (e instanceof CancellationException) {
                        throw e;
                    }
                    RuntimeException runtimeException = new RuntimeException("Failed to load chat", e);
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, runtimeException, h0Var);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    Flow flowQ = vkm.q.q(com.google.crypto.tink.shaded.protobuf.t1.e(j4Var.f181127k0, new l2(20)));
                    e3 e3Var = new e3(i2, j4Var, continuation);
                    this.v = 1;
                    if (vkm.q.o(flowQ, e3Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    vkm.t0 t0Var = new vkm.t0(j4Var.f181140w0.B(new l2(26)), 1);
                    this.v = 1;
                    if (vkm.q.x(t0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                p2 p2Var = j4.Companion;
                return j4Var.X2();
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o3 o3Var = new o3(0, j4Var, continuation);
                this.v = 1;
                p2 p2Var2 = j4.Companion;
                Object objB = pu7.a.B(j4Var.k, "task_cancel_request", o3Var, this);
                return objB == aVar4 ? aVar4 : objB;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    UUID uuid = ((h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue()).f181079a;
                    if (uuid == null) {
                        return Unit.f186387a;
                    }
                    pfm.r rVarK = j4Var.f181136t.k("chat.action.need-more-help", j4Var.f181130p.getContext().getString(R$string.chat_messages_need_more_help), uuid);
                    this.v = 1;
                    if (nim.a.a(rVarK, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                cli.y yVar = j4Var.f181140w0;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    UUID uuid2 = ((h0) ((vkm.j2) yVar.f22677a).getValue()).f181079a;
                    if (uuid2 == null) {
                        return Unit.f186387a;
                    }
                    pfm.r rVarK2 = j4Var.f181136t.k("chat.action.chat-with-a-live-agent", j4Var.Q.b(new TextLocalisedClause(R$string.chat_messages_live_agent, null, null, 14)).toString(), uuid2);
                    this.v = 1;
                    if (nim.a.a(rVarK2, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                j4Var.H2(yVar, new l2(27));
                return Unit.f186387a;
            case 6:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    oji.j jVar = j4Var.l0;
                    t3 t3Var = new t3(j4Var, null);
                    this.v = 1;
                    if (jVar.a(t3Var, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 7:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                int i43 = this.v;
                if (i43 == 0) {
                    yhm.o.b(obj2);
                    oji.j jVar2 = j4Var.m0;
                    e3 e3Var2 = new e3(5, j4Var, continuation);
                    this.v = 1;
                    if (jVar2.a(e3Var2, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 8:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                int i59 = this.v;
                if (i59 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (j4.N2(j4Var, this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i59 != 1) {
                        if (i59 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                this.v = 2;
                if (j4.M2(j4Var, this) == aVar9) {
                    return aVar9;
                }
                return Unit.f186387a;
            case 9:
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                int i66 = this.v;
                if (i66 == 0) {
                    yhm.o.b(obj2);
                    e3 e3Var3 = new e3(6, j4Var, continuation);
                    this.v = 1;
                    p2 p2Var3 = j4.Companion;
                    if (j4Var.W2(e3Var3, this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i66 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                int i74 = this.v;
                if (i74 != 0) {
                    if (i74 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                o3 o3Var2 = new o3(i2, j4Var, continuation);
                this.v = 1;
                p2 p2Var4 = j4.Companion;
                Object objB2 = pu7.a.B(j4Var.k, "refresh_suggestions", o3Var2, this);
                return objB2 == aVar11 ? aVar11 : objB2;
        }
    }
}
