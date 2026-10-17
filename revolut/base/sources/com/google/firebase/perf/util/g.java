package com.google.firebase.perf.util;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f49602a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f49603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rf.a f49604c;
    public final rf.a d;

    public g(View view, rf.a aVar, rf.a aVar2) {
        this.f49603b = new AtomicReference(view);
        this.f49604c = aVar;
        this.d = aVar2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f49603b.getAndSet(null);
        if (view == null) {
            return true;
        }
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        rf.a aVar = this.f49604c;
        Handler handler = this.f49602a;
        handler.post(aVar);
        handler.postAtFrontOfQueue(this.d);
        return true;
    }
}
