package h80;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.n;
import yhm.o;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static WeakReference d;
    public static ActivityManager e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f149931a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CopyOnWriteArrayList f149932b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f149933c = new ArrayList();
    public static final LinkedHashSet f = new LinkedHashSet();

    private c() {
    }

    public static boolean a() throws Throwable {
        int i;
        Activity activityC = c();
        if (activityC != null && activityC.isTaskRoot()) {
            ActivityManager activityManager = e;
            if (activityManager == null) {
                Intrinsics.r("activityManager");
                throw null;
            }
            HashSet hashSetD = d(activityManager);
            Set<Activity> setA = f149931a.a();
            if ((setA instanceof Collection) && setA.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (Activity activity : setA) {
                    if (!activity.isFinishing() && hashSetD.contains(Integer.valueOf(activity.getTaskId())) && (i = i + 1) < 0) {
                        v.r();
                        throw null;
                    }
                }
            }
            if (i == 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        if (c() == null) {
            return false;
        }
        if (e != null) {
            return !d(r1).contains(Integer.valueOf(r0.getTaskId()));
        }
        Intrinsics.r("activityManager");
        throw null;
    }

    public static Activity c() {
        WeakReference weakReference = f149931a.f149930c;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public static HashSet d(ActivityManager activityManager) throws Throwable {
        Object objA;
        int i;
        List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
        Intrinsics.checkNotNullExpressionValue(appTasks, "getAppTasks(...)");
        ArrayList arrayList = new ArrayList();
        for (ActivityManager.AppTask appTask : appTasks) {
            try {
                m.Companion companion = m.INSTANCE;
                if (Build.VERSION.SDK_INT >= 29) {
                    ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                    if (taskInfo != null) {
                        i = taskInfo.taskId;
                        objA = Integer.valueOf(i);
                    }
                    objA = null;
                } else {
                    ActivityManager.RecentTaskInfo taskInfo2 = appTask.getTaskInfo();
                    if (taskInfo2 != null) {
                        i = taskInfo2.id;
                        objA = Integer.valueOf(i);
                    }
                    objA = null;
                }
            } catch (CancellationException e2) {
                throw e2;
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
            Integer num = (Integer) (objA instanceof n ? null : objA);
            if (num != null) {
                arrayList.add(num);
            }
        }
        return d0.b1(arrayList);
    }
}
