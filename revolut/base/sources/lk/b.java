package lk;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.internal.LinkedTreeMap;
import com.meshconnect.link.entity.TransferFinishedErrorPayload;
import com.meshconnect.link.entity.TransferFinishedPayload;
import com.meshconnect.link.entity.TransferFinishedSuccessPayload;
import java.lang.reflect.Type;
import kg.s;
import kg.t;
import kg.u;
import kg.w;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class b implements t {
    @Override // kg.t
    public final Object deserialize(u json, Type typeOfT, s context) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(typeOfT, "typeOfT");
        Intrinsics.checkNotNullParameter(context, "context");
        w wVarC = json.c();
        LinkedTreeMap linkedTreeMap = wVarC.f183891a;
        if (!linkedTreeMap.containsKey("fromAddress")) {
            wVarC.h("fromAddress", "");
        }
        if (!linkedTreeMap.containsKey("toAddress")) {
            wVarC.h("toAddress", "");
        }
        String strF = wVarC.i("status").f();
        if (Intrinsics.f(strF, "success")) {
            Object objD = ((a31.a) context).d(wVarC, TransferFinishedSuccessPayload.class);
            Intrinsics.checkNotNullExpressionValue(objD, "deserialize(...)");
            return (TransferFinishedPayload) objD;
        }
        if (Intrinsics.f(strF, "error")) {
            Object objD2 = ((a31.a) context).d(wVarC, TransferFinishedErrorPayload.class);
            Intrinsics.checkNotNullExpressionValue(objD2, "deserialize(...)");
            return (TransferFinishedPayload) objD2;
        }
        throw new IllegalStateException(("unknown status '" + strF + CoreConstants.SINGLE_QUOTE_CHAR).toString());
    }
}
