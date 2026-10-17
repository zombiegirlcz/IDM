package k2d;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final class f extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f180480b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f180481c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f180482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f180483h;

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar, q qVar2) {
        this.f180481c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f180483h = aVar4;
        this.f180482g = qVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f180480b) {
            case 0:
                a2d.c cVar = (a2d.c) ((phm.a) this.d.f955b).get();
                m4d.a aVar = (m4d.a) ((phm.a) this.e.f955b).get();
                y1d.b bVar = (y1d.b) ((phm.a) this.f.f955b).get();
                a aVar2 = (a) ((Function0) this.f180481c.f124861b).invoke();
                c cVar2 = (c) ((Function0) this.f180482g.f124861b).invoke();
                b bVar2 = (b) ((Function0) ((q) this.f180483h).f124861b).invoke();
                cVar.getClass();
                aVar.getClass();
                bVar.getClass();
                aVar2.getClass();
                cVar2.getClass();
                bVar2.getClass();
                return new e(cVar, aVar, bVar, cVar2);
            default:
                Context context = (Context) ((Function0) this.f180481c.f124861b).invoke();
                poi.b bVar3 = (poi.b) ((phm.a) this.d.f955b).get();
                h30.a aVar3 = (h30.a) ((phm.a) this.e.f955b).get();
                nn0.c cVar3 = (nn0.c) ((phm.a) this.f.f955b).get();
                jm0.a aVar4 = (jm0.a) ((phm.a) ((a31.a) this.f180483h).f955b).get();
                th0.a aVar5 = (th0.a) ((Function0) this.f180482g.f124861b).invoke();
                context.getClass();
                bVar3.getClass();
                aVar3.getClass();
                cVar3.getClass();
                aVar4.getClass();
                aVar5.getClass();
                return new w9i.a(bVar3, aVar3, cVar3, aVar4, aVar5, context);
        }
    }

    public f(a31.a aVar, a31.a aVar2, a31.a aVar3, q qVar, q qVar2, q qVar3) {
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
        this.f180481c = qVar;
        this.f180482g = qVar2;
        this.f180483h = qVar3;
    }
}
