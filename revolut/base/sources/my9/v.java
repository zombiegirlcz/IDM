package my9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.R$string;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o97.e0;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f210438b;

    public /* synthetic */ v(y yVar, int i) {
        this.f210437a = i;
        this.f210438b = yVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f210437a;
        y yVar = this.f210438b;
        switch (i) {
            case 0:
                oy9.i result = (oy9.i) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, oy9.h.f230923a)) {
                    return f0.f322471a;
                }
                if (!(result instanceof oy9.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                oy9.g gVar = (oy9.g) result;
                ly9.i iVar = new ly9.i(gVar.f230921a);
                o97.f0 f0Var = new o97.f0(new TextLocalisedClause(R$string.who_to_pay_section_revolut_tags_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.Username");
                ly9.l lVar = yVar.f210441b;
                Object hVar = iVar;
                if (!gVar.f230922b) {
                    hVar = new ly9.h(iVar);
                }
                ArrayList arrayListA = lVar.a(zhm.u.c(hVar), yVar.f210442c, new v(yVar, 1));
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return zhm.v.k(f0Var, new e0(arrayListA));
            default:
                ly9.j item = (ly9.j) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new o97.y(yVar.f210442c, item, null, 60);
        }
    }
}
