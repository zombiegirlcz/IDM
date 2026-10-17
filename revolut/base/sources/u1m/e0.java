package u1m;

import android.content.Context;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1m.h f276459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1m.l f276460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f276461c;
    public final Context d;
    public final Lazy e;
    public final Lazy f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f276462g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Lazy f276463h;
    public final Lazy i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Lazy f276464j;
    public final Lazy k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Lazy f276465l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Lazy f276466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Lazy f276467n;

    public e0(Context context, w1m.h hVar, w1m.l lVar, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f276459a = hVar;
        this.f276460b = lVar;
        this.f276461c = str;
        this.d = context.getApplicationContext();
        this.e = yhm.j.b(new d0(this, 3));
        this.f = yhm.j.b(new d0(this, 5));
        this.f276462g = yhm.j.b(new d0(this, 1));
        this.f276463h = yhm.j.b(new d0(this, 8));
        this.i = yhm.j.b(new d0(this, 7));
        this.f276464j = yhm.j.b(new d0(this, 6));
        this.k = yhm.j.b(new d0(this, 4));
        this.f276465l = yhm.j.b(new d0(this, 9));
        this.f276466m = yhm.j.b(new d0(this, 2));
        this.f276467n = yhm.j.b(new d0(this, 0));
    }
}
