package vv8;

import android.app.Activity;
import android.app.Application;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import java.io.File;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import vq5.x;
import vrl.i0;
import zhm.f0;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f292498a;

    public r(a dynamicDeliveryResourcesLoader) {
        uh0.a dynamicDeliveryCompat = uh0.a.f280049a;
        Intrinsics.checkNotNullParameter(dynamicDeliveryCompat, "dynamicDeliveryCompat");
        Intrinsics.checkNotNullParameter(dynamicDeliveryResourcesLoader, "dynamicDeliveryResourcesLoader");
        this.f292498a = dynamicDeliveryResourcesLoader;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Collection collectionV0;
        Collection collectionV02;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        uc.a.a(activity);
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (Build.VERSION.SDK_INT >= 30) {
            a aVar = this.f292498a;
            aim.o oVarA = aVar.f292470b;
            if (oVarA == null) {
                aim.o oVar = new aim.o();
                String[] strArr = activity.getApplicationInfo().splitSourceDirs;
                if (strArr == null || (collectionV0 = kotlin.collections.d.v0(strArr)) == null) {
                    collectionV0 = f0.f322471a;
                }
                oVar.addAll(collectionV0);
                String[] strArr2 = activity.getApplicationInfo().splitPublicSourceDirs;
                if (strArr2 == null || (collectionV02 = kotlin.collections.d.v0(strArr2)) == null) {
                    collectionV02 = f0.f322471a;
                }
                oVar.addAll(collectionV02);
                aim.e eVarB = zhm.u.b();
                try {
                    File file = new File(activity.getApplicationContext().getFilesDir(), "splitcompat");
                    if (file.exists()) {
                        Intrinsics.checkNotNullParameter(file, "<this>");
                        nkm.g gVar = new nkm.g(y.n(lim.n.k(file, FileWalkDirection.TOP_DOWN), new i0(19)));
                        while (gVar.hasNext()) {
                            String absolutePath = ((File) gVar.next()).getAbsolutePath();
                            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                            eVarB.add(absolutePath);
                        }
                    }
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, "Unable to collect split apk paths from filesDir", e, h0Var);
                }
                oVar.addAll(zhm.u.a(eVarB));
                oVarA = y0.a(oVar);
                aVar.f292470b = oVarA;
            }
            Resources resources = activity.getResources();
            aim.f map = oVarA.f5338a;
            map.getClass();
            Intrinsics.checkNotNullParameter(map, "map");
            aim.j jVar = new aim.j(map);
            while (jVar.hasNext()) {
                String str = (String) jVar.next();
                Intrinsics.h(resources);
                try {
                    x xVar = new x(resources, 20);
                    WeakHashMap weakHashMap = aVar.f292469a;
                    Object linkedHashSet = weakHashMap.get(resources);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet();
                        weakHashMap.put(resources, linkedHashSet);
                    }
                    Set set = (Set) linkedHashSet;
                    if (!set.contains(str)) {
                        File file2 = new File(str);
                        if (file2.exists()) {
                            xVar.invoke(file2);
                            set.add(str);
                        }
                    }
                } catch (Exception e2) {
                    String name = new File(str).getName();
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, j6.a.s("Unable to add resource loader for split apk: ", name, " (path=", str, ")"), e2, h0Var2);
                }
            }
        }
        super.onActivityPreCreated(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}
