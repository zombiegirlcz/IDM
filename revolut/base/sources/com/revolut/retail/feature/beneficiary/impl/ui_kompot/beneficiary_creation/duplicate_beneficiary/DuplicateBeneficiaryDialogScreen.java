package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary;

import android.view.View;
import b3j.t;
import b3j.v;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.kompot.common.bottom_sheet.BaseBottomSheetController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreen;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.duplicate_beneficiary.DuplicateBeneficiaryDialogScreenContract$InputData;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import sy6.j;
import t4j.c;
import t4j.d;
import t4j.f;
import xki.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/duplicate_beneficiary/DuplicateBeneficiaryDialogScreen;", "Lcom/revolut/kompot/common/bottom_sheet/BaseBottomSheetController;", "Lt4j/d;", "Lcli/w;", "Lt4j/f;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DuplicateBeneficiaryDialogScreen extends BaseBottomSheetController<d> implements w {
    public static final /* synthetic */ int R = 0;
    public final DuplicateBeneficiaryDialogScreenContract$InputData N;
    public final Object O;
    public final Object P;
    public final Object Q;

    public DuplicateBeneficiaryDialogScreen(DuplicateBeneficiaryDialogScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        final int i = 0;
        this.O = te0.w.y0(new Function0(this) { // from class: t4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateBeneficiaryDialogScreen f268002b;

            {
                this.f268002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                DuplicateBeneficiaryDialogScreen duplicateBeneficiaryDialogScreen = this.f268002b;
                switch (i2) {
                    case 0:
                        int i3 = DuplicateBeneficiaryDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(duplicateBeneficiaryDialogScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        DuplicateBeneficiaryDialogScreenContract$InputData duplicateBeneficiaryDialogScreenContract$InputData = duplicateBeneficiaryDialogScreen.N;
                        duplicateBeneficiaryDialogScreenContract$InputData.getClass();
                        return new v(tVar, duplicateBeneficiaryDialogScreenContract$InputData);
                    case 1:
                        int i5 = DuplicateBeneficiaryDialogScreen.R;
                        return n14.e.a(duplicateBeneficiaryDialogScreen, (e) duplicateBeneficiaryDialogScreen.Q.getValue());
                    default:
                        int i6 = DuplicateBeneficiaryDialogScreen.R;
                        return (e) ((v) duplicateBeneficiaryDialogScreen.O.getValue()).f12113b.get();
                }
            }
        });
        final int i2 = 1;
        this.P = te0.w.y0(new Function0(this) { // from class: t4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateBeneficiaryDialogScreen f268002b;

            {
                this.f268002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                DuplicateBeneficiaryDialogScreen duplicateBeneficiaryDialogScreen = this.f268002b;
                switch (i22) {
                    case 0:
                        int i3 = DuplicateBeneficiaryDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(duplicateBeneficiaryDialogScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        DuplicateBeneficiaryDialogScreenContract$InputData duplicateBeneficiaryDialogScreenContract$InputData = duplicateBeneficiaryDialogScreen.N;
                        duplicateBeneficiaryDialogScreenContract$InputData.getClass();
                        return new v(tVar, duplicateBeneficiaryDialogScreenContract$InputData);
                    case 1:
                        int i5 = DuplicateBeneficiaryDialogScreen.R;
                        return n14.e.a(duplicateBeneficiaryDialogScreen, (e) duplicateBeneficiaryDialogScreen.Q.getValue());
                    default:
                        int i6 = DuplicateBeneficiaryDialogScreen.R;
                        return (e) ((v) duplicateBeneficiaryDialogScreen.O.getValue()).f12113b.get();
                }
            }
        });
        final int i3 = 2;
        this.Q = te0.w.y0(new Function0(this) { // from class: t4j.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DuplicateBeneficiaryDialogScreen f268002b;

            {
                this.f268002b = this;
            }

            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                DuplicateBeneficiaryDialogScreen duplicateBeneficiaryDialogScreen = this.f268002b;
                switch (i22) {
                    case 0:
                        int i32 = DuplicateBeneficiaryDialogScreen.R;
                        phm.a aVar = (phm.a) ue0.e.j(duplicateBeneficiaryDialogScreen.m2()).a().get(t.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", t.class, " is not found"));
                        }
                        t tVar = ((t) aVar2.b()).f12108t;
                        DuplicateBeneficiaryDialogScreenContract$InputData duplicateBeneficiaryDialogScreenContract$InputData = duplicateBeneficiaryDialogScreen.N;
                        duplicateBeneficiaryDialogScreenContract$InputData.getClass();
                        return new v(tVar, duplicateBeneficiaryDialogScreenContract$InputData);
                    case 1:
                        int i5 = DuplicateBeneficiaryDialogScreen.R;
                        return n14.e.a(duplicateBeneficiaryDialogScreen, (e) duplicateBeneficiaryDialogScreen.Q.getValue());
                    default:
                        int i6 = DuplicateBeneficiaryDialogScreen.R;
                        return (e) ((v) duplicateBeneficiaryDialogScreen.O.getValue()).f12113b.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        f uiState = (f) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        j3(uiState.f268007a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (v) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (t4j.e) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, new c(vkm.q.J(e3(), f3()), 0), new j(this, null, 14), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.P.getValue();
    }
}
