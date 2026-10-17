package g7;

import android.graphics.Path;
import android.graphics.PointF;
import f7.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends e {
    public final m7.q i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f141044j;
    public Path k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Path f141045l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f141046m;

    public o(List list) {
        super(list);
        this.i = new m7.q();
        this.f141044j = new Path();
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        m7.q qVarF;
        m7.q qVar = (m7.q) aVar.f260482b;
        m7.q qVar2 = (m7.q) aVar.f260483c;
        m7.q qVar3 = qVar2 == null ? qVar : qVar2;
        m7.q qVar4 = this.i;
        ArrayList arrayList = qVar4.f203255a;
        if (qVar4.f203256b == null) {
            qVar4.f203256b = new PointF();
        }
        boolean z = qVar.f203257c;
        ArrayList arrayList2 = qVar.f203255a;
        boolean z3 = true;
        qVar4.f203257c = z || qVar3.f203257c;
        int size = arrayList2.size();
        ArrayList arrayList3 = qVar3.f203255a;
        if (size != arrayList3.size()) {
            r7.c.b("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new k7.a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = qVar.f203256b;
        PointF pointF2 = qVar3.f203256b;
        qVar4.a(r7.g.f(pointF.x, pointF2.x, f), r7.g.f(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            k7.a aVar2 = (k7.a) arrayList2.get(size4);
            k7.a aVar3 = (k7.a) arrayList3.get(size4);
            PointF pointF3 = aVar2.f181749a;
            PointF pointF4 = aVar2.f181750b;
            PointF pointF5 = aVar2.f181751c;
            PointF pointF6 = aVar3.f181749a;
            boolean z4 = z3;
            PointF pointF7 = aVar3.f181750b;
            PointF pointF8 = aVar3.f181751c;
            ((k7.a) arrayList.get(size4)).f181749a.set(r7.g.f(pointF3.x, pointF6.x, f), r7.g.f(pointF3.y, pointF6.y, f));
            ((k7.a) arrayList.get(size4)).f181750b.set(r7.g.f(pointF4.x, pointF7.x, f), r7.g.f(pointF4.y, pointF7.y, f));
            ((k7.a) arrayList.get(size4)).f181751c.set(r7.g.f(pointF5.x, pointF8.x, f), r7.g.f(pointF5.y, pointF8.y, f));
            size4--;
            z3 = z4;
            arrayList2 = arrayList2;
            qVar4 = qVar4;
            arrayList3 = arrayList3;
        }
        m7.q qVar5 = qVar4;
        ArrayList arrayList4 = this.f141046m;
        if (arrayList4 != null) {
            qVarF = qVar5;
            for (int size5 = arrayList4.size() - 1; size5 >= 0; size5--) {
                qVarF = ((f7.t) ((v) this.f141046m.get(size5))).f(qVarF);
            }
        } else {
            qVarF = qVar5;
        }
        Path path = this.f141044j;
        r7.g.e(qVarF, path);
        if (this.e == null) {
            return path;
        }
        if (this.k == null) {
            this.k = new Path();
            this.f141045l = new Path();
        }
        r7.g.e(qVar, this.k);
        if (qVar2 != null) {
            r7.g.e(qVar2, this.f141045l);
        }
        s7.c cVar = this.e;
        float f4 = aVar.f260484g;
        float fFloatValue = aVar.f260485h.floatValue();
        Path path2 = this.k;
        return (Path) cVar.b(f4, fFloatValue, path2, qVar2 == null ? path2 : this.f141045l, f, e(), this.d);
    }

    @Override // g7.e
    public final boolean l() {
        ArrayList arrayList = this.f141046m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
