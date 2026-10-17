package zlb;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.steps.option_selection.SavingsOptionSelectionContract$InputData;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zfd.s;

/* JADX INFO: loaded from: classes6.dex */
public final class o extends oki.h implements c {
    public final ijb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j60.a f323222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SavingsOptionSelectionContract$InputData f323223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vii.b f323224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f323225s;

    public o(ijb.a savingsProductInteractor, j60.a bottomDialogExtension, r stateMapper, SavingsOptionSelectionContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = savingsProductInteractor;
        this.f323222p = bottomDialogExtension;
        this.f323223q = inputData;
        this.f323224r = new vii.b();
        this.f323225s = mra.d.b(this, new b(new Data(null, null, true, 3, null), null), stateMapper, null, false, 12);
    }

    public static ncd.a I2(List list) {
        SavingsProductData savingsProductDataA;
        SavingsProductData savingsProductDataC = opg.a.c(list);
        if (savingsProductDataC == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Intrinsics.checkNotNullParameter(savingsProductDataC, "<this>");
        if (ocd.c.i(savingsProductDataC)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!opg.a.h((SavingsProductData) obj2)) {
                    arrayList.add(obj2);
                }
            }
            savingsProductDataA = opg.a.a(arrayList);
        } else {
            savingsProductDataA = null;
        }
        return new ncd.a(savingsProductDataC, savingsProductDataA);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, vkm.q.Q(this.f323224r, new z6e.g(continuation, this, 17)), null, null, new s(this, continuation, 12), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f323225s;
    }
}
