package sd0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import skm.e0;
import skm.r;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f261797b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f261796a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f261798c = e0.b();

    public static final void a() {
        if (f261797b) {
            return;
        }
        h hVar = new h();
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e() || od0.a.i()) {
            new Handler(Looper.getMainLooper()).post(new o6.a(hVar, 26));
            return;
        }
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, hVar, h0Var);
    }
}
