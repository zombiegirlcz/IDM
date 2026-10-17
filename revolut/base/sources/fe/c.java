package fe;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import le.a1;
import le.d2;
import le.z0;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f134428a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f134429b = new c();

    public static ArrayList c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager != null ? activityManager.getRunningAppProcesses() : null;
        if (runningAppProcesses == null) {
            runningAppProcesses = f0.f322471a;
        }
        ArrayList arrayListZ = d0.Z(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj2 : arrayListZ) {
            if (((ActivityManager.RunningAppProcessInfo) obj2).uid == i) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            z0 z0Var = new z0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                throw new NullPointerException("Null processName");
            }
            z0Var.f194423a = str2;
            z0Var.f194424b = runningAppProcessInfo.pid;
            byte b4 = (byte) (z0Var.e | 1);
            z0Var.f194425c = runningAppProcessInfo.importance;
            z0Var.e = (byte) (b4 | 2);
            z0Var.d = Intrinsics.f(str2, str);
            z0Var.e = (byte) (z0Var.e | 4);
            arrayList2.add(z0Var.a());
        }
        return arrayList2;
    }

    public boolean a(int i) {
        return 4 <= i || Log.isLoggable("FirebaseCrashlytics", i);
    }

    public void b(String str) {
        if (a(3)) {
        }
    }

    public d2 d(Context context) {
        Object next;
        String processName;
        Intrinsics.checkNotNullParameter(context, "context");
        int iMyPid = Process.myPid();
        Iterator it8 = c(context).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((a1) ((d2) next)).f194198b == iMyPid) {
                break;
            }
        }
        d2 d2Var = (d2) next;
        if (d2Var != null) {
            return d2Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "{\n      Process.myProcessName()\n    }");
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                processName = "";
            }
        }
        int i = (12 & 4) != 0 ? 0 : 0;
        Intrinsics.checkNotNullParameter(processName, "processName");
        z0 z0Var = new z0();
        if (processName == null) {
            throw new NullPointerException("Null processName");
        }
        z0Var.f194423a = processName;
        z0Var.f194424b = iMyPid;
        byte b4 = (byte) (z0Var.e | 1);
        z0Var.f194425c = i;
        z0Var.d = false;
        z0Var.e = (byte) (((byte) (b4 | 2)) | 4);
        a1 a1VarA = z0Var.a();
        Intrinsics.checkNotNullExpressionValue(a1VarA, "builder()\n      .setProc…ltProcess)\n      .build()");
        return a1VarA;
    }

    public void e(String str) {
        if (a(2)) {
        }
    }

    public void f(String str, Exception exc2) {
        if (a(5)) {
        }
    }
}
