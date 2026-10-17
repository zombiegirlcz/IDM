package pzd;

import com.revolut.feature.statements.api.models.ConsolidatedStatementProductType;
import com.revolut.feature.statements.impl.ui.consolidated.screen.model.SelectableProductType;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f240976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.statements.impl.ui.consolidated.screen.a f240977b;

    public /* synthetic */ s(com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar, int i) {
        this.f240976a = i;
        this.f240977b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object value;
        ArrayList arrayList;
        switch (this.f240976a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f240977b.f88319s.c(it8);
            case 1:
                vyd.a aVar = this.f240977b.f88319s;
                x content = (x) obj2;
                Intrinsics.checkNotNullParameter(content, "content");
                if (content instanceof t) {
                    return aVar.b(((t) content).f240978a);
                }
                if (content instanceof w) {
                    return aVar.a();
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                fzd.k result = (fzd.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                com.revolut.feature.statements.impl.ui.consolidated.screen.a aVar2 = this.f240977b;
                aVar2.f88321w.setValue(result.f139146b.getProductSelection().getAllSelectedProducts());
                aVar2.H2(aVar2.f88322x, new pth.l(result, 25));
                return Unit.f186387a;
            default:
                y7a.v output = (y7a.v) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                y7a.w wVar = output.f311454a;
                Intrinsics.i(wVar, "null cannot be cast to non-null type com.revolut.feature.statements.impl.ui.consolidated.screen.model.SelectProductScreenResult");
                rzd.a aVar3 = (rzd.a) wVar;
                j2 j2Var = this.f240977b.v;
                do {
                    value = j2Var.getValue();
                    Iterable<SelectableProductType> iterable = (Iterable) j2Var.getValue();
                    arrayList = new ArrayList(zhm.w.t(iterable, 10));
                    for (SelectableProductType selectableProductType : iterable) {
                        boolean zContains = aVar3.f258591a.contains(selectableProductType.f88324a);
                        ConsolidatedStatementProductType productType = selectableProductType.f88324a;
                        Intrinsics.checkNotNullParameter(productType, "productType");
                        arrayList.add(new SelectableProductType(productType, zContains));
                    }
                } while (!j2Var.h(value, zhm.d0.i1(arrayList)));
                return Unit.f186387a;
        }
    }
}
