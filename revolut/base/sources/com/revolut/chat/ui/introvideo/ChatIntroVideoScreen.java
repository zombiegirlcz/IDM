package com.revolut.chat.ui.introvideo;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import cli.a0;
import cli.o;
import cli.q;
import cli.w;
import com.revolut.chat_core.R$layout;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.video.ZoomableFullScreenVideoView;
import com.revolut.kompot.navigable.vc.ViewController;
import g50.a;
import g50.b;
import g50.c;
import g50.d;
import g50.f;
import h30.p;
import kji.e;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import vc.s;
import yhm.j;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/ui/introvideo/ChatIntroVideoScreen;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lg50/c;", "Lcli/w;", "Lg50/d;", "Lkji/e;", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatIntroVideoScreen extends ViewController<c> implements w, e {
    public static final /* synthetic */ KProperty[] P = {o0.f186429a.j(new h0(ChatIntroVideoScreen.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenChatIntroVideoBinding;", 0))};
    public final ChatIntroVideoScreenContract$InputData K;
    public final Object L;
    public final Object M;
    public final Lazy N;
    public final h O;

    public ChatIntroVideoScreen(ChatIntroVideoScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = te0.w.y0(new a(this, 3));
        this.M = te0.w.y0(new a(this, 4));
        this.N = j.b(new a(this, 5));
        this.O = s.t(this, b.f);
    }

    @Override // com.revolut.kompot.navigable.a
    /* JADX INFO: renamed from: A2 */
    public final Integer getK() {
        return Integer.valueOf(R$style.UiKitTheme_TransparentSlider);
    }

    @Override // cli.w
    public final void B(o oVar, q qVar) {
        d uiState = (d) oVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        if (uiState.f140598a != null) {
            ViewBinding value = this.O.getValue(this, P[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            ((a60.b) value).f1509b.setVideo(uiState.f140598a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (p) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (f) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewBinding value = this.O.getValue(this, P[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ZoomableFullScreenVideoView zoomablePlayerView = ((a60.b) value).f1509b;
        Intrinsics.checkNotNullExpressionValue(zoomablePlayerView, "zoomablePlayerView");
        zoomablePlayerView.setAutoDismissEnabled(false);
        zoomablePlayerView.setNestedScrollingEnabled(true);
        zoomablePlayerView.setOnFirstFrameRendered(new a(this, 0));
        zoomablePlayerView.setOnError(new a(this, 1));
        zoomablePlayerView.setOnDismiss(new a(this, 2));
        zoomablePlayerView.setSkipButton(8000L, new TextLocalisedClause(R$string.chat_assistant_introvideo_skip, null, null, 14));
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId */
    public final int getN() {
        return R$layout.screen_chat_intro_video;
    }

    @Override // oki.f
    public final pki.a k() {
        return (a0) this.N.getValue();
    }
}
