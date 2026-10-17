package l7;

import g7.j;
import g7.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends c9.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f192416c;

    public c(int i, ArrayList arrayList) {
        this.f192416c = i;
        switch (i) {
            case 1:
                super(arrayList);
                break;
            default:
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    s7.a aVar = (s7.a) arrayList.get(i2);
                    m7.c cVar = (m7.c) aVar.f260482b;
                    m7.c cVar2 = (m7.c) aVar.f260483c;
                    if (cVar != null && cVar2 != null) {
                        float[] fArr = cVar.f203224a;
                        int length = fArr.length;
                        float[] fArr2 = cVar2.f203224a;
                        if (length != fArr2.length) {
                            int length2 = fArr.length + fArr2.length;
                            float[] fArr3 = new float[length2];
                            System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                            System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                            Arrays.sort(fArr3);
                            float f = Float.NaN;
                            int i3 = 0;
                            for (int i5 = 0; i5 < length2; i5++) {
                                float f4 = fArr3[i5];
                                if (f4 != f) {
                                    fArr3[i3] = f4;
                                    i3++;
                                    f = fArr3[i5];
                                }
                            }
                            float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                            aVar = new s7.a(cVar.b(fArrCopyOfRange), cVar2.b(fArrCopyOfRange));
                        }
                    }
                    arrayList.set(i2, aVar);
                }
                super(arrayList);
                break;
        }
    }

    @Override // l7.g
    public final g7.e a() {
        switch (this.f192416c) {
            case 0:
                return new j((List) this.f22248b, 0);
            default:
                return new n((List) this.f22248b);
        }
    }
}
