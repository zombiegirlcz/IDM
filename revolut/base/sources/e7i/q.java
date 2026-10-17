package e7i;

import cli.y;
import com.revolut.feature_move_money.impl.automation.screen.limit.MoveMoneyAutomationLimitScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends oki.h implements n {

    @NotNull
    public static final p Companion = new p();
    public final MoveMoneyAutomationLimitScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f123346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f123347q;

    public q(t stateMapper, MoveMoneyAutomationLimitScreenContract$InputData inputData, w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.o = inputData;
        this.f123346p = amountFormatter;
        Long l2 = inputData.f97345b;
        long jLongValue = l2 != null ? l2.longValue() : 50000L;
        xi0.b bVar = inputData.f97344a;
        ibd.j jVar = inputData.f97346c;
        this.f123347q = mra.d.b(this, new j(jLongValue, bVar, jVar == null ? ibd.j.Monthly : jVar, l2 != null), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f123347q;
    }
}
