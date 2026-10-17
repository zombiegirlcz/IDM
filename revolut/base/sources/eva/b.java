package eva;

import fo3.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od0.h;
import od0.i;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f129761a = new b();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List it8 = (List) obj2;
        Intrinsics.checkNotNullParameter(it8, "it");
        h hVar = i.Companion;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : it8) {
            psg.a aVar = (psg.a) obj3;
            if (aVar.d == psg.b.GUARDIAN && aVar.f239486c == e.ACTIVE) {
                arrayList.add(obj3);
            }
        }
        hVar.getClass();
        return h.a(arrayList);
    }
}
