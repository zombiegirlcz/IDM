package bq;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17646b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f17647c;
    public final q d;
    public final q e;
    public final a31.a f;

    public a(a31.a aVar, q qVar, q qVar2, a31.a aVar2) {
        this.f17647c = aVar;
        this.d = qVar;
        this.e = qVar2;
        this.f = aVar2;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f17646b) {
            case 0:
                Context context = (Context) ((Function0) this.d.f124861b).invoke();
                ee0.a aVar = (ee0.a) ((phm.a) this.f17647c.f955b).get();
                th0.a aVar2 = (th0.a) ((Function0) this.e.f124861b).invoke();
                an0.c cVar = (an0.c) ((phm.a) this.f.f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                cVar.getClass();
                return new j(aVar, aVar2, cVar);
            case 1:
                nf0.a aVar3 = (nf0.a) ((phm.a) this.f17647c.f955b).get();
                nql.a aVar4 = (nql.a) ((Function0) this.d.f124861b).invoke();
                ij0.a aVar5 = (ij0.a) ((Function0) this.e.f124861b).invoke();
                y60.c cVar2 = (y60.c) ((phm.a) this.f.f955b).get();
                aVar3.getClass();
                aVar4.getClass();
                aVar5.getClass();
                cVar2.getClass();
                return new tql.a(cVar2, aVar3, aVar4, aVar5);
            default:
                return yf3.h.a().a((String) ((Function0) this.d.f124861b).invoke(), (nj0.a) ((phm.a) this.f17647c.f955b).get(), (l70.e) ((phm.a) this.f.f955b).get(), (Context) ((Function0) this.e.f124861b).invoke());
        }
    }

    public a(q qVar, a31.a aVar, a31.a aVar2, q qVar2) {
        this.d = qVar;
        this.f17647c = aVar;
        this.f = aVar2;
        this.e = qVar2;
    }

    public a(q qVar, a31.a aVar, q qVar2, a31.a aVar2) {
        this.d = qVar;
        this.f17647c = aVar;
        this.e = qVar2;
        this.f = aVar2;
    }
}
