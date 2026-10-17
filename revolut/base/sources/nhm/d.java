package nhm;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f215584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f215585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f215586c;

    public d(int i, int i2, Object[] objArr) {
        this.f215584a = objArr;
        this.f215585b = i;
        this.f215586c = i2;
    }

    @Override // nhm.b
    public final ohm.c b(int i, int i2, Object obj2) {
        return ((b) this.f215584a[b.a(i, i2)]).b(i + 5, i2, obj2);
    }

    @Override // nhm.b
    public final b c(int i, int i2, Object obj2, Object obj3, c cVar) {
        int iA = b.a(i, i2);
        Object[] objArr = this.f215584a;
        b bVar = (b) objArr[iA];
        b bVarC = bVar.c(i + 5, i2, obj2, obj3, cVar);
        boolean zIsEmpty = bVar.isEmpty();
        int i3 = this.f215586c;
        int i5 = this.f215585b;
        if (zIsEmpty && !bVarC.isEmpty()) {
            int size = bVarC.size() + i3;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iA] = bVarC;
            return new d(i5 + 1, size, objArrCopyOf);
        }
        if (bVar.isEmpty() || !bVarC.isEmpty()) {
            int size2 = bVarC.size() + (i3 - bVar.size());
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf2[iA] = bVarC;
            return new d(i5, size2, objArrCopyOf2);
        }
        int i6 = i5 - 1;
        if (i6 > 8) {
            int size3 = i3 - bVar.size();
            Object[] objArrCopyOf3 = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf3[iA] = e.f215587a;
            return new d(i6, size3, objArrCopyOf3);
        }
        Object[] objArr2 = new Object[i6];
        int i21 = 0;
        int i22 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < 32; i33++) {
            b bVar2 = (b) objArr[i33];
            if (i33 != iA && !bVar2.isEmpty()) {
                int size4 = bVar2.size() + i22;
                objArr2[i32] = bVar2;
                i21 |= 1 << i33;
                i32++;
                i22 = size4;
            }
        }
        return new f(i21, i22, objArr2);
    }

    @Override // nhm.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // nhm.b
    public final int size() {
        return this.f215586c;
    }
}
