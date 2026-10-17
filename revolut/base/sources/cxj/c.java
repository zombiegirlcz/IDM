package cxj;

import android.content.Context;
import ecm.q;
import jxd.g;
import kotlin.jvm.functions.Function0;
import l70.e;
import ljl.q1;
import ove.t;
import zxb.k0;

/* JADX INFO: loaded from: classes13.dex */
public final class c extends b60.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f109997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a31.a f109998c;
    public final q d;

    public /* synthetic */ c(q qVar, a31.a aVar, int i) {
        this.f109997b = i;
        this.d = qVar;
        this.f109998c = aVar;
    }

    @Override // b60.a
    public final Object a() {
        switch (this.f109997b) {
            case 0:
                Context context = (Context) ((Function0) this.d.f124861b).invoke();
                q1 q1Var = (q1) ((phm.a) this.f109998c.f955b).get();
                context.getClass();
                q1Var.getClass();
                return new a(q1Var);
            case 1:
                ite.a aVar = (ite.a) ((phm.a) this.f109998c.f955b).get();
                vo.a aVar2 = (vo.a) ((Function0) this.d.f124861b).invoke();
                aVar.getClass();
                aVar2.getClass();
                return new dp.a(aVar, aVar2);
            case 2:
                Context context2 = (Context) ((Function0) this.d.f124861b).invoke();
                xmg.a aVar3 = (xmg.a) ((phm.a) this.f109998c.f955b).get();
                context2.getClass();
                aVar3.getClass();
                return new fw3.a(aVar3);
            case 3:
                Context context3 = (Context) ((Function0) this.d.f124861b).invoke();
                xmg.a aVar4 = (xmg.a) ((phm.a) this.f109998c.f955b).get();
                context3.getClass();
                aVar4.getClass();
                return new jm4.q(aVar4);
            case 4:
                Context context4 = (Context) ((Function0) this.d.f124861b).invoke();
                t tVar = (t) ((phm.a) this.f109998c.f955b).get();
                context4.getClass();
                tVar.getClass();
                return new g();
            case 5:
                Context context5 = (Context) ((Function0) this.d.f124861b).invoke();
                nj0.a aVar5 = (nj0.a) ((phm.a) this.f109998c.f955b).get();
                context5.getClass();
                aVar5.getClass();
                return new mz1.a(aVar5);
            case 6:
                Context context6 = (Context) ((Function0) this.d.f124861b).invoke();
                e eVar = (e) ((phm.a) this.f109998c.f955b).get();
                context6.getClass();
                eVar.getClass();
                return new o3i.a(eVar);
            case 7:
                Context context7 = (Context) ((Function0) this.d.f124861b).invoke();
                gvh.a aVar6 = (gvh.a) ((phm.a) this.f109998c.f955b).get();
                context7.getClass();
                aVar6.getClass();
                return new ovh.a(aVar6);
            case 8:
                Context context8 = (Context) ((Function0) this.d.f124861b).invoke();
                n0m.a aVar7 = (n0m.a) ((phm.a) this.f109998c.f955b).get();
                context8.getClass();
                aVar7.getClass();
                return new ri0.a(aVar7);
            case 9:
                Context context9 = (Context) ((Function0) this.d.f124861b).invoke();
                rg0.e eVar2 = (rg0.e) ((phm.a) this.f109998c.f955b).get();
                context9.getClass();
                eVar2.getClass();
                return new ysc.a(eVar2, context9);
            default:
                Context context10 = (Context) ((Function0) this.d.f124861b).invoke();
                k0 k0Var = (k0) ((phm.a) this.f109998c.f955b).get();
                context10.getClass();
                k0Var.getClass();
                return new zxf.b(k0Var);
        }
    }

    public c(a31.a aVar, q qVar) {
        this.f109997b = 1;
        this.f109998c = aVar;
        this.d = qVar;
    }
}
