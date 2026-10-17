package ns1;

import android.os.Parcelable;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import e7l.g;
import efm.r;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import nii.y0;
import nii.z;
import noi.l;
import od0.i;
import vkm.j2;
import vkm.q;
import w4l.h;
import yji.n;
import zh9.u0;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends n implements b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f218731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final fk3.a f218732m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j2 f218733n;

    public e(f provider, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f218731l = provider;
        this.f218732m = configurationInteractor;
        this.f218733n = q.c(new c(null));
    }

    @Override // yji.n
    public final void D2() {
        r map = m70.a.g(((ik3.c) this.f218732m).l(g.b.f123407a, h.f294642c), null, null, 3).map(new l(11, new nrb.c(4)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        i.Companion.getClass();
        n.j2(this, rd0.e.b(ue0.e.E(map, i.f224256b)), null, new d(this, null, 1), 3);
    }

    public final void Z2(n1 dialogResult, Function0 onFinish) {
        Intrinsics.checkNotNullParameter(dialogResult, "dialogResult");
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        if ((dialogResult instanceof j1) || (dialogResult instanceof k1) || (dialogResult instanceof m1)) {
            onFinish.invoke();
        } else {
            if (!(dialogResult instanceof l1)) {
                throw new NoWhenBranchMatchedException();
            }
            FinishCommand finishCommand = new FinishCommand(null, null, null, 7);
            Parcelable parcelableA = ((l1) dialogResult).f216190a.a();
            A2(u0.b(com.revolut.retail.core.navigation.a.c(finishCommand, parcelableA instanceof NaviCommand ? (NaviCommand) parcelableA : null)));
        }
    }

    public final boolean b3(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        z zVarA = this.f218731l.a(throwable, ((c) this.f218733n.getValue()).f218729a);
        if (zVarA == null) {
            return false;
        }
        n.j2(this, L2(new y0(null, zVarA, false, 5)), null, new d(this, null, 0), 3);
        return true;
    }
}
