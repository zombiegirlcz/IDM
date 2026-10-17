package bi3;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import ta9.m;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15400b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f15401c;
    public final q d;
    public final a31.a e;
    public final a31.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a31.a f15402g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a31.a f15403h;
    public final a31.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a31.a f15404j;

    public c(q qVar, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, q qVar2, a31.a aVar5, a31.a aVar6) {
        this.f15401c = qVar;
        this.e = aVar;
        this.f = aVar2;
        this.f15402g = aVar3;
        this.f15403h = aVar4;
        this.d = qVar2;
        this.i = aVar5;
        this.f15404j = aVar6;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f15400b) {
            case 0:
                Context context = (Context) ((Function0) this.f15401c.f124861b).invoke();
                d dVar = (d) ((phm.a) this.e.f955b).get();
                nt8.a aVar = (nt8.a) ((phm.a) this.f.f955b).get();
                m mVar = (m) ((phm.a) this.f15402g.f955b).get();
                jfa.a aVar2 = (jfa.a) ((phm.a) this.f15403h.f955b).get();
                th0.a aVar3 = (th0.a) ((Function0) this.d.f124861b).invoke();
                uq3.b bVar = (uq3.b) ((phm.a) this.i.f955b).get();
                c73.j jVar = (c73.j) ((phm.a) this.f15404j.f955b).get();
                context.getClass();
                dVar.getClass();
                aVar.getClass();
                mVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                bVar.getClass();
                jVar.getClass();
                return new e(dVar, aVar, mVar, aVar2, aVar3, bVar, jVar);
            default:
                Context context2 = (Context) ((Function0) this.f15401c.f124861b).invoke();
                pdd.a aVar4 = (pdd.a) ((Function0) this.d.f124861b).invoke();
                ee0.a aVar5 = (ee0.a) ((phm.a) this.e.f955b).get();
                nj0.a aVar6 = (nj0.a) ((phm.a) this.f.f955b).get();
                ee0.c cVar = (ee0.c) ((phm.a) this.f15402g.f955b).get();
                an0.c cVar2 = (an0.c) ((phm.a) this.f15403h.f955b).get();
                xbd.c cVar3 = (xbd.c) ((phm.a) this.i.f955b).get();
                wpg.a aVar7 = (wpg.a) ((phm.a) this.f15404j.f955b).get();
                context2.getClass();
                aVar4.getClass();
                aVar5.getClass();
                aVar6.getClass();
                cVar.getClass();
                cVar2.getClass();
                cVar3.getClass();
                aVar7.getClass();
                return new ded.a(aVar5, aVar6, cVar, cVar2, cVar3, aVar7, context2, aVar4);
        }
    }

    public c(q qVar, q qVar2, a31.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4, a31.a aVar5, a31.a aVar6) {
        this.f15401c = qVar;
        this.d = qVar2;
        this.e = aVar;
        this.f = aVar2;
        this.f15402g = aVar3;
        this.f15403h = aVar4;
        this.i = aVar5;
        this.f15404j = aVar6;
    }
}
