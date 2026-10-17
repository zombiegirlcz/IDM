package com.fourthline.orca.internal;

import com.fourthline.orca.bav.internal.error.BavError;
import com.fourthline.orca.internal.hq0;
import com.fourthline.orca.internal.s5;
import com.fourthline.orca.internal.u5;
import com.fourthline.orca.internal.v5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class x5 {
    public static final hq0 a(y5 y5Var) {
        Intrinsics.checkNotNullParameter(y5Var, "<this>");
        Integer errorCode = y5Var.getErrorCode();
        return (errorCode != null && errorCode.intValue() == 2000) ? s5.a.C0279a.f32906a : ((errorCode != null && errorCode.intValue() == 3000) || (errorCode != null && errorCode.intValue() == 5000)) ? v5.a.C0298a.f34244a : (errorCode != null && errorCode.intValue() == 3001) ? u5.a.C0291a.f33960a : new hq0.c(BavError.Generic.INSTANCE, null, null, 6, null);
    }
}
