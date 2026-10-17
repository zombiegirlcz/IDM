package f7;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class t implements v, g7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LottieDrawable f132538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g7.e f132539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m7.q f132540c;

    public t(LottieDrawable lottieDrawable, n7.b bVar, m7.p pVar) {
        this.f132538a = lottieDrawable;
        g7.e eVarA = pVar.f203254a.a();
        this.f132539b = eVarA;
        bVar.b(eVarA);
        eVarA.a(this);
    }

    public static int c(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    public final void b(u uVar) {
        this.f132539b.a(uVar);
    }

    @Override // g7.a
    public final void d() {
        this.f132538a.invalidateSelf();
    }

    @Override // f7.d
    public final void e(List list, List list2) {
    }

    public final m7.q f(m7.q qVar) {
        ArrayList arrayList;
        float f;
        m7.q qVar2 = qVar;
        ArrayList arrayList2 = qVar2.f203255a;
        if (arrayList2.size() > 2) {
            float fFloatValue = ((Float) this.f132539b.f()).floatValue();
            if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                ArrayList arrayList3 = qVar2.f203255a;
                boolean z = qVar2.f203257c;
                boolean z3 = true;
                int size = arrayList3.size() - 1;
                int i = 0;
                while (size >= 0) {
                    k7.a aVar = (k7.a) arrayList3.get(size);
                    k7.a aVar2 = (k7.a) arrayList3.get(c(size - 1, arrayList3.size()));
                    PointF pointF = (size != 0 || z) ? aVar2.f181751c : qVar2.f203256b;
                    i = (((size != 0 || z) ? aVar2.f181750b : pointF).equals(pointF) && aVar.f181749a.equals(pointF) && !(!qVar2.f203257c && (size == 0 || size == arrayList3.size() - 1))) ? i + 2 : i + 1;
                    size--;
                }
                m7.q qVar3 = this.f132540c;
                if (qVar3 == null || qVar3.f203255a.size() != i) {
                    ArrayList arrayList4 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList4.add(new k7.a());
                    }
                    this.f132540c = new m7.q(new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED), false, arrayList4);
                }
                m7.q qVar4 = this.f132540c;
                qVar4.f203257c = z;
                PointF pointF2 = qVar2.f203256b;
                qVar4.a(pointF2.x, pointF2.y);
                ArrayList arrayList5 = qVar4.f203255a;
                boolean z4 = qVar2.f203257c;
                int i3 = 0;
                int i5 = 0;
                while (i3 < arrayList2.size()) {
                    k7.a aVar3 = (k7.a) arrayList2.get(i3);
                    k7.a aVar4 = (k7.a) arrayList2.get(c(i3 - 1, arrayList2.size()));
                    k7.a aVar5 = (k7.a) arrayList2.get(c(i3 - 2, arrayList2.size()));
                    PointF pointF3 = (i3 != 0 || z4) ? aVar4.f181751c : qVar2.f203256b;
                    PointF pointF4 = (i3 != 0 || z4) ? aVar4.f181750b : pointF3;
                    boolean z6 = z3;
                    PointF pointF5 = aVar3.f181749a;
                    PointF pointF6 = aVar5.f181751c;
                    PointF pointF7 = aVar3.f181751c;
                    boolean z11 = (qVar2.f203257c || !(i3 == 0 || i3 == arrayList2.size() + (-1))) ? false : z6;
                    if (pointF4.equals(pointF3) && pointF5.equals(pointF3) && !z11) {
                        float f4 = pointF3.x;
                        float f5 = f4 - pointF6.x;
                        float f6 = pointF3.y;
                        float f32 = f6 - pointF6.y;
                        float f35 = pointF7.x - f4;
                        float f36 = pointF7.y - f6;
                        arrayList = arrayList2;
                        float fHypot = (float) Math.hypot(f5, f32);
                        float fHypot2 = (float) Math.hypot(f35, f36);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f37 = pointF3.x;
                        float fA = j6.a.a(pointF6.x, f37, fMin, f37);
                        float f41 = pointF3.y;
                        float fA2 = j6.a.a(pointF6.y, f41, fMin, f41);
                        float fA3 = j6.a.a(pointF7.x, f37, fMin2, f37);
                        float fA4 = j6.a.a(pointF7.y, f41, fMin2, f41);
                        float f42 = fA - ((fA - f37) * 0.5519f);
                        float f57 = fA2 - ((fA2 - f41) * 0.5519f);
                        float f69 = fA3 - ((fA3 - f37) * 0.5519f);
                        float f75 = fA4 - ((fA4 - f41) * 0.5519f);
                        k7.a aVar6 = (k7.a) arrayList5.get(c(i5 - 1, arrayList5.size()));
                        k7.a aVar7 = (k7.a) arrayList5.get(i5);
                        f = fFloatValue;
                        aVar6.f181750b.set(fA, fA2);
                        aVar6.f181751c.set(fA, fA2);
                        if (i3 == 0) {
                            qVar4.a(fA, fA2);
                        }
                        aVar7.f181749a.set(f42, f57);
                        k7.a aVar8 = (k7.a) arrayList5.get(i5 + 1);
                        aVar7.f181750b.set(f69, f75);
                        aVar7.f181751c.set(fA3, fA4);
                        aVar8.f181749a.set(fA3, fA4);
                        i5 += 2;
                    } else {
                        arrayList = arrayList2;
                        f = fFloatValue;
                        k7.a aVar9 = (k7.a) arrayList5.get(c(i5 - 1, arrayList5.size()));
                        k7.a aVar10 = (k7.a) arrayList5.get(i5);
                        PointF pointF8 = aVar4.f181750b;
                        aVar9.f181750b.set(pointF8.x, pointF8.y);
                        PointF pointF9 = aVar4.f181751c;
                        aVar9.f181751c.set(pointF9.x, pointF9.y);
                        PointF pointF10 = aVar3.f181749a;
                        aVar10.f181749a.set(pointF10.x, pointF10.y);
                        i5++;
                    }
                    i3++;
                    qVar2 = qVar;
                    z3 = z6;
                    arrayList2 = arrayList;
                    fFloatValue = f;
                }
                return qVar4;
            }
        }
        return qVar2;
    }
}
