package km4;

import android.content.Context;
import djf.c;
import ecm.q;
import jm4.r;
import kotlin.jvm.functions.Function0;
import qgk.i3;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f185713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f185714c;
    public final a31.a d;
    public final a31.a e;

    public a(q qVar, ibh.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f185713b = qVar;
        this.f185714c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f185713b.f124861b).invoke();
        r rVar = (r) this.f185714c.get();
        c cVar = (c) ((phm.a) this.d.f955b).get();
        i3 i3Var = (i3) ((phm.a) this.e.f955b).get();
        context.getClass();
        rVar.getClass();
        cVar.getClass();
        i3Var.getClass();
        return new b(rVar, cVar, i3Var);
    }
}
