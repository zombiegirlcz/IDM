package bof;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.statements.R$string;
import com.revolut.feature.statements.api.models.StatementUrlState;
import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.Source;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.g0;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class n extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ q v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, Continuation continuation) {
        super(2, continuation);
        this.v = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.v, continuation);
        nVar.u = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((StatementUrlState) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        StatementUrlState statementUrlState = (StatementUrlState) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        q qVar = this.v;
        qVar.d0(false, false);
        if (statementUrlState instanceof StatementUrlState.Ready) {
            qVar.C1(u0.b(new FeatureCommand(new PdfViewFeatureConfiguration(new Source.Remote(((StatementUrlState.Ready) statementUrlState).getUrl()), null, true, false, null, null, false, 504))));
        } else if (statementUrlState instanceof StatementUrlState.InPreparation) {
            qVar.X1(new y0("account_statement_in_preparation", new g0(new TextLocalisedClause(R$string.account_statement_in_preparation_title, null, null, 14), new TextLocalisedClause(R$string.account_statement_in_preparation_subtitle, null, null, 14), null, null, null, null, null, null, false, null, false, null, 16380), false, 4));
        } else {
            int i = jli.h.f175850a;
            Unit unit = Unit.f186387a;
        }
        return Unit.f186387a;
    }
}
