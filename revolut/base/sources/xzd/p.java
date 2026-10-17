package xzd;

import cli.y;
import com.revolut.core.ui_kit.utils.ListIdTarget;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.CustomStatementData;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementsFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import uyd.f0;
import uyd.h0;
import vkm.z1;
import zhm.d0;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.custom_statement.screen.b f309940w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f309940w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new p(this.f309940w, continuation, 0);
            default:
                return new p(this.f309940w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        com.revolut.feature.statements.impl.ui.custom_statement.screen.b bVar = this.f309940w;
        switch (i) {
            case 0:
                y yVar = bVar.f88354x;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                int i3 = 2;
                Continuation continuation = null;
                try {
                    if (i2 == 0) {
                        yhm.o.b(obj2);
                        zxd.c cVar = bVar.f88349q;
                        this.v = 1;
                        h0 h0Var = (h0) ((ryd.w) cVar).f258357a;
                        h0Var.getClass();
                        f0 f0Var = new f0(h0Var, continuation, i3);
                        p0 p0Var = p0.f264001a;
                        objJ = e0.J(elm.f.f127540b, f0Var, this);
                        if (objJ == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ = obj2;
                    }
                    CustomStatementData customStatementData = (CustomStatementData) objJ;
                    CustomisationParameters parameters = customStatementData.getParameters();
                    StatementPeriod statementPeriodF = bVar.o.f(customStatementData);
                    StatementPeriod statementPeriod = (StatementPeriod) d0.o0(bVar.f88352t.a(statementPeriodF, customStatementData.getPeriods().getTaxPeriod()));
                    StatementPeriodSelection statementPeriodSelection = statementPeriod == null ? new StatementPeriodSelection(StatementPeriodType.ALL_TIME, statementPeriodF) : new StatementPeriodSelection(StatementPeriodType.TAX_YEAR, statementPeriod);
                    Locale defaultLanguage = parameters.getDefaultLanguage();
                    xi0.b defaultCurrency = parameters.getDefaultCurrency();
                    ProductSelection productSelectionZ = cj9.c.Z(parameters);
                    List<SelectableOption> transactionCategories = parameters.getTransactionCategories();
                    ArrayList arrayList = new ArrayList(zhm.w.t(transactionCategories, 10));
                    Iterator<T> it8 = transactionCategories.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((SelectableOption) it8.next()).getType());
                    }
                    Set setI1 = d0.i1(arrayList);
                    List<SelectableOption> transactionDirections = parameters.getTransactionDirections();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(transactionDirections, 10));
                    Iterator<T> it9 = transactionDirections.iterator();
                    while (it9.hasNext()) {
                        arrayList2.add(((SelectableOption) it9.next()).getType());
                    }
                    bVar.H2(yVar, new xwd.o(customStatementData, i3, new CustomisationSelection(statementPeriodSelection, defaultLanguage, defaultCurrency, false, null, zhm.h0.f322473a, productSelectionZ, setI1, d0.i1(arrayList2), 16, null), statementPeriodF));
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    bVar.H2(yVar, new d22.f(16, e));
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    z1 z1Var = bVar.f88355y;
                    Intrinsics.checkNotNullParameter("ID_FORMAT_ITEM", "id");
                    ListIdTarget listIdTarget = new ListIdTarget("ID_FORMAT_ITEM");
                    wzd.c cVar2 = bVar.f88348p;
                    StatementsFormat format = bVar.I2().getFormat();
                    cVar2.getClass();
                    l lVar = new l(listIdTarget, wzd.c.a(format));
                    this.v = 1;
                    if (z1Var.emit(lVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
