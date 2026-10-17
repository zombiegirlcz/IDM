package qe0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f245017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f245018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f245019c;
    public final boolean d;
    public final long e;
    public Long f;

    public c(d token, Object obj2, long j2, boolean z, long j3) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.f245017a = token;
        this.f245018b = obj2;
        this.f245019c = j2;
        this.d = z;
        this.e = j3;
    }

    public final long a() {
        return this.e;
    }

    public final Long b() {
        return this.f;
    }

    public final Object c() {
        return this.f245018b;
    }

    public final long d() {
        return this.f245019c;
    }

    public final boolean e() {
        return this.d;
    }

    public final void f(Long l2) {
        this.f = l2;
    }
}
