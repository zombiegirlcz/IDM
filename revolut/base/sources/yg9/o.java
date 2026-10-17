package yg9;

import jg9.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f313590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a f313591b;

    public /* synthetic */ o(com.revolut.feature.pay_bills_taxes.impl.ui.screen.subform.a aVar, int i) {
        this.f313590a = i;
        this.f313591b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f313590a) {
            case 0:
                p pVar = (p) obj2;
                if (pVar != null) {
                    this.f313591b.O2(pVar.f173956a);
                }
                break;
            case 1:
                jg9.o oVar = (jg9.o) obj2;
                if (oVar != null) {
                    sg9.b bVar = oVar.f173955a;
                    String str = bVar.f262633a;
                    this.f313591b.N2(bVar.f262634b.f61366a, str);
                }
                break;
            case 2:
                jg9.o oVar2 = (jg9.o) obj2;
                if (oVar2 != null) {
                    sg9.b bVar2 = oVar2.f173955a;
                    String str2 = bVar2.f262633a;
                    this.f313591b.N2(bVar2.f262634b.f61366a, str2);
                }
                break;
            case 3:
                jg9.m mVar = (jg9.m) obj2;
                if (mVar != null) {
                    String str3 = mVar.f173952a;
                    this.f313591b.N2(mVar.f173953b, str3);
                }
                break;
            case 4:
                p pVar2 = (p) obj2;
                if (pVar2 != null) {
                    this.f313591b.O2(pVar2.f173956a);
                }
                break;
            case 5:
                p pVar3 = (p) obj2;
                if (pVar3 != null) {
                    this.f313591b.O2(pVar3.f173956a);
                }
                break;
            case 6:
                p pVar4 = (p) obj2;
                if (pVar4 != null) {
                    this.f313591b.O2(pVar4.f173956a);
                }
                break;
            case 7:
                jg9.m mVar2 = (jg9.m) obj2;
                if (mVar2 != null) {
                    String str4 = mVar2.f173952a;
                    this.f313591b.N2(mVar2.f173953b, str4);
                }
                break;
            case 8:
                jg9.m mVar3 = (jg9.m) obj2;
                if (mVar3 != null) {
                    String str5 = mVar3.f173952a;
                    this.f313591b.N2(mVar3.f173953b, str5);
                }
                break;
            default:
                jg9.m mVar4 = (jg9.m) obj2;
                if (mVar4 != null) {
                    String str6 = mVar4.f173952a;
                    this.f313591b.N2(mVar4.f173953b, str6);
                }
                break;
        }
        return Unit.f186387a;
    }
}
