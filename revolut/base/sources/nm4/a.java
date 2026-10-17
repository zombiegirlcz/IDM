package nm4;

import android.content.Context;
import ecm.q;
import jm4.r;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f217164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f217165c;
    public final a31.a d;
    public final phm.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f217166g;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar, phm.a aVar5) {
        this.f217164b = qVar;
        this.f217165c = aVar;
        this.d = aVar2;
        this.e = aVar5;
        this.f = aVar3;
        this.f217166g = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f217164b.f124861b).invoke();
        vn.a aVar = (vn.a) ((phm.a) this.f217165c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        r rVar = (r) this.e.get();
        c21.e eVar = (c21.e) ((phm.a) this.f.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f217166g.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        rVar.getClass();
        eVar.getClass();
        cVar.getClass();
        return new f(new b(), new e(), aVar, aVar2, rVar, eVar, cVar);
    }
}
