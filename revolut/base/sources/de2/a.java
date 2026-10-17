package de2;

import com.revolut.feature.apm.swish.impl.domain.SwishPaymentLimits;
import dj0.d;
import ee2.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public abstract class a {
    public static final SwishPaymentLimits a(ee2.a aVar) {
        jo3.a current;
        jo3.a current2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        a.C0728a p2p = aVar.getOutbound().getP2p();
        d dVarO = null;
        d dVarO2 = (p2p == null || (current2 = p2p.getCurrent()) == null) ? null : mo3.a.o(current2);
        if (dVarO2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jo3.a max = aVar.getOutbound().getP2p().getMax();
        d dVarO3 = max != null ? mo3.a.o(max) : null;
        if (dVarO3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        a.C0728a p2m2 = aVar.getOutbound().getP2m();
        if (p2m2 != null && (current = p2m2.getCurrent()) != null) {
            dVarO = mo3.a.o(current);
        }
        if (dVarO != null) {
            return new SwishPaymentLimits(dVarO2, dVarO, dVarO3);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
