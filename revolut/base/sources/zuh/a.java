package zuh;

import evh.g0;
import evh.h0;
import evh.i0;
import evh.j0;
import kg.p;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {
    public static void a(p gsonBuilder) {
        Intrinsics.checkNotNullParameter(gsonBuilder, "gsonBuilder");
        he0.m mVarB = he0.m.b(j0.class, "stepType");
        mVarB.c(i0.class, "REQUEST_USER_INFORMATION");
        mVarB.c(h0.class, "REQUEST_USER_INFORMATION_QUESTIONNAIRE");
        mVarB.c(g0.class, "REQUEST_USER_AUTHENTICATION");
        gsonBuilder.e.add(mVarB);
        Intrinsics.checkNotNullExpressionValue(gsonBuilder, "registerTypeAdapterFactory(...)");
    }
}
