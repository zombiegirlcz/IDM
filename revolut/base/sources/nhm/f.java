package nhm;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f215588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f215589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f215590c;

    public f(int i, int i2, Object[] objArr) {
        this.f215588a = i;
        this.f215589b = i2;
        this.f215590c = objArr;
    }

    @Override // nhm.b
    public final ohm.c b(int i, int i2, Object obj2) {
        int iA = 1 << b.a(i, i2);
        int i3 = this.f215588a;
        if ((i3 & iA) == 0) {
            return ohm.a.f225407a;
        }
        return ((b) this.f215590c[Integer.bitCount((iA - 1) & i3)]).b(i + 5, i2, obj2);
    }

    @Override // nhm.b
    public final b c(int i, int i2, Object obj2, Object obj3, c cVar) {
        e eVar;
        b bVarC;
        int iA = b.a(i, i2);
        int i3 = 1 << iA;
        int i5 = this.f215588a;
        int iBitCount = Integer.bitCount((i3 - 1) & i5);
        boolean z = (i5 & i3) != 0;
        Object[] objArr = this.f215590c;
        b bVar = z ? (b) objArr[iBitCount] : null;
        e eVar2 = e.f215587a;
        if (z) {
            eVar = eVar2;
            bVarC = bVar.c(i + 5, i2, obj2, obj3, cVar);
        } else {
            eVar = eVar2;
            bVarC = eVar.c(i + 5, i2, obj2, obj3, cVar);
        }
        boolean z3 = z && bVarC.isEmpty();
        boolean z4 = (z || bVarC.isEmpty()) ? false : true;
        int i6 = z3 ? (~i3) & i5 : z4 ? i3 | i5 : i5;
        if (i6 == 0) {
            return eVar;
        }
        int i21 = this.f215589b;
        if (z3) {
            if (objArr.length <= 2) {
                Object obj4 = objArr[iBitCount ^ 1];
                if (obj4 instanceof i) {
                    return (b) obj4;
                }
            }
            int size = i21 - bVar.size();
            Object[] objArr2 = new Object[objArr.length - 1];
            System.arraycopy(objArr, 0, objArr2, 0, iBitCount);
            System.arraycopy(objArr, iBitCount + 1, objArr2, iBitCount, (objArr.length - iBitCount) - 1);
            return new f(i6, size, objArr2);
        }
        if (!z4) {
            if (!z) {
                return this;
            }
            int size2 = bVarC.size() + (i21 - bVar.size());
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            objArrCopyOf[iBitCount] = bVarC;
            return new f(i6, size2, objArrCopyOf);
        }
        if (objArr.length < 16) {
            int size3 = bVarC.size() + i21;
            Object[] objArr3 = new Object[objArr.length + 1];
            System.arraycopy(objArr, 0, objArr3, 0, iBitCount);
            objArr3[iBitCount] = bVarC;
            System.arraycopy(objArr, iBitCount, objArr3, iBitCount + 1, objArr.length - iBitCount);
            return new f(i6, size3, objArr3);
        }
        Object[] objArr4 = new Object[32];
        int i22 = 0;
        int i32 = 0;
        for (int i33 = 0; i33 < 32; i33++) {
            if ((i5 & 1) != 0) {
                objArr4[i33] = objArr[i32];
                i22++;
                i32++;
            } else if (i33 == iA) {
                objArr4[i33] = bVarC;
                i22++;
            } else {
                objArr4[i33] = eVar;
            }
            i5 >>>= 1;
        }
        return new d(i22, bVarC.size() + i21, objArr4);
    }

    @Override // nhm.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // nhm.b
    public final int size() {
        return this.f215589b;
    }
}
