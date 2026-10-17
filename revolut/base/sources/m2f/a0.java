package m2f;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import m1c.f1;
import m1c.g1;
import m1c.h1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f201962b;

    public /* synthetic */ a0(g1 g1Var, int i) {
        this.f201961a = i;
        this.f201962b = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Object next2;
        switch (this.f201961a) {
            case 0:
                l lVar = (l) obj2;
                Iterator it8 = this.f201962b.f201366a.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((h1) next).f201375a == f1.ONE_OFF_PURCHASE) {
                        }
                    } else {
                        next = null;
                    }
                }
                h1 h1Var = (h1) next;
                return l.a(lVar, null, null, 0.0d, null, 0, null, null, null, null, h1Var != null && h1Var.f201376b, false, 6143);
            default:
                pig.j jVar = (pig.j) obj2;
                Iterator it9 = this.f201962b.f201366a.iterator();
                while (true) {
                    if (it9.hasNext()) {
                        next2 = it9.next();
                        if (((h1) next2).f201375a == f1.ONE_OFF_PURCHASE) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                h1 h1Var2 = (h1) next2;
                return pig.j.a(jVar, null, null, null, null, null, null, 0, null, null, null, h1Var2 != null && h1Var2.f201376b, 2047);
        }
    }
}
