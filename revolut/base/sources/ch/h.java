package ch;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f24024b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static h f24025c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ce.k f24026a;

    public static h c() {
        h hVar;
        synchronized (f24024b) {
            Preconditions.checkState(f24025c != null, "MlKitContext has not been initialized");
            hVar = (h) Preconditions.checkNotNull(f24025c);
        }
        return hVar;
    }

    public static h d(Context context, Executor executor) {
        h hVar;
        synchronized (f24024b) {
            Preconditions.checkState(f24025c == null, "MlKitContext is already initialized");
            h hVar2 = new h();
            f24025c = hVar2;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList arrayListN = new cpi.g(context, new ce.e(MlKitComponentDiscoveryService.class), 4).n();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            a5.a aVar = ce.g.f23290j1;
            arrayList.addAll(arrayListN);
            arrayList2.add(ce.b.c(context, Context.class, new Class[0]));
            arrayList2.add(ce.b.c(hVar2, h.class, new Class[0]));
            ce.k kVar = new ce.k(executor, arrayList, arrayList2, aVar);
            hVar2.f24026a = kVar;
            kVar.i(true);
            hVar = f24025c;
        }
        return hVar;
    }

    public final Object a(Class cls) {
        Preconditions.checkState(f24025c == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.f24026a);
        return this.f24026a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
