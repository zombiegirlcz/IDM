package q2j;

import android.view.View;
import androidx.camera.video.internal.OutputStorage;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.camera.video.internal.muxer.MuxerFactory;
import androidx.compose.runtime.ShouldPauseCallback;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.util.Consumer;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import com.meshconnect.link.ui.LinkActivity;
import com.revolut.feature.card_payment_method.impl.flows.selector.screens.selector.SelectorScreen;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import q97.u0;
import qc0.c;
import qc0.n0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements kfm.o, Consumer, kfm.p, OnApplyWindowInsetsListener, ShouldPauseCallback, EncoderFactory, MuxerFactory, OutputStorage.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f241686a;

    public /* synthetic */ k() {
        this.f241686a = 15;
        r21.g gVar = r21.g.f;
    }

    @Override // androidx.media3.common.util.Consumer
    public void accept(Object obj2) {
        DrmSessionEventListener.EventDispatcher eventDispatcher = (DrmSessionEventListener.EventDispatcher) obj2;
        switch (this.f241686a) {
            case 1:
                eventDispatcher.drmKeysRemoved();
                break;
            default:
                eventDispatcher.drmKeysRestored();
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f241686a) {
            case 0:
                s sVar = s.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (p) sVar.invoke(p0);
            case 1:
            case 2:
            case 3:
            case 13:
            case 14:
            case 22:
            case 24:
            default:
                rz7.q qVar = rz7.q.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) qVar.invoke(p0);
            case 4:
                q43.r rVar = q43.r.f;
                KProperty[] kPropertyArr = SelectorScreen.f65290n0;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q43.x) rVar.invoke(p0);
            case 5:
                u0 u0Var = u0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (o97.x) u0Var.invoke(p0);
            case 6:
                return (dj0.d) qb3.m.f.invoke(p0);
            case 7:
                qb9.f fVar = qb9.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (e99.a) fVar.invoke(p0);
            case 8:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 9:
                n0 n0Var = n0.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) n0Var.invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "it");
                return c.a.f244403a;
            case 11:
                Intrinsics.checkNotNullParameter(p0, "it");
                return Unit.f186387a;
            case 12:
                return v1.c.u("Error: ", (Throwable) p0);
            case 15:
                r21.g gVar = r21.g.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (n61.o) gVar.invoke(p0);
            case 16:
                r93.b bVar = r93.b.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) bVar.invoke(p0);
            case 17:
                r93.j jVar = r93.j.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NaviCommand) jVar.invoke(p0);
            case 18:
                Throwable it9 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 19:
                rcj.c cVar = rcj.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (uv5.b) cVar.invoke(p0);
            case 20:
                rea.l lVar = rea.l.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) lVar.invoke(p0);
            case 21:
                Throwable error = (Throwable) p0;
                Intrinsics.checkNotNullParameter(error, "error");
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                return Boolean.FALSE;
            case 23:
                rnb.e eVar = rnb.e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) eVar.invoke(p0);
            case 25:
                ryd.q qVar2 = ryd.q.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) qVar2.invoke(p0);
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        switch (this.f241686a) {
            case 13:
                KProperty[] kPropertyArr = TransferOnlyChatScreen.f79800a0;
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "<unused var>");
                return WindowInsetsCompat.CONSUMED;
            case 22:
                int i = LinkActivity.f49860d0;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(insets, "insets");
                Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                view.setPadding(insets2.left, insets2.top, insets2.right, insets2.bottom);
                return insets;
            default:
                Intrinsics.checkNotNullParameter(view, "<unused var>");
                Intrinsics.checkNotNullParameter(insets, "windowInsets");
                int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
                Intrinsics.checkNotNullExpressionValue(insets.getInsets(iSystemBars), "getInsets(...)");
                WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, Insets.NONE).build();
                Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
                return windowInsetsCompatBuild;
        }
    }

    @Override // androidx.compose.runtime.ShouldPauseCallback
    public boolean shouldPause() {
        return LayoutNodeSubcompositionsState.applyPausedPrecomposition$lambda$0$0$0();
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        q43.q qVar = q43.q.f;
        KProperty[] kPropertyArr = SelectorScreen.f65290n0;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((Boolean) qVar.invoke(p0)).booleanValue();
    }

    public /* synthetic */ k(int i) {
        this.f241686a = i;
    }
}
