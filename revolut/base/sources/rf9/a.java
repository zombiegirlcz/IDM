package rf9;

import com.revolut.feature.apm.bills.core.api.model.BillFormField;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f253708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f253709b;

    public /* synthetic */ a(l lVar, int i) {
        this.f253708a = i;
        this.f253709b = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        BillFormField.Choice choiceB;
        jg9.a aVar = (jg9.a) obj2;
        switch (this.f253708a) {
            case 0:
                if (aVar != null) {
                    this.f253709b.q3(aVar.f173935a, aVar.f173936b);
                }
                break;
            default:
                if (aVar != null) {
                    String str = aVar.f173936b;
                    String str2 = aVar.f173935a;
                    l lVar = this.f253709b;
                    lVar.q3(str2, str);
                    BillFormField billFormFieldC = ff9.a.c(str2, ((m) lVar.f253732q.getValue()).f253735b);
                    if (billFormFieldC != null && billFormFieldC.f61276c == xo1.c.DROPDOWN && (choiceB = ff9.a.b(billFormFieldC, str)) != null) {
                        lVar.r3(choiceB.d);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
