package ce;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.Process;
import android.os.StrictMode;
import androidx.core.content.res.ResourcesCompat;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.NetworkTypeObserver;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicMarkableReference;
import nf.w;
import xf.q0;
import xf.t0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f23297c;

    public /* synthetic */ j(Object obj2, Object obj3, int i) {
        this.f23295a = i;
        this.f23297c = obj2;
        this.f23296b = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v67, types: [ce.p] */
    /* JADX WARN: Type inference failed for: r0v68, types: [ce.p] */
    /* JADX WARN: Type inference failed for: r0v74 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX WARN: Type inference failed for: r0v80 */
    @Override // java.lang.Runnable
    public final void run() {
        cf.a aVar;
        ArrayList arrayList;
        boolean zEquals = false;
        switch (this.f23295a) {
            case 0:
                r rVar = (r) this.f23297c;
                cf.b bVar = (cf.b) this.f23296b;
                if (rVar.f23321b != r.d) {
                    throw new IllegalStateException("provide() can be called only once.");
                }
                synchronized (rVar) {
                    aVar = rVar.f23320a;
                    rVar.f23320a = null;
                    rVar.f23321b = bVar;
                    break;
                }
                aVar.b(bVar);
                return;
            case 1:
                q qVar = (q) this.f23297c;
                cf.b bVar2 = (cf.b) this.f23296b;
                synchronized (qVar) {
                    try {
                        if (qVar.f23318b == null) {
                            qVar.f23317a.add(bVar2);
                        } else {
                            qVar.f23318b.add(bVar2.get());
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f23297c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f23296b;
                af.j jVar = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 3:
                de.a aVar2 = (de.a) this.f23297c;
                Runnable runnable = (Runnable) this.f23296b;
                Process.setThreadPriority(aVar2.f113263c);
                StrictMode.ThreadPolicy threadPolicy = aVar2.d;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
                return;
            case 4:
                JobInfoSchedulerService jobInfoSchedulerService = (JobInfoSchedulerService) this.f23297c;
                JobParameters jobParameters = (JobParameters) this.f23296b;
                int i = JobInfoSchedulerService.f37252a;
                jobInfoSchedulerService.jobFinished(jobParameters, false);
                return;
            case 5:
                ((ie.n) this.f23297c).c((String) this.f23296b, Boolean.FALSE);
                return;
            case 6:
                ie.r rVar2 = (ie.r) this.f23297c;
                String str = (String) this.f23296b;
                oe.c cVar = rVar2.f160558g.d;
                cVar.getClass();
                String strA = ke.e.a(1024, str);
                synchronized (((AtomicMarkableReference) cVar.f224500g)) {
                    try {
                        String str2 = (String) ((AtomicMarkableReference) cVar.f224500g).getReference();
                        if (strA != null) {
                            zEquals = strA.equals(str2);
                        } else if (str2 == null) {
                            zEquals = true;
                        }
                        if (zEquals) {
                            return;
                        }
                        ((AtomicMarkableReference) cVar.f224500g).set(strA, true);
                        ((je.d) cVar.f224499c).f173168b.b(new androidx.view.d(cVar, 16));
                        return;
                    } finally {
                    }
                }
            case 7:
                ((ie.r) this.f23297c).a((fc.g) this.f23296b);
                return;
            case 8:
                ((NetworkTypeObserver) this.f23297c).lambda$new$0((Context) this.f23296b);
                return;
            case 9:
                oe.c cVar2 = (oe.c) this.f23297c;
                ((ke.h) cVar2.f224498b).i((String) cVar2.f224497a, (List) this.f23296b);
                return;
            case 10:
                cpi.g gVar = (cpi.g) this.f23297c;
                String str3 = (String) this.f23296b;
                synchronized (((List) gVar.f107954b)) {
                    arrayList = new ArrayList((List) gVar.f107954b);
                    break;
                }
                Iterator it8 = arrayList.iterator();
                while (it8.hasNext()) {
                    ((SharedPreferences.OnSharedPreferenceChangeListener) it8.next()).onSharedPreferenceChanged(null, str3);
                }
                return;
            case 11:
                ((MediaMetricsListener) this.f23297c).lambda$reportTrackChangeEvent$3((TrackChangeEvent) this.f23296b);
                return;
            case 12:
                ((MediaMetricsListener) this.f23297c).lambda$maybeReportNetworkChange$1((NetworkEvent) this.f23296b);
                return;
            case 13:
                ((MediaMetricsListener) this.f23297c).lambda$maybeReportPlaybackError$0((PlaybackErrorEvent) this.f23296b);
                return;
            case 14:
                ((MediaMetricsListener) this.f23297c).lambda$finishCurrentSession$4((PlaybackMetrics) this.f23296b);
                return;
            case 15:
                ((MediaMetricsListener) this.f23297c).lambda$maybeReportPlaybackStateChange$2((PlaybackStateEvent) this.f23296b);
                return;
            case 16:
                w wVar = (w) this.f23297c;
                Context context = (Context) this.f23296b;
                if (wVar.f214790a != null || context == null) {
                    return;
                }
                wVar.f214790a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
                return;
            case 17:
                pe.c cVar3 = (pe.c) this.f23297c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f23296b;
                try {
                    zb.s.a().d.d(cVar3.f235278h.f320794a.b(wb.e.HIGHEST), 1);
                    break;
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                ((ResourcesCompat.FontCallback) this.f23297c).lambda$callbackSuccessAsync$0((Typeface) this.f23296b);
                return;
            case 19:
                ((AppStartTrace) this.f23297c).f49566b.c((t0) ((q0) this.f23296b).a(), xf.n.FOREGROUND_BACKGROUND);
                return;
            case 20:
                ((MediaCodecRenderer) this.f23297c).lambda$feedInputBuffer$0((FormatHolder) this.f23296b);
                return;
            case 21:
                ConstraintTracker._set_state_$lambda$4$lambda$3((List) this.f23297c, (ConstraintTracker) this.f23296b);
                return;
            case 22:
                wf.e eVar = (wf.e) this.f23297c;
                wf.b bVar3 = (wf.b) this.f23296b;
                eVar.getClass();
                eVar.d(bVar3.f296839a, bVar3.f296840b);
                return;
            case 23:
                xd.a aVar3 = (xd.a) this.f23297c;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) this.f23296b;
                xd.d dVar = aVar3.f304192c;
                String str4 = xd.d.f304195b.f245003a;
                ?? r06 = dVar.f304196a;
                String string = ((SharedPreferences) r06.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) r06.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string != null && string2 != null) {
                    try {
                        int i2 = xd.b.f304194a[xd.c.valueOf(string).ordinal()];
                        if (i2 == 1) {
                            nd.k.e(string2);
                            r06 = r06;
                        } else if (i2 != 2) {
                            r06 = "Reached unreachable section in #retrieveAppCheckToken()";
                        } else {
                            nd.k.d(string2);
                            r06 = r06;
                        }
                    } catch (IllegalArgumentException e2) {
                        StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        sbX.append(e2.getMessage());
                        sbX.toString();
                        ((SharedPreferences) r06.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    break;
                }
                taskCompletionSource2.setResult(null);
                return;
            default:
                ((VideoRendererEventListener.EventDispatcher) this.f23297c).lambda$videoSizeChanged$5((VideoSize) this.f23296b);
                return;
        }
    }
}
