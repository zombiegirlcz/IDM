package com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.EditTrustedLocationController;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mvc.d;
import mvc.g;
import mvc.h;
import mvc.i;
import pki.b;
import te0.w;
import vtc.t;
import vtc.x;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/security_hub/impl/ui/street_mode/edit_trusted_location/EditTrustedLocationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmvc/g;", "Ldli/a;", "Lmvc/h;", "feature_security_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EditTrustedLocationController extends ViewController<g> implements dli.a {
    public final d K;
    public final RowDelegate L;
    public final Object M;
    public final int N;
    public final Object O;
    public final Object P;

    public EditTrustedLocationController(d inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = new RowDelegate(null, null, 7);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTrustedLocationController f209212b;

            {
                this.f209212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (i) ((vtc.d) this.f209212b.P.getValue()).f291963b.get();
                    case 1:
                        EditTrustedLocationController editTrustedLocationController = this.f209212b;
                        return dli.f.a(editTrustedLocationController, (i) editTrustedLocationController.M.getValue(), u.c(editTrustedLocationController.L), 0, null, null, null, 60);
                    default:
                        EditTrustedLocationController editTrustedLocationController2 = this.f209212b;
                        qji.b bVarU2 = editTrustedLocationController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.di.EditTrustedLocationControllerInjector");
                        x xVar = (x) bVarU2;
                        t tVar = xVar.f292093b;
                        x xVar2 = xVar.f292094c;
                        d dVar = editTrustedLocationController2.K;
                        dVar.getClass();
                        return new vtc.d(tVar, xVar2, dVar);
                }
            }
        });
        this.N = R$layout.screen_prompt;
        final int i2 = 1;
        this.O = w.y0(new Function0(this) { // from class: mvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTrustedLocationController f209212b;

            {
                this.f209212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (i) ((vtc.d) this.f209212b.P.getValue()).f291963b.get();
                    case 1:
                        EditTrustedLocationController editTrustedLocationController = this.f209212b;
                        return dli.f.a(editTrustedLocationController, (i) editTrustedLocationController.M.getValue(), u.c(editTrustedLocationController.L), 0, null, null, null, 60);
                    default:
                        EditTrustedLocationController editTrustedLocationController2 = this.f209212b;
                        qji.b bVarU2 = editTrustedLocationController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.di.EditTrustedLocationControllerInjector");
                        x xVar = (x) bVarU2;
                        t tVar = xVar.f292093b;
                        x xVar2 = xVar.f292094c;
                        d dVar = editTrustedLocationController2.K;
                        dVar.getClass();
                        return new vtc.d(tVar, xVar2, dVar);
                }
            }
        });
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mvc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EditTrustedLocationController f209212b;

            {
                this.f209212b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (i) ((vtc.d) this.f209212b.P.getValue()).f291963b.get();
                    case 1:
                        EditTrustedLocationController editTrustedLocationController = this.f209212b;
                        return dli.f.a(editTrustedLocationController, (i) editTrustedLocationController.M.getValue(), u.c(editTrustedLocationController.L), 0, null, null, null, 60);
                    default:
                        EditTrustedLocationController editTrustedLocationController2 = this.f209212b;
                        qji.b bVarU2 = editTrustedLocationController2.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.street_mode.edit_trusted_location.di.EditTrustedLocationControllerInjector");
                        x xVar = (x) bVarU2;
                        t tVar = xVar.f292093b;
                        x xVar2 = xVar.f292094c;
                        d dVar = editTrustedLocationController2.K;
                        dVar.getClass();
                        return new vtc.d(tVar, xVar2, dVar);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        dli.a.z0((h) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (vtc.d) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (i) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.L.f53218h), new mvc.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.O.getValue();
    }
}
