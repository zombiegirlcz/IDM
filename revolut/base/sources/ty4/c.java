package ty4;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.credit.direct.debit.account_selection.DirectDebitAccountSelectionScreen;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionParcel;
import com.revolut.feature.credit.direct.debit.account_selection.models.DirectDebitPreviousMandate;
import com.revolut.feature.credit.direct.debit.account_selection.models.LinkedPocketInfo;
import com.revolut.feature.credit.direct.debit.account_selection.models.PocketInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ DirectDebitAccountSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DirectDebitAccountSelectionScreen directDebitAccountSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = directDebitAccountSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        j jVar = (j) this.v.Y.getValue();
        Intrinsics.h(model);
        o oVar = (o) jVar;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f53228a;
        Object obj3 = model.u;
        if (Intrinsics.f(str, "linked_account_item_list_id")) {
            AccountSelectionParcel accountSelectionParcel = obj3 instanceof AccountSelectionParcel ? (AccountSelectionParcel) obj3 : null;
            PocketInfo pocketInfo = accountSelectionParcel != null ? accountSelectionParcel.f69890a : null;
            LinkedPocketInfo linkedPocketInfo = pocketInfo instanceof LinkedPocketInfo ? (LinkedPocketInfo) pocketInfo : null;
            if (linkedPocketInfo != null) {
                oVar.y2(linkedPocketInfo.f69900b);
            }
        } else if (Intrinsics.f(str, "recently_used_item_list_id")) {
            AccountSelectionParcel accountSelectionParcel2 = obj3 instanceof AccountSelectionParcel ? (AccountSelectionParcel) obj3 : null;
            PocketInfo pocketInfo2 = accountSelectionParcel2 != null ? accountSelectionParcel2.f69890a : null;
            DirectDebitPreviousMandate directDebitPreviousMandate = pocketInfo2 instanceof DirectDebitPreviousMandate ? (DirectDebitPreviousMandate) pocketInfo2 : null;
            if (directDebitPreviousMandate != null) {
                io3.d dVar = directDebitPreviousMandate.f69896c;
                if (dVar == null) {
                    oVar.v2(new e(new py4.a(directDebitPreviousMandate.f69894a, directDebitPreviousMandate.f69897g, directDebitPreviousMandate.f69898h, directDebitPreviousMandate.i)));
                } else {
                    oVar.y2(dVar);
                }
            }
        }
        return Unit.f186387a;
    }
}
