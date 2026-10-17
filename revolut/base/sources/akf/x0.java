package akf;

import com.revolut.feature_move_money.api.MoveMoneyFeatureApi$Toggles;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.a3;
import tof.o3;
import tof.v6;
import tof.w5;

/* JADX INFO: loaded from: classes8.dex */
public final class x0 extends yji.n implements elf.s0 {

    @NotNull
    private static final v0 Companion = new v0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5920l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f5921m;

    public x0(klf.h0 commonDataSource, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f5920l = commonDataSource;
        this.f5921m = featureToggleInteractor;
    }

    public final cmf.f Z2() {
        return new cmf.f(new a3i.i(this.f5920l.d(), this, 13), zhm.u.c(this), "MoveAgainActions");
    }

    public final y0 b3(a3 a3Var) {
        tof.a aVar;
        o3 o3Var;
        xi0.b bVar;
        long jAbs;
        io3.l lVar;
        xi0.b bVar2;
        StartUpPocket startUpPocketB;
        if (((jte.d) this.f5921m).c(MoveMoneyFeatureApi$Toggles.MoveAgainButton.f97182c) && k71.k.U0(a3Var) && !k71.k.f(a3Var) && a3Var.f == v6.COMPLETED) {
            Intrinsics.checkNotNullParameter(a3Var, "<this>");
            tof.a aVar2 = a3Var.R0;
            dj0.d dVar = a3Var.k;
            w5 w5Var = a3Var.f272624y;
            String str = w5Var.f273143a;
            if (aVar2 != null && (aVar = a3Var.S0) != null && (o3Var = a3Var.J) != null) {
                dj0.d dVar2 = o3Var.f272965a;
                w5 w5Var2 = o3Var.f272966b;
                io3.l lVar2 = w5Var.f273144b;
                io3.l lVar3 = io3.l.COLLATERAL_PROXY;
                if (lVar2 != lVar3) {
                    if ((w5Var2 != null ? w5Var2.f273144b : null) != lVar3) {
                        if (Intrinsics.f(a1.a(aVar2), str)) {
                            bVar = dVar.f115083b;
                            bVar2 = dVar2.f115083b;
                            lVar = w5Var2 != null ? w5Var2.f273144b : null;
                            jAbs = Math.abs(dVar.f115082a);
                        } else if (Intrinsics.f(a1.a(aVar), str)) {
                            bVar = dVar2.f115083b;
                            xi0.b bVar3 = dVar.f115083b;
                            io3.l lVar4 = w5Var2 != null ? w5Var2.f273144b : null;
                            jAbs = Math.abs(dVar2.f115082a);
                            lVar2 = lVar4;
                            lVar = lVar2;
                            bVar2 = bVar3;
                        }
                        StartUpPocket startUpPocketB2 = a1.b(lVar2, aVar2, bVar);
                        if (startUpPocketB2 != null && (startUpPocketB = a1.b(lVar, aVar, bVar2)) != null) {
                            return new y0(startUpPocketB2, startUpPocketB, jAbs);
                        }
                    }
                }
            }
        }
        return null;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        y0 y0VarB3;
        if (!Intrinsics.f(str, "MOVE_AGAIN")) {
            return Boolean.FALSE;
        }
        a3 a3VarB = this.f5920l.b();
        if (a3VarB != null && (y0VarB3 = b3(a3VarB)) != null) {
            A2(new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveMoneyWithAccountPair(y0VarB3.f5922a, y0VarB3.f5923b, new Long(y0VarB3.f5924c), null, 56), (Set) null, 6), null));
        }
        return Boolean.TRUE;
    }
}
