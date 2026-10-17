package dv5;

import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jmrtd.lds.LDSFile;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f118033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f118034b;

    public /* synthetic */ c(f fVar, int i) {
        this.f118033a = i;
        this.f118034b = fVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.f118033a) {
            case 0:
                List orders = (List) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(orders, "orders");
                if (orders.isEmpty()) {
                    return f0.f322471a;
                }
                boolean z = orders.size() > 3;
                m70.a.c(t0.f186434a);
                return yp0.b.g(this.f118034b.e("", orders, true), f.d(z), null, 0, R$attr.uikit_dp16, LDSFile.EF_DG4_TAG);
            default:
                whf.p transactionsContent = (whf.p) obj2;
                ((Boolean) obj3).getClass();
                Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
                if (transactionsContent.f297646a.isEmpty()) {
                    return f0.f322471a;
                }
                boolean z3 = transactionsContent.f297646a.size() > 3;
                m70.a.c(t0.f186434a);
                f fVar = this.f118034b;
                List listB = pt5.f.b(fVar, transactionsContent, true, "", false, 24);
                fVar.getClass();
                return yp0.b.g(listB, f.g(z3), null, 0, R$attr.uikit_dp0, LDSFile.EF_DG4_TAG);
        }
    }
}
