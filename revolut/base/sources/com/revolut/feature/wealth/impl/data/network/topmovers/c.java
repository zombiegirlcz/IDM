package com.revolut.feature.wealth.impl.data.network.topmovers;

import com.revolut.feature.wealth.impl.data.network.topmovers.a;
import dj0.d;
import kotlin.NoWhenBranchMatchedException;
import xzg.j0;
import xzg.k0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {
    public static final k0 a(a.b bVar) {
        j0 j0Var;
        String ref2 = bVar.getRef();
        int i = b.f95506b[bVar.getAssetType().ordinal()];
        if (i == 1) {
            j0Var = j0.STOCK;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j0Var = j0.CRYPTO;
        }
        d dVarO = mo3.a.o(bVar.getBasePrice());
        ko3.a basePricePrecise = bVar.getBasePricePrecise();
        return new k0(ref2, j0Var, dVarO, basePricePrecise != null ? cj9.c.Q(basePricePrecise) : null);
    }
}
