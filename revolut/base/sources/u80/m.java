package u80;

import com.revolut.core.model.money.ScaleMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qd0.b f278063a;

    public m(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f278063a = languageProvider;
    }

    public final String a(f formattedMoney) {
        dj0.d dVarF;
        Intrinsics.checkNotNullParameter(formattedMoney, "formattedMoney");
        ScaleMode scaleModeE = formattedMoney.e();
        if (Intrinsics.f(scaleModeE, ScaleMode.PrettyFormat.f51440a)) {
            dVarF = q.a(q.c(pyd.c.j(formattedMoney.f())), formattedMoney.f().f115083b);
        } else if (Intrinsics.f(scaleModeE, ScaleMode.CryptoHoldingFormat.f51439a)) {
            dVarF = q.a(q.b(pyd.c.j(formattedMoney.f())), formattedMoney.f().f115083b);
        } else if (Intrinsics.f(scaleModeE, ScaleMode.TradingPrecise.f51443a)) {
            dVarF = q.a(q.d(pyd.c.j(formattedMoney.f()), formattedMoney.f().f115083b), formattedMoney.f().f115083b);
        } else {
            if (!(scaleModeE instanceof ScaleMode.SimpleLen) && scaleModeE != null) {
                throw new NoWhenBranchMatchedException();
            }
            dVarF = formattedMoney.f();
        }
        k.Companion.getClass();
        k kVarA = j.a(this.f278063a);
        kVarA.v(dVarF);
        int i = l.f278062a[formattedMoney.i().ordinal()];
        if (i == 1) {
            kVarA.x();
        } else if (i == 2) {
            kVarA.h();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Unit unit = Unit.f186387a;
        }
        if (formattedMoney.c()) {
            kVarA.f();
        }
        if (formattedMoney.a() != null) {
            kVarA.d(formattedMoney.a().longValue());
        }
        if (formattedMoney.b()) {
            kVarA.e();
        }
        ScaleMode scaleModeE2 = formattedMoney.e();
        if (scaleModeE2 instanceof ScaleMode.SimpleLen) {
            ScaleMode.SimpleLen simpleLen = (ScaleMode.SimpleLen) scaleModeE2;
            kVarA.t(simpleLen.getF51441a(), simpleLen.getF51442b());
        } else if ((scaleModeE2 instanceof ScaleMode.CryptoHoldingFormat) || (scaleModeE2 instanceof ScaleMode.TradingPrecise)) {
            kVarA.u(dVarF.f115083b.c());
        }
        if (formattedMoney.k()) {
            kVarA.n();
        }
        if (formattedMoney.g()) {
            kVarA.o();
        }
        if (formattedMoney.d()) {
            kVarA.l();
        }
        if (formattedMoney.h()) {
            kVarA.p();
        }
        Integer numJ = formattedMoney.j();
        if (numJ != null) {
            kVarA.w(numJ.intValue());
        }
        return kVarA.a();
    }
}
