package com.fourthline.orca.internal;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class u40 implements dh1 {
    private static final a e = new a(null);
    public static final int f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f33952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t40 f33953c;
    private final Object d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public u40(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        this.f33951a = applicationContext;
        this.f33952b = applicationContext.getSharedPreferences("FourthlineWorkflowSessionKeystore", 0);
        this.f33953c = new t40();
        this.d = new Object();
    }

    private final String c(String str) {
        return "pre_sad_refresh_cookie_" + str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:4:0x0008, B:6:0x0015, B:8:0x001d, B:16:0x002b), top: B:21:0x0008 }] */
    @Override // com.fourthline.orca.internal.dh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "workflowId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            java.lang.String r5 = r4.c(r5)     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences r1 = r4.f33952b     // Catch: java.lang.Throwable -> L29
            r2 = 0
            java.lang.String r1 = r1.getString(r5, r2)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L38
            com.fourthline.orca.internal.t40 r3 = r4.f33953c     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r3.a(r1)     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L2b
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L29
            if (r3 <= 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto L2b
            r2 = r1
            goto L38
        L29:
            r5 = move-exception
            goto L3a
        L2b:
            android.content.SharedPreferences r1 = r4.f33952b     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L29
            android.content.SharedPreferences$Editor r5 = r1.remove(r5)     // Catch: java.lang.Throwable -> L29
            r5.apply()     // Catch: java.lang.Throwable -> L29
        L38:
            monitor-exit(r0)
            return r2
        L3a:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.u40.a(java.lang.String):java.lang.String");
    }

    @Override // com.fourthline.orca.internal.dh1
    public void b(String workflowId) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        synchronized (this.d) {
            this.f33952b.edit().remove(c(workflowId)).apply();
            Unit unit = Unit.f186387a;
        }
    }

    @Override // com.fourthline.orca.internal.dh1
    public void a(String workflowId, String cookiePair) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        Intrinsics.checkNotNullParameter(cookiePair, "cookiePair");
        synchronized (this.d) {
            String strC = c(workflowId);
            String strB = this.f33953c.b(cookiePair);
            if (strB != null) {
                this.f33952b.edit().putString(strC, strB).apply();
            }
            Unit unit = Unit.f186387a;
        }
    }
}
