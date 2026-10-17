package vxc;

import android.content.Context;
import ecm.q;
import java.util.List;
import kotlin.jvm.functions.Function0;
import xf6.n1;
import xf6.o1;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f293081b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f293082c;
    public final a31.a d;
    public final Object e;
    public final Object f;

    public k(a31.a aVar, q qVar, q qVar2, q qVar3) {
        this.d = aVar;
        this.e = qVar;
        this.f = qVar2;
        this.f293082c = qVar3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f293081b) {
            case 0:
                l70.e eVar = (l70.e) ((phm.a) this.d.f955b).get();
                i iVar = (i) ((phm.a) this.f293082c).get();
                h hVar = (h) ((phm.a) ((a31.a) this.e).f955b).get();
                sse.b bVar = (sse.b) ((phm.a) ((a31.a) this.f).f955b).get();
                eVar.getClass();
                iVar.getClass();
                hVar.getClass();
                bVar.getClass();
                return new d(eVar, iVar, hVar, bVar);
            case 1:
                je6.g gVar = (je6.g) ((phm.a) this.f293082c).get();
                n1 n1Var = (n1) ((phm.a) this.d.f955b).get();
                usg.a aVar = (usg.a) ((phm.a) ((a31.a) this.e).f955b).get();
                jge.j jVar = (jge.j) ((phm.a) ((a31.a) this.f).f955b).get();
                gVar.getClass();
                n1Var.getClass();
                aVar.getClass();
                jVar.getClass();
                return new o1(gVar, n1Var, aVar, jVar);
            default:
                yi2.a aVar2 = (yi2.a) ((phm.a) this.d.f955b).get();
                ui2.a aVar3 = (ui2.a) ((Function0) ((q) this.e).f124861b).invoke();
                Context context = (Context) ((Function0) ((q) this.f).f124861b).invoke();
                List list = (List) ((Function0) ((q) this.f293082c).f124861b).invoke();
                aVar2.getClass();
                aVar3.getClass();
                context.getClass();
                list.getClass();
                return new w0j.a(aVar2, aVar3, context, list);
        }
    }

    public k(a31.a aVar, phm.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.d = aVar;
        this.f293082c = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }

    public k(phm.a aVar, a31.a aVar2, a31.a aVar3, a31.a aVar4) {
        this.f293082c = aVar;
        this.d = aVar2;
        this.e = aVar3;
        this.f = aVar4;
    }
}
