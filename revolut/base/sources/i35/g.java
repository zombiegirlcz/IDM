package i35;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.impl.ui.security_deposit.SecurityDepositInfoScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wsg.n;
import yji.l;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends oki.h implements d {

    @NotNull
    public static final f Companion = new f();
    public final n o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SecurityDepositInfoScreenContract$InputData f158101p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f158102q;

    public g(n walletInteractor, SecurityDepositInfoScreenContract$InputData inputData, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = walletInteractor;
        this.f158101p = inputData;
        this.f158102q = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(osg.b.s(this.o, this.f158101p.f70063a, null, 6)), null, null, new i13.d(this, (Continuation) null, 7), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f158102q;
    }
}
