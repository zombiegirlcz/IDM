package vd0;

import android.content.Context;
import kg.o;
import kotlin.jvm.internal.Intrinsics;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class e implements sd0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f287762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f287763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l70.e f287764c;
    public final an0.c d;
    public final ee0.a e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f287765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f287766h;

    public e(an0.c cVar, ee0.a aVar, l70.e eVar, g gVar, f fVar, Context context) {
        this.f287762a = gVar;
        this.f287763b = context;
        this.f287764c = eVar;
        this.d = cVar;
        this.e = aVar;
        this.f = fVar;
        int i = 20;
        this.f287765g = e4m.b.b(new uhc.a(this, 1, i));
        this.f287766h = e4m.b.b(new uhc.a(this, 0, i));
    }

    public final ae0.b a() {
        b.Companion.getClass();
        Context context = this.f287763b;
        Intrinsics.checkNotNullParameter(context, "context");
        c90.c cVar = new c90.c(context);
        qd0.b bVarN = this.f287764c.n();
        s.j(bVarN);
        return new ae0.b(cVar, new ae0.d(bVarN));
    }

    public final zd0.b b() {
        zq.a aVarA = this.f287762a.a();
        ae0.b bVarA = a();
        yd0.b bVar = (yd0.b) this.f287766h.get();
        b.Companion.getClass();
        r39.a aVar = new r39.a(new o(), a(), new by5.a(this.f.a()));
        zm0.c cVarJ = this.d.j();
        s.j(cVarJ);
        return new zd0.b(new be0.e(aVarA, bVarA, bVar, aVar, cVarJ));
    }
}
