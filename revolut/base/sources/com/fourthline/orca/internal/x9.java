package com.fourthline.orca.internal;

import android.content.Context;

/* JADX INFO: loaded from: classes23.dex */
public final class x9 implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e4m.e f34922a;

    private x9(e4m.e eVar) {
        this.f34922a = eVar;
    }

    @Override // phm.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public w9 get() {
        return a((Context) this.f34922a.get());
    }

    public static x9 a(e4m.e eVar) {
        return new x9(eVar);
    }

    public static w9 a(Context context) {
        return new w9(context);
    }
}
