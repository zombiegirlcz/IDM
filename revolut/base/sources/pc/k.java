package pc;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes16.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f234763a;

    public k(String str) {
        this.f234763a = com.google.android.gms.internal.mlkit_vision_face.a.m("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
    }

    public static String f(String str, String str2, Object... objArr) {
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

    public rc.h a() {
        String str = this.f234763a;
        if (str != null) {
            return new rc.h(str, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    public void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f234763a = str;
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            f(this.f234763a, str, objArr);
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            f(this.f234763a, str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            f(this.f234763a, str, objArr);
        }
    }
}
