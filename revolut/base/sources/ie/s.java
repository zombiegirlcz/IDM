package ie;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import le.t0;
import le.u0;
import le.v0;
import le.x0;

/* JADX INFO: loaded from: classes.dex */
public final class s {
    public static final HashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f160564g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f160565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f160566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f160567c;
    public final ao.h d;
    public final fc.g e;

    static {
        HashMap map = new HashMap();
        f = map;
        com.google.android.gms.internal.mlkit_vision_face.a.A(5, map, "armeabi", 6, "armeabi-v7a");
        com.google.android.gms.internal.mlkit_vision_face.a.A(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f160564g = "Crashlytics Android SDK/19.4.4";
    }

    public s(Context context, z zVar, a aVar, ao.h hVar, fc.g gVar) {
        this.f160565a = context;
        this.f160566b = zVar;
        this.f160567c = aVar;
        this.d = hVar;
        this.e = gVar;
    }

    public static u0 c(com.google.firebase.messaging.t tVar, int i) {
        String str = (String) tVar.f49544c;
        String str2 = (String) tVar.f49543b;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) tVar.d;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        com.google.firebase.messaging.t tVar2 = (com.google.firebase.messaging.t) tVar.e;
        if (i >= 8) {
            com.google.firebase.messaging.t tVar3 = tVar2;
            while (tVar3 != null) {
                tVar3 = (com.google.firebase.messaging.t) tVar3.e;
                i2++;
            }
        }
        int i3 = i2;
        List listD = d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        byte b4 = (byte) (0 | 1);
        u0 u0VarC = null;
        if (tVar2 != null && i3 == 0) {
            u0VarC = c(tVar2, i + 1);
        }
        if (b4 == 1) {
            return new u0(str, str2, listD, u0VarC, i3);
        }
        StringBuilder sb6 = new StringBuilder();
        if ((b4 & 1) == 0) {
            sb6.append(" overflowCount");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            x0 x0Var = new x0();
            x0Var.e = i;
            x0Var.f = (byte) (x0Var.f | 4);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            x0Var.f194412a = jMax;
            byte b4 = (byte) (x0Var.f | 1);
            x0Var.f = b4;
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            x0Var.f194413b = str;
            x0Var.f194414c = fileName;
            x0Var.d = lineNumber;
            x0Var.f = (byte) (b4 | 2);
            arrayList.add(x0Var.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static v0 e() {
        byte b4 = (byte) 1;
        if (b4 == 1) {
            return new v0("0", "0", 0L);
        }
        StringBuilder sb6 = new StringBuilder();
        if (b4 == 0) {
            sb6.append(" address");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    public final List a() {
        byte b4 = (byte) (((byte) (0 | 1)) | 2);
        a aVar = this.f160567c;
        String str = (String) aVar.d;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        String str2 = (String) aVar.f160500b;
        if (b4 == 3) {
            return Collections.singletonList(new t0(str, str2, 0L, 0L));
        }
        StringBuilder sb6 = new StringBuilder();
        if ((b4 & 1) == 0) {
            sb6.append(" baseAddress");
        }
        if ((b4 & 2) == 0) {
            sb6.append(" size");
        }
        throw new IllegalStateException(com.google.android.gms.internal.mlkit_vision_face.a.q("Missing required properties:", sb6));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final le.c1 b(int r17) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ie.s.b(int):le.c1");
    }
}
