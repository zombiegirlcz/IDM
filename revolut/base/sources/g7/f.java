package g7;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(List list, int i) {
        super(list);
        this.i = i;
    }

    @Override // g7.e
    public final Object g(s7.a aVar, float f) {
        int i;
        float f4;
        int iIntValue;
        switch (this.i) {
            case 0:
                return Integer.valueOf(m(aVar, f));
            default:
                Object obj2 = aVar.f260482b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = aVar.f260483c;
                if (obj3 == null) {
                    if (aVar.k == 784923401) {
                        aVar.k = ((Integer) obj2).intValue();
                    }
                    i = aVar.k;
                } else {
                    if (aVar.f260487l == 784923401) {
                        aVar.f260487l = ((Integer) obj3).intValue();
                    }
                    i = aVar.f260487l;
                }
                s7.c cVar = this.e;
                if (cVar != null) {
                    f4 = f;
                    Integer num = (Integer) cVar.b(aVar.f260484g, aVar.f260485h.floatValue(), (Integer) obj2, Integer.valueOf(i), f4, e(), this.d);
                    if (num != null) {
                        iIntValue = num.intValue();
                    }
                    return Integer.valueOf(iIntValue);
                }
                f4 = f;
                if (aVar.k == 784923401) {
                    aVar.k = ((Integer) obj2).intValue();
                }
                int i2 = aVar.k;
                PointF pointF = r7.g.f251946a;
                iIntValue = (int) (((i - i2) * f4) + i2);
                return Integer.valueOf(iIntValue);
        }
    }

    public int m(s7.a aVar, float f) {
        float f4;
        Float f5;
        Object obj2 = aVar.f260482b;
        Object obj3 = aVar.f260482b;
        if (obj2 == null || aVar.f260483c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        s7.c cVar = this.e;
        if (cVar == null || (f5 = aVar.f260485h) == null) {
            f4 = f;
        } else {
            f4 = f;
            Integer num = (Integer) cVar.b(aVar.f260484g, f5.floatValue(), (Integer) obj3, (Integer) aVar.f260483c, f4, e(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return zi0.c.p(r7.g.b(f4, BitmapDescriptorFactory.HUE_RED, 1.0f), ((Integer) obj3).intValue(), ((Integer) aVar.f260483c).intValue());
    }
}
