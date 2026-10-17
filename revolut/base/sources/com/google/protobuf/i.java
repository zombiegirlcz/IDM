package com.google.protobuf;

import java.util.concurrent.TimeUnit;
import tfm.b5;
import tfm.u4;
import tfm.y4;

/* JADX INFO: loaded from: classes17.dex */
public final class i implements u4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f49727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f49728c;
    public final Object d;

    public i(d0 d0Var) {
        d0Var.getClass();
        this.d = d0Var;
    }

    @Override // tfm.u4
    public y4 call() {
        return new b5(this.f49726a, this.f49727b, (TimeUnit) this.f49728c, (efm.c0) this.d);
    }

    public i(int i, long j2, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f49726a = i;
        this.f49727b = j2;
        this.f49728c = timeUnit;
        this.d = c0Var;
    }
}
