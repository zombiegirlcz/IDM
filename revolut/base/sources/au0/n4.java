package au0;

import android.view.View;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.revolut.core.ui_kit.internal.views.FilterButton;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.navbar.SearchView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class n4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f9286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f9287c;

    public /* synthetic */ n4(Object obj2, boolean z, int i) {
        this.f9285a = i;
        this.f9287c = obj2;
        this.f9286b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9285a;
        Object obj2 = this.f9287c;
        boolean z = this.f9286b;
        switch (i) {
            case 0:
                SearchView.a((SearchView) obj2, z);
                break;
            case 1:
                int i2 = fu0.e.f138054m;
                ((fu0.e) obj2).b(z);
                break;
            case 2:
                ((hyl.h) obj2).f156915b.invoke(Boolean.valueOf(z));
                break;
            case 3:
                FilterButton filterButton = (FilterButton) obj2;
                FilterButton.Companion aVar = FilterButton.INSTANCE;
                if (!z) {
                    filterButton.setVisibility(8);
                }
                break;
            case 4:
                SmallActionButton smallActionButton = (SmallActionButton) obj2;
                SmallActionButton.Companion aVar2 = SmallActionButton.INSTANCE;
                if (!z) {
                    smallActionButton.setVisibility(8);
                }
                break;
            case 5:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$skipSilenceEnabledChanged$7(z);
                break;
            case 6:
                SelectorScreen selectorScreen = (SelectorScreen) obj2;
                if (z) {
                    KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                    selectorScreen.h3().e.setVisibility(0);
                }
                e0m.e.c(selectorScreen.m2());
                View currentFocus = selectorScreen.m2().getCurrentFocus();
                if (currentFocus != null) {
                    currentFocus.clearFocus();
                }
                selectorScreen.l3();
                break;
            case 7:
                ((qod.e) obj2).f248162b.invoke(Boolean.valueOf(z));
                break;
            case 8:
                ((AudioStream.AudioStreamCallback) obj2).onSilenceStateChanged(z);
                break;
            case 9:
                NavBarWithToolbar.O((NavBarWithToolbar) obj2, z);
                break;
            default:
                fc.g gVar = (fc.g) obj2;
                int i3 = 1;
                if (!z) {
                    try {
                        ufm.c cVar = new ufm.c(new tx9.a(((tx9.f) gVar.f133579a).f275378a, i3), 2);
                        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
                        ufm.i iVar = new ufm.i(te0.w.i0(cVar), new xx9.d(18, new xx9.f(5)), 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        if (((Boolean) iVar.e()).booleanValue()) {
                        }
                    } catch (Exception e) {
                        zhm.h0 h0Var = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                    }
                }
                pfm.a aVarF = gVar.f();
                ofm.f fVar = new ofm.f(1);
                aVarF.d(fVar);
                fVar.a();
                break;
        }
    }

    public /* synthetic */ n4(boolean z, Object obj2, int i) {
        this.f9285a = i;
        this.f9286b = z;
        this.f9287c = obj2;
    }
}
