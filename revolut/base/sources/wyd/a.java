package wyd;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.feature.statements.api.models.StatementUrlState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.account.a f301239b;

    public /* synthetic */ a(com.revolut.feature.statements.impl.ui.account.a aVar, int i) {
        this.f301238a = i;
        this.f301239b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f301238a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                com.revolut.feature.statements.impl.ui.account.a aVar = this.f301239b;
                ServerError serverErrorA = aVar.f88292x.a(error);
                if (serverErrorA == null || serverErrorA.f51362a != 9401) {
                    return aVar.f88290t.c(error);
                }
                return null;
            case 1:
                StatementUrlState content = (StatementUrlState) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof StatementUrlState.InPreparation) {
                    return this.f301239b.f88290t.b(((StatementUrlState.InPreparation) content).getEmail());
                }
                if (content instanceof StatementUrlState.Ready) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            default:
                s7a.a0 output = (s7a.a0) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                s7a.c0 c0Var = output.f260599a;
                Intrinsics.i(c0Var, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.account.SelectCurrenciesControllerResult");
                com.revolut.feature.statements.impl.ui.account.a aVar2 = this.f301239b;
                aVar2.H2(aVar2.f88293y, new wvg.d0((d0) c0Var, 17));
                return Unit.f186387a;
        }
    }
}
