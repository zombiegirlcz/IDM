package com.revolut.feature.retail.beneficiary.impl.cop;

import an9.g;
import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.retail.beneficiary.impl.cop.ConfirmationOfPayeeScreen;
import com.revolut.feature.shared.beneficiary.api.confirmation_of_payee.ConfirmationOfPayeeScreenContract$InputData;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import f6d.d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import rt4.o;
import te0.w;
import v1b.a;
import vkm.q;
import xki.e;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/retail/beneficiary/impl/cop/ConfirmationOfPayeeScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Lf6d/d;", "Lcli/k;", "feature_retail_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ConfirmationOfPayeeScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int U = 0;
    public final ConfirmationOfPayeeScreenContract$InputData Q;
    public final Object R;
    public final Object S;
    public final List T;

    public ConfirmationOfPayeeScreen(ConfirmationOfPayeeScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        final int i = 0;
        this.R = w.y0(new Function0(this) { // from class: s1b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationOfPayeeScreen f259122b;

            {
                this.f259122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ConfirmationOfPayeeScreen confirmationOfPayeeScreen = this.f259122b;
                switch (i2) {
                    case 0:
                        int i3 = ConfirmationOfPayeeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(confirmationOfPayeeScreen.m2()).a().get(v1b.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v1b.b.class, " is not found"));
                        }
                        v1b.b bVar = ((v1b.b) aVar2.b()).f285280a;
                        ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData = confirmationOfPayeeScreen.Q;
                        confirmationOfPayeeScreenContract$InputData.getClass();
                        return new v1b.a(bVar, confirmationOfPayeeScreenContract$InputData);
                    default:
                        int i5 = ConfirmationOfPayeeScreen.U;
                        return (d) ((v1b.a) confirmationOfPayeeScreen.R.getValue()).f285279b.get();
                }
            }
        });
        final int i2 = 1;
        this.S = w.y0(new Function0(this) { // from class: s1b.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConfirmationOfPayeeScreen f259122b;

            {
                this.f259122b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ConfirmationOfPayeeScreen confirmationOfPayeeScreen = this.f259122b;
                switch (i22) {
                    case 0:
                        int i3 = ConfirmationOfPayeeScreen.U;
                        phm.a aVar = (phm.a) ue0.e.j(confirmationOfPayeeScreen.m2()).a().get(v1b.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", v1b.b.class, " is not found"));
                        }
                        v1b.b bVar = ((v1b.b) aVar2.b()).f285280a;
                        ConfirmationOfPayeeScreenContract$InputData confirmationOfPayeeScreenContract$InputData = confirmationOfPayeeScreen.Q;
                        confirmationOfPayeeScreenContract$InputData.getClass();
                        return new v1b.a(bVar, confirmationOfPayeeScreenContract$InputData);
                    default:
                        int i5 = ConfirmationOfPayeeScreen.U;
                        return (d) ((v1b.a) confirmationOfPayeeScreen.R.getValue()).f285279b.get();
                }
            }
        });
        this.T = v.k(new RowDelegate(null, null, 7), new CellDetailsDelegate());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.R.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (s1b.d) this.S.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new g(q.J(e3(), f3()), 27), new o(this, null, 19), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (s1b.d) this.S.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getT() {
        return this.T;
    }
}
