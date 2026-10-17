package pq7;

import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import ip0.tn;
import java.util.List;
import kl7.j0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238697a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f238698b;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f238697a;
        j0 j0Var = this.f238698b;
        switch (i) {
            case 0:
                return h.a((h) obj2, null, new Data(null, null, true, 3, null), j0Var, 1);
            default:
                Function0 it8 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List listK = v.k(new tn("DRIVING_SCORE_HISTORY_HISTOGRAM_LOADING"), q.b(j0Var));
                yp0.b.k(listK, R$attr.uikit_dp16, 0, 0, 0, 30);
                return listK;
        }
    }
}
