package c5a;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import tof.hc;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f f21484w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21484w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(this.f21484w, continuation, 0);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(this.f21484w, continuation, 1);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(this.f21484w, continuation, 2);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(this.f21484w, continuation, 3);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(this.f21484w, continuation, 4);
                a0Var5.v = obj2;
                return a0Var5;
            case 5:
                a0 a0Var6 = new a0(this.f21484w, continuation, 5);
                a0Var6.v = obj2;
                return a0Var6;
            case 6:
                a0 a0Var7 = new a0(this.f21484w, continuation, 6);
                a0Var7.v = obj2;
                return a0Var7;
            case 7:
                a0 a0Var8 = new a0(this.f21484w, continuation, 7);
                a0Var8.v = obj2;
                return a0Var8;
            case 8:
                a0 a0Var9 = new a0(this.f21484w, continuation, 8);
                a0Var9.v = obj2;
                return a0Var9;
            case 9:
                a0 a0Var10 = new a0(this.f21484w, continuation, 9);
                a0Var10.v = obj2;
                return a0Var10;
            default:
                a0 a0Var11 = new a0(this.f21484w, continuation, 10);
                a0Var11.v = obj2;
                return a0Var11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((NavBarWithContainerBackground) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((a0) create((i5a.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((a0) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((a0) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((a0) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((NavBarMessage) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = this.f21484w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new byi.i(data, 22));
                break;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new byi.i(data2, 23));
                break;
            case 2:
                NavBarWithContainerBackground navBarWithContainerBackground = (NavBarWithContainerBackground) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new d0(navBarWithContainerBackground, 0));
                break;
            case 3:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new bke.t(list, 7));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new byi.i(data3, 24));
                break;
            case 5:
                i5a.a aVar6 = (i5a.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new k0(aVar6, 0));
                break;
            case 6:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                n38.a aVar9 = (n38.a) iVar.f224257a;
                if (aVar9 != null && (str = aVar9.f211924b) != null) {
                    ((mjf.b0) fVar.f80173q).t(new hc(str, null));
                }
                break;
            case 7:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new a09.z((Boolean) rVar.f314201a, ((Boolean) rVar.f314202b).booleanValue(), (List) rVar.f314203c, 14));
                break;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new byi.i(data4, 25));
                break;
            case 9:
                List list2 = (List) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new bke.t(list2, 8));
                break;
            default:
                NavBarMessage navBarMessage = (NavBarMessage) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                fVar.H2(fVar.f80171h0, new ble.f1(navBarMessage, 1));
                break;
        }
        return Unit.f186387a;
    }
}
