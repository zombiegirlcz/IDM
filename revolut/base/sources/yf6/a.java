package yf6;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f313185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f313186c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar) {
        this.f313185b = qVar;
        this.f313186c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        Context context = (Context) ((Function0) this.f313185b.f124861b).invoke();
        nj0.a aVar = (nj0.a) ((phm.a) this.f313186c.f955b).get();
        ee0.a aVar2 = (ee0.a) ((phm.a) this.d.f955b).get();
        q8b.a aVar3 = (q8b.a) ((phm.a) this.e.f955b).get();
        an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
        context.getClass();
        aVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        cVar.getClass();
        return new e(aVar2, aVar, aVar3, cVar);
    }
}
