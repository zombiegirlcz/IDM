package tn6;

import android.content.Intent;
import android.net.Uri;
import cli.n;
import cli.y;
import com.revolut.kompot.common.ExternalDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends oki.h implements i {

    @NotNull
    public static final k Companion = new k();
    public final l61.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f272319p;

    public l(n stateMapper, l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.o = userCompanyInteractor;
        this.f272319p = mra.d.b(this, new f(null), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.e(rd0.e.b(m70.a.g(hng.g.b(((ang.b) this.o).f7765a), null, new tj9.d(15), 1)), h0.f322473a, new tc6.d(3, 9, continuation)), null, null, new t9h.b(this, continuation, 28), 3);
    }

    public final void I2(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        String str = clickData.f275445a;
        if (a0.H(str, "https://", false)) {
            C1(new ExternalDestination.ByIntent(new Intent("android.intent.action.VIEW", Uri.parse(str)), null));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f272319p;
    }
}
