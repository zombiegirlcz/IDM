package com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.w;
import co7.c;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientContract$InputData;
import com.revolut.shared.feature.suspicious_transaction.impl.ui.suspicious_recipient.SuspiciousRecipientController;
import dbl.b;
import dbl.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import lal.i;
import lal.k;
import pki.a;
import vc.s;
import xki.e;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/ui/suspicious_recipient/SuspiciousRecipientController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lcli/w;", "Ldbl/b;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SuspiciousRecipientController extends ViewController<q> implements w {
    public static final /* synthetic */ KProperty[] Q = {o0.f186429a.j(new h0(SuspiciousRecipientController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenRecyclerNavbarBottomsheetNextbuttonBinding;", 0))};
    public final SuspiciousRecipientContract$InputData K;
    public final int L;
    public final Object M;
    public final h N;
    public final Object O;
    public final Object P;

    public SuspiciousRecipientController(SuspiciousRecipientContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_recycler_navbar_bottomsheet_nextbutton;
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: dbl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousRecipientController f112769b;

            {
                this.f112769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SuspiciousRecipientController suspiciousRecipientController = this.f112769b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousRecipientController.Q;
                        return n14.e.a(suspiciousRecipientController, (e) suspiciousRecipientController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousRecipientController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(suspiciousRecipientController.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).e;
                        SuspiciousRecipientContract$InputData suspiciousRecipientContract$InputData = suspiciousRecipientController.K;
                        suspiciousRecipientContract$InputData.getClass();
                        return new i(kVar, suspiciousRecipientContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousRecipientController.Q;
                        return (e) ((i) suspiciousRecipientController.O.getValue()).f193450c.get();
                }
            }
        });
        this.N = s.t(this, d.f);
        final int i2 = 1;
        this.O = te0.w.y0(new Function0(this) { // from class: dbl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousRecipientController f112769b;

            {
                this.f112769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SuspiciousRecipientController suspiciousRecipientController = this.f112769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousRecipientController.Q;
                        return n14.e.a(suspiciousRecipientController, (e) suspiciousRecipientController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousRecipientController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(suspiciousRecipientController.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).e;
                        SuspiciousRecipientContract$InputData suspiciousRecipientContract$InputData = suspiciousRecipientController.K;
                        suspiciousRecipientContract$InputData.getClass();
                        return new i(kVar, suspiciousRecipientContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousRecipientController.Q;
                        return (e) ((i) suspiciousRecipientController.O.getValue()).f193450c.get();
                }
            }
        });
        final int i3 = 2;
        this.P = te0.w.y0(new Function0(this) { // from class: dbl.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SuspiciousRecipientController f112769b;

            {
                this.f112769b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SuspiciousRecipientController suspiciousRecipientController = this.f112769b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = SuspiciousRecipientController.Q;
                        return n14.e.a(suspiciousRecipientController, (e) suspiciousRecipientController.P.getValue());
                    case 1:
                        KProperty[] kPropertyArr2 = SuspiciousRecipientController.Q;
                        phm.a aVar = (phm.a) ue0.e.j(suspiciousRecipientController.m2()).a().get(k.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", k.class, " is not found"));
                        }
                        k kVar = ((k) aVar2.b()).e;
                        SuspiciousRecipientContract$InputData suspiciousRecipientContract$InputData = suspiciousRecipientController.K;
                        suspiciousRecipientContract$InputData.getClass();
                        return new i(kVar, suspiciousRecipientContract$InputData);
                    default:
                        KProperty[] kPropertyArr3 = SuspiciousRecipientController.Q;
                        return (e) ((i) suspiciousRecipientController.O.getValue()).f193450c.get();
                }
            }
        });
    }

    @Override // cli.w
    public final void B(o oVar, cli.q qVar) {
        b uiState = (b) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f174546c.setHeaderModel(uiState.f112766a);
        LargeActionButton largeActionButton = d3().f174545b;
        Clause clause = uiState.f112767b;
        largeActionButton.setVisibility(clause != null ? 0 : 8);
        largeActionButton.setText(clause);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (i) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (dbl.e) this.P.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174545b.o), new c(this, null, 27), 3);
    }

    public final jii.o d3() {
        ViewBinding value = this.N.getValue(this, Q[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.o) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final a k() {
        return (a0) this.M.getValue();
    }
}
