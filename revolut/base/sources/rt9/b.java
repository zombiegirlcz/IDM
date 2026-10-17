package rt9;

import cli.k;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.payments.groups.impl.ui_new.share_group_qr.GroupQrScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import tqi.g;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends h implements a {
    public final GroupQrScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f257216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f257217q;

    public b(GroupQrScreenContract$InputData inputData, g shareNaviCommandFactory, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f257216p = shareNaviCommandFactory;
        this.f257217q = d.b(this, k.f25028a, stateMapper, null, false, 12);
    }

    @Override // fpa.e
    public final void O(ActionsView.Item action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.f(action.f58316a, "SHARE_CONTACT_BUTTON_ID")) {
            tqi.c cVar = new tqi.c(null, this.o.f79496c, null, null, 91);
            m70.a.c(t0.f186434a);
            C1(u0.b(this.f257216p.g(cVar, "")));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f257217q;
    }
}
