package g8i;

import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.s2;
import com.revolut.feature_move_money.api.model.OrderMode;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreen;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreen;
import com.revolut.feature_move_money.impl.review.edit_note.MoveMoneyEditNoteScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MoveMoneyReviewScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MoveMoneyReviewScreen moveMoneyReviewScreen, Continuation continuation) {
        super(2, continuation);
        this.v = moveMoneyReviewScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.v, continuation);
        jVar.u = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CellDetailsNoteDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsNoteDelegate.Model model = (CellDetailsNoteDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        v vVarT2 = this.v.T2();
        Intrinsics.h(model);
        e0 e0Var = (e0) vVarT2;
        e0Var.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f51871a;
        char c2 = 1;
        if (Intrinsics.f(str, "ID_REVIEW_NOTE_CELL")) {
            q7i.a aVar2 = e0Var.B;
            OrderMode orderMode = ((r) e0Var.t2()).f141388g;
            aVar2.getClass();
            yji.l.j2(e0Var, new MoveMoneyEditNoteScreen(new MoveMoneyEditNoteScreenContract$InputData(q7i.a.a(orderMode))), null, new x(e0Var, c2 == true ? 1 : 0), 1);
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.c cVar = rd0.c.WARNING;
            Intrinsics.checkNotNullParameter(model, "<this>");
            s2 s2Var = model.f51876j;
            boolean z = model.d != null;
            boolean z3 = model.i != null;
            Object obj3 = model.f51877l;
            String name = obj3 != null ? obj3.getClass().getName() : null;
            StringBuilder sb6 = new StringBuilder("CellDetailsNoteDelegate.Model(listId=");
            sb6.append(str);
            sb6.append(", actionState=");
            sb6.append(s2Var);
            sb6.append(", notePresent=");
            t61.a.y(sb6, z, ", actionTextPresent=", z3, ", parcelType=");
            rd0.d.b(cVar, "MoveMoneyReviewScreenModel", j6.a.q("Unknown model: ", v0.a.i(sb6, name, ")")), null, null, 16);
        }
        return Unit.f186387a;
    }
}
