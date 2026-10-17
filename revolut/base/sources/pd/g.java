package pd;

import android.app.Application;
import android.content.Context;
import android.os.Trace;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import ce.k;
import ce.p;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import de.m;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayMap f235022l = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f235023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f235025c;
    public final k d;
    public final AtomicBoolean e;
    public final AtomicBoolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f235026g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final cf.b f235027h;
    public final CopyOnWriteArrayList i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f235028j;

    public g(Context context, String str, i iVar) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.i = copyOnWriteArrayList;
        this.f235028j = new CopyOnWriteArrayList();
        this.f235023a = (Context) Preconditions.checkNotNull(context);
        this.f235024b = Preconditions.checkNotEmpty(str);
        this.f235025c = (i) Preconditions.checkNotNull(iVar);
        a aVar = FirebaseInitProvider.f49611a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayListN = new cpi.g(context, new ce.e(ComponentDiscoveryService.class), 4).n();
        Trace.endSection();
        Trace.beginSection("Runtime");
        m mVar = m.INSTANCE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(arrayListN);
        int i = 1;
        arrayList.add(new ce.d(new FirebaseCommonRegistrar(), i));
        arrayList.add(new ce.d(new ExecutorsRegistrar(), i));
        arrayList2.add(ce.b.c(context, Context.class, new Class[0]));
        arrayList2.add(ce.b.c(this, g.class, new Class[0]));
        arrayList2.add(ce.b.c(iVar, i.class, new Class[0]));
        qf.b bVar = new qf.b(6);
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.f49612b.get()) {
            arrayList2.add(ce.b.c(aVar, a.class, new Class[0]));
        }
        k kVar = new k(mVar, arrayList, arrayList2, bVar);
        this.d = kVar;
        Trace.endSection();
        this.f235026g = new p(new ce.i(this, context, 1));
        this.f235027h = kVar.c(af.e.class);
        d dVar = new d(this);
        a();
        if (atomicBoolean.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        copyOnWriteArrayList.add(dVar);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static g c() {
        g gVar;
        synchronized (k) {
            try {
                gVar = (g) f235022l.get("[DEFAULT]");
                if (gVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((af.e) gVar.f235027h.get()).a();
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (k) {
            try {
                if (f235022l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    return null;
                }
                return g(context, iVarA);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f235019a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f235019a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                while (true) {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(eVar);
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        break;
                    }
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            ArrayMap arrayMap = f235022l;
            Preconditions.checkState(!arrayMap.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            arrayMap.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final Object b(Class cls) {
        a();
        return this.d.a(cls);
    }

    public final String d() {
        StringBuilder sb6 = new StringBuilder();
        a();
        sb6.append(Base64Utils.encodeUrlSafeNoPadding(this.f235024b.getBytes(Charset.defaultCharset())));
        sb6.append("+");
        a();
        sb6.append(Base64Utils.encodeUrlSafeNoPadding(this.f235025c.f235031b.getBytes(Charset.defaultCharset())));
        return sb6.toString();
    }

    public final void e() {
        Context context = this.f235023a;
        boolean zIsUserUnlocked = UserManagerCompat.isUserUnlocked(context);
        String str = this.f235024b;
        if (!zIsUserUnlocked) {
            StringBuilder sb6 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb6.append(str);
            sb6.toString();
            f.a(context);
            return;
        }
        StringBuilder sb9 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb9.append(str);
        sb9.toString();
        a();
        this.d.i("[DEFAULT]".equals(str));
        ((af.e) this.f235027h.get()).a();
    }

    public final boolean equals(Object obj2) {
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        gVar.a();
        return this.f235024b.equals(gVar.f235024b);
    }

    public final boolean h() {
        boolean z;
        a();
        hf.a aVar = (hf.a) this.f235026g.get();
        synchronized (aVar) {
            z = aVar.f151737a;
        }
        return z;
    }

    public final int hashCode() {
        return this.f235024b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f235024b).add("options", this.f235025c).toString();
    }
}
