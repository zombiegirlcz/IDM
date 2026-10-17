package e2m;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import w1m.h;
import w1m.l;
import yhm.j;

/* JADX INFO: loaded from: classes12.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f122153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f122154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f122155c;
    public final Context d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f122156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f122157h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f122158j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f122159l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f122160m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f122161n;
    public final Lazy o;

    public d(Context context, h hVar, l lVar, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f122153a = hVar;
        this.f122154b = lVar;
        this.f122155c = str;
        this.d = context.getApplicationContext();
        this.e = j.b(new a(this, 6));
        this.f = j.b(new a(this, 7));
        this.f122156g = j.b(new a(this, 2));
        this.f122157h = j.b(new a(this, 1));
        this.i = j.b(new a(this, 0));
        this.f122158j = j.b(new b(context, 0));
        this.k = j.b(new c(this, context, 0));
        this.f122159l = j.b(new a(this, 5));
        this.f122160m = j.b(new c(this, context, 1));
        this.f122161n = j.b(new a(this, 4));
        this.o = j.b(new a(this, 3));
    }
}
