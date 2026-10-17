package eg;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.google.android.gms.common.util.ProcessUtils;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f125436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f125437b;

    static {
        String processName;
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            Intrinsics.checkNotNullExpressionValue(processName, "myProcessName()");
        } else {
            processName = Application.getProcessName();
            if (processName == null && (processName = ProcessUtils.getMyProcessName()) == null) {
                processName = "";
            }
        }
        String strEncodeToString = Base64.encodeToString(kotlin.text.a0.w(processName), 10);
        f125436a = p.a.p("firebase_session_", strEncodeToString, "_data");
        f125437b = p.a.p("firebase_session_", strEncodeToString, "_settings");
    }
}
