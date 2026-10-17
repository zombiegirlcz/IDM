package c63;

import android.content.Context;
import e4m.e;

/* JADX INFO: loaded from: classes13.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f21598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f21599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f21600c;

    public c(th0.a aVar, Context context) {
        this.f21598a = context;
        int i = 0;
        this.f21599b = e4m.b.b(new b(this, 0, i));
        this.f21600c = e4m.b.b(new b(this, 1, i));
    }

    public final e63.a a() {
        return (e63.a) this.f21599b.get();
    }
}
