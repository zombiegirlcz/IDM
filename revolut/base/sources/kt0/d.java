package kt0;

import android.animation.ValueAnimator;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessor;
import androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.audio.AudioTrackAudioOutput;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import com.google.android.material.appbar.AppBarLayout;
import com.revolut.core.ui_kit.internal.views.DraggableWidgetRootFrameLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButtonWithPager;
import com.revolut.core.ui_kit.views.CardsCarouselView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.KeyboardSuggestionsView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.NewRevolutCardView;
import com.revolut.core.ui_kit.views.TiltGlowCardContainerView;
import com.revolut.feature.credit.loan.impl.ui.rev10.repaymentslist.LoanRepaymentsListScreen;
import com.revolut.feature.toggles.impl.interactor.FeatureRegistrationValidatorImpl$FeatureDefinitionError;
import com.trustdockekyc.core.backend.presentation.ProgressDialogFragment;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import ku2.h;
import lbm.i;
import lbm.j;
import lki.z;
import mc4.g;
import ms0.o4;
import mx0.a5;
import mx0.p0;
import mx0.vc;
import oo0.k;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f189492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f189493b;

    public /* synthetic */ d(Object obj2, int i) {
        this.f189492a = i;
        this.f189493b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f189492a;
        Object obj2 = this.f189493b;
        switch (i) {
            case 0:
                e eVar = (e) obj2;
                eVar.d = true;
                f fVar = (f) eVar.f;
                fVar.f189497a.setSelectedPosition$ui_kit_components_release(eVar.b());
                fVar.f189497a.getParent().requestDisallowInterceptTouchEvent(true);
                return;
            case 1:
                h hVar = (h) obj2;
                hVar.f189641a.a(hVar.f189642b);
                return;
            case 2:
                ((DualSurfaceProcessor) obj2).lambda$release$4();
                return;
            case 3:
                ((DualSurfaceProcessorNode) obj2).lambda$release$1();
                return;
            case 4:
                i iVar = (i) obj2;
                int i2 = 0;
                if (iVar.d.compareAndSet(true, false)) {
                    j jVar = iVar.f;
                    jVar.getClass();
                    jVar.f(jbm.a.OPEN, new lbm.c(jVar, i2));
                    return;
                }
                return;
            case 5:
                throw ((RuntimeException) obj2);
            case 6:
                lji.c cVar = (lji.c) obj2;
                ViewParent parent = cVar.d.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(cVar.d);
                    return;
                }
                return;
            case 7:
                z zVar = (z) obj2;
                zVar.r();
                zVar.q();
                return;
            case 8:
                lz0.d dVar = (lz0.d) obj2;
                oo0.d dVar2 = dVar.f200855b;
                Uri uri2 = dVar.f200854a;
                k kVar = (k) dVar2;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(uri2, "uri");
                if (uri2.equals(kVar.f)) {
                    kVar.c().pause();
                    kVar.j();
                    return;
                } else {
                    oo0.i iVarE = k.e(uri2, kVar.d);
                    iVarE.a(oo0.a.PAUSED);
                    kVar.b(uri2, iVarE);
                    return;
                }
            case 9:
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "KontomatikSignInJS", "onStarted", null, null, 16);
                ((g) obj2).e.invoke();
                return;
            case 10:
                c01.d dVarQ = ((mqi.d) obj2).Q();
                if (dVarQ != null) {
                    ((hz0.e) dVarQ).d(true);
                    return;
                }
                return;
            case 11:
                DraggableWidgetRootFrameLayout.a((DraggableWidgetRootFrameLayout) obj2);
                return;
            case 12:
                SmallActionButtonWithPager smallActionButtonWithPager = (SmallActionButtonWithPager) obj2;
                o4 o4Var = smallActionButtonWithPager.f56403j;
                o4 o4Var2 = o4.CONTENT_VISIBLE;
                if (o4Var == o4Var2) {
                    return;
                }
                smallActionButtonWithPager.g0();
                smallActionButtonWithPager.f56403j = o4Var2;
                smallActionButtonWithPager.h0();
                return;
            case 13:
                throw ((FeatureRegistrationValidatorImpl$FeatureDefinitionError) obj2);
            case 14:
                p0 p0Var = (p0) obj2;
                p0.a aVar = p0.Companion;
                p0Var.invalidate();
                d dVar3 = p0Var.C;
                if (dVar3 != null) {
                    p0Var.postDelayed(dVar3, 100L);
                    return;
                } else {
                    Intrinsics.r("cursorDrawRunnable");
                    throw null;
                }
            case 15:
                CardsCarouselView.setItems$lambda$0((CardsCarouselView) obj2);
                return;
            case 16:
                int i3 = ChatInputView.I0;
                ((ImageView) obj2).setVisibility(4);
                return;
            case 17:
                ValueAnimator valueAnimator = ((a5) obj2).f209582g;
                if (valueAnimator == null || valueAnimator.isStarted()) {
                    return;
                }
                valueAnimator.start();
                return;
            case 18:
                KeyboardSuggestionsView.setModel$lambda$0((KeyboardSuggestionsView) obj2);
                return;
            case 19:
                MapView mapView = (MapView) obj2;
                if (mapView.f58778s == null) {
                    mapView.setLifecycle(w.A(mapView));
                    return;
                }
                return;
            case 20:
                NewRevolutCardView.e((NewRevolutCardView) obj2);
                return;
            case 21:
                AppCompatTextView appCompatTextView = (AppCompatTextView) obj2;
                NewRevolutCardView.Companion companion = NewRevolutCardView.INSTANCE;
                appCompatTextView.invalidate();
                appCompatTextView.requestLayout();
                return;
            case 22:
                TiltGlowCardContainerView.a aVar2 = TiltGlowCardContainerView.Companion;
                ((TiltGlowCardContainerView) obj2).f58907b = vc.PROCESSING;
                return;
            case 23:
                FragmentManager supportFragmentManager = (FragmentManager) obj2;
                Intrinsics.checkNotNullParameter(supportFragmentManager, "$supportFragmentManager");
                Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag("progress_dialog_fragment");
                ProgressDialogFragment progressDialogFragment = fragmentFindFragmentByTag instanceof ProgressDialogFragment ? (ProgressDialogFragment) fragmentFindFragmentByTag : null;
                if (progressDialogFragment != null && progressDialogFragment.isAdded()) {
                    progressDialogFragment.dismiss();
                    return;
                }
                return;
            case 24:
                ((DefaultAnalyticsCollector) obj2).releaseInternal();
                return;
            case 25:
                ((DefaultTimeBar) obj2).lambda$new$0();
                return;
            case 26:
                ((PlayerControlView) obj2).updateProgress();
                return;
            case 27:
                LoanRepaymentsListScreen loanRepaymentsListScreen = (LoanRepaymentsListScreen) obj2;
                KProperty[] kPropertyArr = LoanRepaymentsListScreen.f70576e0;
                db.a aVar3 = new db.a(loanRepaymentsListScreen, 2);
                n85.e eVar2 = new n85.e(loanRepaymentsListScreen);
                loanRepaymentsListScreen.h3().f259773c.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) aVar3);
                loanRepaymentsListScreen.h3().d.addOnScrollListener(eVar2);
                return;
            case 28:
                AudioTrackAudioOutput.lambda$releaseAudioTrackAsync$0((ListenerSet) obj2);
                return;
            default:
                ((DefaultAudioSink) obj2).maybeReportSkippedSilence();
                return;
        }
    }
}
