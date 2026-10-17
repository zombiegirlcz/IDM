package pzd;

import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import com.revolut.feature.statements.api.models.CustomisationParameters;
import com.revolut.feature.statements.api.models.CustomisationSelection;
import com.revolut.feature.statements.api.models.ProductSelection;
import com.revolut.feature.statements.api.models.SelectableOption;
import com.revolut.feature.statements.impl.ui.consolidated.screen.model.SelectableProductType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import uyd.f0;
import uyd.h0;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.consolidated.screen.a f240981w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i, com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f240981w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(0, this.f240981w, continuation);
            default:
                return new y(1, this.f240981w, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        Object objA;
        Object value;
        ArrayList arrayList;
        int i = this.u;
        com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar = this.f240981w;
        int i2 = 1;
        switch (i) {
            case 0:
                cli.y yVar = aVar.f88322x;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                Continuation continuation = null;
                try {
                    if (i3 == 0) {
                        yhm.o.b(obj2);
                        zxd.c cVar = aVar.f88316p;
                        this.v = 1;
                        h0 h0Var = (h0) ((ryd.w) cVar).f258357a;
                        h0Var.getClass();
                        f0 f0Var = new f0(h0Var, continuation, i2);
                        p0 p0Var = p0.f264001a;
                        objJ = e0.J(elm.f.f127540b, f0Var, this);
                        if (objJ == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        objJ = obj2;
                    }
                    CustomisationParameters customisationParameters = (CustomisationParameters) objJ;
                    Locale defaultLanguage = customisationParameters.getDefaultLanguage();
                    xi0.b defaultCurrency = customisationParameters.getDefaultCurrency();
                    ProductSelection productSelectionZ = cj9.c.Z(customisationParameters);
                    List<SelectableOption> transactionCategories = customisationParameters.getTransactionCategories();
                    ArrayList arrayList2 = new ArrayList(zhm.w.t(transactionCategories, 10));
                    Iterator<T> it8 = transactionCategories.iterator();
                    while (it8.hasNext()) {
                        arrayList2.add(((SelectableOption) it8.next()).getType());
                    }
                    Set setI1 = zhm.d0.i1(arrayList2);
                    List<SelectableOption> transactionDirections = customisationParameters.getTransactionDirections();
                    ArrayList arrayList3 = new ArrayList(zhm.w.t(transactionDirections, 10));
                    Iterator<T> it9 = transactionDirections.iterator();
                    while (it9.hasNext()) {
                        arrayList3.add(((SelectableOption) it9.next()).getType());
                    }
                    CustomisationSelection customisationSelection = new CustomisationSelection(null, defaultLanguage, defaultCurrency, false, null, zhm.h0.f322473a, productSelectionZ, setI1, zhm.d0.i1(arrayList3), 16, null);
                    aVar.f88321w.setValue(customisationSelection.getProductSelection().getAllSelectedProducts());
                    aVar.H2(yVar, new fzd.p(customisationParameters, customisationSelection, 1));
                    break;
                } catch (Exception e) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var2);
                    aVar.H2(yVar, new d22.f(10, e));
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    g gVar = aVar.o;
                    this.v = 1;
                    objA = gVar.a(this);
                    if (objA == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objA = obj2;
                }
                Set set = (Set) objA;
                j2 j2Var = aVar.v;
                do {
                    value = j2Var.getValue();
                    Set set2 = set;
                    arrayList = new ArrayList(zhm.w.t(set2, 10));
                    Iterator it10 = set2.iterator();
                    while (it10.hasNext()) {
                        arrayList.add(new SelectableProductType((ConsolidatedStatementProductType) it10.next(), true));
                    }
                } while (!j2Var.h(value, zhm.d0.i1(arrayList)));
                return Unit.f186387a;
        }
    }
}
