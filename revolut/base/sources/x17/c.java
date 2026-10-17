package x17;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f302317a;

    public c(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f302317a = amountFormatter;
    }

    public final List a(List list, String str, String str2, Function1 function1) {
        if (list.isEmpty()) {
            return list;
        }
        w80.b bVar = this.f302317a;
        if (str != null && (!d0.W(str))) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                dj0.d dVar = (dj0.d) function1.invoke(obj2);
                b bVar2 = b.f;
                dj0.d dVarA = dVar.a();
                xi0.b bVar3 = dVar.f115083b;
                if (((Boolean) bVar2.invoke(dVarA, new dj0.d(bVar.b(str, bVar3.f306286a), bVar3))).booleanValue()) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        if (str2 == null || !(!d0.W(str2))) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : list) {
            dj0.d dVar2 = (dj0.d) function1.invoke(obj3);
            a aVar = a.f;
            dj0.d dVarA2 = dVar2.a();
            xi0.b bVar4 = dVar2.f115083b;
            if (((Boolean) aVar.invoke(dVarA2, new dj0.d(bVar.b(str2, bVar4.f306286a), bVar4))).booleanValue()) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }
}
