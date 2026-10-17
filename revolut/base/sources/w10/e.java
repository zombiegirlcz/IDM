package w10;

import java.lang.reflect.Type;
import java.util.ArrayList;
import kg.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements kg.t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, kg.s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.r rVar = json instanceof kg.r ? (kg.r) json : null;
        if (rVar == null) {
            return null;
        }
        ArrayList arrayList = rVar.f183889a;
        if (arrayList.isEmpty()) {
            return d70.b.f111735b;
        }
        d70.c cVar = new d70.c(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cVar.b(((u) arrayList.get(i)).a());
        }
        return cVar;
    }
}
