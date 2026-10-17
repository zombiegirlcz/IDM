package com.revolut.feature.transfer_reasons.impl.ui.legal_confirmation;

import android.view.View;
import cli.k;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.feature.transfer_reasons.api.navigation.LegalConfirmationInputData;
import com.revolut.feature.transfer_reasons.impl.ui.legal_confirmation.LegalConfirmationScreen;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController;
import com.revolut.kompot.navigable.vc.ViewController;
import dsf.d;
import gtf.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nsf.a;
import pki.b;
import te0.w;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/transfer_reasons/impl/ui/legal_confirmation/LegalConfirmationScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetRecyclerController;", "Ldsf/d;", "Lcli/k;", "feature_transfer_reasons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LegalConfirmationScreen extends BaseBottomSheetRecyclerController<d, k> {
    public static final /* synthetic */ int V = 0;
    public final LegalConfirmationInputData Q;
    public final CellDetailsStandaloneNoteDelegate R;
    public final Object S;
    public final Object T;
    public final List U;

    public LegalConfirmationScreen(LegalConfirmationInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.Q = inputData;
        CellDetailsStandaloneNoteDelegate cellDetailsStandaloneNoteDelegate = new CellDetailsStandaloneNoteDelegate();
        this.R = cellDetailsStandaloneNoteDelegate;
        final int i = 0;
        this.S = w.y0(new Function0(this) { // from class: gtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalConfirmationScreen f146603b;

            {
                this.f146603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                LegalConfirmationScreen legalConfirmationScreen = this.f146603b;
                switch (i2) {
                    case 0:
                        int i3 = LegalConfirmationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(legalConfirmationScreen.m2()).a().get(nsf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nsf.b.class, " is not found"));
                        }
                        nsf.b bVar = ((nsf.b) aVar2.b()).f218801m;
                        LegalConfirmationInputData legalConfirmationInputData = legalConfirmationScreen.Q;
                        legalConfirmationInputData.getClass();
                        return new nsf.a(bVar, legalConfirmationInputData);
                    default:
                        int i5 = LegalConfirmationScreen.V;
                        return (c) ((nsf.a) legalConfirmationScreen.S.getValue()).f218793b.get();
                }
            }
        });
        final int i2 = 1;
        this.T = w.y0(new Function0(this) { // from class: gtf.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LegalConfirmationScreen f146603b;

            {
                this.f146603b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                LegalConfirmationScreen legalConfirmationScreen = this.f146603b;
                switch (i22) {
                    case 0:
                        int i3 = LegalConfirmationScreen.V;
                        phm.a aVar = (phm.a) ue0.e.j(legalConfirmationScreen.m2()).a().get(nsf.b.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", nsf.b.class, " is not found"));
                        }
                        nsf.b bVar = ((nsf.b) aVar2.b()).f218801m;
                        LegalConfirmationInputData legalConfirmationInputData = legalConfirmationScreen.Q;
                        legalConfirmationInputData.getClass();
                        return new nsf.a(bVar, legalConfirmationInputData);
                    default:
                        int i5 = LegalConfirmationScreen.V;
                        return (c) ((nsf.a) legalConfirmationScreen.S.getValue()).f218793b.get();
                }
            }
        });
        this.U = u.c(cellDetailsStandaloneNoteDelegate);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (a) this.S.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, e3(), new gtf.b(this, null, 0), 3);
        ViewController.P2(this, f3(), new gtf.b(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.R.f51901c), new gii.b(this, null, 26), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: k3 */
    public final dli.b R2() {
        return (c) this.T.getValue();
    }

    @Override // com.revolut.kompot.common.bottom_sheet.BaseBottomSheetRecyclerController
    /* JADX INFO: renamed from: l3, reason: from getter */
    public final List getU() {
        return this.U;
    }
}
