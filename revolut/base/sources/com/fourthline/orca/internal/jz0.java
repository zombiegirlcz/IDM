package com.fourthline.orca.internal;

import android.graphics.Canvas;
import java.io.InputStream;

/* JADX INFO: loaded from: classes23.dex */
public class jz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lz0 f30080a;

    private jz0(lz0 lz0Var) {
        this.f30080a = lz0Var;
    }

    public static jz0 a(InputStream inputStream) {
        return new jz0(lz0.a(inputStream));
    }

    public float b() {
        return this.f30080a.e();
    }

    public void a(float f) {
        this.f30080a.b(f);
    }

    public void a(Canvas canvas) {
        a(canvas, null);
    }

    public void a(Canvas canvas, cz0 cz0Var) {
        this.f30080a.a(canvas, cz0Var);
    }

    public float a() {
        return this.f30080a.d();
    }
}
