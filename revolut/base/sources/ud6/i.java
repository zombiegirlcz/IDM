package ud6;

import cli.j;
import cli.n;
import cli.o;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import ip0.ti0;
import ip0.ui0;
import ip0.zj;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ud3.f0;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements n {
    public static List a() {
        return u.c(new ui0("errorItemId", u.c(new FullScreenStateDelegate.Model("ERROR_STATE_ID", new TextLocalisedClause(R$string.common_error_state_title, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D018", null, null, null, 30)), zj.REGULAR, new TextLocalisedClause(R$string.common_error_state_action, null, null, 14), false, null, null, true, 0, 0, 31684)), (ti0) null, 12));
    }

    @Override // cli.n
    public final o c(j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new g((List) iii.c.f(t1.t(domainState.f279156a, domainState.f279157b), new ud3.n(this, 1), new f0(this, 7), new u3b.h(this, 8)));
    }
}
