package r15;

import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreen;
import com.revolut.feature.credit.help.impl.ui.financial_difficulties.legacy.FinancialDifficultiesScreenContract$InputData;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250901a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FinancialDifficultiesScreen f250902b;

    public /* synthetic */ a(FinancialDifficultiesScreen financialDifficultiesScreen) {
        this.f250902b = financialDifficultiesScreen;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f250901a;
        FinancialDifficultiesScreen financialDifficultiesScreen = this.f250902b;
        switch (i) {
            case 0:
                KProperty[] kPropertyArr = FinancialDifficultiesScreen.c0;
                phm.a aVar = (phm.a) ue0.e.j(financialDifficultiesScreen.m2()).a().get(i15.d.class);
                b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                if (aVar2 != null) {
                    return new i15.f(((i15.d) aVar2.b()).f157559h);
                }
                throw new IllegalStateException(a0.d.q("Api ", i15.d.class, " is not found"));
            default:
                KProperty[] kPropertyArr2 = FinancialDifficultiesScreen.c0;
                return (i) ((i15.f) financialDifficultiesScreen.W.getValue()).f157570c.get();
        }
    }

    public /* synthetic */ a(FinancialDifficultiesScreen financialDifficultiesScreen, FinancialDifficultiesScreenContract$InputData financialDifficultiesScreenContract$InputData) {
        this.f250902b = financialDifficultiesScreen;
    }
}
