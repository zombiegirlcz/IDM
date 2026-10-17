package sgm;

import java.util.Collection;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f262712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f262713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c0 f262714c;

    public /* synthetic */ b0(c0 c0Var, Collection collection, int i) {
        this.f262712a = i;
        this.f262714c = c0Var;
        this.f262713b = collection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f262712a) {
            case 0:
                synchronized (this.f262714c) {
                    this.f262714c.k.remove(this.f262713b);
                    break;
                }
                c0 c0Var = this.f262714c;
                c0Var.l(this.f262713b, c0Var.f262732j);
                return;
            default:
                synchronized (this.f262714c) {
                    this.f262714c.k.remove(this.f262713b);
                    break;
                }
                c0 c0Var2 = this.f262714c;
                c0Var2.l(this.f262713b, c0Var2.f262732j);
                return;
        }
    }
}
