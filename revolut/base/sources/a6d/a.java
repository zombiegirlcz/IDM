package a6d;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import l70.g;
import l70.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1602b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f1603c;
    public final q d;
    public final a31.a e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f1605h;
    public final Object i;

    public a(a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, q qVar, q qVar2) {
        this.f1603c = qVar;
        this.d = qVar2;
        this.e = aVar;
        this.f = aVar2;
        this.f1604g = aVar3;
        this.f1605h = aVar4;
        this.i = aVar5;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f1602b) {
            case 0:
                Context context = (Context) ((Function0) this.f1603c.f124861b).invoke();
                zvh.a aVar = (zvh.a) ((Function0) this.d.f124861b).invoke();
                nj0.a aVar2 = (nj0.a) ((phm.a) this.e.f955b).get();
                ee0.a aVar3 = (ee0.a) ((phm.a) ((a31.a) this.f).f955b).get();
                ee0.c cVar = (ee0.c) ((phm.a) ((a31.a) this.f1604g).f955b).get();
                fl2.a aVar4 = (fl2.a) ((phm.a) ((a31.a) this.f1605h).f955b).get();
                an0.c cVar2 = (an0.c) ((phm.a) ((a31.a) this.i).f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                cVar.getClass();
                aVar4.getClass();
                cVar2.getClass();
                return new e(new c(), aVar2, aVar3, cVar, aVar4, cVar2, context, aVar);
            default:
                Context context2 = (Context) ((Function0) this.f1603c.f124861b).invoke();
                w70.a aVar5 = (w70.a) ((Function0) this.d.f124861b).invoke();
                jl0.a aVar6 = (jl0.a) ((Function0) ((q) this.f).f124861b).invoke();
                String str = (String) ((Function0) ((q) this.f1604g).f124861b).invoke();
                t70.d dVar = (t70.d) ((Function0) ((q) this.f1605h).f124861b).invoke();
                n nVar = (n) ((Function0) ((q) this.i).f124861b).invoke();
                kf0.c cVar3 = (kf0.c) ((phm.a) this.e.f955b).get();
                context2.getClass();
                aVar5.getClass();
                str.getClass();
                dVar.getClass();
                nVar.getClass();
                cVar3.getClass();
                return new l70.e(new g(), cVar3, context2, aVar5, aVar6, str, dVar, nVar);
        }
    }

    public a(q qVar, q qVar2, q qVar3, q qVar4, q qVar5, q qVar6, a31.a aVar) {
        this.f1603c = qVar;
        this.d = qVar2;
        this.f = qVar3;
        this.f1604g = qVar4;
        this.f1605h = qVar5;
        this.i = qVar6;
        this.e = aVar;
    }
}
