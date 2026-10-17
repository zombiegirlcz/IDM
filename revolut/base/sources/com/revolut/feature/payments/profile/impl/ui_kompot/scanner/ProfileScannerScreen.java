package com.revolut.feature.payments.profile.impl.ui_kompot.scanner;

import aii.q;
import akl.e0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import ao.h;
import avk.i;
import com.revolut.core.ui_kit.R$style;
import com.revolut.feature.payments.profile.impl.R$layout;
import com.revolut.kompot.navigable.screen.BaseScreen;
import io.fotoapparat.view.CameraView;
import jki.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ow9.j;
import te0.w;
import vc.s;
import vkm.j2;
import w01.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreen;", "Lcom/revolut/kompot/navigable/screen/BaseScreen;", "Lax9/g;", "Lcom/revolut/feature/payments/profile/impl/ui_kompot/scanner/ProfileScannerScreenContract$InputData;", "Laii/q;", "retail_feature_payments_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProfileScannerScreen extends BaseScreen<ax9.g, ProfileScannerScreenContract$InputData, q> {
    public static final /* synthetic */ KProperty[] T = {o0.f186429a.j(new h0(ProfileScannerScreen.class, "binding", "getBinding()Lcom/revolut/feature/payments/profile/impl/databinding/ScreenProfileScannerBinding;", 0))};
    public final int M;
    public final int N;
    public final boolean O;
    public final h P;
    public final Object Q;
    public final Object R;
    public xu.f S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileScannerScreen(ProfileScannerScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.M = R$layout.screen_profile_scanner;
        this.N = R$style.UiKitTheme_TransparentNight;
        this.O = true;
        this.P = s.t(this, ax9.c.f);
        this.Q = w.y0(new ax9.b(this, inputData));
        this.R = w.y0(new ax9.b(this));
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getN() {
        return Integer.valueOf(this.N);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(m mVar, o oVar) {
        ax9.g uiState = (ax9.g) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        mw9.d dVarZ2 = Z2();
        ProgressBar profileScannerScannerProgress = dVarZ2.f;
        Intrinsics.checkNotNullExpressionValue(profileScannerScannerProgress, "profileScannerScannerProgress");
        k.e(profileScannerScannerProgress, uiState.f10900a);
        dVarZ2.e.setState(uiState.f10901b);
        TextView textView = dVarZ2.f209419c;
        textView.setText(uiState.f10902c);
        textView.setBackgroundResource(uiState.d);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (j) this.Q.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, vkm.q.q(((f) T2()).f79667w), null, new a2g.q(this, (Continuation) null, 4), 3);
        com.revolut.kompot.navigable.a.g2(this, ((f) T2()).v.f292657c, null, new e0(this, null, 25), 3);
        xu.f fVar = this.S;
        if (fVar != null) {
            com.revolut.kompot.navigable.a.g2(this, rd0.e.b(fVar.f308843h), null, new i(this, continuation, 7), 3);
        } else {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CameraView profileScannerCameraView = Z2().f209418b;
        Intrinsics.checkNotNullExpressionValue(profileScannerCameraView, "profileScannerCameraView");
        ?? r2 = this.Q;
        this.S = new xu.f(context, profileScannerCameraView, (cv.c) ((j) r2.getValue()).f230392b.z.get(), new ax9.d(1, (ar2.c) ((j) r2.getValue()).k.get(), ar2.c.class, "onFrameProcess", "onFrameProcess(Lcom/revolut/camera/PhotoVideoCameraFrame;)V", 0, 0));
        FrameLayout frameLayout = Z2().d;
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.enableTransitionType(4);
        frameLayout.setLayoutTransition(layoutTransition);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final void Y2() {
        xu.f fVar = this.S;
        if (fVar == null) {
            Intrinsics.r("cameraDelegate");
            throw null;
        }
        fVar.b();
        j2 j2Var = ((f) T2()).v.f292656b;
        Boolean bool = Boolean.FALSE;
        j2Var.getClass();
        j2Var.g(null, bool);
    }

    public final mw9.d Z2() {
        ViewBinding value = this.P.getValue(this, T[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (mw9.d) value;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: a3, reason: merged with bridge method [inline-methods] */
    public final ax9.f T2() {
        return (ax9.f) this.R.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.M;
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.O);
    }
}
