package d88;

import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import sf8.m;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        Integer num = 1;
        c cVar = (c) obj3;
        m mVar = cVar.f112141a;
        m mVar2 = cVar.f112141a;
        boolean zL = c8g.a.l(mVar.e);
        sf8.b bVar = sf8.b.f262351a;
        sf8.e eVar = sf8.e.f262354a;
        Integer num2 = zL ? 2 : (mVar2.f262365j || Intrinsics.f(mVar2.e, eVar) || Intrinsics.f(mVar2.e, bVar)) ? num : 0;
        c cVar2 = (c) obj2;
        m mVar3 = cVar2.f112141a;
        m mVar4 = cVar2.f112141a;
        if (c8g.a.l(mVar3.e)) {
            num = 2;
        } else if (!mVar4.f262365j && !Intrinsics.f(mVar4.e, eVar) && !Intrinsics.f(mVar4.e, bVar)) {
            num = 0;
        }
        return cim.b.b(num2, num);
    }
}
