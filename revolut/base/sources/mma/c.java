package mma;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import igk.t;
import igk.u;
import igk.v;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.profile.impl.ui.close_account.c f207184b;

    public /* synthetic */ c(com.revolut.feature.profile.impl.ui.close_account.c cVar, int i) {
        this.f207183a = i;
        this.f207184b = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f207183a) {
            case 0:
                v output = (v) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                boolean zF = Intrinsics.f(output, t.f161272a);
                com.revolut.feature.profile.impl.ui.close_account.c cVar = this.f207184b;
                if (zF) {
                    cVar.C1(u0.b(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP))));
                    h.D2(cVar.u);
                } else {
                    if (!Intrinsics.f(output, u.f161273a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar.I2();
                }
                return Unit.f186387a;
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f207184b.I2();
                return Boolean.TRUE;
        }
    }
}
