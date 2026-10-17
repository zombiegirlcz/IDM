package com.fourthline.orca.internal;

import android.app.Activity;

/* JADX INFO: loaded from: classes23.dex */
public final class f implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f28298a;

    private f(d dVar) {
        this.f28298a = dVar;
    }

    public static Activity b(d dVar) {
        Activity activityB = dVar.b();
        vc.s.k(activityB);
        return activityB;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Activity get() {
        return b(this.f28298a);
    }

    public static f a(d dVar) {
        return new f(dVar);
    }
}
