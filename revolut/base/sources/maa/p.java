package maa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f203986a = new p();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        yhm.r rVar = (yhm.r) obj2;
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        List<f5j.a> list = (List) rVar.f314201a;
        Map map = (Map) rVar.f314202b;
        List<f5j.a> list2 = (List) rVar.f314203c;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (f5j.a aVar : list) {
            if (map.get(aVar.f132329a) == null) {
                arrayList.add(aVar);
            }
        }
        for (f5j.a aVar2 : list2) {
            if (map.get(aVar2.f132329a) == null) {
                arrayList2.add(aVar2);
            }
        }
        return new i(map, arrayList, arrayList2);
    }
}
