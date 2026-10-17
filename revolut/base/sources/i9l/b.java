package i9l;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import npk.e;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f159893b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f159894c;
    public final a31.a d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f159895g;

    public b(q qVar, a31.a aVar, a31.a aVar2, phm.a aVar3, a31.a aVar4) {
        this.f159894c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f159895g = aVar3;
        this.f = aVar4;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f159893b) {
            case 0:
                Context context = (Context) ((Function0) this.f159894c.f124861b).invoke();
                d9l.a aVar = (d9l.a) ((Function0) ((q) this.f159895g).f124861b).invoke();
                e eVar = (e) ((phm.a) this.d.f955b).get();
                ee0.a aVar2 = (ee0.a) ((phm.a) this.e.f955b).get();
                nj0.a aVar3 = (nj0.a) ((phm.a) this.f.f955b).get();
                context.getClass();
                aVar.getClass();
                eVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                return new a(eVar, aVar2, aVar3, context, aVar);
            default:
                Context context2 = (Context) ((Function0) this.f159894c.f124861b).invoke();
                nf0.a aVar4 = (nf0.a) ((phm.a) this.d.f955b).get();
                nj0.a aVar5 = (nj0.a) ((phm.a) this.e.f955b).get();
                uw1.b bVar = (uw1.b) ((phm.a) this.f159895g).get();
                osb.a aVar6 = (osb.a) ((phm.a) this.f.f955b).get();
                context2.getClass();
                aVar4.getClass();
                aVar5.getClass();
                bVar.getClass();
                aVar6.getClass();
                return new nz1.a(aVar4, aVar5, bVar, aVar6, context2);
        }
    }

    public b(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3) {
        this.f159894c = qVar;
        this.f159895g = qVar2;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
    }
}
