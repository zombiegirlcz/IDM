package jeg;

import com.revolut.feature.acquiring.card_reader.order.api.model.CardReaderOrderProductDetails;
import com.revolut.feature.insurance.impl.ui.cfac.claim.supporting_documents.CFACInsuranceSupportingDocumentsScreen;
import com.revolut.feature.pay_later.impl.ui.accountdetails.PayLaterAccountDetailsScreen;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreen;
import com.revolut.feature.shared_separate_favourites.converter.ui.screen.SharedConverterScreen;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.bottom_sheets.terms.EsimMobilePlanCancellationTermsScreen;
import efm.h0;
import efm.w;
import java.util.List;
import je5.n;
import jfb.v0;
import kfm.o;
import kfm.p;
import kotlin.Function;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements o, kfm.c, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function f173394b;

    public /* synthetic */ h(Function function, int i) {
        this.f173393a = i;
        this.f173394b = function;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f173393a;
        Function function = this.f173394b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((n) function).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((jei.a) function).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jei.a) function).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jfc.a) function).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (CardReaderOrderProductDetails) ((jfc.a) function).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ya1.h) ((jfc.a) function).invoke(p0);
            case 6:
                KProperty[] kPropertyArr = SharedConverterScreen.f86850h0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((jgd.b) function).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) ((je2.d) function).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lk0.e) ((g) function).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) ((jhi.a) function).invoke(p0);
            case 10:
            case 14:
            case 15:
            case 18:
            case 22:
            case 24:
            case 27:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((jn2.a) function).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((g) function).invoke(p0);
            case 12:
                KProperty[] kPropertyArr2 = PayLaterAccountDetailsScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) ((jj3.a) function).invoke(p0);
            case 13:
                KProperty[] kPropertyArr3 = PayLaterAccountDetailsScreen.i0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (yx4.b) ((jj3.a) function).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((jk5.j) function).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) ((jk5.j) function).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((je2.d) function).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ekc.e) ((a5g.i) function).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((avj.o) function).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((jj3.a) function).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) ((jlh.g) function).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) ((jn2.a) function).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) ((jn2.a) function).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        int i = this.f173393a;
        Function function = this.f173394b;
        switch (i) {
            case 14:
                KProperty[] kPropertyArr = EsimMobilePlanCancellationTermsScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jj3.a) function).invoke(p0)).booleanValue();
            case 15:
                KProperty[] kPropertyArr2 = EsimMobilePlanCancellationTermsScreen.R;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jj3.a) function).invoke(p0)).booleanValue();
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 23:
            default:
                KProperty[] kPropertyArr3 = ProjectionScreen.c0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jn2.a) function).invoke(p0)).booleanValue();
            case 18:
                KProperty[] kPropertyArr4 = CFACInsuranceSupportingDocumentsScreen.f75113d0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jj3.a) function).invoke(p0)).booleanValue();
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jj3.a) function).invoke(p0)).booleanValue();
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) ((jj3.a) function).invoke(p0)).booleanValue();
        }
    }

    @Override // kfm.c
    public Object apply(Object p0, Object p17) {
        v0 v0Var = (v0) this.f173394b;
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p17, "p1");
        return (Boolean) v0Var.invoke(p0, p17);
    }
}
