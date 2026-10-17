package g8b;

import android.content.Context;
import e4m.e;
import fd2.n;
import sri.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cri.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f141332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f141333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f141334c;

    public a(Context context) {
        this.f141332a = context;
        int i = 16;
        this.f141333b = e4m.b.b(new n(this, 0, i));
        this.f141334c = e4m.b.b(new n(this, 1, i));
    }

    public final ifm.b a() {
        return (ifm.b) this.f141333b.get();
    }

    public final lfm.c b() {
        return (lfm.c) this.f141333b.get();
    }

    public final ifm.c c() {
        return (ifm.c) this.f141333b.get();
    }

    public final m d() {
        return (m) this.f141334c.get();
    }
}
