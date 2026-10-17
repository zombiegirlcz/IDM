package vq0;

import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.media3.exoplayer.ExoPlayer;
import aw0.o9;
import ch.qos.logback.core.CoreConstants;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jv0.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import uyh.w;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends a {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f291285c;
    public y d;
    public nu0.i e;
    public nu0.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f291286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f291287h;
    public final b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f291288j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f291289l;

    /* JADX WARN: Type inference failed for: r2v2, types: [vq0.b] */
    /* JADX WARN: Type inference failed for: r2v3, types: [vq0.b] */
    public e(n timeFormatter) {
        Intrinsics.checkNotNullParameter(timeFormatter, "timeFormatter");
        this.f291285c = timeFormatter;
        this.f291286g = new Handler(Looper.getMainLooper());
        final int i = 0;
        this.f291287h = new Runnable(this) { // from class: vq0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f291283b;

            {
                this.f291283b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i) {
                    case 0:
                        this.f291283b.c();
                        break;
                    default:
                        e eVar = this.f291283b;
                        nu0.n nVar = eVar.f;
                        if (nVar == null || !((wq0.d) nVar).c()) {
                            nu0.i iVar = eVar.e;
                            nu0.n nVar2 = eVar.f;
                            if (iVar != null && nVar2 != null) {
                                ((wq0.d) nVar2).b(new vch.a(iVar, 18), new vch.a(eVar, 19), false);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.i = new Runnable(this) { // from class: vq0.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f291283b;

            {
                this.f291283b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f291283b.c();
                        break;
                    default:
                        e eVar = this.f291283b;
                        nu0.n nVar = eVar.f;
                        if (nVar == null || !((wq0.d) nVar).c()) {
                            nu0.i iVar = eVar.e;
                            nu0.n nVar2 = eVar.f;
                            if (iVar != null && nVar2 != null) {
                                ((wq0.d) nVar2).b(new vch.a(iVar, 18), new vch.a(eVar, 19), false);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        this.k = true;
    }

    @Override // vq0.a
    public final void a(nu0.m view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.d = view.getContentPlayerView();
        this.e = view.mo3804getControlsView();
        this.f = view.getErrorSubtitlesView();
    }

    public final void c() {
        Handler handler = this.f291286g;
        b bVar = this.f291287h;
        handler.removeCallbacks(bVar);
        y yVar = this.d;
        nu0.i iVar = this.e;
        if (yVar == null || iVar == null) {
            return;
        }
        handler.postDelayed(bVar, 1000L);
        long contentPosition = yVar.getContentPosition();
        if (contentPosition < 0) {
            contentPosition = 0;
        }
        long contentDuration = yVar.getContentDuration();
        long j2 = contentDuration >= 0 ? contentDuration : 0L;
        int maxProgress = (int) ((contentPosition / j2) * iVar.getMaxProgress());
        this.f291288j = Math.max(this.f291288j, maxProgress);
        if (this.k) {
            iVar.setProgress(maxProgress);
            d(contentPosition, j2);
        }
    }

    public final void d(long j2, long j3) {
        nu0.i iVar = this.e;
        if (iVar != null) {
            this.f291285c.getClass();
            long j5 = j3 - j2;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long minutes = timeUnit.toMinutes(j5);
            if (minutes < 0) {
                minutes = 0;
            }
            long seconds = timeUnit.toSeconds(j5 - TimeUnit.MINUTES.toMillis(minutes));
            long j16 = seconds >= 0 ? seconds : 0L;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(minutes < 10 ? p.a.m(minutes, "0") : String.valueOf(minutes));
            sb6.append(CoreConstants.COLON_CHAR);
            sb6.append(j16 < 10 ? p.a.m(j16, "0") : String.valueOf(j16));
            iVar.setTimeText(new TextClause(sb6.toString(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        this.f291286g.removeCallbacks(this.f291287h);
        this.f291280a.d();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        c();
        y yVar = this.d;
        nu0.i iVar = this.e;
        if (yVar != null && iVar != null) {
            UiKitPlayerView uiKitPlayerView = (UiKitPlayerView) yVar;
            ExoPlayer exoPlayer = uiKitPlayerView.f57712n;
            ((RichVideoPlayerControlsView) iVar).g0(pd.b.j(exoPlayer != null ? Boolean.valueOf(exoPlayer.isPlaying()) : null) ? nu0.e.PAUSE : nu0.e.PLAY);
            b(uiKitPlayerView.f57715r, new w(iVar, 23, this, yVar));
        }
        y yVar2 = this.d;
        nu0.i iVar2 = this.e;
        if (yVar2 == null || iVar2 == null) {
            return;
        }
        RichVideoPlayerControlsView richVideoPlayerControlsView = (RichVideoPlayerControlsView) iVar2;
        b(richVideoPlayerControlsView.f57513j, new vh2.j(yVar2, 26));
        b(richVideoPlayerControlsView.k, new vh2.j(this, 27));
    }
}
