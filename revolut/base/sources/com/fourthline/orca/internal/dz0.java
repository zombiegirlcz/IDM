package com.fourthline.orca.internal;

import com.fourthline.orca.internal.e9;
import com.fourthline.orca.internal.lz0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class dz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f27953a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    e9.q f27954b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    oq0 f27955c = null;
    String d = null;
    lz0.c e = null;
    String f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    lz0.c f27956g = null;

    public boolean a() {
        String str = this.f27953a;
        return (str != null && str.trim().length() > 0) || this.f27954b != null;
    }

    public boolean b() {
        return this.f27955c != null;
    }

    public boolean c() {
        return this.d != null;
    }

    public boolean d() {
        return this.f != null;
    }

    public boolean e() {
        return this.e != null;
    }

    public boolean f() {
        return this.f27956g != null;
    }

    public dz0 a(float f, float f4, float f5, float f6) {
        this.f27956g = new lz0.c(f, f4, f5, f6);
        return this;
    }
}
