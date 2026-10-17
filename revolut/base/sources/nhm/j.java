package nhm;

/* JADX INFO: loaded from: classes14.dex */
public final class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f215596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f215597c;
    public int d;
    public int e = 0;

    public j(b bVar) {
        Object[] objArr = new Object[8];
        this.f215596b = objArr;
        int[] iArr = new int[8];
        this.f215597c = iArr;
        this.f215595a = bVar.size();
        int i = 0;
        while (true) {
            objArr[i] = bVar;
            iArr[i] = 0;
            bVar = b(bVar, 0);
            if (bVar == null) {
                this.d = i;
                return;
            }
            i++;
        }
    }

    public static b b(b bVar, int i) {
        if (bVar instanceof f) {
            Object[] objArr = ((f) bVar).f215590c;
            if (i < objArr.length) {
                return (b) objArr[i];
            }
            return null;
        }
        if (bVar instanceof d) {
            d dVar = (d) bVar;
            if (i < 32) {
                return (b) dVar.f215584a[i];
            }
        }
        return null;
    }

    @Override // nhm.a
    public final Object a() {
        int[] iArr;
        int i = this.d;
        Object[] objArr = this.f215596b;
        Object obj2 = objArr[i];
        while (!(obj2 instanceof i)) {
            b bVarB = null;
            do {
                int i2 = this.d;
                iArr = this.f215597c;
                if (i2 <= 0) {
                    break;
                }
                int i3 = i2 - 1;
                this.d = i3;
                int i5 = iArr[i3] + 1;
                iArr[i3] = i5;
                bVarB = b((b) objArr[i3], i5);
            } while (bVarB == null);
            int i6 = this.d;
            do {
                i6++;
                objArr[i6] = bVarB;
                iArr[i6] = 0;
                bVarB = b(bVarB, 0);
            } while (bVarB != null);
            this.d = i6;
            obj2 = objArr[i6];
        }
        this.e++;
        if (!(obj2 instanceof h)) {
            objArr[this.d] = e.f215587a;
            return (k) obj2;
        }
        h hVar = (h) obj2;
        objArr[this.d] = hVar.e;
        return hVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.f215595a;
    }
}
