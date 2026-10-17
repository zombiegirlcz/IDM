package ecm;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.common.base.Preconditions;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f124782b;

    public c(String str, int i) {
        this.f124781a = i;
        switch (i) {
            case 1:
                this.f124782b = com.google.android.gms.internal.mlkit_vision_face.a.m("UID: [", Process.myUid(), Process.myPid(), "]  PID: [", "] ").concat(str);
                break;
            default:
                this.f124782b = str;
                break;
        }
    }

    public static c a(String str) {
        Preconditions.checkNotNull(str, "debugString");
        return new c(str, 0);
    }

    public static String g(String str, String str2, Object... objArr) {
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

    public void b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            g(this.f124782b, str, objArr);
        }
    }

    public void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            g(this.f124782b, str, objArr);
        }
    }

    public void d(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            g(this.f124782b, str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            g(this.f124782b, str, objArr);
        }
    }

    public void f(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            g(this.f124782b, str, objArr);
        }
    }

    public String toString() {
        switch (this.f124781a) {
            case 0:
                return this.f124782b;
            default:
                return super.toString();
        }
    }
}
