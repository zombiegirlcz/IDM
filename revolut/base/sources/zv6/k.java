package zv6;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.feature.freelancer.impl.ui.create_sale.invoice.customer.FreelancerAddCustomerScreenContract$InputData;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import et6.b1;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends jki.g implements f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b1 f325587p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final zi1.d f325588q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f325589r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(b1 freelancerCustomersInteractor, zi1.d addressInteractor, FreelancerAddCustomerScreenContract$InputData inputData, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(freelancerCustomersInteractor, "freelancerCustomersInteractor");
        Intrinsics.checkNotNullParameter(addressInteractor, "addressInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f325587p = freelancerCustomersInteractor;
        this.f325588q = addressInteractor;
        String str = inputData.f73761a;
        String str2 = inputData.f73762b;
        String str3 = str2 == null ? "" : str2;
        String str4 = inputData.f73763c;
        this.f325589r = new d(str, str3, str4 == null ? "" : str4, inputData.d, inputData.e, inputData.f);
    }

    public static final lr6.e y2(k kVar) {
        String str = ((d) kVar.t2()).f325576b;
        String str2 = ((d) kVar.t2()).f325577c;
        String str3 = ((d) kVar.t2()).d;
        String strL = str3 != null ? m70.a.l(str3) : null;
        String str4 = ((d) kVar.t2()).e;
        String strL2 = str4 != null ? m70.a.l(str4) : null;
        Address address = ((d) kVar.t2()).f;
        return new lr6.e(str, str2, strL, strL2, !Intrinsics.f(address, Address.INSTANCE.getEMPTY()) ? address : null);
    }

    public static final void z2(k kVar, String str) {
        kVar.getClass();
        yji.l.a1(kVar, kVar.X1(new y0("ITEM_ID_SUCCESS_STATUS_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.freelancer_sale_invoice_who_to_bill_customer_creation_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4)), null, null, new zt4.l(kVar, str, null, 7), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f325589r;
    }
}
