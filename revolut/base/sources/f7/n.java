package f7;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes16.dex */
public final class n implements o, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Path f132510a = new Path();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Path f132511b = new Path();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f132512c = new Path();
    public final ArrayList d = new ArrayList();
    public final m7.l e;

    public n(m7.l lVar) {
        this.e = lVar;
    }

    @Override // f7.k
    public final void b(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            d dVar = (d) listIterator.previous();
            if (dVar instanceof o) {
                this.d.add((o) dVar);
                listIterator.remove();
            }
        }
    }

    public final void c(Path.Op op2) {
        Path path = this.f132511b;
        path.reset();
        Path path2 = this.f132510a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar instanceof e) {
                e eVar = (e) oVar;
                ArrayList arrayList2 = (ArrayList) eVar.b();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path path3 = ((o) arrayList2.get(size2)).getPath();
                    Matrix matrixE = eVar.d;
                    g7.t tVar = eVar.f132475l;
                    if (tVar != null) {
                        matrixE = tVar.e();
                    } else {
                        matrixE.reset();
                    }
                    path3.transform(matrixE);
                    path.addPath(path3);
                }
            } else {
                path.addPath(oVar.getPath());
            }
        }
        int i = 0;
        o oVar2 = (o) arrayList.get(0);
        if (oVar2 instanceof e) {
            e eVar2 = (e) oVar2;
            List listB = eVar2.b();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listB;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path path4 = ((o) arrayList3.get(i)).getPath();
                Matrix matrixE2 = eVar2.d;
                g7.t tVar2 = eVar2.f132475l;
                if (tVar2 != null) {
                    matrixE2 = tVar2.e();
                } else {
                    matrixE2.reset();
                }
                path4.transform(matrixE2);
                path2.addPath(path4);
                i++;
            }
        } else {
            path2.set(oVar2.getPath());
        }
        this.f132512c.op(path2, path, op2);
    }

    @Override // f7.d
    public final void e(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e(list, list2);
            i++;
        }
    }

    @Override // f7.o
    public final Path getPath() {
        Path path = this.f132512c;
        path.reset();
        m7.l lVar = this.e;
        if (!lVar.f203244b) {
            int i = m.f132509a[lVar.f203243a.ordinal()];
            if (i == 1) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList = this.d;
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    path.addPath(((o) arrayList.get(i2)).getPath());
                    i2++;
                }
            } else {
                if (i == 2) {
                    c(Path.Op.UNION);
                    return path;
                }
                if (i == 3) {
                    c(Path.Op.REVERSE_DIFFERENCE);
                    return path;
                }
                if (i == 4) {
                    c(Path.Op.INTERSECT);
                    return path;
                }
                if (i == 5) {
                    c(Path.Op.XOR);
                    return path;
                }
            }
        }
        return path;
    }
}
