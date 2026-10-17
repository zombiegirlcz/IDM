package vq0;

import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.CaptionsView;
import efm.r;
import java.util.List;
import jv0.y;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y f291300c;
    public nu0.n d;
    public nu0.i e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f291301g;

    public m() {
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        this.f = "";
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f291301g = "";
    }

    @Override // vq0.a
    public final void a(nu0.m view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f291300c = view.getContentPlayerView();
        this.d = view.getSubtitlesView();
        this.e = view.mo3804getControlsView();
    }

    public final void c() {
        nu0.n nVar;
        if (d0.W(this.f) || (nVar = this.d) == null) {
            return;
        }
        wq0.d dVar = (wq0.d) nVar;
        if (!dVar.c()) {
            nu0.d.d(nVar, false, null, new vd1.a(nVar, this, 27), 2);
            return;
        }
        CaptionsView captionsView = dVar.f299372a;
        ViewPropertyAnimator viewPropertyAnimator = dVar.d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        dVar.d = null;
        captionsView.setVisibility(8);
        captionsView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        if (dVar.f299373b) {
            captionsView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public final void d(String str) {
        nu0.n nVar = this.d;
        if (nVar != null) {
            if (d0.W(str)) {
                c();
                return;
            }
            if (!((wq0.d) nVar).c()) {
                nu0.n nVar2 = this.d;
                if (nVar2 != null) {
                    nu0.d.d(nVar2, true, new qg7.k(this, 15, str, nVar2), null, 4);
                    return;
                }
                return;
            }
            nu0.n nVar3 = this.d;
            if (nVar3 != null) {
                wq0.d dVar = (wq0.d) nVar3;
                dVar.a();
                TextClause text = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                Intrinsics.checkNotNullParameter(text, "text");
                dVar.f299372a.setCaptions(text);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.f291280a.d();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        y yVar = this.f291300c;
        nu0.i iVar = this.e;
        if (yVar == null || iVar == null) {
            return;
        }
        r rVarFlatMapMaybe = ((UiKitPlayerView) yVar).f57715r.filter(new vpg.b(17, new g(2))).map(new vpg.b(18, new g(4))).map(new vpg.b(19, new g(5))).doOnNext(new vpg.b(20, new k(this, 1))).flatMapMaybe(new vpg.b(14, new vh2.j(iVar, 29)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMapMaybe, "flatMapMaybe(...)");
        b(rVarFlatMapMaybe, new ux7.i(1, this, m.class, "onNextText", "onNextText(Ljava/lang/String;)V", 0, 28));
        b(((RichVideoPlayerControlsView) iVar).f57514l, new k(this, 0));
    }
}
