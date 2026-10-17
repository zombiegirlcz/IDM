package ry7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import nkm.d0;
import nkm.y;
import zw7.h1;

/* JADX INFO: loaded from: classes4.dex */
public final class q {
    public static List a(ArrayList quotes) {
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        d0 d0VarX = y.x(y.l(zhm.d0.Q(quotes), new rxb.b(19)), new h0() { // from class: ry7.p
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((h1) obj2).d;
            }
        });
        Intrinsics.checkNotNullParameter(d0VarX, "<this>");
        return y.J(new nkm.m(d0VarX, 1));
    }
}
