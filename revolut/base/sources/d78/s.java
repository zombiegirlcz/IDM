package d78;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num = 1;
        vf8.a aVar = (vf8.a) obj3;
        sf8.h hVar = aVar.f288533b;
        sf8.h hVar2 = aVar.f288533b;
        boolean zL = c8g.a.l(hVar);
        sf8.b bVar = sf8.b.f262351a;
        sf8.e eVar = sf8.e.f262354a;
        Integer num2 = zL ? 2 : (aVar.f288532a.f77106n || Intrinsics.f(hVar2, eVar) || Intrinsics.f(hVar2, bVar)) ? num : 0;
        vf8.a aVar2 = (vf8.a) obj2;
        sf8.h hVar3 = aVar2.f288533b;
        sf8.h hVar4 = aVar2.f288533b;
        if (c8g.a.l(hVar3)) {
            num = 2;
        } else if (!aVar2.f288532a.f77106n && !Intrinsics.f(hVar4, eVar) && !Intrinsics.f(hVar4, bVar)) {
            num = 0;
        }
        return cim.b.b(num2, num);
    }
}
