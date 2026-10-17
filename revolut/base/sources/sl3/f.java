package sl3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f264106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f264107b;

    public /* synthetic */ f(k kVar, int i) {
        this.f264106a = i;
        this.f264107b = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f264106a) {
            case 0:
                return k.h(ao.h.i(this.f264107b.f264113a));
            default:
                ao.h hVar = this.f264107b.f264113a;
                List all2 = ((ne0.j) hVar.f7848c).getAll();
                if (all2.isEmpty()) {
                    return ao.h.t(((ml3.a) hVar.f7847b).l());
                }
                ArrayList arrayListT = ao.h.t(all2);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListT) {
                    ml3.i iVar = (ml3.i) obj2;
                    if (iVar.f206605s != null && iVar.i) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
        }
    }
}
