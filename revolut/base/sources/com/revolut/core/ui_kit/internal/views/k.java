package com.revolut.core.ui_kit.internal.views;

import android.view.Choreographer;
import ms0.w4;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeUtils;

/* JADX INFO: loaded from: classes19.dex */
public final class k {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f57222c;
    public long d;
    public int e;
    public Long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f57223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f57224h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f57225j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w4 f57226l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f57220a = v0.a.d("create(...)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f57221b = v0.a.d("create(...)");
    public final l k = new l(this);

    public static final class a {
        private a() {
        }

        public static final int a(a aVar, long j2) {
            aVar.getClass();
            if (0 > j2 || j2 >= 2147483648L) {
                return 0;
            }
            return (int) j2;
        }
    }

    public final void a() {
        this.f57224h = true;
        if (this.i) {
            Choreographer.getInstance().postFrameCallback(this.k);
        }
    }

    public final void b(long j2, long j3, Long l2) {
        Choreographer choreographer = Choreographer.getInstance();
        l lVar = this.k;
        choreographer.removeFrameCallback(lVar);
        int iA = a.a(Companion, j2);
        this.e = iA;
        w4 w4Var = this.f57226l;
        if (w4Var != null) {
            w4Var.b(iA);
        }
        this.f57222c = j3 - ((long) this.e);
        this.d = j3;
        this.f = l2 != null ? Long.valueOf(l2.longValue() - this.f57222c) : null;
        this.f57223g = false;
        this.f57225j = false;
        int i = (int) kotlin.ranges.f.i(this.d - DateTimeUtils.currentTimeMillis(), 0L, this.e);
        w4 w4Var2 = this.f57226l;
        if (w4Var2 != null) {
            w4Var2.d(i);
        }
        w4 w4Var3 = this.f57226l;
        if (w4Var3 != null) {
            w4Var3.a((int) Math.ceil(((double) i) / 1000.0d));
        }
        lVar.f57227a = -1;
        lVar.f57228b = -1L;
        lVar.f57229c = -1L;
        this.i = true;
        if (this.f57224h) {
            Choreographer.getInstance().postFrameCallback(lVar);
        }
    }
}
