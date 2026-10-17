package com.revolut.feature.checkout.models;

import c93.j;
import c93.l;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import pi3.c;
import pi3.e;
import xi0.b;

/* JADX INFO: loaded from: classes21.dex */
public abstract class a {
    public static final d a(CheckoutOrder checkoutOrder) {
        l lVar;
        Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
        int i = c.f236387a[checkoutOrder.f65847a.ordinal()];
        d dVar = null;
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            e eVarE = e(checkoutOrder);
            d dVar2 = eVarE.d.f152326a;
            d dVar3 = !eVarE.i ? dVar2 : null;
            return dVar3 == null ? d.c(dVar2, 0L, null, 2) : dVar3;
        }
        pi3.d dVarD = d(checkoutOrder);
        Intrinsics.checkNotNullParameter(dVarD, "<this>");
        d dVarO = pyd.c.O(dVarD.f236392h.f22288a.f22290a, dVarD.f.f22288a.f22290a);
        j jVar = dVarD.f236393j;
        d dVarO2 = pyd.c.O(pyd.c.O(dVarO, (jVar == null || (lVar = jVar.f22288a) == null) ? null : lVar.f22290a), dVarD.o);
        e eVar = checkoutOrder.e;
        if (eVar != null) {
            d dVar4 = eVar.d.f152326a;
            d dVarC = !eVar.i ? dVar4 : null;
            if (dVarC == null) {
                dVarC = d.c(dVar4, 0L, null, 2);
            }
            dVar = dVarC;
        }
        return pyd.c.O(dVarO2, dVar);
    }

    public static final b b(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
        int i = c.f236387a[checkoutOrder.f65847a.ordinal()];
        if (i == 1) {
            return d(checkoutOrder).f236392h.f22288a.f22290a.f115083b;
        }
        if (i == 2) {
            return e(checkoutOrder).d.f152326a.f115083b;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String c(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
        int i = c.f236387a[checkoutOrder.f65847a.ordinal()];
        if (i == 1) {
            return d(checkoutOrder).f236389b;
        }
        if (i == 2) {
            return e(checkoutOrder).f236401c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final pi3.d d(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
        pi3.d dVar = checkoutOrder.d;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final e e(CheckoutOrder checkoutOrder) {
        Intrinsics.checkNotNullParameter(checkoutOrder, "<this>");
        e eVar = checkoutOrder.e;
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
