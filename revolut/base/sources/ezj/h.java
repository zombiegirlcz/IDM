package ezj;

import android.content.Context;
import ecm.q;
import kotlin.jvm.functions.Function0;
import s3a.r;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f130970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f130971c;
    public final a31.a d;
    public final a31.a e;
    public final phm.a f;

    public /* synthetic */ h(q qVar, a31.a aVar, a31.a aVar2, phm.a aVar3, int i) {
        this.f130970b = i;
        this.f130971c = qVar;
        this.d = aVar;
        this.e = aVar2;
        this.f = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f130970b) {
            case 0:
                Context context = (Context) ((Function0) this.f130971c.f124861b).invoke();
                ite.a aVar = (ite.a) ((phm.a) this.d.f955b).get();
                a aVar2 = (a) this.f.get();
                cl2.a aVar3 = (cl2.a) ((phm.a) this.e.f955b).get();
                context.getClass();
                aVar.getClass();
                aVar2.getClass();
                aVar3.getClass();
                return new b(aVar, aVar2, aVar3, context);
            case 1:
                Context context2 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                u06.a aVar4 = (u06.a) ((phm.a) this.e.f955b).get();
                fd2.f fVar = (fd2.f) this.f.get();
                context2.getClass();
                eVar.getClass();
                aVar4.getClass();
                fVar.getClass();
                return new fd2.g(new fd2.e(), eVar, aVar4, fVar, context2);
            case 2:
                Context context3 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                ebj.b bVar = (ebj.b) this.f.get();
                ei5.d dVar = (ei5.d) ((phm.a) this.d.f955b).get();
                bpj.a aVar5 = (bpj.a) ((phm.a) this.e.f955b).get();
                context3.getClass();
                bVar.getClass();
                dVar.getClass();
                aVar5.getClass();
                return new qbj.n(bVar, dVar, aVar5, context3);
            case 3:
                Context context4 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                h30.a aVar6 = (h30.a) ((phm.a) this.d.f955b).get();
                fma.h hVar = (fma.h) ((phm.a) this.e.f955b).get();
                r rVar = (r) this.f.get();
                context4.getClass();
                aVar6.getClass();
                hVar.getClass();
                rVar.getClass();
                return new r5a.a(aVar6, hVar, rVar);
            case 4:
                Context context5 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                nf0.a aVar7 = (nf0.a) ((phm.a) this.d.f955b).get();
                tq1.c cVar = (tq1.c) this.f.get();
                usg.a aVar8 = (usg.a) ((phm.a) this.e.f955b).get();
                context5.getClass();
                aVar7.getClass();
                cVar.getClass();
                aVar8.getClass();
                return new tq1.d(aVar7, cVar, aVar8);
            case 5:
                Context context6 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                ite.a aVar9 = (ite.a) ((phm.a) this.d.f955b).get();
                vac.a aVar10 = (vac.a) this.f.get();
                hsh.b bVar2 = (hsh.b) ((phm.a) this.e.f955b).get();
                context6.getClass();
                aVar9.getClass();
                aVar10.getClass();
                bVar2.getClass();
                return new uac.j(aVar9, aVar10, bVar2);
            default:
                Context context7 = (Context) ((Function0) this.f130971c.f124861b).invoke();
                v81.d dVar2 = (v81.d) this.f.get();
                l70.e eVar2 = (l70.e) ((phm.a) this.d.f955b).get();
                ckg.a aVar11 = (ckg.a) ((phm.a) this.e.f955b).get();
                context7.getClass();
                dVar2.getClass();
                eVar2.getClass();
                aVar11.getClass();
                return new w81.c(dVar2, eVar2, aVar11);
        }
    }

    public /* synthetic */ h(q qVar, a31.a aVar, phm.a aVar2, a31.a aVar3, int i) {
        this.f130970b = i;
        this.f130971c = qVar;
        this.d = aVar;
        this.f = aVar2;
        this.e = aVar3;
    }

    public /* synthetic */ h(q qVar, phm.a aVar, a31.a aVar2, a31.a aVar3, int i) {
        this.f130970b = i;
        this.f130971c = qVar;
        this.f = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }
}
