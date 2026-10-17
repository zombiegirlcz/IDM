package atg;

import au0.j0;
import au6.w0;
import au6.x0;
import com.revolut.core.ui_kit.internal.views.navbar.WallpaperView;
import com.revolut.feature.freelancer.common.models.FreelancerCustomer;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoice;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceSettings;
import com.revolut.feature.freelancer.common.models.invoices.FreelancerInvoiceTaxRate;
import efm.h0;
import efm.w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n implements kfm.o, kfm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f9061b;

    public /* synthetic */ n(int i, Function1 function1) {
        this.f9060a = i;
        this.f9061b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        int i = this.f9060a;
        Function1 function1 = this.f9061b;
        switch (i) {
            case 3:
                ((a08.e) function1).invoke(obj2);
                break;
            case 8:
                int i2 = au0.e.f9172g;
                ((a08.e) function1).invoke(obj2);
                break;
            case 9:
                WallpaperView.Companion aVar = WallpaperView.INSTANCE;
                ((ar1.c) function1).invoke(obj2);
                break;
            case 19:
                ((x0) function1).invoke(obj2);
                break;
            default:
                ((x0) function1).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f9060a) {
            case 0:
                m mVar = (m) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar.invoke(p0);
            case 1:
                arf.h hVar = (arf.h) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) hVar.invoke(p0);
            case 2:
                as9.a aVar = (as9.a) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Unit) aVar.invoke(p0);
            case 3:
            case 8:
            case 9:
            case 19:
            case 20:
            default:
                j0 j0Var = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var.invoke(p0);
            case 4:
                ak7.g gVar = (ak7.g) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (od0.i) gVar.invoke(p0);
            case 5:
                m mVar2 = (m) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.f) mVar2.invoke(p0);
            case 6:
                q qVar = (q) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) qVar.invoke(p0);
            case 7:
                as9.a aVar2 = (as9.a) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (w) aVar2.invoke(p0);
            case 10:
                j0 j0Var2 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) j0Var2.invoke(p0);
            case 11:
                j0 j0Var3 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) j0Var3.invoke(p0);
            case 12:
                j0 j0Var4 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerCustomer) j0Var4.invoke(p0);
            case 13:
                j0 j0Var5 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) j0Var5.invoke(p0);
            case 14:
                w0 w0Var = (w0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) w0Var.invoke(p0);
            case 15:
                j0 j0Var6 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoiceTaxRate) j0Var6.invoke(p0);
            case 16:
                x0 x0Var = (x0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h0) x0Var.invoke(p0);
            case 17:
                j0 j0Var7 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoiceSettings) j0Var7.invoke(p0);
            case 18:
                j0 j0Var8 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoiceSettings) j0Var8.invoke(p0);
            case 21:
                j0 j0Var9 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var9.invoke(p0);
            case 22:
                j0 j0Var10 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var10.invoke(p0);
            case 23:
                j0 j0Var11 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var11.invoke(p0);
            case 24:
                j0 j0Var12 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var12.invoke(p0);
            case 25:
                j0 j0Var13 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var13.invoke(p0);
            case 26:
                j0 j0Var14 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) j0Var14.invoke(p0);
            case 27:
                j0 j0Var15 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var15.invoke(p0);
            case 28:
                j0 j0Var16 = (j0) this.f9061b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (FreelancerInvoice) j0Var16.invoke(p0);
        }
    }
}
