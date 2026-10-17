package gcm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class k0 extends j0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f142704c = 0;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(f3 f3Var, ecm.v vVar) {
        super(vVar, 0);
        this.d = f3Var;
    }

    @Override // gcm.j0
    public final void b() {
        List list;
        switch (this.f142704c) {
            case 0:
                ((p0) this.d).h();
                return;
            default:
                o0 o0Var = (o0) this.d;
                o0Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (o0Var) {
                        try {
                            if (o0Var.f142791c.isEmpty()) {
                                o0Var.f142791c = null;
                                o0Var.f142790b = true;
                                return;
                            } else {
                                list = o0Var.f142791c;
                                o0Var.f142791c = arrayList;
                            }
                        } catch (Throwable th10) {
                            throw th10;
                        }
                    }
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        ((Runnable) it8.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p0 p0Var, o0 o0Var) {
        super(p0Var.f142805c, 0);
        this.d = o0Var;
    }
}
