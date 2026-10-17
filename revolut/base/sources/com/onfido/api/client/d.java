package com.onfido.api.client;

import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes17.dex */
public final class d extends u implements Function1 {
    public static final d f = new d(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        rlm.f Json = (rlm.f) obj2;
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.f255101c = true;
        Json.f255099a = true;
        Json.d = true;
        Json.f255100b = false;
        tlm.f fVar = new tlm.f();
        fVar.f(o0.f186429a.b(Locale.class), bl.b.f16441a);
        tlm.d dVarA = fVar.a();
        Intrinsics.checkNotNullParameter(dVarA, "<set-?>");
        Json.f255103h = dVarA;
        Json.e = true;
        return Unit.f186387a;
    }
}
