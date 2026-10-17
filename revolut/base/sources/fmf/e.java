package fmf;

import com.revolut.core.ui_kit.delegates.tc;
import com.revolut.core.ui_kit.delegates.w8;
import com.revolut.core.ui_kit.models.popup.PopupMenuItem;
import com.revolut.feature.transactions.impl.ui.kompot.details.screen.TransactionDetailsScreen;
import ip0.f6;
import ip0.t5;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TransactionDetailsScreen f136386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(TransactionDetailsScreen transactionDetailsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f136386w = transactionDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f136386w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f136386w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f136386w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f136386w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            case 4:
                e eVar5 = new e(this.f136386w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
            case 5:
                e eVar6 = new e(this.f136386w, continuation, 5);
                eVar6.v = obj2;
                return eVar6;
            case 6:
                e eVar7 = new e(this.f136386w, continuation, 6);
                eVar7.v = obj2;
                return eVar7;
            case 7:
                e eVar8 = new e(this.f136386w, continuation, 7);
                eVar8.v = obj2;
                return eVar8;
            case 8:
                e eVar9 = new e(this.f136386w, continuation, 8);
                eVar9.v = obj2;
                return eVar9;
            case 9:
                e eVar10 = new e(this.f136386w, continuation, 9);
                eVar10.v = obj2;
                return eVar10;
            default:
                e eVar11 = new e(this.f136386w, continuation, 10);
                eVar11.v = obj2;
                return eVar11;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((w8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e) create((PopupMenuItem) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((e) create((tc) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((e) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((e) create((f6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((t5) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        List list;
        int i = this.u;
        TransactionDetailsScreen transactionDetailsScreen = this.f136386w;
        switch (i) {
            case 0:
                String itemId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarE3 = transactionDetailsScreen.d();
                Intrinsics.h(itemId);
                n0 n0Var = (n0) f0VarE3;
                n0Var.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (kotlin.text.a0.H(itemId, "ID_THREE_DOTS_MENU", false) && (list = ((e0) ((j2) n0Var.u.f22677a).getValue()).e) != null) {
                    List list2 = list.isEmpty() ? null : list;
                    if (list2 != null) {
                        rp0.l0.f(n0Var.f136403r, itemId, zi0.c.d(list2), null, null, 12);
                    }
                }
                break;
            case 1:
                ty0.a aVar2 = (ty0.a) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(aVar2, "ID_NOTE_DELEGATE_CLAUSE");
                break;
            case 2:
                ty0.a aVar4 = (ty0.a) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(aVar4.d, aVar4.f275445a);
                break;
            case 3:
                w8 w8Var = (w8) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(w8Var.f54900l, w8Var.f54894a);
                break;
            case 4:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(aVar7.d, aVar7.f275445a);
                break;
            case 5:
                PopupMenuItem popupMenuItem = (PopupMenuItem) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0VarE32 = transactionDetailsScreen.d();
                String listId = popupMenuItem.getF55254b();
                Object d = popupMenuItem.getF55256g();
                n0 n0Var2 = (n0) f0VarE32;
                n0Var2.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                n0Var2.l2(new j0(n0Var2, listId, d, null, 2), new yi5.b(26));
                break;
            case 6:
                ty0.a aVar10 = (ty0.a) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(aVar10.d, aVar10.f275445a);
                break;
            case 7:
                tc tcVar = (tc) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(null, tcVar.f54766a);
                break;
            case 8:
                ty0.a aVar13 = (ty0.a) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(aVar13.d, aVar13.f275445a);
                break;
            case 9:
                f6 f6Var = (f6) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(f6Var.f, f6Var.f164196a);
                break;
            default:
                t5 t5Var = (t5) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n0) transactionDetailsScreen.d()).I2(t5Var.e, "ID_DETAILS_ACCOUNT_COPY");
                break;
        }
        return Unit.f186387a;
    }
}
