package wo2;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LabelButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.bank_account_switching.impl.ui.request_status.BankAccountSwitchingRequestStatusScreen;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nii.v;
import nii.y0;
import vkm.j2;

/* JADX INFO: loaded from: classes21.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingRequestStatusScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BankAccountSwitchingRequestStatusScreen bankAccountSwitchingRequestStatusScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingRequestStatusScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LabelButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yo2.i iVar;
        yo2.d dVar;
        LabelButtonDelegate.Model model = (LabelButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarD3 = this.v.d();
        String listId = model.f52603a;
        m mVar = (m) hVarD3;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (Intrinsics.f(listId, "ID_CANCELLATION_BUTTON") && (iVar = (yo2.i) ((g) ((j2) mVar.f298875r.f22677a).getValue()).f298868b.getContent()) != null && (dVar = iVar.f) != null) {
            yji.l.b1(mVar, mVar.X1(new y0("ID_CANCELLATION_CONFIRM_DIALOG", new v(new TextClause(dVar.f315541b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(dVar.f315542c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, new TextClause(dVar.d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(dVar.e, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, null, false, null, 4032), false, 4)), null, new l(mVar, dVar, (Continuation) null, 0), 3);
        }
        return Unit.f186387a;
    }
}
