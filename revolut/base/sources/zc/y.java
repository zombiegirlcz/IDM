package zc;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f320997a;

    public y(String str) {
        this.f320997a = com.google.android.gms.internal.mlkit_vision_face.a.m("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                "Unable to format ".concat(str2);
                str2 = j6.a.r(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return com.google.android.gms.internal.mlkit_vision_face.a.o(str, " : ", str2);
    }

    public final void a(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            d(this.f320997a, str, objArr);
        }
    }

    public final void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            d(this.f320997a, str, objArr);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            d(this.f320997a, str, objArr);
        }
    }
}
