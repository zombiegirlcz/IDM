package c5a;

import com.revolut.core.ui_kit.models.navbar.NavBarMessage;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.Rev10ChatTransferScreen;
import ip0.t80;
import ip0.u80;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Rev10ChatTransferScreen f21544w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(Rev10ChatTransferScreen rev10ChatTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21544w = rev10ChatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z0 z0Var = new z0(this.f21544w, continuation, 0);
                z0Var.v = obj2;
                return z0Var;
            case 1:
                z0 z0Var2 = new z0(this.f21544w, continuation, 1);
                z0Var2.v = obj2;
                return z0Var2;
            case 2:
                z0 z0Var3 = new z0(this.f21544w, continuation, 2);
                z0Var3.v = obj2;
                return z0Var3;
            case 3:
                z0 z0Var4 = new z0(this.f21544w, continuation, 3);
                z0Var4.v = obj2;
                return z0Var4;
            case 4:
                z0 z0Var5 = new z0(this.f21544w, continuation, 4);
                z0Var5.v = obj2;
                return z0Var5;
            case 5:
                z0 z0Var6 = new z0(this.f21544w, continuation, 5);
                z0Var6.v = obj2;
                return z0Var6;
            case 6:
                z0 z0Var7 = new z0(this.f21544w, continuation, 6);
                z0Var7.v = obj2;
                return z0Var7;
            case 7:
                z0 z0Var8 = new z0(this.f21544w, continuation, 7);
                z0Var8.v = obj2;
                return z0Var8;
            case 8:
                z0 z0Var9 = new z0(this.f21544w, continuation, 8);
                z0Var9.v = obj2;
                return z0Var9;
            case 9:
                z0 z0Var10 = new z0(this.f21544w, continuation, 9);
                z0Var10.v = obj2;
                return z0Var10;
            case 10:
                z0 z0Var11 = new z0(this.f21544w, continuation, 10);
                z0Var11.v = obj2;
                return z0Var11;
            case 11:
                z0 z0Var12 = new z0(this.f21544w, continuation, 11);
                z0Var12.v = obj2;
                return z0Var12;
            case 12:
                z0 z0Var13 = new z0(this.f21544w, continuation, 12);
                z0Var13.v = obj2;
                return z0Var13;
            default:
                z0 z0Var14 = new z0(this.f21544w, continuation, 13);
                z0Var14.v = obj2;
                return z0Var14;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((z0) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        Rev10ChatTransferScreen rev10ChatTransferScreen = this.f21544w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG3 = rev10ChatTransferScreen.d();
                Intrinsics.h(str);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG3).N2(str);
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG32 = rev10ChatTransferScreen.d();
                Intrinsics.h(tVar);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG32).J2(tVar);
                return Unit.f186387a;
            case 2:
                NavBarMessage message = (NavBarMessage) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG33 = rev10ChatTransferScreen.d();
                Intrinsics.h(message);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG33;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                fVar.S.b3(message);
                return Unit.f186387a;
            case 3:
                NavBarMessage message2 = (NavBarMessage) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG34 = rev10ChatTransferScreen.d();
                Intrinsics.h(message2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG34;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(message2, "message");
                fVar2.S.c3(message2);
                return Unit.f186387a;
            case 4:
                String str2 = (String) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG35 = rev10ChatTransferScreen.d();
                Intrinsics.h(str2);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG35).M2(str2);
                return Unit.f186387a;
            case 5:
                String str3 = (String) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG36 = rev10ChatTransferScreen.d();
                Intrinsics.h(str3);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG36).N2(str3);
                return Unit.f186387a;
            case 6:
                String str4 = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG37 = rev10ChatTransferScreen.d();
                Intrinsics.h(str4);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG37).M2(str4);
                return Unit.f186387a;
            case 7:
                String str5 = (String) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG38 = rev10ChatTransferScreen.d();
                Intrinsics.h(str5);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG38).N2(str5);
                return Unit.f186387a;
            case 8:
                m mVar = (m) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rev10ChatTransferScreen.f80159e0.e();
                rp0.l0 l0Var = rev10ChatTransferScreen.Q;
                if (l0Var != null) {
                    l0Var.e(mVar.f21512a, mVar.f21513b, mw0.o.VIEW_BOUNDS, new mw0.l(true));
                    return Unit.f186387a;
                }
                Intrinsics.r("popupMenuDialogDisplayer");
                throw null;
            case 9:
                PopupMenuItem item = (PopupMenuItem) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG39 = rev10ChatTransferScreen.d();
                Intrinsics.h(item);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG39;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                fVar3.l2(new btk.j(fVar3, item, null, 20), new yi5.b(26));
                return Unit.f186387a;
            case 10:
                g5a.r parcel = (g5a.r) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG310 = rev10ChatTransferScreen.d();
                Intrinsics.h(parcel);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG310;
                fVar4.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                fVar4.l2(new btk.j(fVar4, parcel, null, 21), new yi5.b(26));
                return Unit.f186387a;
            case 11:
                u80 clickData = (u80) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG311 = rev10ChatTransferScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG311;
                fVar5.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((cc7.h) fVar5.f80176t).d3(clickData);
                return Unit.f186387a;
            case 12:
                t80 model = (t80) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG312 = rev10ChatTransferScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar6 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG312;
                fVar6.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                ((cc7.h) fVar6.f80176t).c3(model);
                return Unit.f186387a;
            default:
                t80 model2 = (t80) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG313 = rev10ChatTransferScreen.d();
                Intrinsics.h(model2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar7 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG313;
                fVar7.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                ((cc7.h) fVar7.f80176t).b3(model2);
                return Unit.f186387a;
        }
    }
}
