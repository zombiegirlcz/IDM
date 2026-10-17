package g7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class j extends k {
    public final /* synthetic */ int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f141038j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(List list, int i) {
        super(list);
        this.i = i;
        switch (i) {
            case 1:
                super(list);
                this.f141038j = new s7.d();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    m7.c cVar = (m7.c) ((s7.a) list.get(i2)).f260482b;
                    if (cVar != null) {
                        iMax = Math.max(iMax, cVar.f203225b.length);
                    }
                }
                this.f141038j = new m7.c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        Object obj2;
        float f4;
        switch (this.i) {
            case 0:
                m7.c cVar = (m7.c) this.f141038j;
                m7.c cVar2 = (m7.c) aVar.f260482b;
                m7.c cVar3 = (m7.c) aVar.f260483c;
                int[] iArr = cVar.f203225b;
                float[] fArr = cVar.f203224a;
                boolean zEquals = cVar2.equals(cVar3);
                int[] iArr2 = cVar2.f203225b;
                if (zEquals || f <= BitmapDescriptorFactory.HUE_RED) {
                    cVar.a(cVar2);
                } else if (f >= 1.0f) {
                    cVar.a(cVar3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = cVar3.f203225b;
                    if (length != iArr3.length) {
                        StringBuilder sb6 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb6.append(iArr2.length);
                        sb6.append(" vs ");
                        throw new IllegalArgumentException(j6.a.v(sb6, ")", iArr3.length));
                    }
                    for (int i = 0; i < iArr2.length; i++) {
                        fArr[i] = r7.g.f(cVar2.f203224a[i], cVar3.f203224a[i], f);
                        iArr[i] = zi0.c.p(f, iArr2[i], iArr3[i]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return cVar;
            default:
                s7.d dVar = (s7.d) this.f141038j;
                Object obj3 = aVar.f260482b;
                if (obj3 == null || (obj2 = aVar.f260483c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                s7.d dVar2 = (s7.d) obj3;
                s7.d dVar3 = (s7.d) obj2;
                s7.c cVar4 = this.e;
                if (cVar4 != null) {
                    f4 = f;
                    s7.d dVar4 = (s7.d) cVar4.b(aVar.f260484g, aVar.f260485h.floatValue(), dVar2, dVar3, f4, e(), this.d);
                    if (dVar4 != null) {
                        return dVar4;
                    }
                } else {
                    f4 = f;
                }
                float f5 = r7.g.f(dVar2.f260497a, dVar3.f260497a, f4);
                float f6 = r7.g.f(dVar2.f260498b, dVar3.f260498b, f4);
                dVar.f260497a = f5;
                dVar.f260498b = f6;
                return dVar;
        }
    }
}
