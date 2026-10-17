package tg;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.maps.Projection;
import sgm.j1;

/* JADX INFO: loaded from: classes17.dex */
public final class l extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f271023a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f271024b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f271025c;

    public l(m mVar) {
        this.f271025c = mVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        k kVar;
        if (message.what == 1) {
            this.f271023a = false;
            if (this.f271024b != null) {
                sendEmptyMessage(0);
                return;
            }
            return;
        }
        removeMessages(0);
        if (this.f271023a || this.f271024b == null) {
            return;
        }
        Projection projection = this.f271025c.f271028a.getProjection();
        synchronized (this) {
            kVar = this.f271024b;
            this.f271024b = null;
            this.f271023a = true;
        }
        kVar.f271021b = new j1(this, 3);
        kVar.f271022c = projection;
        kVar.e = this.f271025c.f271028a.getCameraPosition().zoom;
        kVar.d = new wg.b(Math.pow(2.0d, Math.min(r7, kVar.f.f271035m)) * 256.0d);
        this.f271025c.e.execute(kVar);
    }
}
