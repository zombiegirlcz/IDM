package vh3;

import android.os.Parcelable;
import com.revolut.retail.core.navigation.NaviCommand;
import efm.d0;
import k3l.j;
import kotlin.jvm.internal.Intrinsics;
import ufm.i;
import vf0.n;
import zh3.g;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements g3l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ln.a f289305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f289306b;

    public d(ln.a navigationCommandsDispatcher, g presentationModel) {
        Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
        Intrinsics.checkNotNullParameter(presentationModel, "presentationModel");
        this.f289305a = navigationCommandsDispatcher;
        this.f289306b = presentationModel;
    }

    @Override // g3l.d
    public final d0 b(j result) {
        ufm.b bVarM;
        Intrinsics.checkNotNullParameter(result, "result");
        if (Intrinsics.f(result.a().getF104385a(), "CARD_CHECKOUT_CONFIGURATION_ID")) {
            Parcelable f = result.a().getF();
            if (f == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.revolut.retail.core.navigation.NaviCommand");
            }
            this.f289305a.b((NaviCommand) f);
            bVarM = d0.m(Boolean.TRUE);
        } else {
            bVarM = d0.m(Boolean.FALSE);
        }
        i iVar = new i(bVarM, new n(new vh2.j(this, 1), 27), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }
}
