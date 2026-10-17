package crg;

import android.os.Parcelable;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.kj;
import com.revolut.core.ui_kit.delegates.mj;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import ip0.cp0;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {
    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        kj kjVar = new kj("WEB_VIEW_ITEM_ID", new mj(domainState.f108381a.e, null), new cp0(true, null, null, null, 126), Constants.TAG_FULL_SVPP_IDENTIFICATION);
        yp0.b.l(kjVar, 0, R$attr.uikit_dp32, 0, 0, null, false, 61);
        return new g(v.k(kjVar, new ListSubheaderDelegate.Model("LIST_ITEM_ID_SPACE", (Image) null, (Clause) null, (Image) null, (Clause) null, (String) null, (ListSubheaderDelegate.Model.a) null, false, false, (Object) null, (Parcelable) null, R$attr.uikit_dp24, 0, 0, 0, 61438)), domainState.f108381a.f94742b);
    }
}
