package wg9;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import wg9.l;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f297258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a f297259b;

    public /* synthetic */ o(com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar, int i) {
        this.f297258a = i;
        this.f297259b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f297258a) {
            case 0:
                jg9.m mVar = (jg9.m) obj2;
                if (mVar == null) {
                    return Unit.f186387a;
                }
                String str = mVar.f173952a;
                this.f297259b.O2(mVar.f173953b, str);
                return Unit.f186387a;
            case 1:
                jg9.o oVar = (jg9.o) obj2;
                if (oVar == null) {
                    return Unit.f186387a;
                }
                sg9.b bVar = oVar.f173955a;
                String str2 = bVar.f262633a;
                this.f297259b.O2(bVar.f262634b.f61366a, str2);
                return Unit.f186387a;
            case 2:
                jg9.p pVar = (jg9.p) obj2;
                if (pVar == null) {
                    return Unit.f186387a;
                }
                this.f297259b.L2(pVar.f173956a);
                return Unit.f186387a;
            case 3:
                hg9.k outputData = (hg9.k) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof hg9.j) {
                    com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar = this.f297259b;
                    aVar.H2(aVar.v, new wf6.p(26));
                }
                return Unit.f186387a;
            case 4:
                jg9.m mVar2 = (jg9.m) obj2;
                if (mVar2 == null) {
                    return Unit.f186387a;
                }
                String str3 = mVar2.f173952a;
                this.f297259b.O2(mVar2.f173953b, str3);
                return Unit.f186387a;
            case 5:
                jg9.p pVar2 = (jg9.p) obj2;
                if (pVar2 == null) {
                    return Unit.f186387a;
                }
                this.f297259b.L2(pVar2.f173956a);
                return Unit.f186387a;
            case 6:
                jg9.p pVar3 = (jg9.p) obj2;
                if (pVar3 == null) {
                    return Unit.f186387a;
                }
                this.f297259b.L2(pVar3.f173956a);
                return Unit.f186387a;
            case 7:
                jg9.p pVar4 = (jg9.p) obj2;
                if (pVar4 == null) {
                    return Unit.f186387a;
                }
                this.f297259b.L2(pVar4.f173956a);
                return Unit.f186387a;
            case 8:
                jg9.m mVar3 = (jg9.m) obj2;
                if (mVar3 == null) {
                    return Unit.f186387a;
                }
                String str4 = mVar3.f173952a;
                this.f297259b.O2(mVar3.f173953b, str4);
                return Unit.f186387a;
            case 9:
                jg9.m mVar4 = (jg9.m) obj2;
                if (mVar4 == null) {
                    return Unit.f186387a;
                }
                String str5 = mVar4.f173952a;
                this.f297259b.O2(mVar4.f173953b, str5);
                return Unit.f186387a;
            default:
                ih9.f fVar = (ih9.f) obj2;
                boolean zF = Intrinsics.f(fVar, ih9.d.f161311a);
                com.revolut.feature.pay_bills_taxes.impl.ui.screen.form.a aVar2 = this.f297259b;
                if (zF) {
                    aVar2.C2(l.b.f297253a);
                } else if (Intrinsics.f(fVar, ih9.e.f161312a)) {
                    aVar2.C2(l.c.f297254a);
                } else {
                    if (!Intrinsics.f(fVar, ih9.c.f161310a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.C2(l.a.f297252a);
                }
                return Unit.f186387a;
        }
    }
}
