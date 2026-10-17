package cbh;

import com.revolut.feature.wealth.api.FeatureWealthApi$Toggles;
import java.util.List;
import kotlin.jvm.functions.Function0;
import vkm.j2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f22804b;

    public /* synthetic */ a0(n0 n0Var, int i) {
        this.f22803a = i;
        this.f22804b = n0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f22803a) {
            case 0:
                return Boolean.valueOf(((jte.d) this.f22804b.o).c(FeatureWealthApi$Toggles.InvestTransactionsFullHistory.f95162c));
            default:
                lk0.g gVar = ((l) ((j2) this.f22804b.v.f22677a).getValue()).f22827a;
                List list = gVar != null ? gVar.f196174a : null;
                if (list == null) {
                    list = zhm.f0.f322471a;
                }
                return zhm.d0.f1(list);
        }
    }
}
