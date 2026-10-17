package gjg;

import com.revolut.feature.apm.bills.f24.impl.ui.forms_list.FormsListScreen;
import com.revolut.feature.contacts.core.platform.model.DeviceContact;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.OpenBankingConsentsFlowContract$Step;
import com.revolut.feature.insurance.impl.ui.cfac.claim.select_expenses.CFACInsuranceSelectExpensesScreen;
import com.revolut.feature.trusted_merchants.impl.ui.TrustedMerchantsFlowContract$MerchantsContent;
import efm.r;
import efm.w;
import efm.x;
import gk7.m;
import k71.q;
import kfm.o;
import kfm.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import tof.a3;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements o, p, x, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f144281b;

    public /* synthetic */ e(Object obj2, int i) {
        this.f144280a = i;
        this.f144281b = obj2;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f144280a) {
            case 7:
                ((gk7.a) this.f144281b).invoke(obj2);
                break;
            case 15:
                ((gk7.a) this.f144281b).invoke(obj2);
                break;
            case 18:
                ((gk7.a) this.f144281b).invoke(obj2);
                break;
            case 19:
                ((gk7.a) this.f144281b).invoke(obj2);
                break;
            default:
                ((gk7.a) this.f144281b).invoke(obj2);
                break;
        }
    }

    @Override // efm.x
    public w apply(r transactionDataObservable) {
        m mVar = (m) this.f144281b;
        Intrinsics.checkNotNullParameter(transactionDataObservable, "transactionDataObservable");
        return nim.a.w(transactionDataObservable, new gk7.k(mVar, 1));
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f144280a;
        Object obj2 = this.f144281b;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 3:
                KProperty[] kPropertyArr = CFACInsuranceSelectExpensesScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            case 24:
                KProperty[] kPropertyArr2 = FormsListScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
            default:
                KProperty[] kPropertyArr3 = FormsListScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                break;
        }
        return ((Boolean) ((gn.a) obj2).invoke(p0)).booleanValue();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f144280a;
        Object obj2 = this.f144281b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (TrustedMerchantsFlowContract$MerchantsContent) ((d) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((d) obj2).invoke(p0);
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 15:
            case 18:
            case 19:
            case 20:
            case 24:
            case 25:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q) ((gqa.a) obj2).invoke(p0);
            case 4:
                KProperty[] kPropertyArr = CFACInsuranceSelectExpensesScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (a3) ((gk7.a) obj2).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gk7.a) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gk7.a) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gl3.c) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gl3.c) obj2).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gk7.a) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gk7.a) obj2).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (DeviceContact) ((gl3.d) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gk7.a) obj2).invoke(p0);
            case 21:
                return (OpenBankingConsentsFlowContract$Step.ClientsList) ((gk7.a) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sm.c) ((gk7.a) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (sm.b) ((gk7.a) obj2).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((gqk.a) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (gqk.c) ((gqa.a) obj2).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (qsi.d) ((gqk.a) obj2).invoke(p0);
        }
    }
}
