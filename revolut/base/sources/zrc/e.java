package zrc;

import be7.s;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$InputData;
import elm.f;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f324677a;

    public e(InvestOrderEditScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f324677a = inputData;
    }

    public Object a(vrc.a aVar, gim.c cVar) {
        bsc.c cVar2 = (bsc.c) this.f324677a;
        cVar2.getClass();
        p0 p0Var = p0.f264001a;
        return e0.J(f.f127540b, new s(cVar2, aVar, null, 27), cVar);
    }

    public e(bsc.c tradingScaPromptRepository) {
        Intrinsics.checkNotNullParameter(tradingScaPromptRepository, "tradingScaPromptRepository");
        this.f324677a = tradingScaPromptRepository;
    }
}
