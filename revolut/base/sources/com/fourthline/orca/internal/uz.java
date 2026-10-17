package com.fourthline.orca.internal;

import android.os.Build;
import android.os.Debug;
import com.fourthline.core.internal.devicedata.DeviceDataCollector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class uz implements DeviceDataCollector {
    public static final a d = new a(null);
    public static final int e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f34222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f34223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f34224c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public uz(Map destination, boolean z) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f34222a = destination;
        this.f34223b = z;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        List listN0 = kotlin.text.d0.n0(RELEASE, new String[]{"."}, 0, 6);
        int size = listN0.size();
        if (size == 1) {
            RELEASE = listN0.get(0) + ".0.0";
        } else if (size == 2) {
            RELEASE = listN0.get(0) + "." + listN0.get(1) + ".0";
        }
        Intrinsics.checkNotNullExpressionValue(RELEASE, "with(...)");
        this.f34224c = RELEASE;
    }

    private final boolean a() {
        if (Debug.isDebuggerConnected()) {
            return true;
        }
        return b();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean b() {
        /*
            r6 = this;
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L69
            java.lang.String r2 = "/proc/self/status"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L69
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8     // Catch: java.lang.Exception -> L69
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L69
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L69
            r4.<init>(r1)     // Catch: java.lang.Exception -> L69
            r3.<init>(r4, r2)     // Catch: java.lang.Exception -> L69
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L69
            r2 = 8192(0x2000, float:1.148E-41)
            r1.<init>(r3, r2)     // Catch: java.lang.Exception -> L69
            nkm.a r2 = jh.d.m(r1)     // Catch: java.lang.Throwable -> L39
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L39
        L23:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = "TracerPid:"
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L39
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L39
            boolean r5 = kotlin.text.a0.H(r5, r4, r0)     // Catch: java.lang.Throwable -> L39
            if (r5 == 0) goto L23
            goto L3c
        L39:
            r2 = move-exception
            goto L63
        L3b:
            r3 = 0
        L3c:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L5e
            java.lang.String r2 = kotlin.text.d0.v0(r3, r4, r3)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L5e
            java.lang.CharSequence r2 = kotlin.text.d0.F0(r2)     // Catch: java.lang.Throwable -> L39
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L5e
            java.lang.Integer r2 = kotlin.text.z.m(r2)     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L5e
            int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L5e
            r2 = 1
            goto L5f
        L5e:
            r2 = r0
        L5f:
            r1.close()     // Catch: java.lang.Exception -> L69
            return r2
        L63:
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r3 = move-exception
            com.bumptech.glide.d.e(r1, r2)     // Catch: java.lang.Exception -> L69
            throw r3     // Catch: java.lang.Exception -> L69
        L69:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.uz.b():boolean");
    }

    @Override // com.fourthline.core.internal.devicedata.DeviceDataCollector
    public void startDataCollection() {
        if (this.f34223b) {
            this.f34222a.put("sdkVersion", "3.4.29");
            this.f34222a.put("sdkPlatformName", "android");
            this.f34222a.put("deviceModel", Build.MODEL);
            this.f34222a.put("devicePlatformName", "Android");
            this.f34222a.put("devicePlatformVersion", this.f34224c);
            this.f34222a.put("debuggerIsEnabled", Boolean.valueOf(a()));
        }
    }
}
