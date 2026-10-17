package f7;

import java.util.ArrayList;
import java.util.List;
import m7.y;
import m7.z;

/* JADX INFO: loaded from: classes.dex */
public final class x implements d, g7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f132549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f132550b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f132551c;
    public final g7.i d;
    public final g7.i e;
    public final g7.i f;

    public x(n7.b bVar, z zVar) {
        this.f132549a = zVar.e;
        this.f132551c = zVar.f203275a;
        g7.i iVarA = zVar.f203276b.a();
        this.d = iVarA;
        g7.i iVarA2 = zVar.f203277c.a();
        this.e = iVarA2;
        g7.i iVarA3 = zVar.d.a();
        this.f = iVarA3;
        bVar.b(iVarA);
        bVar.b(iVarA2);
        bVar.b(iVarA3);
        iVarA.a(this);
        iVarA2.a(this);
        iVarA3.a(this);
    }

    public final void b(g7.a aVar) {
        this.f132550b.add(aVar);
    }

    @Override // g7.a
    public final void d() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f132550b;
            if (i >= arrayList.size()) {
                return;
            }
            ((g7.a) arrayList.get(i)).d();
            i++;
        }
    }

    @Override // f7.d
    public final void e(List list, List list2) {
    }
}
