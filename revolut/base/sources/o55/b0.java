package o55;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f222319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f222320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f0 f222321c;

    public /* synthetic */ b0(Map map, f0 f0Var, int i) {
        this.f222319a = i;
        this.f222320b = map;
        this.f222321c = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f222319a) {
            case 0:
                List<k55.r> loans = (List) obj2;
                Intrinsics.checkNotNullParameter(loans, "loans");
                ArrayList arrayList = new ArrayList();
                for (k55.r rVar : loans) {
                    String upperCase = rVar.getCountryCode().toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    p35.d0 d0Var = (p35.d0) this.f222320b.get(upperCase);
                    p35.e0 e0VarA = d0Var != null ? f55.c.a(rVar, this.f222321c.f222334a, d0Var) : null;
                    if (e0VarA != null) {
                        arrayList.add(e0VarA);
                    }
                }
                return arrayList;
            default:
                k55.r loan = (k55.r) obj2;
                Intrinsics.checkNotNullParameter(loan, "loan");
                String upperCase2 = loan.getCountryCode().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
                p35.d0 d0Var2 = (p35.d0) this.f222320b.get(upperCase2);
                if (d0Var2 != null) {
                    return f55.c.a(loan, this.f222321c.f222334a, d0Var2);
                }
                throw new RuntimeException("No country config found");
        }
    }
}
