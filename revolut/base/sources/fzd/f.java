package fzd;

import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.picker.PickerController;
import com.revolut.feature.statements.impl.ui.consolidated.customisation.ConsolidatedStatementCustomisationScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ConsolidatedStatementCustomisationScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ConsolidatedStatementCustomisationScreen consolidatedStatementCustomisationScreen, Continuation continuation) {
        super(2, continuation);
        this.v = consolidatedStatementCustomisationScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CellDetailsActionDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        CellDetailsActionDelegate.Model model = (CellDetailsActionDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        l lVarE3 = this.v.R2();
        String listId = model.f51781a;
        u uVar = (u) lVarE3;
        uVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Continuation continuation = null;
        if (Intrinsics.f(listId, "ID_LANGUAGE")) {
            Locale language = ((j) ((j2) uVar.u.f22677a).getValue()).f139144b.getLanguage();
            s7a.x xVar = new s7a.x(null, null, null, null, false, null, new TextLocalisedClause(R.string.common_search, null, null, 14), null, null, false, null, language != null ? language.toLanguageTag() : null, null, null, true, null, null, null, null, null, 2138963454);
            Object obj3 = uVar.f139166t.get();
            Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
            uVar.f2(new PickerController(xVar, (x7a.d) obj3), ModalDestination.Style.POPUP.f98311a, new q(uVar, 0));
        } else if (Intrinsics.f(listId, "ID_DISPLAY_CURRENCY")) {
            uVar.l2(new r(uVar, continuation, 1), new yi5.b(26));
        }
        return Unit.f186387a;
    }
}
