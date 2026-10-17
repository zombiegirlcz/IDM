package com.revolut.feature.backgroundpicker.impl.flow.upload;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.impl.R$layout;
import com.revolut.feature.backgroundpicker.impl.R$string;
import com.revolut.feature.backgroundpicker.impl.flow.upload.UploadBackgroundController;
import com.revolut.kompot.navigable.a;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import tx0.d0;
import vc.s;
import zm2.b;
import zm2.c;
import zm2.e;
import zm2.f;
import zm2.g;
import zm2.j;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backgroundpicker/impl/flow/upload/UploadBackgroundController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lzm2/f;", "Lcli/w;", "Lzm2/g;", "feature_background_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadBackgroundController extends ViewController<f> implements w {
    public static final /* synthetic */ KProperty[] S = {o0.f186429a.j(new h0(UploadBackgroundController.class, "binding", "getBinding()Lcom/revolut/feature/backgroundpicker/impl/databinding/ScreenUploadBackgroundBinding;", 0))};
    public final e K;
    public final h L;
    public final Object M;
    public final Object N;
    public final Object O;
    public final int P;
    public final boolean Q;
    public final int R;

    public UploadBackgroundController(e inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = s.t(this, b.f);
        final int i = 0;
        this.M = te0.w.y0(new Function0(this) { // from class: zm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadBackgroundController f323323b;

            {
                this.f323323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                UploadBackgroundController uploadBackgroundController = this.f323323b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = UploadBackgroundController.S;
                        qji.b bVarU2 = uploadBackgroundController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.upload.di.UploadBackgroundControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        e eVar = uploadBackgroundController.K;
                        eVar.getClass();
                        return new pm2.g(cVar, bVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadBackgroundController.S;
                        return (j) ((pm2.g) uploadBackgroundController.M.getValue()).f237471b.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadBackgroundController.S;
                        return n14.e.a(uploadBackgroundController, (j) uploadBackgroundController.N.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = te0.w.y0(new Function0(this) { // from class: zm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadBackgroundController f323323b;

            {
                this.f323323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                UploadBackgroundController uploadBackgroundController = this.f323323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UploadBackgroundController.S;
                        qji.b bVarU2 = uploadBackgroundController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.upload.di.UploadBackgroundControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        e eVar = uploadBackgroundController.K;
                        eVar.getClass();
                        return new pm2.g(cVar, bVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadBackgroundController.S;
                        return (j) ((pm2.g) uploadBackgroundController.M.getValue()).f237471b.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadBackgroundController.S;
                        return n14.e.a(uploadBackgroundController, (j) uploadBackgroundController.N.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = te0.w.y0(new Function0(this) { // from class: zm2.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ UploadBackgroundController f323323b;

            {
                this.f323323b = this;
            }

            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                UploadBackgroundController uploadBackgroundController = this.f323323b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = UploadBackgroundController.S;
                        qji.b bVarU2 = uploadBackgroundController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.backgroundpicker.impl.flow.upload.di.UploadBackgroundControllerInjector");
                        pm2.b bVar = (pm2.b) bVarU2;
                        pm2.c cVar = bVar.f237457c;
                        pm2.b bVar2 = bVar.d;
                        e eVar = uploadBackgroundController.K;
                        eVar.getClass();
                        return new pm2.g(cVar, bVar2, eVar);
                    case 1:
                        KProperty[] kPropertyArr2 = UploadBackgroundController.S;
                        return (j) ((pm2.g) uploadBackgroundController.M.getValue()).f237471b.get();
                    default:
                        KProperty[] kPropertyArr3 = UploadBackgroundController.S;
                        return n14.e.a(uploadBackgroundController, (j) uploadBackgroundController.N.getValue());
                }
            }
        });
        this.P = R$layout.screen_upload_background;
        this.Q = true;
        this.R = R$style.ShowcaseSystemBarsMarkerTheme;
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(this.R);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        g uiState = (g) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        d3().f207139c.setImage(uiState.f323327a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (pm2.g) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (j) this.N.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        d3().d.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_cross));
        d3().d.setBackground(d0.TRANSPARENT);
        d3().f207138b.setText(new TextLocalisedClause(R$string.image_cropper_action_title, null, null, 14));
        d3().f207138b.setLoadingButtonTag("UPLOAD_BACKGROUND_BUTTON_TAG");
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        a.g2(this, rd0.e.b(d3().d.f59211b), null, new c(this, null, 0), 3);
        a.g2(this, rd0.e.b(d3().f207138b.o), null, new c(this, null, 1), 3);
    }

    public final mm2.c d3() {
        ViewBinding value = this.L.getValue(this, S[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mm2.c) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getM() {
        return this.P;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (a0) this.O.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.Q);
    }
}
