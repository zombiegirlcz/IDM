package zfm;

/* JADX INFO: loaded from: classes13.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f322039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f322040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f322041c;
    public Object[] d;

    public n(int i) {
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
        this.f322039a = iNumberOfLeadingZeros - 1;
        this.f322041c = (int) (0.75f * iNumberOfLeadingZeros);
        this.d = new Object[iNumberOfLeadingZeros];
    }

    public final void a(ifm.c cVar) {
        Object obj2;
        Object obj3;
        Object[] objArr = this.d;
        int i = this.f322039a;
        int iHashCode = cVar.hashCode() * (-1640531527);
        int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
        Object obj4 = objArr[i2];
        if (obj4 != null) {
            if (obj4.equals(cVar)) {
                return;
            }
            do {
                i2 = (i2 + 1) & i;
                obj3 = objArr[i2];
                if (obj3 == null) {
                }
            } while (!obj3.equals(cVar));
            return;
        }
        objArr[i2] = cVar;
        int i3 = this.f322040b + 1;
        this.f322040b = i3;
        if (i3 < this.f322041c) {
            return;
        }
        Object[] objArr2 = this.d;
        int length = objArr2.length;
        int i5 = length << 1;
        int i6 = i5 - 1;
        Object[] objArr3 = new Object[i5];
        while (true) {
            int i21 = i3 - 1;
            if (i3 == 0) {
                this.f322039a = i6;
                this.f322041c = (int) (i5 * 0.75f);
                this.d = objArr3;
                return;
            }
            do {
                length--;
                obj2 = objArr2[length];
            } while (obj2 == null);
            int iHashCode2 = obj2.hashCode() * (-1640531527);
            int i22 = (iHashCode2 ^ (iHashCode2 >>> 16)) & i6;
            if (objArr3[i22] != null) {
                do {
                    i22 = (i22 + 1) & i6;
                } while (objArr3[i22] != null);
            }
            objArr3[i22] = objArr2[length];
            i3 = i21;
        }
    }

    public final void b(int i, int i2, Object[] objArr) {
        int i3;
        Object obj2;
        this.f322040b--;
        while (true) {
            int i5 = i + 1;
            while (true) {
                i3 = i5 & i2;
                obj2 = objArr[i3];
                if (obj2 == null) {
                    objArr[i] = null;
                    return;
                }
                int iHashCode = obj2.hashCode() * (-1640531527);
                int i6 = (iHashCode ^ (iHashCode >>> 16)) & i2;
                if (i <= i3) {
                    if (i >= i6 || i6 > i3) {
                        break;
                    } else {
                        i5 = i3 + 1;
                    }
                } else if (i < i6 || i6 <= i3) {
                    i5 = i3 + 1;
                }
            }
            objArr[i] = obj2;
            i = i3;
        }
    }
}
