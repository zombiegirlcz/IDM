package v20;

import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i0 implements kg.t {
    @Override // kg.t
    public final Object deserialize(kg.u json, Type typeOfT, kg.s context) {
        String strF;
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        kg.w wVarC = json.c();
        kg.u uVarI = wVarC.i("type");
        if (uVarI == null || (strF = uVarI.f()) == null) {
            strF = "";
        }
        String strF2 = wVarC.f183891a.containsKey("rawData") ? wVarC.i("rawData").f() : wVarC.toString();
        Intrinsics.h(strF2);
        return new h0(strF, strF2);
    }
}
