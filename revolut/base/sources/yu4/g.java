package yu4;

import al4.n;
import cli.y;
import com.revolut.feature.credit.card.api.models.settings.CreditCardSettings$RepaymentPreferenceSettings$DueDateOption;
import com.revolut.feature.credit.card.impl.ui.settings.due_date.CreditCardSelectDueDateScreenContract$InputData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements dli.b {
    public final CreditCardSelectDueDateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f316882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f316883q;

    public g(CreditCardSelectDueDateScreenContract$InputData inputData, n creditCardInteractor, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f316882p = creditCardInteractor;
        int i = inputData.f69631b;
        ArrayList arrayList = inputData.f69632c;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(Integer.valueOf(((CreditCardSettings$RepaymentPreferenceSettings$DueDateOption) it8.next()).f68861a));
        }
        this.f316883q = mra.d.b(this, new d(i, i, arrayList, d0.d1(d0.i1(d0.F0(Integer.valueOf(this.o.f69631b), arrayList2)))), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f316883q;
    }
}
