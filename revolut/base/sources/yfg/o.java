package yfg;

import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kotlin.jvm.internal.Intrinsics;
import yfg.p;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        u uVarI = json.c().i("iataCode");
        if ((uVarI != null ? uVarI.f() : null) != null) {
            Object objD = ((a31.a) context).d(json, p.a.C1744a.class);
            Intrinsics.h(objD);
            return (p.a) objD;
        }
        Object objD2 = ((a31.a) context).d(json, p.a.b.class);
        Intrinsics.h(objD2);
        return (p.a) objD2;
    }
}
