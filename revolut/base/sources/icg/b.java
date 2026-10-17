package icg;

import mbg.f;
import vkm.q;
import vkm.t1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements exf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f160266b;

    public /* synthetic */ b(Object obj2, int i) {
        this.f160265a = i;
        this.f160266b = obj2;
    }

    @Override // exf.a
    public final t1 a() {
        switch (this.f160265a) {
            case 0:
                return q.g(((d) this.f160266b).f160268m.f133334a.f142174a);
            case 1:
                return ((l2g.c) this.f160266b).f191794m.a();
            default:
                return q.g(((f) this.f160266b).f204212q.f133334a.f142174a);
        }
    }
}
