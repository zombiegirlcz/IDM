package tfm;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f270395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final efm.r f270396b;

    public /* synthetic */ d(efm.r rVar, int i) {
        this.f270395a = i;
        this.f270396b = rVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f270395a) {
            case 0:
                c cVar = new c();
                efm.r.wrap(this.f270396b).materialize().subscribe(cVar);
                return cVar;
            default:
                return new sgm.i(this.f270396b, new f(), 1);
        }
    }
}
