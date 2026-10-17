package ckf;

import com.revolut.feature.defi.exchange.api.navigation.DeFiExchangeDestination;
import elf.s0;
import klf.h0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.l0;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends n implements s0 {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f24830l;

    public e(h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f24830l = commonDataSource;
    }

    public static a Z2(a3 a3Var) {
        xi0.b bVarV;
        l0 l0Var = a3Var.Q1;
        if (l0Var != null) {
            int i = c.f24828a[a3Var.z.ordinal()];
            if (i == 1) {
                bVarV = pyd.c.v(a3Var);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bVarV = null;
            }
            if (bVarV != null) {
                return new a(l0Var.f272895a, bVarV);
            }
        }
        return null;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        a aVarZ2;
        if (!Intrinsics.f(str, "DEFI_BUY_AGAIN")) {
            return Boolean.FALSE;
        }
        a3 a3VarB = this.f24830l.b();
        if (a3VarB == null || (aVarZ2 = Z2(a3VarB)) == null) {
            return Boolean.TRUE;
        }
        A2(new DeFiExchangeDestination(wd6.e.BUY, aVarZ2.f24826a, aVarZ2.f24827b));
        return Boolean.TRUE;
    }
}
