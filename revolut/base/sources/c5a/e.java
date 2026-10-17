package c5a;

import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreen;
import ip0.t80;
import ip0.u80;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatTransferScreen f21489w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ChatTransferScreen chatTransferScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f21489w = chatTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f21489w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f21489w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f21489w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f21489w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f21489w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e(this.f21489w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e(this.f21489w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e(this.f21489w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            default:
                e eVar9 = new e(this.f21489w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((t80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChatTransferScreen chatTransferScreen = this.f21489w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG3 = chatTransferScreen.d();
                Intrinsics.h(str);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG3).N2(str);
                return Unit.f186387a;
            case 1:
                com.revolut.core.ui_kit.delegates.t tVar = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG32 = chatTransferScreen.d();
                Intrinsics.h(tVar);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG32).J2(tVar);
                return Unit.f186387a;
            case 2:
                m mVar = (m) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chatTransferScreen.f80148b0.e();
                rp0.l0 l0Var = chatTransferScreen.O;
                if (l0Var != null) {
                    l0Var.e(mVar.f21512a, mVar.f21513b, mw0.o.VIEW_BOUNDS, new mw0.l(true));
                    return Unit.f186387a;
                }
                Intrinsics.r("popupMenuDialogDisplayer");
                throw null;
            case 3:
                String str2 = (String) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG33 = chatTransferScreen.d();
                Intrinsics.h(str2);
                ((com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG33).M2(str2);
                return Unit.f186387a;
            case 4:
                PopupMenuItem item = (PopupMenuItem) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG34 = chatTransferScreen.d();
                Intrinsics.h(item);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG34;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                fVar.l2(new btk.j(fVar, item, null, 20), new yi5.b(26));
                return Unit.f186387a;
            case 5:
                g5a.r parcel = (g5a.r) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG35 = chatTransferScreen.d();
                Intrinsics.h(parcel);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar2 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG35;
                fVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                fVar2.l2(new btk.j(fVar2, parcel, null, 21), new yi5.b(26));
                return Unit.f186387a;
            case 6:
                u80 clickData = (u80) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG36 = chatTransferScreen.d();
                Intrinsics.h(clickData);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar3 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG36;
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                ((cc7.h) fVar3.f80176t).d3(clickData);
                return Unit.f186387a;
            case 7:
                t80 model = (t80) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG37 = chatTransferScreen.d();
                Intrinsics.h(model);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar4 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG37;
                fVar4.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                ((cc7.h) fVar4.f80176t).c3(model);
                return Unit.f186387a;
            default:
                t80 model2 = (t80) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                t tVarG38 = chatTransferScreen.d();
                Intrinsics.h(model2);
                com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f fVar5 = (com.revolut.feature.payments.who_to_transfer.impl.ui.chats.f) tVarG38;
                fVar5.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                ((cc7.h) fVar5.f80176t).b3(model2);
                return Unit.f186387a;
        }
    }
}
