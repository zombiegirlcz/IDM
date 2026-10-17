package hsg;

import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.voluntary.offboarding.impl.R$string;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements n {
    @Override // cli.n
    public final o c(j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return new a(new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_title, null, null, 14), new TextLocalisedClause(R$string.voluntary_offboarding_cant_close_description, null, null, 14), u.c(new FullScreenStateDelegate.Model("image", null, null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D301", null, null, null, 30)), null, null, false, null, null, false, 0, 0, 32758)));
    }
}
