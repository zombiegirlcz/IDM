package yfg;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import yfg.h;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        u uVarI = json.c().i("iataCode");
        if ((uVarI != null ? uVarI.f() : null) != null) {
            Object objD = ((a31.a) context).d(json, h.a.class);
            Intrinsics.h(objD);
            return (h) objD;
        }
        Object objD2 = ((a31.a) context).d(json, h.b.class);
        Intrinsics.h(objD2);
        return (h) objD2;
    }
}
