package gpc;

import android.content.Context;
import c4f.k;
import dmc.c;
import ecm.q;
import kotlin.jvm.functions.Function0;
import ql7.d2;
import t29.d;
import t29.i;
import zdl.e;
import zdl.f;
import zxb.j0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f145432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final phm.a f145433c;
    public final Object d;
    public final a31.a e;

    public /* synthetic */ b(phm.a aVar, phm.a aVar2, a31.a aVar3, int i) {
        this.f145432b = i;
        this.f145433c = aVar;
        this.d = aVar2;
        this.e = aVar3;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f145432b) {
            case 0:
                dmc.a aVar = (dmc.a) this.f145433c.get();
                c cVar = (c) ((phm.a) this.d).get();
                ite.a aVar2 = (ite.a) ((phm.a) this.e.f955b).get();
                aVar.getClass();
                cVar.getClass();
                aVar2.getClass();
                return new a(aVar, cVar, aVar2);
            case 1:
                f fVar = (f) this.f145433c.get();
                zdl.c cVar2 = (zdl.c) ((phm.a) this.d).get();
                k kVar = (k) ((phm.a) this.e.f955b).get();
                fVar.getClass();
                cVar2.getClass();
                kVar.getClass();
                return new e(fVar, cVar2, kVar);
            default:
                Context context = (Context) ((Function0) ((q) this.d).f124861b).invoke();
                j0 j0Var = (j0) ((phm.a) this.e.f955b).get();
                i iVar = (i) this.f145433c.get();
                context.getClass();
                j0Var.getClass();
                iVar.getClass();
                return new d(j0Var, iVar);
        }
    }

    public b(q qVar, a31.a aVar, d2 d2Var) {
        this.f145432b = 2;
        this.d = qVar;
        this.e = aVar;
        this.f145433c = d2Var;
    }
}
