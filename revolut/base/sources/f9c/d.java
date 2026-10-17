package f9c;

import com.revolut.feature.revolutpay.impl.ui.nativetopup.RevolutPayTopUpScreenContract$InputData;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import com.revolut.retail.core.navigation.IntentCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import jki.g;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import sri.m;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends g implements c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RevolutPayTopUpScreenContract$InputData f132914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f132915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f132916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f132917s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, RevolutPayTopUpScreenContract$InputData inputData, m navigator, a returnCommandBuilder) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(returnCommandBuilder, "returnCommandBuilder");
        this.f132914p = inputData;
        this.f132915q = navigator;
        this.f132916r = returnCommandBuilder;
        this.f132917s = new b(null);
    }

    @Override // yji.l
    public final void T1(long j2) {
        NaviCommand naviCommand = ((b) t2()).f132913a;
        m mVar = this.f132915q;
        if (naviCommand != null) {
            mVar.c(r6.b.g(null, null, null, 7, naviCommand));
            return;
        }
        RevolutPayTopUpScreenContract$InputData revolutPayTopUpScreenContract$InputData = this.f132914p;
        String str = revolutPayTopUpScreenContract$InputData.f84507a;
        if (str == null) {
            str = "";
        }
        String str2 = revolutPayTopUpScreenContract$InputData.f84508b;
        x2(new f0m.c(new IntentCommand(this.f132916r.a(str, str2 != null ? str2 : ""), null), 17));
        mVar.c(u0.f(new InitTopUpDestination(TopUpConfig.Companion.c(TopUpConfig.INSTANCE, null, TopUpConfig.PreselectedTopUpMethod.ExternalOneOff.f90476a, null, pte.a.REVOLUT_PAY, 21))));
    }

    @Override // jki.g
    public final i r2() {
        return this.f132917s;
    }
}
