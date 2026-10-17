package tfm;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class x extends bgm.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f270924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ofm.q f270925c;

    public /* synthetic */ x(ofm.q qVar, int i) {
        this.f270924b = i;
        this.f270925c = qVar;
    }

    @Override // efm.y
    public final void onComplete() {
        switch (this.f270924b) {
            case 0:
                ((v) this.f270925c).onComplete();
                break;
            default:
                ((m7) this.f270925c).onComplete();
                break;
        }
    }

    @Override // efm.y
    public final void onError(Throwable th10) {
        switch (this.f270924b) {
            case 0:
                ((v) this.f270925c).onError(th10);
                break;
            default:
                m7 m7Var = (m7) this.f270925c;
                m7Var.k.dispose();
                m7Var.f270658j.dispose();
                m7Var.onError(th10);
                break;
        }
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f270924b) {
            case 0:
                v vVar = (v) this.f270925c;
                vVar.getClass();
                try {
                    Object objCall = vVar.f270877h.call();
                    mfm.f.b(objCall, "The buffer supplied is null");
                    Collection collection = (Collection) objCall;
                    synchronized (vVar) {
                        try {
                            Object obj3 = vVar.f270878j;
                            if (obj3 != null) {
                                vVar.f270878j = collection;
                                vVar.h(obj3, vVar);
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    vVar.dispose();
                    vVar.f224946b.onError(th10);
                    return;
                }
            default:
                m7 m7Var = (m7) this.f270925c;
                m7Var.f224947c.offer(new n7(null, obj2));
                if (m7Var.f()) {
                    m7Var.j0();
                    return;
                }
                return;
        }
    }
}
