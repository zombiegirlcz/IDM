package e2j;

import java.util.Comparator;

/* JADX INFO: loaded from: classes10.dex */
public final class n implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num = 0;
        e eVar = (e) obj3;
        Integer num2 = cp5.d.A(eVar.f122119b.f115083b) ? 10 : cp5.d.z(eVar.f122119b.f115083b) ? 1 : num;
        e eVar2 = (e) obj2;
        if (cp5.d.A(eVar2.f122119b.f115083b)) {
            num = 10;
        } else if (cp5.d.z(eVar2.f122119b.f115083b)) {
            num = 1;
        }
        return cim.b.b(num2, num);
    }
}
