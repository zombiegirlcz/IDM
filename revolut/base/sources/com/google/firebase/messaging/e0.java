package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class e0 extends Binder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mp.r f49492a;

    public e0(mp.r rVar) {
        this.f49492a = rVar;
    }

    public final void a(f0 f0Var) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
        }
        ((i) this.f49492a.f207713b).b(f0Var.f49494a).addOnCompleteListener(new l.a(2), new ag.j(f0Var, 9));
    }
}
