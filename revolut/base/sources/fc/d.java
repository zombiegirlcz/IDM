package fc;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import fag.m0;
import java.util.Objects;
import zb.j;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f133570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f133571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f133572c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ d(g gVar, j jVar, int i, Runnable runnable) {
        this.f133570a = gVar;
        this.f133571b = jVar;
        this.f133572c = i;
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j jVar = this.f133571b;
        int i = this.f133572c;
        Runnable runnable = this.d;
        g gVar = this.f133570a;
        hc.b bVar = (hc.b) gVar.f;
        try {
            try {
                gc.d dVar = (gc.d) gVar.f133581c;
                Objects.requireNonNull(dVar);
                ((gc.j) bVar).j(new m0(dVar, 19));
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) ((Context) gVar.f133579a).getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    ((gc.j) bVar).j(new com.onfido.android.sdk.capture.detector.face.a(gVar, jVar, i));
                } else {
                    gVar.d(jVar, i);
                }
                runnable.run();
            } catch (SynchronizationException unused) {
                ((gpk.c) gVar.d).h(jVar, i + 1, false);
                runnable.run();
            }
        } catch (Throwable th10) {
            runnable.run();
            throw th10;
        }
    }
}
