package m2j;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.interactor.BalancesInteractor$InputData;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f202085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BalancesInteractor$InputData.RegisteredIdentity f202086c;

    public /* synthetic */ u(z zVar, BalancesInteractor$InputData.RegisteredIdentity registeredIdentity, int i) {
        this.f202084a = i;
        this.f202085b = zVar;
        this.f202086c = registeredIdentity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Boolean enabled = (Boolean) obj2;
        switch (this.f202084a) {
            case 0:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    String strC = z.c(this.f202086c);
                    final z zVar = this.f202085b;
                    final int i = 2;
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    String strC2 = z.c(this.f202086c);
                    final z zVar2 = this.f202085b;
                    final int i2 = 1;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(enabled, "enabled");
                if (enabled.booleanValue()) {
                    String strC3 = z.c(this.f202086c);
                    final z zVar3 = this.f202085b;
                    zf8.k kVar = zVar3.f202097a;
                    w4l.j jVar = w4l.j.f294644c;
                    efm.r rVarF = mif.a.f(rd0.e.c(kVar.c(strC3, jVar), kotlin.coroutines.g.f186406a), nim.a.w(zVar3.f202099c.g0(fo3.d.YOUTH, jVar, null), new m2g.c(23)), nim.a.w(zVar3.a(strC3), new m2g.c(24)), zVar3.d.d(strC3, jVar));
                    final int i3 = 0;
                }
                break;
        }
        return te0.w.h(new Data(null, null, false, 6, null));
    }
}
