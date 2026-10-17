package t7e;

import a8e.e;
import com.revolut.feature.product_article.api.models.ProductArticleParams;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.impl.ui.create.flow.main.CreateSubaccountFlowContract$Step;
import h1j.b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import r7e.a;
import t5e.m;
import t73.y2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f268635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.subaccount.impl.ui.create.flow.main.c f268636b;

    public /* synthetic */ c(com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar, int i) {
        this.f268635a = i;
        this.f268636b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        r7e.b bVar;
        Object result;
        switch (this.f268635a) {
            case 0:
                Subaccount subaccount = (Subaccount) obj2;
                Intrinsics.checkNotNullParameter(subaccount, "subaccount");
                this.f268636b.C2(new j6e.a(subaccount.getF88959a().f234881a));
                return Unit.f186387a;
            case 1:
                a8e.e result2 = (a8e.e) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                boolean z = result2 instanceof e.a;
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar = this.f268636b;
                if (z) {
                    cVar.B2();
                } else {
                    if (!(result2 instanceof a8e.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(cVar, cVar.f89043y, new CreateSubaccountFlowContract$Step.ChooseCurrency(((a8e.f) result2).f2188a), false, null, false, 12);
                }
                return Unit.f186387a;
            case 2:
                h1j.b outputData = (h1j.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof b.a) {
                    result = a.C1390a.f252198a;
                } else {
                    if (outputData instanceof h1j.c) {
                        bVar = new r7e.b(((h1j.c) outputData).f148579a);
                    } else {
                        if (!(outputData instanceof h1j.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = new r7e.b(((h1j.d) outputData).f148581b.f306286a);
                    }
                    result = bVar;
                }
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar2 = this.f268636b;
                r7e.c cVar3 = cVar2.u;
                yki.i iVar = cVar2.f89043y;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(result, "result");
                cVar3.f252200a.onNext(result);
                oki.h.E2(iVar, new y2(18));
                iVar.e(false);
                return Unit.f186387a;
            case 3:
                v7e.j result3 = (v7e.j) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar4 = this.f268636b;
                yki.i iVar2 = cVar4.f89043y;
                if (result3 instanceof v7e.i) {
                    cVar4.H2(cVar4.z, new m(result3, 12));
                    v7e.i iVar3 = (v7e.i) result3;
                    SubaccountType subaccountType = iVar3.f286596a;
                    if (Intrinsics.f(subaccountType, SubaccountType.Personal.f88963a) || (subaccountType instanceof SubaccountType.Joint)) {
                        cVar4.L2(null);
                    } else if (Intrinsics.f(subaccountType, SubaccountType.Group.f88960a)) {
                        oki.h.t2(cVar4, iVar2, CreateSubaccountFlowContract$Step.ContactsSelectorScreen.f89023a, true, null, false, 12);
                    } else if (Intrinsics.f(subaccountType, SubaccountType.Pro.f88964a)) {
                        cVar4.L2(null);
                    } else if (Intrinsics.f(subaccountType, SubaccountType.ProTax.f88965a)) {
                        oki.h.t2(cVar4, iVar2, new CreateSubaccountFlowContract$Step.TaxPocketScreen(iVar3.f286597b, iVar3.d, iVar3.f286598c), true, null, false, 12);
                    } else {
                        if (!(subaccountType instanceof SubaccountType.Junior)) {
                            if (subaccountType instanceof SubaccountType.Teen) {
                                throw new IllegalArgumentException("SubaccountType.Teen not supported");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        cVar4.L2(null);
                    }
                } else {
                    if (!(result3 instanceof v7e.h)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    v7e.h hVar = (v7e.h) result3;
                    oki.h.t2(cVar4, iVar2, hVar.f286595c ? CreateSubaccountFlowContract$Step.ChooseCurrencyType.f89021a : new CreateSubaccountFlowContract$Step.ChooseCurrency(hVar.f286594b), true, null, false, 12);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.subaccount.impl.ui.create.flow.main.c cVar5 = this.f268636b;
                oki.h.t2(cVar5, cVar5.f89043y, new CreateSubaccountFlowContract$Step.ProductArticle.Intro((ProductArticleParams) obj2), true, null, false, 12);
                return Unit.f186387a;
        }
    }
}
