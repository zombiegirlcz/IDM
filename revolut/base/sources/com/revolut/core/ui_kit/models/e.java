package com.revolut.core.ui_kit.models;

import aw0.a5;
import aw0.t5;
import aw0.z4;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.models.MoneyClause;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class e {
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final t5 a(Float f, Function1 valueToMoney) {
        Intrinsics.checkNotNullParameter(valueToMoney, "valueToMoney");
        MoneyClause.Format.Shorts shorts = new MoneyClause.Format.Shorts(!((Boolean) jo0.g.E.getValue()).booleanValue(), 61);
        a5 a5Var = null;
        a5 a5Var2 = new a5(BitmapDescriptorFactory.HUE_RED, null, z4.SOLID);
        if (f != null) {
            if (f == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            a5Var = new a5(f.floatValue(), new MoneyClause((dj0.d) valueToMoney.invoke(f), shorts, null, null, 12), z4.DASHED);
        }
        a5[] elements = {a5Var2, a5Var};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new t5(kotlin.collections.d.L(elements));
    }
}
