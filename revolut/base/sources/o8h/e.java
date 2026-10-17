package o8h;

import e8h.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o8h.b;
import xzg.j0;
import xzg.k0;

/* JADX INFO: loaded from: classes9.dex */
public abstract class e {
    public static final k0 a(b.a aVar) {
        j0 j0Var;
        String ref2 = aVar.getRef();
        int i = d.f223027b[aVar.getAssetType().ordinal()];
        if (i == 1) {
            j0Var = j0.STOCK;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            j0Var = j0.CRYPTO;
        }
        dj0.d dVarV = hx7.a.v(aVar.getBasePrice());
        ko3.b basePricePrecise = aVar.getBasePricePrecise();
        return new k0(ref2, j0Var, dVarV, basePricePrecise != null ? cp5.c.I(basePricePrecise) : null);
    }

    public static final a b(j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        int i = d.f223028c[j0Var.ordinal()];
        if (i == 1) {
            return a.STOCK;
        }
        if (i == 2) {
            return a.CRYPTO;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final b.a c(k0 k0Var) {
        Intrinsics.checkNotNullParameter(k0Var, "<this>");
        String str = k0Var.f310003a;
        a aVarB = b(k0Var.f310004b);
        jo3.b bVarA = hx7.a.A(k0Var.f310005c);
        ej0.b bVar = k0Var.d;
        return new b.a(str, aVarB, bVarA, bVar != null ? cp5.c.M(bVar) : null);
    }

    public static final String d(e0 e0Var) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        int i = d.f223028c[e0Var.f123682a.ordinal()];
        if (i == 1) {
            str = "STOCK";
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = "CRYPTO";
        }
        int i2 = d.d[e0Var.f123683b.ordinal()];
        if (i2 == 1) {
            str2 = "OneDay";
        } else if (i2 == 2) {
            str2 = "OneMonth";
        } else if (i2 == 3) {
            str2 = "OneWeek";
        } else if (i2 == 4) {
            str2 = "OneYear";
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "FiveYears";
        }
        return p.a.p("TOP_MOVERS_PREFIX_", str, str2);
    }
}
