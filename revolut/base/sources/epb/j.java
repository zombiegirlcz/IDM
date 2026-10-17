package epb;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import com.revolut.feature.shared.savings.models.product.SavingsDocument;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends oki.h implements f {
    public final FundInfoControllerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ijb.a f128134p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f128135q;

    public j(FundInfoControllerContract$InputData inputData, ijb.a savingsProductInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsProductInteractor, "savingsProductInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f128134p = savingsProductInteractor;
        this.f128135q = mra.d.b(this, new e(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, ijb.a.b(this.f128134p, this.o.f83376a), null, null, new enb.f(this, null, 9), 3);
    }

    public final SavingsDocument I2() {
        Object next;
        Object content = ((e) ((j2) this.f128135q.f22677a).getValue()).f128132a.getContent();
        if (content == null) {
            throw new IllegalStateException("Content have not to be null");
        }
        Iterator it8 = ((SavingsProductData) content).f86683a.f86624m.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (next instanceof SavingsDocument.Link) {
                SavingsDocument.DocumentType documentType = ((SavingsDocument.Link) next).f86609b;
                SavingsDocument.DocumentType.INSTANCE.getClass();
                if (Intrinsics.f(documentType, SavingsDocument.DocumentType.f86606b)) {
                    break;
                }
            }
        }
        return (SavingsDocument) next;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f128135q;
    }
}
