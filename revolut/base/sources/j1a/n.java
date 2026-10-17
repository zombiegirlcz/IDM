package j1a;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f170342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f170343c;
    public final a31.a d;
    public final a31.a e;

    public n(a31.a aVar, a31.a aVar2, a31.a aVar3, q qVar) {
        this.f170342b = qVar;
        this.f170343c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f170342b.f124861b).invoke();
        vl3.n nVar = (vl3.n) ((phm.a) this.f170343c.f955b).get();
        ite.a aVar = (ite.a) ((phm.a) this.d.f955b).get();
        xmg.a aVar2 = (xmg.a) ((phm.a) this.e.f955b).get();
        context.getClass();
        nVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        return new a(nVar, aVar, aVar2);
    }
}
