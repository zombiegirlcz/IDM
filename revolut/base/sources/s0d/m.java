package s0d;

import aw0.n6;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.semi_independent_activation.impl.ui.details.SemiIndependentActivationDetailsScreenContract$InputData;
import java.util.concurrent.CopyOnWriteArrayList;
import kl.t1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rt4.o;
import vkm.q;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends oki.h implements j {
    public final SemiIndependentActivationDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t1 f258951p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p0d.e f258952q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f258953r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final vii.b f258954s;

    public m(u0d.b stateMapper, SemiIndependentActivationDetailsScreenContract$InputData inputData, t1 configInteractor, p0d.e invitationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(invitationInteractor, "invitationInteractor");
        this.o = inputData;
        this.f258951p = configInteractor;
        this.f258952q = invitationInteractor;
        this.f258953r = mra.d.b(this, new f(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f258954s = new vii.b();
    }

    public static String I2(n6 n6Var) {
        Object obj2 = n6Var.k;
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Invitation id is empty for item " + n6Var.f10433a);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return str;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.f258954s, new r3k.c(continuation, this, 19)), null, null, new o(this, continuation, 16), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f258953r;
    }
}
