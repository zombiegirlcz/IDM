package vq0;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import com.revolut.core.ui_kit.internal.views.fullscreenheader.InternalFullscreenHeaderView;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import efm.r;
import jv0.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import org.jetbrains.annotations.NotNull;
import sgm.j1;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends vq0.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public nu0.m f291293c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final j1 e = new j1(new j(0, 0, h.class, this, "hideInterface", "hideInterface(Z)V"));
    public boolean f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f291294g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f291295h;

    public static final class a {
        private a() {
        }
    }

    @Override // vq0.a
    public final void a(nu0.m view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f291293c = view;
    }

    public final void c(boolean z) {
        nu0.m mVar = this.f291293c;
        if (mVar != null) {
            y contentPlayerView = mVar.getContentPlayerView();
            long contentDuration = contentPlayerView.getContentDuration() - contentPlayerView.getContentPosition();
            if (contentDuration < 0) {
                contentDuration = 0;
            }
            if (contentDuration != 0 || z) {
                nu0.d.d(mVar.getInterfaceAnimatedView(), false, null, new f(this, 0), 2);
            }
        }
    }

    public final void d() {
        nu0.d interfaceAnimatedView;
        this.d.removeCallbacks(this.e);
        nu0.m mVar = this.f291293c;
        if (mVar == null || (interfaceAnimatedView = mVar.getInterfaceAnimatedView()) == null) {
            return;
        }
        nu0.d.d(interfaceAnimatedView, true, null, new f(this, 1), 2);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.f291280a.d();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        h hVar;
        nu0.m mVar = this.f291293c;
        if (mVar != null) {
            mVar.getInterfaceAnimatedView().a();
            this.f = true;
            this.d.postDelayed(this.e, 5000L);
            b(((nu0.c) mVar).v, new vh2.j(this, 28));
        }
        nu0.m mVar2 = this.f291293c;
        if (mVar2 != null) {
            nu0.d interfaceAnimatedView = mVar2.getInterfaceAnimatedView();
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            r rVarMerge = r.merge(((RichVideoPlayerControlsView) mVar2.mo3804getControlsView()).i, ((RichVideoPlayerControlsView) mVar2.mo3804getControlsView()).f57513j, ((RichVideoPlayerControlsView) mVar2.mo3804getControlsView()).k, ((InternalFullscreenHeaderView) mVar2.mo3805getHeaderView()).f57102g);
            Intrinsics.checkNotNullExpressionValue(rVarMerge, "merge(...)");
            hVar = this;
            b(rVarMerge, new sc7.b(ref$BooleanRef, mVar2, hVar, interfaceAnimatedView, 21));
        } else {
            hVar = this;
        }
        nu0.m mVar3 = hVar.f291293c;
        if (mVar3 != null) {
            r map = ((UiKitPlayerView) mVar3.getContentPlayerView()).f57715r.filter(new vpg.b(12, new g(0))).map(new vpg.b(13, new g(1)));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            b(map, new vgk.f(mVar3, this, 24));
        }
    }
}
