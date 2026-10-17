package gl0;

import android.content.Context;
import e4m.g;
import fw2.l;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f144531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f144532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f144533c;
    public final e4m.e d;
    public final e4m.e e;

    public a(Context context) {
        this.f144531a = context;
        int i = 6;
        this.f144532b = g.a(new l(this, 3, i));
        this.f144533c = g.a(new l(this, 2, i));
        this.d = e4m.b.b(new l(this, 1, i));
        this.e = g.a(new l(this, 0, i));
    }
}
