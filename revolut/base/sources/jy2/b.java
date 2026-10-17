package jy2;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f179307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v60.e f179308b;

    public b(k state, sf0.h serverErrorParser, v60.e serverErrorsProvider) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(serverErrorsProvider, "serverErrorsProvider");
        this.f179307a = state;
        this.f179308b = serverErrorsProvider;
    }

    public abstract tm.g d();

    public final void e(Clause errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        te0.e eVarY0 = ((n) this.f179307a).y0();
        od0.i.Companion.getClass();
        eVarY0.set(od0.h.a(errorMessage));
    }

    public final void f(String cardNumber) {
        Intrinsics.checkNotNullParameter(cardNumber, "cardNumber");
        n nVar = (n) this.f179307a;
        te0.e eVarY0 = nVar.y0();
        od0.i.Companion.getClass();
        eVarY0.set(od0.i.f224256b);
        nVar.x0().set(cardNumber);
    }
}
