package nn0;

import android.content.Context;
import e4m.e;
import e4m.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f217431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f217432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f217433c;

    public c(Context context) {
        this.f217431a = context;
        int i = 16;
        this.f217432b = g.a(new mva.a(this, 1, i));
        this.f217433c = g.a(new mva.a(this, 0, i));
    }

    public final pn0.c a() {
        return (pn0.c) this.f217432b.get();
    }
}
