package uo;

import android.app.ActivityManager;
import android.app.ApplicationStartInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import uo.x0;

/* JADX INFO: loaded from: classes17.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f281524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f281525b;

    public y(Context context) {
        int i = Build.VERSION.SDK_INT;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f281524a = context;
        this.f281525b = i;
    }

    public final u0 a() {
        z0 z0Var;
        b1 b1Var;
        w0 w0Var;
        g0 g0Var = null;
        if (this.f281525b >= 35) {
            Object systemService = this.f281524a.getSystemService("activity");
            Intrinsics.i(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            List historicalProcessStartReasons = ((ActivityManager) systemService).getHistoricalProcessStartReasons(1);
            Intrinsics.checkNotNullExpressionValue(historicalProcessStartReasons, "getHistoricalProcessStartReasons(...)");
            ApplicationStartInfo applicationStartInfo = f5l.f.e(zhm.d0.d0(historicalProcessStartReasons));
            if (applicationStartInfo != null) {
                u0.Companion.getClass();
                Intrinsics.checkNotNullParameter(applicationStartInfo, "applicationStartInfo");
                y0 y0Var = z0.Companion;
                int startType = applicationStartInfo.getStartType();
                y0Var.getClass();
                if (startType == 0) {
                    z0Var = z0.START_TYPE_UNSET;
                } else if (startType == 1) {
                    z0Var = z0.START_TYPE_COLD;
                } else if (startType == 2) {
                    z0Var = z0.START_TYPE_WARM;
                } else if (startType != 3) {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "StartType", a0.d.n("Unknown startType:", startType), null, h0Var);
                    z0Var = null;
                } else {
                    z0Var = z0.START_TYPE_HOT;
                }
                a1 a1Var = b1.Companion;
                int startupState = applicationStartInfo.getStartupState();
                a1Var.getClass();
                if (startupState == 0) {
                    b1Var = b1.STARTUP_STATE_STARTED;
                } else if (startupState == 1) {
                    b1Var = b1.STARTUP_STATE_ERROR;
                } else if (startupState != 2) {
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "StartupState", a0.d.n("Unknown startupState:", startupState), null, h0Var2);
                    b1Var = null;
                } else {
                    b1Var = b1.STARTUP_STATE_FIRST_FRAME_DRAWN;
                }
                v0 v0Var = w0.Companion;
                int reason = applicationStartInfo.getReason();
                v0Var.getClass();
                switch (reason) {
                    case 0:
                        w0Var = w0.START_REASON_ALARM;
                        break;
                    case 1:
                        w0Var = w0.START_REASON_BACKUP;
                        break;
                    case 2:
                        w0Var = w0.START_REASON_BOOT_COMPLETE;
                        break;
                    case 3:
                        w0Var = w0.START_REASON_BROADCAST;
                        break;
                    case 4:
                        w0Var = w0.START_REASON_CONTENT_PROVIDER;
                        break;
                    case 5:
                        w0Var = w0.START_REASON_JOB;
                        break;
                    case 6:
                        w0Var = w0.START_REASON_LAUNCHER;
                        break;
                    case 7:
                        w0Var = w0.START_REASON_LAUNCHER_RECENTS;
                        break;
                    case 8:
                        w0Var = w0.START_REASON_OTHER;
                        break;
                    case 9:
                        w0Var = w0.START_REASON_PUSH;
                        break;
                    case 10:
                        w0Var = w0.START_REASON_SERVICE;
                        break;
                    case 11:
                        w0Var = w0.START_REASON_START_ACTIVITY;
                        break;
                    default:
                        zhm.h0 h0Var3 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "StartReason", a0.d.n("Unknown startReason:", reason), null, h0Var3);
                        w0Var = null;
                        break;
                }
                f0 f0Var = g0.Companion;
                int launchMode = applicationStartInfo.getLaunchMode();
                f0Var.getClass();
                if (launchMode == 0) {
                    g0Var = g0.LAUNCH_MODE_STANDARD;
                } else if (launchMode == 1) {
                    g0Var = g0.LAUNCH_MODE_SINGLE_TOP;
                } else if (launchMode == 2) {
                    g0Var = g0.LAUNCH_MODE_SINGLE_INSTANCE;
                } else if (launchMode == 3) {
                    g0Var = g0.LAUNCH_MODE_SINGLE_TASK;
                } else if (launchMode != 4) {
                    zhm.h0 h0Var4 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "LaunchMode", a0.d.n("Unknown launchMode:", launchMode), null, h0Var4);
                } else {
                    g0Var = g0.LAUNCH_MODE_SINGLE_INSTANCE_PER_TASK;
                }
                x0.a aVar = x0.Companion;
                Map timestampMap = applicationStartInfo.getStartupTimestamps();
                Intrinsics.checkNotNullExpressionValue(timestampMap, "getStartupTimestamps(...)");
                aVar.getClass();
                Intrinsics.checkNotNullParameter(timestampMap, "timestampMap");
                return new u0(z0Var, b1Var, w0Var, g0Var, new x0((Long) timestampMap.get(2), (Long) timestampMap.get(3), (Long) timestampMap.get(4), (Long) timestampMap.get(1), (Long) timestampMap.get(5), (Long) timestampMap.get(6), (Long) timestampMap.get(0), (Long) timestampMap.get(30), (Long) timestampMap.get(21), (Long) timestampMap.get(20), (Long) timestampMap.get(7)), applicationStartInfo.wasForceStopped(), applicationStartInfo.getIntent());
            }
        }
        return null;
    }
}
