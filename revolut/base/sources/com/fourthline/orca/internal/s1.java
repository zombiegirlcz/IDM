package com.fourthline.orca.internal;

import com.fourthline.orca.internal.pb1;
import java.lang.Thread;

/* JADX INFO: loaded from: classes23.dex */
public abstract class s1 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof r1) {
            return;
        }
        r1 r1Var = new r1(defaultUncaughtExceptionHandler, null, 2, 0 == true ? 1 : 0);
        Thread.setDefaultUncaughtExceptionHandler(r1Var);
        r1Var.a().track(new pb1.a.C0262a(defaultUncaughtExceptionHandler != null));
    }

    public static final void b() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler instanceof r1) {
            r1 r1Var = (r1) defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(r1Var.b());
            r1Var.a().track(pb1.a.b.f31919b);
        }
    }
}
