package rc;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static yf.c f253181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final af.f f253182b = new af.f(13);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final af.f f253183c = new af.f(14);

    public static c a(Context context) {
        yf.c cVar;
        synchronized (x.class) {
            try {
                if (f253181a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f253181a = new yf.c(context, 23);
                }
                cVar = f253181a;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return (c) ((zc.m) cVar.b).a();
    }
}
