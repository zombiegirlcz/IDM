package jn;

import com.revolut.retail.common.ui.R$string;
import com.youTransactor.uCube.rpc.Constants;
import efm.d0;
import hn.h;
import kotlin.jvm.internal.Intrinsics;
import rfm.f0;
import t70.g;

/* JADX INFO: loaded from: classes.dex */
public final class a extends vm.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f176638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f176639b;

    public a(h dialogConfigurationDispatcher, g localisation) {
        Intrinsics.checkNotNullParameter(dialogConfigurationDispatcher, "dialogConfigurationDispatcher");
        Intrinsics.checkNotNullParameter(localisation, "localisation");
        this.f176638a = dialogConfigurationDispatcher;
        this.f176639b = localisation;
    }

    @Override // vm.d
    public final d0 d(um.a errorData) {
        Intrinsics.checkNotNullParameter(errorData, "errorData");
        int i = R$string.error_generic;
        g gVar = this.f176639b;
        f0 f0VarF = this.f176638a.a(new npi.d("DEFAULT_ERROR_HANDLER_DIALOG", uc0.b.g(i, gVar), null, uc0.b.g(R$string.common_action_ok, gVar), null, null, Constants.TAG_F4)).f(d0.m(Boolean.TRUE));
        Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
        return f0VarF;
    }

    @Override // um.b
    public final int getLevel() {
        return Integer.MIN_VALUE;
    }
}
