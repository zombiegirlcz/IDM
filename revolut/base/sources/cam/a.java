package cam;

import android.webkit.ValueCallback;
import yhm.m;

/* JADX INFO: loaded from: classes19.dex */
public final class a implements ValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ eim.c f22665a;

    public a(eim.c cVar) {
        this.f22665a = cVar;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj2) {
        m.Companion companion = yhm.m.INSTANCE;
        this.f22665a.resumeWith((Boolean) obj2);
    }
}
